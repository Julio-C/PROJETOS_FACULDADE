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
import semeando_futuro.modelo.Login;
import semeando_futuro.view.Frm_Login;
import semeando_futuro.view.Frm_Menu;
import semeando_futuro.view.Frm_Splash;

/**
 *
 * @author Thiago
 */
public class LoginDAO {

    private Connection connection;

    public LoginDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void Consultar(String campo, String inf, Login l) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from login where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                l.setCod_login(rs.getInt("idLogin"));
                l.setNome(rs.getString("nome"));
                l.setSenha(rs.getString("senha"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void ConsultarLogin(Login consultar) {
        String aberto="nao";
        try {
            String sql = "select*from login where idLogin";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
                while (rs.next()) {
                if (consultar.getUsuario().equals(rs.getString("usuario")) && consultar.getSenha().equals(rs.getString("senha"))) {
                                       
                    
                } else {
                     consultar.setVerifica("Falhou");
                     
                }
                
            }
            aberto="sim"; 
            consultar.setVerifica("OK");
            rs.close();
            stmt.close();
            if(aberto.equals("nao")){JOptionPane.showMessageDialog(null, "Usuario e Senha não corretos ou não cadastrados!");}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception ex) {
        ex.printStackTrace();
        throw ex;}
        finally {}
    }

    public void adciona(Login l) {
        String sql = "insert into login "
                + "(nome, usuario, senha)"
                + "values (?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getUsuario());
            stmt.setString(3, l.getSenha());

            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void remove(Login l) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from login where idLogin=?");
            stmt.setInt(1, l.getCod_login());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Login l) {

        String sql = "update  login set nome=?," + "usuario=?,"
                + "senha=? where idLogin=?;";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getUsuario());
            stmt.setString(3, l.getSenha());
            stmt.setInt(4, l.getCod_login());

            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<Login> getLista(String campo, String inf) {
        try {
            List<Login> logins = new ArrayList<Login>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Login where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Login l = new Login();
                l.setCod_login(rs.getInt("idLogin"));
                l.setNome(rs.getString("nome"));
                l.setUsuario(rs.getString("usuario"));
                logins.add(l);
            }
            rs.close();
            stmt.close();
            return logins;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
