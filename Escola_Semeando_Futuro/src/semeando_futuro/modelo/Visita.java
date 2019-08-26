/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semeando_futuro.modelo;

import java.util.Date;

/**
 *
 * @author lab
 */
public class Visita {
    Integer idVisita;
    String NomeMae, NomePai, NomeFilho, Telefone, Celular, Email, DataVisita;
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String NomeMae) {
        this.NomeMae = NomeMae;
    }

    public String getNomePai() {
        return NomePai;
    }

    public void setNomePai(String NomePai) {
        this.NomePai = NomePai;
    }

    public String getNomeFilho() {
        return NomeFilho;
    }

    public void setNomeFilho(String NomeFilho) {
        this.NomeFilho = NomeFilho;
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

    public String getDataVisita() {
        return DataVisita;
    }

    public void setDataVisita(String DataVisita) {
        this.DataVisita = DataVisita;
    }
    
    
    
}
