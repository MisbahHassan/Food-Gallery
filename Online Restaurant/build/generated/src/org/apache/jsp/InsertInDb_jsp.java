package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class InsertInDb_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Connection con = null;
            Statement stmt1 = null;
            Statement stmt2 = null;
            Statement stmt3 = null;
            Statement stmt4 = null;
            String query1 = null;
            String query2 = null;
            String query3 = null;
            String query4 = null;
            String itemName = null;
            double price = 0;
            String image = null;
            String place = null;
            String category = null;
            ResultSet rs1 = null;
            ResultSet rs2 = null;
            ResultSet rs4 = null;
            int rs3 = 0;
            int catID = -1;
            int pid = -1;
            String message=null;
        
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>insertInDb</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            itemName = request.getParameter("item");
            price = Double.parseDouble(request.getParameter("price"));
            image = ( request.getParameter("image"));
            place = request.getParameter("place");
            category = request.getParameter("category");
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");

                out.println("Connection created");

                stmt1 = con.createStatement();
                query1 = "Select cid from categories where category='" + category + "'";
                rs1 = stmt1.executeQuery(query1);

                stmt2 = con.createStatement();
                query2 = "Select pid from places where place='" + place + "'";
                rs2 = stmt2.executeQuery(query2);
                if (rs1.next()) {
                    catID = rs1.getInt("cid");
                }

              

                if (rs2.next()) {
                    pid = rs2.getInt("pid");
                }
                out.println(itemName + "    " + price + "   " + image + "   " + place + "    " + pid + "  " + category + "  " + catID);

                stmt3 = con.createStatement();
                query3 = "insert into items (itemName,price,placeId,catId,image) values('" + itemName + "','" + price + "','" + pid + "','" + catID + "','" + image + "')";
                rs3 = stmt3.executeUpdate(query3);
                if (rs3 > 0) {
                    message = "New Item Inserted";
                response.sendRedirect("AddNew.jsp?error=" + message);
                } else {
                    out.println("image not inserted");
                }

                
            } catch (Exception exe) {
                exe.printStackTrace();
            }


        
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
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
