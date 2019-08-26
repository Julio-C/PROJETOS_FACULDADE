

package semeando_futuro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import semeando_futuro.ConnectionFactory;
import semeando_futuro.modelo.BancoHoras;
import semeando_futuro.modelo.Devedor;


public class BancoHorasDAO {
    private Connection connection;
    public BancoHorasDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adciona(BancoHoras c) {
    String sql = "insert into Banco_Horas"
                + "(Funcionario_idFuncionario,Horas,Data_bh)"
                + "values ((Select idFuncionario from Funcionario where Nome=?),?,?)";
    
        try {
            
       
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdFuncionario());
            stmt.setString(2,c.getHoras());
            stmt.setString(3,c.getData_BH());
            
        
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
        } 
    
    public void remove(BancoHoras c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Banco_Horas where idBanco_Horas=?");
            stmt.setInt(1, c.getIdBancoHoras());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(BancoHoras c) {

        String sql = "update  Banco_Horas set Funcionario_idFuncionario=?," + "Horas=?,"
                + "Data_BH=?" + " where idBanco_Horas=?;";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdFuncionario());
            stmt.setString(2, c.getHoras());
            stmt.setString(3, c.getData_BH());
            stmt.setInt(4, c.getIdBancoHoras());            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        } 

    }

    public void Consultar(String campo, String inf, BancoHoras c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Banco_Horas where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdBancoHoras(rs.getInt("idBanco_Horas"));
                c.setIdFuncionario(rs.getInt("Funcionario_idFuncionario"));
                c.setHoras(rs.getString("Horas"));
                c.setData_BH(rs.getString("Data_bh"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public List<BancoHoras> getLista(String campo, String inf) {
        try {
            List<BancoHoras> bancohoras = new ArrayList<BancoHoras>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from Banco_Horas where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BancoHoras c = new BancoHoras();
                c.setIdBancoHoras(rs.getInt("idBanco_Horas"));
                c.setIdFuncionario(rs.getInt("Funcionario_idFuncionario"));
                c.setHoras(rs.getString("Horas"));
                c.setData_BH(rs.getString("Data_bh"));

                bancohoras.add(c);
            }
            rs.close();
            stmt.close();
            return bancohoras;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
}

