package com.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TabelaCliente")
public class TabelaClienteBean implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  int cod;
    private  String nome;   
    private  String cpf;
    private  String datanascimento;
    private  String rg;
    private  String endereço;
    private  String numero;
    private  String email;
    private  String genero;

    public TabelaClienteBean()
    {
        
    }
    
    public TabelaClienteBean(int cod, String nome, String cpf,String datanascimento, String endereço, String numero, String email, String genero) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.endereço = endereço;
        this.numero = numero;
        this.email = email;
        this.genero = genero;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "TabelaClienteBean{" + "cod=" + cod + ", nome=" + nome + ", cpf=" + cpf + ", datanascimento=" + datanascimento + ", rg=" + rg + ", endere\u00e7o=" + endereço + ", numero=" + numero + ", email=" + email + ", genero=" + genero + '}';
    }


   
}
