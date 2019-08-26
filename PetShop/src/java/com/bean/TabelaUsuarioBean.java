/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author marco.junior
 */
@Entity
@Table(name="TabelaUsuario")
public class TabelaUsuarioBean implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cod;
    private String usuario;
    private String senha;

    public TabelaUsuarioBean()
    {
        
    }
    
    public TabelaUsuarioBean(int cod, String usuario, String senha) {
        this.cod = cod;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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
    }

    @Override
    public String toString() {
        return "TabelaUsuarioBean{" + "cod=" + cod + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
    

    
}
