/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.modelo;

/**
 *
 * @author Thiago
 */
public class Login {
    int cod_login;
    String usuario, senha;
    String Nome;
    private String verifica;
    

    public int getCod_login() {
        return cod_login;
    }

    public void setCod_login(int cod_login) {
        this.cod_login = cod_login;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }public String getVerifica() {
        return verifica;
    }public void setVerifica(String verifica) {
        this.verifica = verifica;
    }
    
    
    
    
}