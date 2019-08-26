package projeto_julio.dao;

import Projeto_julio.ConnectionFactory;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import projeto_julio.modelo.Quadrado;
import projeto_julio.modelo.Retangulo;


public class RetanguloDao {
    
        private Connection connection;
    
    public RetanguloDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
      public void Adicionar( Retangulo quadrado ){
        
     
            
                   String sql = "insert into retangulo"
                           +"( h , b , p , valor1)"
                           + "values (?,?,?,?)";
          
               
                try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setDouble(1, quadrado.getH());
             stmt.setDouble(2, quadrado.getB());
             stmt.setDouble(3, quadrado.getP());
             stmt.setDouble(4,quadrado.getValor1());
           
                
             stmt.execute();
             stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
    }
                
}
      public void RELr(){
     try {
         JasperReport report = JasperCompileManager.compileReport("src/Projeto_julio/Relatorios/RelRe.jrxml");
         JasperPrint print = JasperFillManager.fillReport(report,null,connection);
         JasperExportManager.exportReportToPdfFile(print,"src/Projeto_julio/RelRe.pdf");
         System.out.println("Relatorio Gerado com Sucesso");
     } 
     catch (Exception e) {
     throw new RuntimeException(e);
     }
 }
 
 public void ChamaRelr(){
     try {
         java.awt.Desktop.getDesktop().open(new File("src/Projeto_julio/RelRe.pdf"));
     } catch (Exception e) {
     }
 }
 
      public List<Retangulo> getLista (String campo, String inf){
        try {
            List <Retangulo> para = new ArrayList<Retangulo>();
            PreparedStatement stmt = this.connection.prepareStatement
        ("select * from retangulo where "+campo+" like '%"+inf+"%'");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            
            Retangulo s = new Retangulo();
            s.setCod_ret((rs.getInt("cod_ret")));
            s.setB(rs.getDouble("b"));
            s.setH(rs.getDouble("h"));
            s.setP(rs.getDouble("p"));
           
            para.add(s);
        }
        rs.close();
        stmt.close();
        return para;
        
        } catch (Exception e) {
        throw new RuntimeException(e);        
        
        }  
    }
      
      
      
 
    /**
     *
     * @param campo
     * @param inf
     * @param c
     */
    public void pesquisar(String campo,String inf,Retangulo c){
        try {
            PreparedStatement stmt = this.connection.prepareStatement
                    ("select * from retangulo where " +campo+ " like '%" +inf+ "%'");
            ResultSet rs= stmt.executeQuery();
            while (rs.next()){
                //criando o objeto Soma
                    //Soma c = new Soma();
                
    
                
                c.setCod_ret(rs.getInt("cod_ret"));
                c.setH((rs.getDouble("h")));
                c.setB(rs.getDouble("b"));
                c.setP(rs.getDouble("p"));
                 
                
            }
            rs.close();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }    
    
    public void remover ( Retangulo c) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from retangulo where cod_ret =?") ;
            
 
            
            stmt.setInt(1,c.getCod_ret());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        throw new RuntimeException(e);
        }
    }
               
    
  public void altera(Retangulo c){
        String sql = "update retangulo set h=?, b=?, p=? where cod_ret =?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
          
                                    int cod_ret;
    double h, b, p;
            
            stmt.setDouble(1, c.getH());
            stmt.setDouble(2, c.getB());
            stmt.setDouble(3, c.getP());
            stmt.setInt(4, c.getCod_ret());
        
            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }
}
