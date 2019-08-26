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
import projeto_julio.modelo.Paralelogramo;

public class ParalelogramoDao {
     private Connection connection;
    
    public ParalelogramoDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
      public void Adicionar( Paralelogramo paralelogramo ){
        
            
                   String sql = "insert into paralelogramo"
                           +"( valor1 , a , b , p)"
                           + "values (?,?,?,?)";
          
               
                try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
             
             stmt.setDouble(1, paralelogramo.getValor1());
             stmt.setDouble(2, paralelogramo.getA());
             stmt.setDouble(3, paralelogramo.getB());
             stmt.setDouble(4, paralelogramo.getP());
           
                
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
    public void pesquisar(String campo,String inf,Paralelogramo c){
        try {
            PreparedStatement stmt = this.connection.prepareStatement
                    ("select * from paralelogramo where " +campo+ " like '%" +inf+ "%'");
            ResultSet rs= stmt.executeQuery();
            while (rs.next()){
                //criando o objeto Soma
                    //Soma c = new Soma();
                
                c.setCod_par(rs.getInt("cod_par"));
                c.setValor1((rs.getDouble("valor1")));
                c.setA(rs.getDouble("a"));
                c.setB(rs.getDouble("b"));
                 c.setP(rs.getDouble("p"));
                
            }
            rs.close();
            stmt.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }    
    
    public void remover ( Paralelogramo c) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from paralelogramo where Cod_par =?") ;
            
            stmt.setInt(1,c.getCod_par());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        throw new RuntimeException(e);
        }
    }
 public List<Paralelogramo> getLista (String campo, String inf){
        try {
            List <Paralelogramo> para = new ArrayList<Paralelogramo>();
            PreparedStatement stmt = this.connection.prepareStatement
        ("select * from paralelogramo where "+campo+" like '%"+inf+"%'");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            
            Paralelogramo s = new Paralelogramo();
            s.setCod_par((rs.getInt("cod_par")));
            s.setValor1(rs.getDouble("valor1"));
            s.setA(rs.getDouble("a"));
            s.setB(rs.getDouble("b"));
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
    
 public void RELp(){
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
 
 public void ChamaRelp(){
     try {
         java.awt.Desktop.getDesktop().open(new File("src/Projeto_julio/RelP.pdf"));
     } catch (Exception e) {
     }
 }
 
  public void altera(Paralelogramo c){
        String sql = "update paralelogramo set valor1=?, a=?, b=?,p=? where cod_par =?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
          
            stmt.setDouble(1, c.getValor1());
            stmt.setDouble(2, c.getA());
            stmt.setDouble(3, c.getB());
            stmt.setDouble(4, c.getP());
            stmt.setInt(5, c.getCod_par());
        
            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }    
}
