/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Hibernate.HibernateAulaDAO;
import com.bean.TabelaClienteBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gonçalves
 */
@WebServlet(urlPatterns = {"/MeuServlet"})
public class ServletPrincipal extends HttpServlet {

    HibernateAulaDAO bd=new HibernateAulaDAO();
    
    protected void Process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
            if(request.getParameter("action").equals("ListarCD"))
            {
                ProcessListarCD(request,response);
            }
                
        }catch(Exception e)
            {
                System.out.println(e.getMessage());
                RequestDispatcher rd = request.getRequestDispatcher("/erro.jsp");
                rd.forward(request,response);

            }
        
        
        try
        {
            if(request.getParameter("action").equals("Deletar"))
            {
                int cod = Integer.parseInt(request.getParameter("cod"));
                TabelaClienteBean cliente = new TabelaClienteBean();
                cliente.setCod(cod);
                bd.delete(cliente);
                ProcessSucesso(request,response);
            }
        }catch(Exception e)
            {
                System.out.println(e.getMessage());
                RequestDispatcher rd = request.getRequestDispatcher("/erro.jsp");
                rd.forward(request,response);

            }
        
    }
           protected void ProcessListarCD(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
           {
//            ArrayList clientes = bd.listar("from TabelaClienteBean");
//            TabelaClienteBean cliente = new TabelaClienteBean();
//            cliente = (TabelaClienteBean) clientes.get(0);
//            
//            request.setAttribute("ClienteLista",cliente);
            RequestDispatcher rd = request.getRequestDispatcher("/Listagem.jsp");
            rd.forward(request,response);// abre a pagina
           
           }
           
            protected void ProcessSucesso(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
           {
           RequestDispatcher rd = request.getRequestDispatcher("/Mensagem.jsp");
            rd.forward(request,response);// abre a pagina
           }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Process(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
