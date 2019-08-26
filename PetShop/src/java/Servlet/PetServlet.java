/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marco.junior
 */
@WebServlet(name = "PetServlet", urlPatterns = {"/PetServlet"})
public class PetServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        try{ 
            if(request.getParameter("action").equals("ListarPet"))
                processListar(request,response);
            }catch(Exception ex)
            {

            }
        
        
    }

        protected void processListar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          RequestDispatcher rd = request.getRequestDispatcher("ListagemPet.jsp");
          rd.forward(request,response); 
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
