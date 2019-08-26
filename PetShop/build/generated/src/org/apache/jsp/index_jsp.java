package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.TabelaProdutoBean;
import Hibernate.HibernateAulaDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/barrademenu.jsp", out, false);
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("      \n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" ></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Mundo Cão</title>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      <main role=\"main\">\n");
      out.write("\n");
      out.write("      <!-- Principal jumbotron, para a principal mensagem de marketing ou call to action -->\n");
      out.write("      <div class=\"jumbotron img p1\"  >\n");
      out.write("         <!--center> <img src=\"http://www.realepetshop.com.br/wp-content/themes/limonada/assets/img-petshop.png\" width=\"200\" height=\"180\" /!-->\n");
      out.write("         <br>\n");
      out.write("         <center><h1 class=\"p1\">PET SHOP - Mundo Cão</h1></center>\n");
      out.write("          <center><p><h2>O maior PetShop online da América Latina.</h2></p></center>     \n");
      out.write("      </div>\n");
      out.write("<tbody>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("           <div class=\"row\">\n");
 
List<TabelaProdutoBean> produtos1 = HibernateAulaDAO.listar(TabelaProdutoBean.class);
String user = (String)session.getAttribute("usuario");

for (int i = 0; i < produtos1.size(); i++) 
{
    TabelaProdutoBean produto5 = (TabelaProdutoBean) produtos1.get(i);

      out.write("        \n");
      out.write("<!--tr> \n");
      out.write("    <td> ");
      out.print( produto5.getNome() );
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( produto5.getCategoria() );
      out.write("</td> \n");
      out.write("    <td> ");
      out.print( produto5.getDescricao() );
      out.write("\n");
      out.write("    <td> ");
      out.print( produto5.getPeso());
      out.write("</td>\n");
      out.write("    <td> ");
      out.print( produto5.getPreco() );
      out.write("</td>\n");
      out.write("    <td> <img src=\"Photo/");
      out.print( produto5.getImagem1());
      out.write(".jpg\" width=\"70\" height=\"70\" /></td>\n");
      out.write("</tr!-->\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <h3><center>");
      out.print(produto5.getCod()+"--"+produto5.getNome() );
      out.write("</center></h3>\n");
      out.write("                <center><p><img src=\"Photo/");
      out.print( produto5.getImagem1());
      out.write(".jpg\" width=\"70\" height=\"70\" ></p></center>\n");
      out.write("                <center><p>");
      out.print("R$"+produto5.getPreco() );
      out.write("</p></center>\n");
      out.write("                <center><p>");
      out.print(produto5.getDescricao());
      out.write("</p></center>\n");
      out.write("                <center><p><a \n");
      out.write("                ");
 String Login = (String)session.getAttribute("usuario"); 
                if(Login !=null) {
      out.write(" href=\"CarrinhoServlet?action=Incluir&produto=");
      out.print(produto5.getNome());
      out.write("\n");
      out.write("                &valor=");
      out.print(produto5.getPreco());
      out.write("&imagem=");
      out.print(produto5.getImagem1());
      out.write("\">Adicionar ao Carrinho ");
}
      out.write("</a></p></center>\n");
      out.write("          </div>  \n");
      out.write("    ");

}   

      out.write("    \n");
      out.write("          </div>\n");
      out.write("</div>\n");
      out.write("</tbody>          \n");
      out.write("    </main>\n");
      out.write("    <footer class=\"container\">\n");
      out.write("      <p>© Companhia FMU.BR</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
