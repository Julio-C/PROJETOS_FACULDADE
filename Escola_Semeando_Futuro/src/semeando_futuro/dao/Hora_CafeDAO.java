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
import semeando_futuro.modelo.Falta_Funcionario;
import semeando_futuro.modelo.Hora_Cafe;

/**
 *
 * @author Thiago
 */
public class Hora_CafeDAO {
    
    
    private Connection connection;
    public Hora_CafeDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adciona(Hora_Cafe c) {
    String sql = "insert into Hora_Cafe"
                + "(Funcionario_idFuncionario,Data_Cafe,Hora_Cafe)"
                + "values ((Select idFuncionario from Funcionario where Nome=?),?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdFuncionario());
            stmt.setString(2,c.getData_Cafe());
            stmt.setString(3,c.getHora_Cafe());
            
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        } 
    
    public void remove(Hora_Cafe c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Hora_Cafe where idHora_Cafe=?");
            stmt.setInt(1, c.getIdHoraCafe());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Hora_Cafe c) {

        String sql = "update  Hora_Cafe set Funcionario_idFuncionario=?," + "Data_Cafe=?,"
                + "Hora_Cafe=?" + " where idHora_Cafe=?;";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdFuncionario());
            stmt.setString(2, c.getData_Cafe());
            stmt.setString(3, c.getData_Cafe());
            stmt.setInt(4, c.getIdHoraCafe());            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } 

    }

    public void Consultar(String campo, String inf, Hora_Cafe c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Hora_Cafe where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdHoraCafe(rs.getInt("idHora"));
                c.setIdFuncionario(rs.getInt("Funcionario_idFuncionario"));
                c.setData_Cafe(rs.getString("Data_Cafe"));
                c.setHora_Cafe(rs.getString("Hora_Cafe"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<Hora_Cafe> getLista(String campo, String inf) {
        try {
            List<Hora_Cafe> hora_cafes= new ArrayList<Hora_Cafe>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Hora_Cafe where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Hora_Cafe c = new Hora_Cafe();
                c.setIdHoraCafe(rs.getInt("idHora_Cafe"));
                c.setIdFuncionario(rs.getInt("Funcionario_idFuncionario"));
                c.setData_Cafe(rs.getString("Data_Cafe"));
                c.setHora_Cafe(rs.getString("Hora_Cafe"));

                hora_cafes.add(c);
            }
            rs.close();
            stmt.close();
            return hora_cafes;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    
}
