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
import javax.swing.JOptionPane;
import semeando_futuro.ConnectionFactory;
import semeando_futuro.modelo.Funcionario;


/**
 *
 * @author Thiago
 */
public class FuncionarioDAO {

    private Connection connection;

    public FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adciona(Funcionario c) {
        String sql = "insert into Funcionario"
                + "(NomeFunc, Estado, Cidade, Bairro, EnderecoFun, CEP, Telefone, Estado_Civil, Sexo, "
                + "Dt_Nascimento, Local_Nascimento, Nome_Parceiro, Nome_Pai,Nome_mae, Cart_Profissional, Data_de_Emissao_CartPro, UF, Identidade, "
                + "Data_de_Emissao_Identidade, Orgao_emissor_Identidade, Titulo_de_Eleitor, Zona, Seccao, Certificado_Reservista, "
                + "Orgao_Emissor_Certificado, PIS, CPF, Escolaridade, Primeiro_Emprego, Empresa, Banco, Agencia, Conta_Corrente)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEstado());
            stmt.setString(3, c.getCidade());
            stmt.setString(4, c.getBairro());
            stmt.setString(5, c.getEnderecoFun());
            stmt.setString(6, c.getCep());
            stmt.setString(7, c.getTelefone());
            stmt.setString(8, c.getEstado_Civil());
            stmt.setString(9, c.getSexo());
            stmt.setString(10, c.getDt_Nascimento());
            stmt.setString(11, c.getLocal_Nascimento());
            stmt.setString(12, c.getNome_Parceiro());
            stmt.setString(13, c.getNome_Pai());
            stmt.setString(14, c.getNome_Mae());
            stmt.setString(15, c.getCart_Profissional());
            stmt.setString(16, c.getData_Emissao_CartPro());
            stmt.setString(17, c.getUF());
            stmt.setString(18, c.getIdentidade());
            stmt.setString(19, c.getData_Emissao_Ident());
            stmt.setString(20, c.getOrgao_emissor_Ident());
            stmt.setString(21, c.getTitulo_de_Eleitor());
            stmt.setString(22, c.getZona());
            stmt.setString(23, c.getSeccao());
            stmt.setString(24, c.getCertificado_Reservista());
            stmt.setString(25, c.getOrgao_Emissor_CertReserv());
            stmt.setString(26, c.getPIS());
            stmt.setString(27, c.getCPF());
            stmt.setString(28, c.getEscolaridade());
            stmt.setString(29, c.getPrimeiro_Emprego());
            stmt.setString(30, c.getEmpresa());
            stmt.setString(31, c.getBanco());
            stmt.setString(32, c.getAgencia());
            stmt.setString(33, c.getConta_corrente());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Funcionario c) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from Funcionario where id_Funcionario=?");
            stmt.setInt(1, c.getIdFuncionario());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public void Alterar(Funcionario c) {

        String sql = "update  Funcionario set"  + " NomeFunc=?," + "Estado=?,"
                + "Cidade=?," + "Bairro=?," + "EnderecoFun=?," + "CEP=?," + "Telefone,=?" + "Estado_Civil=?," + "Sexo,=?"
                + "Dt_Nascimento=?," + "Local_Nascimento,=?" + "Nome_Parceiro=?," + "Nome_pai=?," + "nome_mae=?," + "Cart_Profissional=?,"
                + "Data_de_Emissao_CartPro=?," + "UF=?," + "Identidade=?," + "Data_de_Emissao_Identidade=?,"
                + "Orgao_emissor_Identidade=?," + "Titulo_de_Eleitor=?," + "Zona=?," + "Seccao=?," + "Certificado_Reservista=?,"
                + "Orgao_Emissor_Certificado=?," + "PIS=?," + "CPF=?," + "Escolaridade=?," + "Primeiro_Emprego=?,"+ "Empresa=?,"+ "Banco=?,"
                + "Agencia=?,"+ "Conta_corrente=? " + "where idFuncionario=?";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEstado());
            stmt.setString(3, c.getCidade());
            stmt.setString(4, c.getBairro());
            stmt.setString(5, c.getEnderecoFun());
            stmt.setString(6, c.getCep());
            stmt.setString(7, c.getTelefone());
            stmt.setString(8, c.getEstado_Civil());
            stmt.setString(9, c.getSexo());
            stmt.setString(10, c.getDt_Nascimento());
            stmt.setString(11, c.getLocal_Nascimento());
            stmt.setString(12, c.getNome_Parceiro());
            stmt.setString(13, c.getNome_Pai());
            stmt.setString(14, c.getNome_Mae());
            stmt.setString(15, c.getCart_Profissional());
            stmt.setString(16, c.getData_Emissao_CartPro());
            stmt.setString(17, c.getUF());
            stmt.setString(18, c.getIdentidade());
            stmt.setString(19, c.getData_Emissao_Ident());
            stmt.setString(20, c.getOrgao_emissor_Ident());
            stmt.setString(21, c.getTitulo_de_Eleitor());
            stmt.setString(22, c.getZona());
            stmt.setString(23, c.getSeccao());
            stmt.setString(24, c.getCertificado_Reservista());
            stmt.setString(25, c.getOrgao_Emissor_CertReserv());
            stmt.setString(26, c.getPIS());
            stmt.setString(27, c.getCPF());
            stmt.setString(28, c.getEscolaridade());
            stmt.setString(29, c.getPrimeiro_Emprego());
            stmt.setString(30, c.getEmpresa());
            stmt.setString(31, c.getBanco());
            stmt.setString(32, c.getAgencia());
            stmt.setString(33, c.getConta_corrente());
            stmt.setInt(34, c.getIdFuncionario());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }

    }

    public void Consultar(String campo, String inf, Funcionario c) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from funcionario where " + campo + " like '%" + inf + "%'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c.setIdFuncionario(rs.getInt("idFuncionario"));
                c.setNome(rs.getString("NomeFunc"));
                c.setEstado(rs.getString("Estado"));
                c.setCidade(rs.getString("Cidade"));
                c.setBairro(rs.getString("Bairro"));
                c.setEnderecoFun(rs.getString("EnderecoFun"));
                c.setCep(rs.getString("CEP"));
                c.setTelefone(rs.getString("Telefone"));
                c.setEstado_Civil(rs.getString("Estado_Civil"));
                c.setSexo(rs.getString("Sexo"));
                c.setDt_Nascimento(rs.getString("Dt_Nascimento"));
                c.setLocal_Nascimento(rs.getString("Local_Nascimento"));
                c.setNome_Parceiro(rs.getString("Nome_Parceiro"));
                c.setNome_Pai(rs.getString("Nome_Pai"));
                c.setNome_Mae(rs.getString("Nome_Mae"));
                c.setCart_Profissional(rs.getString("Cart_Profissional"));
                c.setData_Emissao_CartPro(rs.getString("Data_de_Emissao_CartPro"));
                c.setUF(rs.getString("UF"));
                c.setIdentidade(rs.getString("Identidade"));
                c.setData_Emissao_Ident(rs.getString("Data_de_Emissao_Identidade"));
                c.setOrgao_emissor_Ident(rs.getString("Orgao_Emissor_identidade"));
                c.setTitulo_de_Eleitor(rs.getString("Titulo_de_eleitor"));
                c.setZona(rs.getString("Zona"));
                c.setSeccao(rs.getString("Seccao"));
                c.setCertificado_Reservista(rs.getString("Certificado_Reservista"));
                c.setOrgao_Emissor_CertReserv(rs.getString("Orgao_Emissor_Certificado"));
                c.setPIS(rs.getString("PIS"));
                c.setCPF(rs.getString("CPF"));
                c.setEscolaridade(rs.getString("Escolaridade"));
                c.setPrimeiro_Emprego(rs.getString("Primeiro_emprego"));
                c.setEmpresa(rs.getString("Empresa"));
                c.setBanco(rs.getString("Banco"));
                c.setAgencia(rs.getString("Agencia"));
                c.setConta_corrente(rs.getString("Conta_Corrente"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }

    public List<Funcionario> getLista() {
        try {
            List<Funcionario> funcionarios = new ArrayList<Funcionario>();
            PreparedStatement stmt = this.connection.prepareStatement(
                    "select*from funcionario");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario c = new Funcionario();
                c.setIdFuncionario(rs.getInt("idFuncionario"));
                c.setNome(rs.getString("NomeFunc"));
                c.setEstado(rs.getString("Estado"));
                c.setCidade(rs.getString("Cidade"));
                c.setBairro(rs.getString("Bairro"));
                c.setEnderecoFun(rs.getString("EnderecoFun"));
                c.setCep(rs.getString("CEP"));
                c.setTelefone(rs.getString("Telefone"));
                c.setEstado_Civil(rs.getString("Estado_Civil"));
                c.setSexo(rs.getString("Sexo"));
                c.setDt_Nascimento(rs.getString("Dt_Nascimento"));
                c.setLocal_Nascimento(rs.getString("Local_Nascimento"));
                c.setNome_Parceiro(rs.getString("Nome_Parceiro"));
                c.setNome_Pai(rs.getString("Nome_Pai"));
                c.setNome_Mae(rs.getString("Nome_Mae"));
                c.setCart_Profissional(rs.getString("Cart_Profissional"));
                c.setData_Emissao_CartPro(rs.getString("Data_de_Emissao_CartPro"));
                c.setUF(rs.getString("UF"));
                c.setIdentidade(rs.getString("Identidade"));                
                c.setData_Emissao_Ident(rs.getString("Data_de_Emissao_Identidade"));
                c.setOrgao_emissor_Ident(rs.getString("Orgao_Emissor_identidade"));
                c.setTitulo_de_Eleitor(rs.getString("Titulo_de_eleitor"));
                c.setZona(rs.getString("Zona"));
                c.setSeccao(rs.getString("Seccao"));
                c.setCertificado_Reservista(rs.getString("Certificado_Reservista"));
                c.setOrgao_Emissor_CertReserv(rs.getString("Orgao_Emissor_Certificado"));
                c.setPIS(rs.getString("PIS"));
                c.setCPF(rs.getString("CPF"));
                c.setEscolaridade(rs.getString("Escolaridade"));
                c.setPrimeiro_Emprego(rs.getString("Primeiro_emprego"));
                c.setEmpresa(rs.getString("Empresa"));
                c.setBanco(rs.getString("Banco"));
                c.setAgencia(rs.getString("Agencia"));
                c.setConta_corrente(rs.getString("Conta_Corrente"));

                funcionarios.add(c);
            }
            rs.close();
            stmt.close();
            return funcionarios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    
    
    
    

}
