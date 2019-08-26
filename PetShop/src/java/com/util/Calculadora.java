/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

/**
 *
 * @author marco.junior
 */
public  class Calculadora {
    
    public static int Conversor(String valor)
    {
        String conversao = valor;
        
        String [] moeda = conversao.split(",");
        
        int inteiro = Integer.parseInt(moeda[0]);
        
        return inteiro;
    }
}
