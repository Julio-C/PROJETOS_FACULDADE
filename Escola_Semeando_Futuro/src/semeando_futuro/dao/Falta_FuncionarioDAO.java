
package semeando_futuro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import semeando_futuro.ConnectionFactory;
import semeando_futuro.modelo.Desligamento;
import semeando_futuro.modelo.Falta_Funcionario;

/**
 *
 * @author Thiago
 */
public class Falta_FuncionarioDAO {
    private Connection connection;
    public Falta_FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adciona(Falta_Funcionario c) {
    String sql = "insert into Falta"
                + "(Funcionario_idFuncionario,Data_Falta,Motivo_Falta)"
                + "values ((Select idFuncionario from Funcionario where Nome=?),?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdFuncionario());
            stmt.setString(2,c.getData_Falta());
            stmt.setString(3,c.getMotivo_Falta());
            
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        } 
    
    public void remove(Falta_Funcionario c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Falta where idFalta=?");
            stmt.setInt(1, c.getIdFalta());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Falta_Funcionario c) {

        String sql = "update  Falta set Funcionario_idFuncionario=?," + "Data_Falta=?,"
                + "Motivo_Falta=?" + " where idFalta=?;";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdFuncionario());
            stmt.setString(2, c.getData_Falta());
            stmt.setString(3, c.getMotivo_Falta());
            stmt.setInt(4, c.getIdFalta());            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } 

    }

    public void Consultar(String campo, String inf, Falta_Funcionario c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Falta where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdFalta(rs.getInt("idFalta"));
                c.setIdFuncionario(rs.getInt("Funcionario_idFuncionario"));
                c.setData_Falta(rs.getString("Data_Falta"));
                c.setMotivo_Falta(rs.getString("Motivo_Falta"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<Falta_Funcionario> getLista(String campo, String inf) {
        try {
            List<Falta_Funcionario> falta_funcionarios= new ArrayList<Falta_Funcionario>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Falta where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Falta_Funcionario c = new Falta_Funcionario();
                c.setIdFalta(rs.getInt("idFalta"));
                c.setIdFuncionario(rs.getInt("Funcionario_idFuncionario"));
                c.setData_Falta(rs.getString("Data_Falta"));
                c.setMotivo_Falta(rs.getString("Motivo_Falta"));

                falta_funcionarios.add(c);
            }
            rs.close();
            stmt.close();
            return falta_funcionarios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
}
