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

public class QuadradoDao {
         private Connection connection;
    
    public QuadradoDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
      public void Adicionar( Quadrado quadrado ){
        
     
            
                   String sql = "insert into quadrado"
                           +"( valor1 , a , p)"
                           + "values (?,?,?)";
          
               
                try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setDouble(1, quadrado.getValor1());
             stmt.setDouble(2, quadrado.getA());
             stmt.setDouble(3, quadrado.getP());
           
                
             stmt.execute();
             stmt.close();
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
    public void pesquisar(String campo,String inf,Quadrado c){
        try {
            PreparedStatement stmt = this.connection.prepareStatement
                    ("select * from quadrado where " +campo+ " like '%" +inf+ "%'");
            ResultSet rs= stmt.executeQuery();
            while (rs.next()){
                //criando o objeto Soma
                    //Soma c = new Soma();
                
                c.setCod_quad(rs.getInt("cod_quad"));
                c.setValor1((rs.getDouble("valor1")));
                c.setA(rs.getDouble("a"));
                c.setP(rs.getDouble("p"));
                 
                
            }
            rs.close();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }   
    
    public List<Quadrado> getLista (String campo, String inf){
        try {
            List <Quadrado> quad = new ArrayList<Quadrado>();
            PreparedStatement stmt = this.connection
.prepareStatement ("select * from quadrado where "+campo+" like'% "+inf+"%'");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            
            Quadrado s = new Quadrado();
            s.setCod_quad((rs.getInt("cod_quad")));
            s.setA(rs.getDouble("a"));
            s.setP(rs.getDouble("p"));
            quad.add(s);
        }
        rs.close();
        stmt.close();
        return quad;
        
        } catch (Exception e) {
        throw new RuntimeException(e);        
        
        }  
    }
    
public void RELQ(){
     try {
         JasperReport report = JasperCompileManager.compileReport("src/Projeto_julio/Relatorios/RelP.jrxml");
         JasperPrint print = JasperFillManager.fillReport(report,null,connection);
         JasperExportManager.exportReportToPdfFile(print,"src/Projeto_julio/RelP.pdf");
         System.out.println("Relatorio Gerado com Sucesso");
     } 
     catch (Exception e) {
     throw new RuntimeException(e);
     }
 }
 
 public void ChamaRelQ(){
     try {
         java.awt.Desktop.getDesktop().open(new File("src/Projeto_julio/RelP.pdf"));
     } catch (Exception e) {
     }
 }    
    
    public void remover ( Quadrado c) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from quadrado where cod_quad =?") ;
            
            stmt.setInt(1,c.getCod_quad());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        throw new RuntimeException(e);
        }
    }
               
    
  public void altera(Quadrado c){
        String sql = "update quadrado set valor1=?, a=?, p=? where cod_quad =?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
          
            stmt.setDouble(1, c.getValor1());
            stmt.setDouble(2, c.getA());
            stmt.setDouble(3, c.getP());
            stmt.setInt(4, c.getCod_quad());
        
            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }
}
