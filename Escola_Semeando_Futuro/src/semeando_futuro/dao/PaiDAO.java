/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.dao;

import com.mysql.jdbc.Blob;
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
import semeando_futuro.modelo.Pai;


/**
 *
 * @author Thiago
 */
public class PaiDAO {
    private Connection connection;
    
    public PaiDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adciona(Pai c) {
    String sql = "insert into pai"
                + "(Nome,Sobrenome,Estado,Cidade,Bairro,Endereco,CEP,Telefone,Celular,Email,Profissao,Empresa_Trabalho,Funcao,Estado_Civil,RG,CPF)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
        try {
            
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2,c.getSobrenome());
            stmt.setString(3,c.getEstado());
            stmt.setString(4,c.getCidade());
            stmt.setString(5,c.getBairro());
            stmt.setString(6,c.getEndereco());
            stmt.setString(7,c.getCEP());
            stmt.setString(8,c.getTelefone());
            stmt.setString(9,c.getCelular());
            stmt.setString(10,c.getEmail());
            stmt.setString(11,c.getProfissao());
            stmt.setString(12,c.getEmpresa_Trab());
            stmt.setString(13,c.getFuncao_trab());
            stmt.setString(14,c.getEstado_Civil());
            stmt.setString(15,c.getRG());
            stmt.setString(16,c.getCPF());
            
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
    
    
    public void remove(Pai c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from pai where idPai=?");
            stmt.setInt(1, c.getIdPai());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Pai c) {

        String s = "Nome, Sobrenome, Estado, Cidade, Bairro, Endereco, CEP, Telefone, Celular, Email, Profissao,"
                + "Empresa_Trabalho, Funcao, Estado_Civil, RG, CPF";

        String sql = "update  Pai set nome=?," + "sobrenome=?,"
                + "Estado=?," + "Cidade=?," + "Bairro=?," + "Endereco=?," + "CEP=?," + "Telefone=?," + "Celular=?," + "Email=?," + "Profissao=?,"
                + "Empresa_Trabalho=?," + "Funcao=?," + "Estado_Civil=?," + "RG=?," + "CPF=?" + " where idPai=?;";

        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobrenome());
            stmt.setString(3, c.getEstado());
            stmt.setString(4, c.getCidade());
            stmt.setString(5, c.getBairro());
            stmt.setString(6, c.getEndereco());
            stmt.setString(7, c.getCEP());
            stmt.setString(8, c.getTelefone());
            stmt.setString(9, c.getCelular());
            stmt.setString(10, c.getEmail());
            stmt.setString(11, c.getProfissao());
            stmt.setString(12, c.getEmpresa_Trab());
            stmt.setString(13, c.getFuncao_trab());
            stmt.setString(14, c.getEstado_Civil());
            stmt.setString(15, c.getRG());
            stmt.setString(16, c.getCPF());            
            stmt.setInt(17, c.getIdPai());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }

    }

    public void Consultar(String campo, String inf, Pai c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Pai where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {                
                c.setIdPai(rs.getInt("idPai"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setEstado(rs.getString("estado"));
                c.setCidade(rs.getString("cidade"));
                c.setBairro(rs.getString("bairro"));
                c.setEndereco(rs.getString("endereco"));
                c.setCEP(rs.getString("cep"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("email"));
                c.setProfissao(rs.getString("profissao"));
                c.setEmpresa_Trab(rs.getString("Empresa_Trabalho"));
                c.setFuncao_trab(rs.getString("Funcao"));
                c.setEstado_Civil(rs.getString("Estado_Civil"));
                c.setRG(rs.getString("RG"));
                c.setCPF(rs.getString("CPF"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public List<Pai> getLista(String campo, String inf) {
        try {
            List<Pai> pais = new ArrayList<Pai>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Pai where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pai c = new Pai();
                c.setIdPai(rs.getInt("idPai"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setEstado(rs.getString("estado"));
                c.setCidade(rs.getString("cidade"));
                c.setBairro(rs.getString("bairro"));
                c.setEndereco(rs.getString("endereco"));
                c.setCEP(rs.getString("cep"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("email"));
                c.setProfissao(rs.getString("profissao"));
                c.setEmpresa_Trab(rs.getString("Empresa_Trabalho"));
                c.setFuncao_trab(rs.getString("Funcao"));
                c.setEstado_Civil(rs.getString("Estado_Civil"));
                c.setRG(rs.getString("RG"));
                c.setCPF(rs.getString("CPF"));

                pais.add(c);
            }
            rs.close();
            stmt.close();
            return pais;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    public List<Pai> getList() {
        try {
            List<Pai> pais = new ArrayList<Pai>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Pai ");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pai c = new Pai();
                c.setIdPai(rs.getInt("idPai"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setEstado(rs.getString("estado"));
                c.setCidade(rs.getString("cidade"));
                c.setBairro(rs.getString("bairro"));
                c.setEndereco(rs.getString("endereco"));
                c.setCEP(rs.getString("cep"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("email"));
                c.setProfissao(rs.getString("profissao"));
                c.setEmpresa_Trab(rs.getString("Empresa_Trabalho"));
                c.setFuncao_trab(rs.getString("Funcao"));
                c.setEstado_Civil(rs.getString("Estado_Civil"));
                c.setRG(rs.getString("RG"));
                c.setCPF(rs.getString("CPF"));

                pais.add(c);
            }
            rs.close();
            stmt.close();
            return pais;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    
}
