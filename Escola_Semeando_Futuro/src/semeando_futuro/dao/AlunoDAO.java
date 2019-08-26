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
import semeando_futuro.modelo.Aluno;
import semeando_futuro.modelo.Funcionario;
import semeando_futuro.view.IFrm_CadAluno;
import semeando_futuro.view.IFrm_Consulta;

/**
 *
 * @author Thiago
 */
public class AlunoDAO {

    private Connection connection;

    public AlunoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    
    
    

    public void adciona(Aluno c) {
        String sql = "insert into aluno"
                + "(Nome, Sobrenome, Dt_Nascimento, Turma_idTurma, Mae_idMae, Pai_idPai, RA, Mensalidade, Foto, An_Res, An_Nasc, An_Vacina, An_Matricula)"
                + "values (?,?,?,(select idTurma from turma where nome=?),(select idMae from mae where RG=?),(select idPai from pai where RG=?),?,?,?,?,?,?,?)";

        try {
            FileInputStream fis = new FileInputStream(new File(c.getCaminhoFoto()));
            FileInputStream fis2 = new FileInputStream(new File(c.getCaminhoCert()));
            FileInputStream fis3 = new FileInputStream(new File(c.getCaminhoRes()));
            FileInputStream fis4 = new FileInputStream(new File(c.getCaminhoVac()));
            FileInputStream fis5 = new FileInputStream(new File(c.getCaminhoMatri()));
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobrenome());
            stmt.setString(3, c.getNascimento());
            stmt.setString(4, c.getTurma());
            stmt.setString(5, c.getRG_Mae());
            stmt.setString(6, c.getRG_Pai());
            stmt.setString(7, c.getRA());
            stmt.setDouble(8, c.getMensalidade());
            stmt.setBlob(9, fis);
            stmt.setBlob(10, fis3);
            stmt.setBlob(11, fis2);
            stmt.setBlob(12, fis4);
            stmt.setBlob(13, fis5);
            
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {

            throw new RuntimeException(e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void remove(Aluno c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from aluno where idCliente=?");
            stmt.setInt(1, c.getIdAluno());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Aluno c) {

        String sql = "update  aluno set nome=?," + "sobrenome=?,"
                + "dt_nascimento=?," + "ra=?," + "mensalidade=?,"
                + "foto=?," + "an_res=?," + "an_nasc=?," + "an_Vacina=?," + "Turma_idTurma=?," + "Mae_idMae=?," + "Pai_idPai=?,"+ "an_matricula=?" + " where idAluno=?;";

        try {
            FileInputStream fis = new FileInputStream(new File(c.getCaminhoFoto()));
            FileInputStream fis2 = new FileInputStream(new File(c.getCaminhoCert()));
            FileInputStream fis3 = new FileInputStream(new File(c.getCaminhoRes()));
            FileInputStream fis4 = new FileInputStream(new File(c.getCaminhoVac()));
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobrenome());
            stmt.setString(3, c.getRA());
            stmt.setDouble(4, c.getMensalidade());
            stmt.setBlob(5, fis);
            stmt.setBlob(6, fis3);
            stmt.setBlob(7, fis2);
            stmt.setBlob(8, fis4);
            stmt.setInt(9, c.getIdTurmaFK());
            stmt.setInt(10, c.getIdMaeFK());
            stmt.setInt(11, c.getIdPaiFK());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Consultar(String campo, String inf, Aluno c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Aluno where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdAluno(rs.getInt("idAluno"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setRA(rs.getString("RA"));
                c.setMensalidade(rs.getDouble("mensalidade"));
                c.setIdTurmaFK(rs.getInt("turma_idTurma"));
                c.setIdMaeFK(rs.getInt("mae_idMae"));
                c.setIdPaiFK(rs.getInt("pai_idPai"));
                c.setFoto((Blob) rs.getBlob("Foto"));
                c.setMatricula((Blob) rs.getBlob("An_Matricula"));
                c.setCertidao((Blob) rs.getBlob("An_Nasc"));
                c.setResidencia((Blob) rs.getBlob("An_Res"));
                c.setVacina((Blob) rs.getBlob("An_Vacina"));
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<Aluno> getLista(String campo, String inf) {
        try {
            List<Aluno> alunos = new ArrayList<Aluno>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Aluno where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Aluno c = new Aluno();
                c.setIdAluno(rs.getInt("idAluno"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setRA(rs.getString("RA"));
                c.setMensalidade(rs.getDouble("mensalidade"));
                c.setIdTurmaFK(rs.getInt("turma_idTurma"));
                c.setIdMaeFK(rs.getInt("mae_idMae"));
                c.setIdPaiFK(rs.getInt("pai_idPai"));
                c.setFoto((Blob) rs.getBlob("Foto"));
                c.setMatricula((Blob) rs.getBlob("An_Matricula"));
                c.setCertidao((Blob) rs.getBlob("An_Nasc"));
                c.setResidencia((Blob) rs.getBlob("An_Res"));
                c.setVacina((Blob) rs.getBlob("An_Vacina"));

                alunos.add(c);
            }
            rs.close();
            stmt.close();
            return alunos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    public List<Aluno> getList() {
        try {
            List<Aluno> alunos = new ArrayList<Aluno>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Aluno;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Aluno c = new Aluno();
                c.setIdAluno(rs.getInt("idAluno"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setRA(rs.getString("RA"));
                c.setMensalidade(rs.getDouble("mensalidade"));
                c.setIdTurmaFK(rs.getInt("turma_idTurma"));
                c.setIdMaeFK(rs.getInt("mae_idMae"));
                c.setIdPaiFK(rs.getInt("pai_idPai"));
                c.setFoto((Blob) rs.getBlob("Foto"));
                c.setMatricula((Blob) rs.getBlob("An_Matricula"));
                c.setCertidao((Blob) rs.getBlob("An_Nasc"));
                c.setResidencia((Blob) rs.getBlob("An_Res"));
                c.setVacina((Blob) rs.getBlob("An_Vacina"));

                alunos.add(c);
            }
            rs.close();
            stmt.close();
            return alunos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    public List<Aluno> getListaComTurma(javax.swing.JComboBox turma){
        try{
            List<Aluno> alunos = new ArrayList<Aluno>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Aluno where aluno.Turma_idTurma=(select idTurma from turma where turma.nome='"+turma.getSelectedItem()+"')");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Aluno c = new Aluno();
            c.setIdAluno(rs.getInt("idAluno"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setRA(rs.getString("RA"));
                c.setMensalidade(rs.getDouble("mensalidade"));
                c.setIdTurmaFK(rs.getInt("turma_idTurma"));
                c.setIdMaeFK(rs.getInt("mae_idMae"));
                c.setIdPaiFK(rs.getInt("pai_idPai"));
                c.setFoto((Blob) rs.getBlob("Foto"));
                c.setMatricula((Blob) rs.getBlob("An_Matricula"));
                c.setCertidao((Blob) rs.getBlob("An_Nasc"));
                c.setResidencia((Blob) rs.getBlob("An_Res"));
                c.setVacina((Blob) rs.getBlob("An_Vacina"));
                alunos.add(c);
            }
            rs.close();
            stmt.close();
            return alunos;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
}
