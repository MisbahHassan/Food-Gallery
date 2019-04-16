package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Italian_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <title>\n");
      out.write("            Pakistani Cuisine\n");
      out.write("     </title>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("         html, body {\n");
      out.write("            height: 100%;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .bg {\n");
      out.write("\n");
      out.write("    background-image: url(\"images/italian.jpg\");\n");
      out.write("     height: auto;\n");
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
      out.write("    <body class=\"bg\">\n");
      out.write("        <div >\n");
      out.write("    <h1 align=center style=\"font-size:300%; font-family:Comic Sans MS; color: white\">Italian Food</h1>\n");
      out.write("<table cellspacing=\"40\" align=center>\n");
      out.write("<tr>\n");
      out.write("<td align=center><a href=\"Pasta.jsp\"><img class=\"border\" src=\"images/noddles.png\" width=\"250\" height=\"200\"></a><br><b style=\"font-size:150%; font-family:Comic Sans MS; color: white\">Spaghetti</b></td>\n");
      out.write("<td align=center><a  href=\"Pizza.jsp\"><img class=\"border\" src=\"images/pizza.jpg\" width=\"250\" height=\"200\"></a><br><b style=\"font-size:150%; font-family:Comic Sans MS; color: white\">Pizza</b></td>\n");
      out.write("<td align=center><a  href=\"Burger.jsp\"><img class=\"border\" src=\"images/burger.jpg\"width=\"250\" height=\"200\"></a><br><b style=\"font-size:150% ; font-family:Comic Sans MS; color: white\">Burgers</b></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("        </div>\n");
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
