package com.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TabelaProduto")
public class TabelaProdutoBean implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cod;
    private String nome;
    private String imagem1;
    private String imagem2;
    private String imagem3;
    private String categoria;
    private String descricao;
    private String peso;
    private String preco;
    private String dataVencimento;
    private String desconto;

    public TabelaProdutoBean() {
    }

    public TabelaProdutoBean(int cod, String nome, String imagem1, String imagem2, String imagem3, String categoria, String descricao, String peso, String preco, String dataVencimento, String desconto) {
        this.cod = cod;
        this.nome = nome;
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.imagem3 = imagem3;
        this.categoria = categoria;
        this.descricao = descricao;
        this.peso = peso;
        this.preco = preco;
        this.dataVencimento = dataVencimento;
        this.desconto = desconto;
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

    public String getImagem1() {
        return imagem1;
    }

    public void setImagem1(String imagem1) {
        this.imagem1 = imagem1;
    }

    public String getImagem2() {
        return imagem2;
    }

    public void setImagem2(String imagem2) {
        this.imagem2 = imagem2;
    }

    public String getImagem3() {
        return imagem3;
    }

    public void setImagem3(String imagem3) {
        this.imagem3 = imagem3;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "TabelaProdutoBean{" + "cod=" + cod + ", nome=" + nome + ", imagem1=" + imagem1 + ", imagem2=" + imagem2 + ", imagem3=" + imagem3 + ", categoria=" + categoria + ", descricao=" + descricao + ", peso=" + peso + ", preco=" + preco + ", dataVencimento=" + dataVencimento + ", desconto=" + desconto + '}';
    }
        
}
