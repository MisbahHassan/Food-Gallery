package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import DTO.CartDTO;

public final class ViewCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 HttpSession sess = null;
                ArrayList<CartDTO> list = null;
                Double amount = 0.0;
                Double total = 0.0;
            
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .bg {\n");
      out.write("\n");
      out.write("            background-color: #DC7633;\n");
      out.write("            background-position: center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        .border \n");
      out.write("        {\n");
      out.write("            border:outset;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            border-color: black;\n");
      out.write("            color:black;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body class=\"bg\">\n");
      out.write("        <div >\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");

                session = request.getSession(false);
                list = new ArrayList<CartDTO>();
                list = (ArrayList<CartDTO>) session.getAttribute("CartList");

                if (session.getAttribute("name") != null) {
                    if (list.size() == 0) {
            
      out.write("\n");
      out.write("            <b style=\"color:white; text-align: center\">No Item In The Cart...</b>\n");
      out.write("            ");

            } else {
      out.write("\n");
      out.write("            <h1 style=\"color:white; text-align: center\">Items in cart are </h1>\n");
      out.write("            ");
    for (CartDTO d : list) {
      out.write("\n");
      out.write("            <form action=\"RemoveFromCart.jsp\"><table align=\"center\">\n");
      out.write("                    <table class=\"border\" cellspacing=\"4\" cellpadding=\"2\"  align=\"center\" bgcolor=\"white\"  >\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                ");
      out.print(d.getName());
      out.write("</td>\n");
      out.write("                            <td>  ");
      out.print(d.getQuantity());
      out.write("</td>\n");
      out.write("                            ");

                                amount = d.getQuantity() * d.getPrice();
                                total = total + amount;
                            
      out.write("\n");
      out.write("                            <td>  ");
      out.print(amount);
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"cartItemIndex\" value=\"");
      out.print(list.indexOf(d));
      out.write("\">\n");
      out.write("                        <td>    <input type=\"submit\" value=\"remove\" >\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            <form action=\"PlaceOrder.jsp\"><table class=\"border\" cellspacing=\"4\" cellpadding=\"2\"  align=\"center\" bgcolor=\"white\"  >\n");
      out.write("\n");
      out.write("                <tr><td><b style=\"color:#C0392B\"> Your Total Amount is ");
      out.print(total);
      out.write("</b></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Done\"></td></tr>\n");
      out.write("                </table></form>\n");
      out.write("                ");
 }
                } else if (session.getAttribute("name") == null) {
                
      out.write("\n");
      out.write("                <b style=\"color:white; text-align: center\">Login First</b>\n");
      out.write("                ");

                        response.sendRedirect("Login.jsp");

                    }
                
      out.write("\n");
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
