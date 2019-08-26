/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import semeando_futuro.modelo.Turma;
import semeando_futuro.modelo.Visita;

/**
 *
 * @author lab
 */
public class VisitaDAO {
    private Connection connection;
    public VisitaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adciona(Visita c) {
    String sql = "insert into Visita"
                + "(Nome_Mae, Nome_Pai, Nome_Filho, Fone, Celular, Email, Data_Visita)"
                + "values (?,?,?,?,?,?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNomeMae());
            stmt.setString(2,c.getNomePai());
            stmt.setString(3,c.getNomeFilho());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5,c.getCelular());
            stmt.setString(6,c.getEmail());
            stmt.setString(7, c.getDataVisita());
            
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        } 
    
    public void remove(Visita c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Visita where idVisita=?");
            stmt.setInt(1, c.getIdVisita());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Visita c) {

        String sql = "update  visita set Nome_mae=?," + "Nome_Pai=?,"
                + "Nome_Filho=?" +"Fone=?,"+"Celular=?,"+"Email=?,"+"Data_Visita=? "+ " where idTurma=?;";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNomeMae());
            stmt.setString(2,c.getNomePai());
            stmt.setString(3,c.getNomeFilho());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5,c.getCelular());
            stmt.setString(6,c.getEmail());
            stmt.setString(7, c.getDataVisita());
            stmt.setInt(8, c.getIdVisita());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } 

    }

    public void Consultar(String campo, String inf, Visita c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Visita where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdVisita(rs.getInt("idVisita"));
                c.setNomeMae(rs.getString("Nome_Mae"));
                c.setNomePai(rs.getString("Nome_Pai"));
                c.setNomeFilho(rs.getString("Nome_Filho"));
                c.setTelefone(rs.getString("fone"));
                c.setCelular(rs.getString("Celular"));
                c.setEmail(rs.getString("Email"));
                c.setDataVisita(rs.getString("Data_Visita"));
                c.setDate(rs.getDate("Data_Visita"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<Visita> getLista(String campo, String inf) {
        try {
            List<Visita> visitas= new ArrayList<Visita>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Visita where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Visita c = new Visita();
                c.setIdVisita(rs.getInt("idVisita"));
                c.setNomeMae(rs.getString("Nome_Mae"));
                c.setNomePai(rs.getString("Nome_Pai"));
                c.setNomeFilho(rs.getString("Nome_Filho"));
                c.setTelefone(rs.getString("fone"));
                c.setCelular(rs.getString("Celular"));
                c.setEmail(rs.getString("Email"));
                c.setDataVisita(rs.getString("Data_Visita"));
                c.setDate(rs.getDate("Data_Visita"));

                visitas.add(c);
            }
            rs.close();
            stmt.close();
            return visitas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    public List<Visita> getList() {
        try {
            List<Visita> visitas= new ArrayList<Visita>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Visita") ;
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Visita c = new Visita();
                c.setIdVisita(rs.getInt("idVisita"));
                c.setNomeMae(rs.getString("Nome_Mae"));
                c.setNomePai(rs.getString("Nome_Pai"));
                c.setNomeFilho(rs.getString("Nome_Filho"));
                c.setTelefone(rs.getString("fone"));
                c.setCelular(rs.getString("Celular"));
                c.setEmail(rs.getString("Email"));
                c.setDataVisita(rs.getString("Data_Visita"));
                c.setDate(rs.getDate("Data_Visita"));

                visitas.add(c);
            }
            rs.close();
            stmt.close();
            return visitas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    
    public void gerarRelCompleto() {
        try {
            String sql = "select*from Visita;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Visita.jasper", new HashMap(), jrRs);
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
            String sql = "SELECT*FROM Visita where Data_Visita between '" + datade + "' and '" + dataate + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Visita.jasper", new HashMap(), jrRs);
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
