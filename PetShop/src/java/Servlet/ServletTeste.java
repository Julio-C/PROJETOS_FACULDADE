/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author marco.junior
 */
@WebServlet(name = "ServletTeste", urlPatterns = {"/ServletTeste"})
public class ServletTeste extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
                HibernateAulaDAO logar = new HibernateAulaDAO();
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                String usuario = request.getParameter("usuario");
                String senha = request.getParameter("senha");
                
                TabelaUsuarioBean logado = logar.login(codigo, usuario, senha);
                
                if(logado.getCod() != 0 && logado.getUsuario() != null && logado.getSenha() != null)
                {
                    int cod = logado.getCod();
                    String senhaDAO = logado.getSenha();
                    
                    TabelaClienteBean cliente =logar.getClienteById(cod);
                    TabelaTelefoneBean telefone = logar.getTelefoneById(cod);
                    TabelaPetBean pet = logar.getPetById(cod);
                                      
                int codigoCTP = cliente.getCod();
                String nome = cliente.getNome();
                String endereco = cliente.getEndereço();
                String numero = cliente.getNumero();
                String email = cliente.getEmail();
                String senhalogin = senhaDAO;
                String genero = cliente.getGenero();
                String rg = cliente.getRg();
                String cpf = cliente.getCpf();
                String dataDeNascimento = cliente.getDatanascimento();
                String ddd = telefone.getDdd();
                String numeroTelefone = telefone.getTelefone();
                String nomeCliente = telefone.getNomeCliente();
                String nomePet = pet.getNome();
                String racaPet = pet.getRaca();
                String pesoPet = pet.getPeso();
                String dataNascimentoPet = pet.getDataDeNascimento();
                    
                request.setAttribute("codigo", codigoCTP);
                request.setAttribute("nome", nome);
                request.setAttribute("endereco", endereco);
                request.setAttribute("numero",numero);
                request.setAttribute("email", email);
                request.setAttribute("senha", senhalogin);
                request.setAttribute("genero", genero);
                request.setAttribute("rg", rg);
                request.setAttribute("cpf", cpf);
                request.setAttribute("dataDeNascimento", dataDeNascimento);
                request.setAttribute("ddd", ddd);
                request.setAttribute("telefone", numeroTelefone);
                request.setAttribute("nomeCliente", nomeCliente);
                request.setAttribute("nomePet", nomePet);
                request.setAttribute("racaPet", racaPet);
                request.setAttribute("pesoPet", pesoPet);
                request.setAttribute("dataNascimentoPet", dataNascimentoPet);
                    
                RequestDispatcher rd = request.getRequestDispatcher("AlterarCadastroCliente.jsp");
                rd.forward(request,response);// abre a pagina
    
            }
        }catch(Exception ex)
        {
                RequestDispatcher rd = request.getRequestDispatcher("LoginErro.jsp");
                rd.forward(request,response);// abre a pagina
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
