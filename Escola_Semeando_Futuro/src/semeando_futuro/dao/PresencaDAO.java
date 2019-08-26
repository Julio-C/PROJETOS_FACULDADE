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
import semeando_futuro.modelo.Presenca;

/**
 *
 * @author Thiago
 */
public class PresencaDAO {

    private Connection connection;

    public PresencaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adciona(Presenca c) {
        String sql = "insert into Presenca"
                + "(Aluno_idAluno, Funcionario_idFuncionario, Data_Pres, Aulas, Faltas)"
                + "values ((select idAluno from aluno where aluno.RA=?),(select idFuncionario from funcionario where NomeFunc=?),?,?,?)";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getRA_Aluno());
            stmt.setString(2, c.getFuncionario());
            stmt.setString(3, c.getData());
            stmt.setInt(4, c.getAula());
            stmt.setInt(5, c.getFalta());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }

    public void remove(Presenca c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Presenca where idPresenca=?");
            stmt.setInt(1, c.getIdPresenca());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Presenca c) {

        String sql = "update  Presenca set Aluno_idAluno=(select idAluno from aluno where aluno.RA=?), Funcionario_idFuncionario=(select idFuncionario from funcionario where NomeFunc=?),"
                + "Data_Pres=?, Aulas=?, Faltas=? where idPresenca=?;";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getRA_Aluno());
            stmt.setString(2, c.getFuncionario());
            stmt.setString(3, c.getData());
            stmt.setInt(4, c.getAula());
            stmt.setInt(5, c.getFalta());
            stmt.setInt(6, c.getIdPresenca());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }

    }

    public void Consultar(String campo, String inf, Presenca c) {
        try {
            Integer IdAluno, IdFuncionario, IdTurma;
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Presenca inner join Aluno ON Aluno.idAluno = Presenca.Aluno_idAluno inner join funcionario ON Funcionario.idFuncionario = Presenca.Funcionario_idFuncionario inner join turma ON Turma.idTurma = Aluno.Turma_idTurma where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                IdAluno = (rs.getInt("Aluno_idAluno"));
                IdFuncionario = (rs.getInt("Funcionario_idFuncionario"));
                IdTurma = (rs.getInt("Aluno.Turma_idTurma"));
                c.setDate(rs.getDate("Data_Pres"));
                c.setIdPresenca(rs.getInt("idPresenca"));
                c.setTurma(rs.getString("Turma.Nome"));
                c.setRA_Aluno(rs.getString("Aluno.RA"));
                c.setFuncionario(rs.getString("Funcionario.NomeFunc"));
                c.setData(rs.getString("Data_Pres"));
                c.setFalta(rs.getInt("Faltas"));
                c.setAula(rs.getInt("Aulas"));

            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public List<Presenca> getLista(String campo, String inf) {
        try {
            Integer IdAluno, IdFuncionario;
            List<Presenca> presencas = new ArrayList<Presenca>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Presenca inner join Aluno ON Aluno.idAluno = Presenca.Aluno_idAluno inner join funcionario ON Funcionario.idFuncionario = Presenca.Funcionario_idFuncionario inner join turma ON Turma.idTurma = Aluno.Turma_idTurma where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Presenca c = new Presenca();
                IdAluno = (rs.getInt("Aluno_idAluno"));
                IdFuncionario = (rs.getInt("Funcionario_idFuncionario"));
                c.setIdPresenca(rs.getInt("idPresenca"));
                c.setDate(rs.getDate("Data_Pres"));
                c.setTurma(rs.getString("Turma.Nome"));
                c.setRA_Aluno(rs.getString("Aluno.RA"));
                c.setFuncionario(rs.getString("Funcionario.NomeFunc"));
                c.setData(rs.getString("Data_Pres"));
                c.setFalta(rs.getInt("Faltas"));
                c.setAula(rs.getInt("Aulas"));
                

                presencas.add(c);
            }
            rs.close();
            stmt.close();
            return presencas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void gerarRelCompleto() {
        try {
            String sql = "select*from Presenca inner join Aluno ON Aluno.idAluno = Presenca.Aluno_idAluno inner join funcionario ON Funcionario.idFuncionario = Presenca.Funcionario_idFuncionario inner join turma ON Turma.idTurma = Aluno.Turma_idTurma;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Chamada.jasper", new HashMap(), jrRs);
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
            String sql = "select*from Presenca inner join Aluno ON Aluno.idAluno = Presenca.Aluno_idAluno inner join funcionario ON Funcionario.idFuncionario = Presenca.Funcionario_idFuncionario inner join turma ON Turma.idTurma = Aluno.Turma_idTurma where Data_Pres between '" + datade + "' and '" + dataate + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Chamada.jasper", new HashMap(), jrRs);
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

            String sql = "select*from Presenca inner join Aluno ON Aluno.idAluno = Presenca.Aluno_idAluno inner join funcionario ON Funcionario.idFuncionario = Presenca.Funcionario_idFuncionario inner join turma ON Turma.idTurma = Aluno.Turma_idTurma where RA= '" + RA.getText() + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Chamada.jasper", new HashMap(), jrRs);
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
            String sql = "select*from Presenca inner join Aluno ON Aluno.idAluno = Presenca.Aluno_idAluno inner join funcionario ON Funcionario.idFuncionario = Presenca.Funcionario_idFuncionario inner join turma ON Turma.idTurma = Aluno.Turma_idTurma where RA='"+RA.getText()+"' and Data_Pres between '" + datade + "' and '" + dataate + "';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            net.sf.jasperreports.engine.JRResultSetDataSource jrRs = new net.sf.jasperreports.engine.JRResultSetDataSource(rs);
            JasperPrint print = JasperFillManager.fillReport("src/semeando_futuro/relatorio/Rel_Chamada.jasper", new HashMap(), jrRs);
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
