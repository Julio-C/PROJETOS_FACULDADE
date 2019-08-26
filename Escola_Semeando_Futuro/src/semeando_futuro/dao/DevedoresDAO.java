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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import semeando_futuro.ConnectionFactory;
import semeando_futuro.modelo.Aluno;
import semeando_futuro.modelo.Devedor;
import semeando_futuro.modelo.Pai;

/**
 *
 * @author Thiago
 */
public class DevedoresDAO {
    private Connection connection;
    public DevedoresDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adciona(Devedor c) {
    String sql = "insert into devedor"
                + "(Aluno_idAluno,Mensalidade,Obs,Estado)"
                + "values ((Select idAluno from aluno where RA=?),?,?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdDevedor());
            stmt.setInt(2,c.getIdAluno());
            stmt.setString(3,c.getObs());
            stmt.setString(4,c.getEstado());
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        } 
    
    public void remove(Devedor c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from devedor where idDevedor=?");
            stmt.setInt(1, c.getIdDevedor());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Devedor c) {

        String sql = "update  devedor set Aluno_idAluno=?," + "Mensalidade=?,"
                + "Obs=?," + "Estado=?" + " where idDevedor=?;";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdAluno());
            stmt.setDouble(2, c.getMensalidade());
            stmt.setString(3, c.getObs());
            stmt.setString(4, c.getEstado());
            stmt.setInt(11, c.getIdDevedor());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } 

    }

    public void Consultar(String campo, String inf, Devedor c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from devedor where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdDevedor(rs.getInt("idDevedor"));
                c.setIdAluno(rs.getInt("Aluno_idAluno"));
                c.setMensalidade(rs.getDouble("Mensalidade"));
                c.setObs(rs.getString("Obs"));
                c.setEstado(rs.getString("Estado"));
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<Devedor> getLista(String campo, String inf) {
        try {
            List<Devedor> devedores = new ArrayList<Devedor>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Devedor where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Devedor c = new Devedor();
                c.setIdDevedor(rs.getInt("idDevedor"));
                c.setIdAluno(rs.getInt("Aluno_idAluno"));
                c.setMensalidade(rs.getDouble("Mensalidade"));
                c.setObs(rs.getString("Obs"));
                c.setEstado(rs.getString("Estado"));

                devedores.add(c);
            }
            rs.close();
            stmt.close();
            return devedores;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
}

