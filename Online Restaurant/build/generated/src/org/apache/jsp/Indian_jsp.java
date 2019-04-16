package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Indian_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <title>\n");
      out.write("            Pakistani Cuisine\n");
      out.write("     </title>\n");
      out.write("    <style>\n");
      out.write("        .bg {\n");
      out.write("\n");
      out.write("    background-image: url(\"images/5.jpg\");\n");
      out.write("    height: 100%; \n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write(".border \n");
      out.write("{\n");
      out.write("    border:outset;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    border-color: black;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bg\">\n");
      out.write("    <h1 align=center style=\"font-size:300%; font-family:Comic Sans MS\">Indian Foods</h1>\n");
      out.write("<table cellspacing=\"40\" align=center>\n");
      out.write("<tr>\n");
      out.write("<td align=center><a target=\"_blank\" href=\"Punjabi.jsp\"><img class=\"border\" src=\"images/punjabi.jpg\" width=\"250\" height=\"200\"></a><br><b style=\"font-size:150%; font-family:Comic Sans MS\">Punjabi</b></td>\n");
      out.write("<td align=center><a target=\"_blank\" href=\"Gujrati.jsp\"><img class=\"border\" src=\"images/gujrati.jpg\" width=\"250\" height=\"200\"></a><br><b style=\"font-size:150%; font-family:Comic Sans MS\">Gujrati</b></td>\n");
      out.write("<td align=center><a target=\"_blank\" href=Bombay.jsp\"><img class=\"border\" src=\"images/bombaytype.jpg\"width=\"250\" height=\"200\"></a><br><b style=\"font-size:150% ; font-family:Comic Sans MS\">Bombay</b></td>\n");
      out.write("<td align=center><a target=\"_blank\" href=\"Bengoli.jsp\"><img class=\"border\" src=\"images/bengoli.jpg\"width=\"250\" height=\"200\"></a><br><b style=\"font-size:150%; font-family:Comic Sans MS\">Bengoli</b></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
