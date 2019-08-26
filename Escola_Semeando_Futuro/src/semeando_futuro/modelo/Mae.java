/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.modelo;

import com.mysql.jdbc.Blob;

/**
 *
 * @author Thiago
 */
public class Mae {

    Integer idMae;
    String Nome, Sobrenome, Estado, Cidade, Bairro, Endereco, CEP, Telefone, Celular, Email, Profissao,
            Empresa_Trab, Funcao_trab, Estado_Civil, RG, CPF;
    Blob An_RG, An_CPF;
    String Caminho_RG, Caminho_CPF;

    public String getCaminho_RG() {
        return Caminho_RG;
    }

    public void setCaminho_RG(String Caminho_RG) {
        this.Caminho_RG = Caminho_RG;
    }

    public String getCaminho_CPF() {
        return Caminho_CPF;
    }

    public void setCaminho_CPF(String Caminho_CPF) {
        this.Caminho_CPF = Caminho_CPF;
    }
    
    

    public Integer getIdMae() {
        return idMae;
    }

    public void setIdMae(Integer idMae) {
        this.idMae = idMae;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String Profissao) {
        this.Profissao = Profissao;
    }

    public String getEmpresa_Trab() {
        return Empresa_Trab;
    }

    public void setEmpresa_Trab(String Empresa_Trab) {
        this.Empresa_Trab = Empresa_Trab;
    }

    public String getFuncao_trab() {
        return Funcao_trab;
    }

    public void setFuncao_trab(String Funcao_trab) {
        this.Funcao_trab = Funcao_trab;
    }

    public String getEstado_Civil() {
        return Estado_Civil;
    }

    public void setEstado_Civil(String Estado_Civil) {
        this.Estado_Civil = Estado_Civil;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Blob getAn_RG() {
        return An_RG;
    }

    public void setAn_RG(Blob An_RG) {
        this.An_RG = An_RG;
    }

    public Blob getAn_CPF() {
        return An_CPF;
    }

    public void setAn_CPF(Blob An_CPF) {
        this.An_CPF = An_CPF;
    }
    
    
    
    
}
