package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.ifsp.edu.model.EstadoDAO;
import com.ifsp.edu.model.Estado;

public final class cadastro_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/menu.jsp", out, false);
      out.write("   \n");
      out.write("\n");
      out.write("       \n");
      out.write("    <form id=\"frmCadCliente\"  method=\"get\" action=\"\" >\n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td> Nome</td>\n");
      out.write("                <td> <input type=\"text\" name=\"nome\" id=\"nome_id\">  </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td> Endereco</td>\n");
      out.write("                <td> <input type=\"text\" name=\"endereco\" id=\"endereco_id\">  </td>             \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> Cep</td>\n");
      out.write("                <td> <input type=\"text\" name=\"cep\" id=\"cep_id\">  </td>            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td> Email</td>\n");
      out.write("                <td> <input type=\"text\" name=\"email\" id=\"email_id\">  </td>              \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td> Telefone</td>\n");
      out.write("                <td> <input type=\"text\" name=\"telefone\" id=\"telefone_id\">  </td>              \n");
      out.write("            </tr>   \n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td> Sexo </td>\n");
      out.write("                <td>\n");
      out.write("                           <select name=\"cbSexo\">\n");
      out.write("                                <option value=\"M\"> Masculino </option>);\n");
      out.write("                                <option value=\"F\"> Feminino </option>);                        \n");
      out.write("                          </select>\n");
      out.write("                </td>                 \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td> Estado </td>\n");
      out.write("                <td>\n");
      out.write("                           <select name=\"cbEstado\">\n");
      out.write("                               ");
  EstadoDAO dao=new EstadoDAO();
                                List<Estado> list = dao.Lista();
                                Estado est;
                                for (Object obj : list){
                                    est = (Estado)obj;
                                    out.println("<option value=" + est.getSigla() + ">" + est.getDescricao().trim() + "</option>");
                                }
                            
      out.write(" \n");
      out.write("                          </select>\n");
      out.write("                </td>              \n");
      out.write("            </tr>              \n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"> <input type=\"submit\" value=\"Gravar\"> </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.jsp", out, false);
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
