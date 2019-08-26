package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.TabelaProdutoBean;
import com.bean.TabelaTelefoneBean;
import java.util.List;
import java.util.ArrayList;
import Hibernate.HibernateAulaDAO;
import com.bean.TabelaClienteBean;

public final class Gatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      java.util.ArrayList ClienteLista = null;
      synchronized (request) {
        ClienteLista = (java.util.ArrayList) _jspx_page_context.getAttribute("ClienteLista", PageContext.REQUEST_SCOPE);
        if (ClienteLista == null){
          ClienteLista = new java.util.ArrayList();
          _jspx_page_context.setAttribute("ClienteLista", ClienteLista, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>LISTAGEM DE PRODUTOS PARA CAES</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"ProdutoServlet\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<h1><strong>PRODUTOS PARA GATOS</strong></h1>\n");
      out.write("<table class=\"table the-bordered\">\n");
      out.write("    <thead>\n");
      out.write("        <th>CODIGO</th>\n");
      out.write("        <th>NOME</th>\n");
      out.write("        <th>CATEGORIA</th>\n");
      out.write("        <th>DESCRIÇÃO</th>\n");
      out.write("        <th>PESO</th>\n");
      out.write("        <th>PRECO</th>\n");
      out.write("        <th>DATA DE VENCIMENTO</th>\n");
      out.write("        <th>IMAGEM</th>\n");
      out.write("    </thead>\n");
      out.write("<tbody>\n");
      out.write("     \n");
 
List<TabelaProdutoBean> produtos = HibernateAulaDAO.listar(TabelaProdutoBean.class);

for (int i = 0; i < produtos.size(); i++) 
{
    TabelaProdutoBean produto = (TabelaProdutoBean) produtos.get(i);
    String promocao = produto.getCategoria();
    if(promocao.equals("GATOS"))
    {

      out.write("        \n");
      out.write("<tr>\n");
      out.write("    <td> ");
      out.print( produto.getCod() );
      out.write("</td> \n");
      out.write("    <td> ");
      out.print( produto.getNome() );
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( produto.getCategoria() );
      out.write("</td> \n");
      out.write("    <td> ");
      out.print( produto.getDescricao() );
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( produto.getPeso());
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( produto.getPreco() );
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( produto.getDataVencimento() );
      out.write("</td>\n");
      out.write("    <td> <img src=\"Photo/");
      out.print( produto.getImagem1());
      out.write(".jpg\" width=\"100\" height=\"100\" /></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("    ");

    }
}   

      out.write("\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<p><button><a href=\"index.jsp\" type=\"button\" border-radius:15px>Retornar</a></button></p>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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
