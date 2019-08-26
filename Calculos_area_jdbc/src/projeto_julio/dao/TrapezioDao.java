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
import projeto_julio.modelo.Trapezio;

public class TrapezioDao {
    
       private Connection connection;
    
    public TrapezioDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
      public void Adicionar( Trapezio quadrado ){
        
      
            
                   String sql = "insert into trapezio"
                           +"( a , b , c , d , p )"
                           + "values (?,?,?,?,?)";
          
               
                try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
           stmt.setDouble(1, quadrado.getA());
           stmt.setDouble(2, quadrado.getB());
           stmt.setDouble(3, quadrado.getC());
           stmt.setDouble(4, quadrado.getD());
           stmt.setDouble(5, quadrado.getP());
           
                
             stmt.execute();
             stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
    }
                
}
      
      public List<Trapezio> getLista (String campo, String inf){
        try {
            List <Trapezio> para = new ArrayList<Trapezio>();
            PreparedStatement stmt = this.connection.prepareStatement
        ("select * from trapezio where "+campo+" like '%"+inf+"%'");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            
            Trapezio s = new Trapezio();
            s.setCod_tra((rs.getInt("cod_tra")));
            s.setA(rs.getDouble("a"));
            s.setB(rs.getDouble("b"));
            s.setC(rs.getDouble("c"));
            s.setD(rs.getDouble("d"));
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
    public void pesquisar(String campo,String inf,Trapezio c){
        try {
            PreparedStatement stmt = this.connection.prepareStatement
                    ("select * from trapezio where "+campo+" like '%"+inf+"%'");
            ResultSet rs= stmt.executeQuery();
            while (rs.next()){
                //criando o objeto Soma
                    //Soma c = new Soma();
                
    
                
                c.setCod_tra(rs.getInt("cod_tra"));
                c.setA((rs.getDouble("a")));
                c.setB(rs.getDouble("b"));
                c.setC(rs.getDouble("c"));
                c.setD(rs.getDouble("d"));
                c.setP(rs.getDouble("p"));
                 
                
            }
            rs.close();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }    
    
    public void RELt(){
     try {
         JasperReport report = JasperCompileManager.compileReport("src/Projeto_julio/Relatorios/RelT.jrxml");
         JasperPrint print = JasperFillManager.fillReport(report,null,connection);
         JasperExportManager.exportReportToPdfFile(print,"src/Projeto_julio/RelT.pdf");
         System.out.println("Relatorio Gerado com Sucesso");
     } 
     catch (Exception e) {
     throw new RuntimeException(e);
     }
 }
 
 public void ChamaRelt(){
     try {
         java.awt.Desktop.getDesktop().open(new File("src/Projeto_julio/RelT.pdf"));
     } catch (Exception e) {
     }
 }
    
    public void remover ( Trapezio c) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from trapezio where cod_tra =?") ;
            
 
            
            stmt.setInt(1,c.getCod_tra());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        throw new RuntimeException(e);
        }
    }
               
    
  public void altera(Trapezio c){
        String sql = "update trapezio set  a=?, b=?, c=? , d=? , p=? where cod_tra =?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
          
      
            
            stmt.setDouble(1, c.getA());
            stmt.setDouble(2, c.getB());
            stmt.setDouble(3, c.getC());
            stmt.setDouble(4, c.getD());
            stmt.setDouble(5, c.getP());
            stmt.setInt(6, c.getCod_tra());
        
            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }
    
}
