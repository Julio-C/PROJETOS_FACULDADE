
package semeando_futuro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import semeando_futuro.ConnectionFactory;
import semeando_futuro.modelo.Desligamento;


public class DesligamentoDAO {
    
    private Connection connection;
    public DesligamentoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adciona(Desligamento c) {
    String sql = "insert into desligamento"
                + "(Aluno_idAluno,Data_Desl,Motivo)"
                + "values ((Select idAluno from Aluno where RA=?),?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getRAALuno());
            stmt.setString(2,c.getData_Desligamento());
            stmt.setString(3,c.getMotivo());
            
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        } 
    
    public void remove(Desligamento c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Desligamento where idDesligamento=?");
            stmt.setInt(1, c.getIdDesligamento());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Desligamento c) {

        String sql = "update  Desligamento set Aluno_idAluno=(select idAluno from aluno where RA=?),Data_Desl=?, Motivo=? where idDesligamento=?;";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getRAALuno());
            stmt.setString(2, c.getData_Desligamento());
            stmt.setString(3, c.getMotivo());
            stmt.setInt(4, c.getIdDesligamento());            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } 

    }

    public void Consultar(String campo, String inf, Desligamento c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Desligamento inner join aluno on aluno.idAluno = Desligamento.Aluno_idAluno where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdDesligamento(rs.getInt("idDesligamento"));
                c.setIdAluno(rs.getInt("Aluno_idAluno"));
                c.setData_Desligamento(rs.getString("Data_Desl"));
                c.setMotivo(rs.getString("Motivo"));
                c.setRAALuno(rs.getString("RA"));
                c.setDate(rs.getDate("Data_Desl"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<Desligamento> getLista(String campo, String inf) {
        try {
            List<Desligamento> desligamento = new ArrayList<Desligamento>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Desligamento inner join aluno on aluno.idAluno = Desligamento.Aluno_idAluno where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Desligamento c = new Desligamento();
                c.setIdDesligamento(rs.getInt("idDesligamento"));
                c.setIdAluno(rs.getInt("Aluno_idAluno"));
                c.setData_Desligamento(rs.getString("Data_Desl"));
                c.setMotivo(rs.getString("Motivo"));
                c.setRAALuno(rs.getString("RA"));
                c.setDate(rs.getDate("Data_Desl"));
                

                desligamento.add(c);
            }
            rs.close();
            stmt.close();
            return desligamento;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    
    public void gerarRelCompleto() {
        try {
            String sql = "select*from Desligamento inner join aluno on aluno.idAluno = Desligamento.Aluno_idAluno;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Desligamento.jasper", new HashMap(), jrRs);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            jv.toFront();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Chamar " + ex);
        }

    }

    public void gerarRelData(com.toedter.calendar.JDateChooser de, com.toedter.calendar.JDateChooser ate) {
        try {

            java.util.Date F = de.getDate();
            java.util.Date G = ate.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
            String datade = format1.format(F);
            String dataate = format1.format(G);
            String sql = "select*from Desligamento inner join aluno on aluno.idAluno = Desligamento.Aluno_idAluno where Data_Desl between '" + datade + "' and '" + dataate + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Desligamento.jasper", new HashMap(), jrRs);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            jv.toFront();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Chamar " + ex);
        }

    }
    
    
    
    
}
