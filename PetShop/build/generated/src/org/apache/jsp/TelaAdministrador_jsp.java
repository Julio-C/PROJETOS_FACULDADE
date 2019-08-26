package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TelaAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/barrademenu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Menu Principal</h1>\n");
      out.write("        <br>\n");
      out.write("        <!--p><a href=\"ClienteServlet?action=retorno\">Listar Produtos</a></p!-->\n");
      out.write("        <!--p><a href=\"ClienteServlet?action=ListarCliente\">Listar Clientes</a></p!-->\n");
      out.write("    \n");
      out.write("          <div class=\"container\">\n");
      out.write("        <!-- Exemplo de linha de colunas -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <h2>Clientes</h2>\n");
      out.write("            <p>Listagem de todos os clientes cadastrados em seu site </p>\n");
      out.write("            <p><a class=\"btn btn-secondary\" href=\"ClienteServlet?action=ListarCliente\" role=\"button\">Listar Clientes »</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <h2>Produtos</h2>\n");
      out.write("            <p>Listagem de todos os Produtos cadastrados em seu site</p>\n");
      out.write("            <p><a class=\"btn btn-secondary\" href=\"ProdutoServlet?action=ListarProdutos\" role=\"button\">Listar Produtos »</a></p>\n");
      out.write("            <p>Inserir produtos</p>\n");
      out.write("            <p><a class=\"btn btn-secondary\" href=\"ProdutoServlet?action=inserir\" role=\"button\">Inserir Produtos »</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <h2>Listar Pets</h2>\n");
      out.write("            <p>Listagem de todos os Pets cadastrados em seu site</p>\n");
      out.write("            <p><a class=\"btn btn-secondary\" href=\"PetServlet?action=ListarPet\" role=\"button\">Listar Pets »</a></p>\n");
      out.write("          </div>\n");
      out.write("         <div class=\"col-md-4\">\n");
      out.write("            <h2>Promoção</h2>\n");
      out.write("            <p>Inserir produto na tela de Promoção </p>\n");
      out.write("            <p><a class=\"btn btn-secondary\" href=\"ProdutoServlet?action=ListarProdutosPromocao\" role=\"button\">Inserir Promoção »</a></p>\n");
      out.write("        </div>\n");
      out.write("           <div class=\"col-md-4\">\n");
      out.write("            <h2>Retonar</h2>\n");
      out.write("            <p>Deslogar usuário administrado</p>\n");
      out.write("            <p><a class=\"btn btn-secondary\" href=\"index.jsp\" role=\"button\">Voltar »</a></p>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("      </div> <!-- /container -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
