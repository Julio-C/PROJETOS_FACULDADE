/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import semeando_futuro.ConnectionFactory;
import semeando_futuro.modelo.Aluno;

import semeando_futuro.modelo.Festa;

/**
 *
 * @author Thiago
 */
public class FestaDAO {
    private Connection connection;
    public FestaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adciona(Festa c) {
    String sql = "insert into Festa"
                + "(Aluno_idAluno,Nome,  Data_Festa, Pagamento, Observacao)"
                + "values ((select idaluno From Aluno where RA=?),?,?,?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getRAAluno());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getData_Festa());
            stmt.setDouble(4, c.getPagamento());
            stmt.setString(5, c.getObservacao());
            
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        }
    
     public void remove(Festa c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Festa where id_Festa=?");
            stmt.setInt(1, c.getId_Festa());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
     public void Alterar(Festa c) {

        String sql = "update festa set Aluno_idAluno=(select idaluno from aluno where RA=?), nome=?, Data_Festa=?, Pagamento=?, Observacao=?"+
                " where idFesta=?;"
                ;

        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,c.getRAAluno());
            stmt.setString(2, c.getNome());
            stmt.setString(3,c.getData_Festa());
            stmt.setDouble(4,c.getPagamento());
            stmt.setString(5,c.getObservacao());            
            stmt.setInt(6, c.getId_Festa());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }

    }
     
     public void Consultar(String campo, String inf, Festa c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Festa inner join aluno on festa.aluno_idaluno = aluno.idaluno where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setNome(rs.getString("nome"));
                c.setData_Festa(rs.getString("data_festa"));
                c.setPagamento(rs.getDouble("pagamento"));
                c.setObservacao(rs.getString("Observacao"));
                c.setId_Aluno(rs.getInt("aluno_idAluno"));
                c.setId_Festa(rs.getInt("idFesta"));
                c.setRAAluno(rs.getString("Aluno.RA"));
                c.setDate(rs.getDate("Data_Festa"));
               
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
     public List<Festa> getLista(String campo, String inf) {
        try {
            List<Festa> calendarios = new ArrayList<Festa>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Festa inner join aluno on festa.aluno_idaluno = aluno.idaluno where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Festa c = new Festa();
                c.setNome(rs.getString("nome"));
                c.setData_Festa(rs.getString("data_festa"));
                c.setPagamento(rs.getDouble("pagamento"));
                c.setObservacao(rs.getString("Observacao"));
                c.setId_Aluno(rs.getInt("idAluno"));
                c.setId_Festa(rs.getInt("idFesta"));
                c.setRAAluno(rs.getString("Aluno.RA"));
                c.setDate(rs.getDate("Data_Festa"));

                calendarios.add(c);
            }
            rs.close();
            stmt.close();
            return calendarios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

     
     
     public void gerarRelCompleto() {
        try {
            String sql = "select*from Festa inner join Aluno ON Aluno.idAluno = Festa.Aluno_idAluno;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Festa.jasper", new HashMap(), jrRs);
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
            String sql = "SELECT*FROM FESTA INNER JOIN ALUNO ON Aluno.idAluno = FESTA.Aluno_idAluno where Data_Festa between '" + datade + "' and '" + dataate + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Festa.jasper", new HashMap(), jrRs);
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

    public void gerarRelRA(javax.swing.JTextField RA) {
        try {

            String sql = "SELECT*FROM FESTA INNER JOIN ALUNO ON Aluno.idAluno = FESTA.Aluno_idAluno where RA= '" + RA.getText() + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Festa.jasper", new HashMap(), jrRs);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            jv.toFront();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Chamar " + ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "RA Digitado errado!" + e);
        }

    }
    
    public void gerarRelRAData(javax.swing.JTextField RA,com.toedter.calendar.JDateChooser de, com.toedter.calendar.JDateChooser ate) {
        try {

            java.util.Date F = de.getDate();
            java.util.Date G = ate.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
            String datade = format1.format(F);
            String dataate = format1.format(G);
            String sql = "SELECT*FROM FESTA INNER JOIN ALUNO ON Aluno.idAluno = FESTA.Aluno_idAluno where RA='"+RA.getText()+"' and Data_Festa between '" + datade + "' and '" + dataate + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Festa.jasper", new HashMap(), jrRs);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            jv.toFront();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Chamar " + ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "RA Digitado errado!" + e);
        }

    }
    
    
    public void gerarRelNome(javax.swing.JTextField Nome) {
        try {

            String sql = "SELECT*FROM FESTA INNER JOIN ALUNO ON Aluno.idAluno = FESTA.Aluno_idAluno where Nome= '" + Nome.getText() + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Festa.jasper", new HashMap(), jrRs);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            jv.toFront();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Chamar " + ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "RA Digitado errado!" + e);
        }

    }
    
    public void gerarRelNomeData(javax.swing.JTextField Nome,com.toedter.calendar.JDateChooser de, com.toedter.calendar.JDateChooser ate) {
        try {

            java.util.Date F = de.getDate();
            java.util.Date G = ate.getDate();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
            String datade = format1.format(F);
            String dataate = format1.format(G);
            String sql = "SELECT*FROM FESTA INNER JOIN ALUNO ON Aluno.idAluno = FESTA.Aluno_idAluno where Nome='"+Nome.getText()+"' and Data_Festa between '" + datade + "' and '" + dataate + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Festa.jasper", new HashMap(), jrRs);
            JasperViewer jv = new JasperViewer(print, false);
            jv.setVisible(true);
            jv.toFront();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Chamar " + ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "RA Digitado errado!" + e);
        }

    }

     




}





