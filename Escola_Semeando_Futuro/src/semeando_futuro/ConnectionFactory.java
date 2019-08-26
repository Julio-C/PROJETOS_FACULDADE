/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thiago
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
   System.out.println("Conectado ao Banco de Dados");
   
   try{
     return      
     DriverManager.getConnection("jdbc:mysql://"+"localhost"+"/semeando_futuro","admin","admin");
   }catch(SQLException e){
     throw new RuntimeException(e);
    }
   }
    public  static void main(String[]args){
      new ConnectionFactory().getConnection();
        System.out.println("Conexão Criada com Sucesso");
    }
}
