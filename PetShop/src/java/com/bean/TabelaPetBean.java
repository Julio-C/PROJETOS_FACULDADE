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
@Table(name="TabelaPet")
public class TabelaPetBean implements Serializable {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)   
    private int cod;
    private String nome;
    private String raca;
    private String peso;
    private String dataDeNascimento;

    public TabelaPetBean() {
    }

    public TabelaPetBean(int cod, String nome, String raca, String peso, String dataDeNascimento) {
        this.cod = cod;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.dataDeNascimento = dataDeNascimento;
    }
   
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "TabelaPetBean{" + "cod=" + cod + ", nome=" + nome + ", raca=" + raca + ", peso=" + peso + ", dataDeNascimento=" + dataDeNascimento + '}';
    }
    
    
    
}
