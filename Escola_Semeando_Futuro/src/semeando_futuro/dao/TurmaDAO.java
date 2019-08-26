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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import semeando_futuro.ConnectionFactory;
import semeando_futuro.modelo.Hora_Cafe;
import semeando_futuro.modelo.Turma;

/**
 *
 * @author guilherme
 */
public class TurmaDAO {
    
    
    private Connection connection;
    public TurmaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adciona(Turma c) {
    String sql = "insert into Turma"
                + "(Nome,Ano,Serie)"
                + "values (?,?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome_Turma());
            stmt.setString(2,c.getAno());
            stmt.setString(3,c.getSerie());
            
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        } 
    
    public void remove(Turma c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Turma where idTurma=?");
            stmt.setInt(1, c.getIdTurma());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Turma c) {

        String sql = "update  Turma set Nome=?," + "Ano=?,"
                + "Serie=?" + " where idTurma=?;";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome_Turma());
            stmt.setString(2, c.getAno());
            stmt.setString(3, c.getSerie());
            stmt.setInt(4, c.getIdTurma());            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } 

    }

    public void Consultar(String campo, String inf, Turma c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Turma where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdTurma(rs.getInt("idTurma"));
                c.setNome_Turma(rs.getString("Nome"));
                c.setAno(rs.getString("Ano"));
                c.setSerie(rs.getString("Serie"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<Turma> getLista(String campo, String inf) {
        try {
            List<Turma> turmas= new ArrayList<Turma>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Turma where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Turma c = new Turma();
                c.setIdTurma(rs.getInt("idTurma"));
                c.setNome_Turma(rs.getString("Nome"));
                c.setAno(rs.getString("Ano"));
                c.setSerie(rs.getString("Serie"));

                turmas.add(c);
            }
            rs.close();
            stmt.close();
            return turmas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    public List<Turma> getList() {
        try {
            List<Turma> turmas= new ArrayList<Turma>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Turma") ;
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Turma c = new Turma();
                c.setIdTurma(rs.getInt("idTurma"));
                c.setNome_Turma(rs.getString("Nome"));
                c.setAno(rs.getString("Ano"));
                c.setSerie(rs.getString("Serie"));

                turmas.add(c);
            }
            rs.close();
            stmt.close();
            return turmas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
}
