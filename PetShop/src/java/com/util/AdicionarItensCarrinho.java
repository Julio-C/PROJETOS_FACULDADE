package com.util;


import com.bean.TabelaCarrinhoBean;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class AdicionarItensCarrinho {

	public ArrayList AdicionaItensCarrinho(TabelaCarrinhoBean dado, ArrayList lista) {
				
		if (lista == null)
                {    
                    lista = new ArrayList();
		}	
		lista.add("Produto: " + dado.getNomeProduto()+ " Valor: "+dado.getPrecoProduto() + " Imagem: "+dado.getImagemProduto());
		
                return lista;
	}

}