package Servlet;

import Hibernate.HibernateAulaDAO;
import com.bean.TabelaClienteBean;
import com.bean.TabelaPetBean;
import com.bean.TabelaTelefoneBean;
import com.bean.TabelaUsuarioBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
        ArrayList listaUsuarioLogado = new ArrayList();
        
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

            
        HibernateAulaDAO logar = new HibernateAulaDAO();
        String usuario = request.getParameter("usuario");
	String senha= request.getParameter("senha");
                
        TabelaUsuarioBean login = new TabelaUsuarioBean();
        
        login = logar.login(usuario,senha);
        String usuarioLogado = login.getUsuario();
        
        if(login.getCod() == 99)
        {
             try
            {
            RequestDispatcher rd = request.getRequestDispatcher("LoginErro.jsp");
            rd.forward(request, response);  
            }catch(Exception ex)
            {
            } 
        }
        
        
        if(login.getCod() == 1)
        {
                 try
                    {                        
                    HttpSession session = request.getSession(true);
               //     listaUsuarioLogado.add(usuarioLogado);
                    session.setAttribute("usuario", usuarioLogado);
                    RequestDispatcher rd = request.getRequestDispatcher("TelaAdministrador.jsp");
                    rd.forward(request, response);
                    
                    }catch(Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }            

        }
        
          if(login.getCod() > 1 )
        {
             try
                {
               // request.setAttribute("usuario", usuarioLogado);
                HttpSession session = request.getSession(true);
               //     listaUsuarioLogado.add(usuarioLogado);
                    session.setAttribute("usuario", usuarioLogado);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
                }catch(Exception ex)
                  {
                    System.out.println(ex.getMessage());
                  }
        }             
          
         
          

                    
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
