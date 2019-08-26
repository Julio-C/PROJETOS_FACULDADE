/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author marco.junior
 */
public class TabelaCarrinhoBean {
    
    
    private int codProduto;
    private String nomeProduto;
    private String precoProduto;
    private String imagemProduto;

    public TabelaCarrinhoBean() {
    }

    public TabelaCarrinhoBean(int codProduto, String nomeProduto, String precoProduto, String imagemProduto) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.imagemProduto = imagemProduto;
    }
    
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    @Override
    public String toString() {
        return "TabelaCarrinhoBean{" + "codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto + ", imagemProduto=" + imagemProduto + '}';
    }
    
    
}
