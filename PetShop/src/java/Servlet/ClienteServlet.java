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
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try
        {
            if(request.getParameter("action").equals("index"))
               processIndex(request,response);
        }catch(Exception ex)
        {
            
        }
                
        try
        {
            if(request.getParameter("action").equals("Alterar"))
            {
                int cod = Integer.parseInt(request.getParameter("codigo"));
                TabelaClienteBean cliente = new TabelaClienteBean();
                TabelaTelefoneBean telefone = new TabelaTelefoneBean();
                TabelaUsuarioBean usuario = new TabelaUsuarioBean();
                TabelaPetBean pet = new TabelaPetBean();
                
                
                HibernateAulaDAO bd = new HibernateAulaDAO();
                cliente = bd.getClienteById(cod);
                telefone = bd.getTelefoneById(cod);
                usuario = bd.getUsuarioById(cod);
                pet = bd.getPetById(cod);
//informações que serão enviadas para a tela do request
                int codigo = cliente.getCod();
                String nome = cliente.getNome();
                String endereco = cliente.getEndereço();
                String numero = cliente.getNumero();
                String email = cliente.getEmail();
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
                
                request.setAttribute("cod", codigo);
                request.setAttribute("nome", nome);
                request.setAttribute("endereco", endereco);
                request.setAttribute("numero",numero);
                request.setAttribute("email", email);
                request.setAttribute("genero", genero);
                request.setAttribute("rg", rg);
                request.setAttribute("cpf", cpf);
                request.setAttribute("dataDeNascimento", dataDeNascimento);
                request.setAttribute("ddd", ddd);
                request.setAttribute("numeroTelefone", numeroTelefone);
                request.setAttribute("nomeCliente", nomeCliente);
                request.setAttribute("nomePet", nomePet);
                request.setAttribute("racaPet", racaPet);
                request.setAttribute("pesoPet", pesoPet);
                request.setAttribute("dataNascimentoPet", dataNascimentoPet);
                
                
                request.getRequestDispatcher("AlterarCadastroCliente.jsp").forward(request,response);
   
          }
        }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
     
         try
        {
            if(request.getParameter("action").equals("Deletar"))
            {
                int cod = Integer.parseInt(request.getParameter("cod"));
                TabelaClienteBean cliente = new TabelaClienteBean();
                TabelaTelefoneBean telefone = new TabelaTelefoneBean();
                TabelaUsuarioBean usuario = new TabelaUsuarioBean();
                TabelaPetBean pet = new TabelaPetBean();
                cliente.setCod(cod);
                telefone.setCod(cod);
                usuario.setCod(cod);
                pet.setCod(cod);
                HibernateAulaDAO bd = new HibernateAulaDAO();
                bd.delete(cliente);
                bd.delete(telefone);
                bd.delete(usuario);
                bd.delete(pet);
                RequestDispatcher rd = request.getRequestDispatcher("SucessoExclusao.jsp");
                rd.forward(request,response);
            }
        }catch(Exception e)
            {
                System.out.println(e.getMessage());

            }
             
        try{
            if(request.getParameter("action").equals("ListarCliente"))
            {
          RequestDispatcher rd = request.getRequestDispatcher("Listagem.jsp");
          rd.forward(request,response); 
            }
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
              
        try
        {
        if(request.getParameter("action").equals("retorno"))
        {
            processRetorno(request, response);
        }
        }catch(Exception ex)
        {
            
        }
      
        try
        {
            if(request.getParameter("nome") != null && request.getParameter("endereco") != null &&
               request.getParameter("numero") != null && request.getParameter("cpf") != null &&
               request.getParameter("rg") != null && request.getParameter("genero") != null &&
               request.getParameter("email") != null && request.getParameter("dataDeNascimento") != null &&
               request.getParameter("ddd") != null && request.getParameter("telefone") != null &&
               request.getParameter("senha") != null && request.getParameter("nome_pet") != null &&
               request.getParameter("raca_pet") != null && request.getParameter("peso_pet") != null &&
               request.getParameter("dataDeNascimento_pet") != null)
            {
                    String nome = request.getParameter("nome");
                    String endereco = request.getParameter("endereco");
                    String numero = request.getParameter("numero");
                    String cpf = request.getParameter("cpf");
                    String rg = request.getParameter("rg");
                    String email = request.getParameter("email");
                    String genero = request.getParameter("genero");
                    String dataNascimento = request.getParameter("dataDeNascimento");
                    String ddd = request.getParameter("ddd");
                    String telefone = request.getParameter("telefone");
                    String senha = request.getParameter("senha");
                    String nomePet = request.getParameter("nome_pet");
                    String racaPet = request.getParameter("raca_pet");
                    String pesoPet = request.getParameter("peso_pet");
                    String dataNascimentoPet = request.getParameter("dataDeNascimento_pet");
                    
                    TabelaClienteBean cliente = new TabelaClienteBean();
                    TabelaTelefoneBean telefoneCliente = new TabelaTelefoneBean();
                    TabelaUsuarioBean usuario = new TabelaUsuarioBean();
                    TabelaPetBean pet = new TabelaPetBean();
                    
                    cliente.setNome(nome);
                    cliente.setEndereço(endereco);
                    cliente.setNumero(numero);
                    cliente.setCpf(cpf);
                    cliente.setRg(rg);
                    cliente.setEmail(email);
                    cliente.setGenero(genero);
                    cliente.setDatanascimento(dataNascimento);
                    telefoneCliente.setDdd(ddd);
                    telefoneCliente.setTelefone(telefone);
                    telefoneCliente.setNomeCliente(nome);
                    usuario.setUsuario(email);
                    usuario.setSenha(senha);
                    pet.setNome(nomePet);
                    pet.setRaca(racaPet);
                    pet.setPeso(pesoPet);
                    pet.setDataDeNascimento(dataNascimentoPet);
                    HibernateAulaDAO bd = new HibernateAulaDAO();

                    if(request.getParameter("cod") != null)
                    {
                        int cod = Integer.parseInt(request.getParameter("cod"));
                        cliente.setCod(cod);
                        telefoneCliente.setCod(cod);
                        pet.setCod(cod);
                        usuario.setCod(cod);
                        bd.update(cliente);
                        bd.update(usuario);
                        bd.update(telefoneCliente);
                        bd.update(pet);
                        RequestDispatcher rd = request.getRequestDispatcher("SucessoCadastroCliente.jsp");
                        rd.forward(request,response);
                    }
                                       
                    if(request.getParameter("cod") == null)
                    {
                    bd.insert(cliente);
                    bd.insert(telefoneCliente);
                    bd.insert(usuario);
                    bd.insert(pet);
                    RequestDispatcher rd = request.getRequestDispatcher("SucessoCadastroCliente.jsp");
                    rd.forward(request,response); 
                    }

            }
            else
            {
                
            }
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
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

    protected void processRetorno(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
          RequestDispatcher rd = request.getRequestDispatcher("TelaAdministrador.jsp");
          rd.forward(request,response); 
        }
        catch(Exception ex)
        {
            
        }
    }
        protected void processIndex(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
          RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
          rd.forward(request,response); 
        }
        catch(Exception ex)
        {
            
        }    
    }

}
