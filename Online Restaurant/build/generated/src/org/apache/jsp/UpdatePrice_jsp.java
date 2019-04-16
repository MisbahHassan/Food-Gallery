package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdatePrice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <style>\n");
      out.write("   .button {\n");
      out.write("    background-color: #F14D29; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 15px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Price</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#EDA252\">\n");
      out.write("        <h1 align=\"center\">Update Price</h1>\n");
      out.write("        <form action=\"updatetInDb.jsp\" >\n");
      out.write("              <table cellspacing=\"4\" cellpadding=\"10\"  align=\"center\">\n");
      out.write("             <tr>\n");
      out.write("                    <td><b>Region: </b></td>\n");
      out.write("                    <td> <select name=\"place\">\n");
      out.write("                            <option value=\"\">-Select Place-</option>\n");
      out.write("                            <option value=\"Pakistan\">Pakistan</option>\n");
      out.write("                            <option value=\"indian\">Indian</option>\n");
      out.write("                            <option value=\"italian\">Italian</option>\n");
      out.write("                            <option value =\"Chinese\">Chinese</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("        </select><br><br>\n");
      out.write("        <tr><td> <b>Category: </b></td><td><input type=\"text\" name=\"category\"></td></tr><br><br>\n");
      out.write("       <tr><td> <b>Item: </b></td> <td><input type=\"text\" name=\"item\"></td></tr><br><br>\n");
      out.write("       <tr><td> <b>New Price: </b> </td><td><input type=\"text\" name=\"price\"></td></tr><br><br>\n");
      out.write("       <tr><td><td> <input type=\"submit\" class=\"button\" value=\"Update Price\"></td></td></tr><br>\n");
      out.write("              </table>\n");
      out.write("     </form>\n");
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
