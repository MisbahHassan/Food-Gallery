package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PlaceAddress_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>details</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        html, body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    ");

        String error = request.getParameter("error");
        if (error == null || error == "null") {
            error = "";
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    ");

        if (error.equals("Your Order Placed")) {
      out.write("\n");
      out.write("    <script>\n");
      out.write("        window.alert(\"Your Order Placed.\");\n");
      out.write("    </script>");

        }
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\"background-color: #EDA252\">\n");
      out.write("        <form action=\"PlaceOrder.jsp\">\n");
      out.write("            <h1 align=\"center\">Please Enter Delivery details</h1>\n");
      out.write("            <table cellspacing=\"4\" cellpadding=\"2\" align=\"center\">\n");
      out.write("\n");
      out.write("                <tr><td>Name</td><td><input type=\"text\" required name=\"name\" id=\"name\"><br/> </td></tr>\n");
      out.write("                <tr><td>Mobile Number</td><td><input type=\"number\" required name=\"num\" id=\"num\" > <br/></td></tr>\n");
      out.write("                <tr><td>Address</td><td><textarea rows=\"5\" cols=\"15\">\n");
      out.write("                        </textarea><br/><input type=\"hidden\" name=\"total\" value=\"");
      out.print(Double.parseDouble(request.getParameter("total")));
      out.write("\"></td></tr>\n");
      out.write("                <tr><td></td><td>\n");
      out.write("                        <input type=\"submit\" name=\"submit\" value=\"submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
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
