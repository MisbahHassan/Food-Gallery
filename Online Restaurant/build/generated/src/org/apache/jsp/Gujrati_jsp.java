package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Gujrati_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Connection con = null;
            Statement stmt4 = null;
            ResultSet rs4 = null;
            String query4 = null;
            String name = null;
            int count = 0;
            int size = 0;
            int rows = 0;
            int j = 0;
            int i = 0;

        
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .bg {\n");
      out.write("\n");
      out.write("            background-image: url(\"images/back.jpg\");\n");
      out.write("            height: 200%; \n");
      out.write("            background-position: center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        .border \n");
      out.write("        {\n");
      out.write("            border:outset;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            border-color: black;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"bg\">\n");
      out.write("            <h1 align=center style=\"font-size:300%; font-family:Comic Sans MS\">Gujrati</h1>\n");
      out.write("            <table cellspacing=\"40\" align=center>\n");
      out.write("\n");
      out.write("                ");

                    try {

                        name = "Gujrati";
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");

                        query4 = "Select * from items where  catId = ANY (Select cid from categories where category='" + name + "')";
                        stmt4 = con.createStatement();
                        rs4 = stmt4.executeQuery(query4);

                        while (rs4.next()) {
                            count++;

                        }
                        out.println(count);
                        rs4.beforeFirst();
                        
                        size = count;
                        count = 0;
                        rows = size;
                        while (rows > 4) {
                            rows = rows / 2;
                        }
                        for (i = 0; i < rows; i++) {
                            j = size / rows + (size % rows);
      out.write("\n");
      out.write("                <tr> \n");
      out.write("                    ");

                               while ( j > 0 && rs4.next() ) {
      out.write("\n");
      out.write("                               \n");
      out.write("                               <td><img class=\"border\" src=\"images/");
      out.print(rs4.getString("image"));
      out.write("\" width=\"250\" height=\"200\"><br><b style=\"font-size:100%; font-family:Comic Sans MS; \">");
      out.print(rs4.getString("itemName"));
      out.write("<br>Price: ");
      out.print(rs4.getDouble("price"));
      out.write("<br>Quantity:  <input type=text name=\"");
      out.print(rs4.getString("image"));
      out.write("\" required size = \"6\"><br><input type=\"submit\" name=\"order\" value=\"order\"></b></td>\n");
      out.write("                               ");

                                   j--;
                               
      out.write("\n");
      out.write("                            \n");
      out.write("                    ");
   }
      out.write("\n");
      out.write("                    \n");
      out.write("                     </tr> \n");
      out.write("                    ");
        }
                        } catch (Exception exe) {
                            exe.printStackTrace();
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </table>\n");
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
