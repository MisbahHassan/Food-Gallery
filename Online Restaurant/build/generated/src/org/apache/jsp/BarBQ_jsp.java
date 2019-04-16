package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class BarBQ_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header.jsp");
  }

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
      out.write("            background-image: url(\"images/BarBQ_BK.jpg\");\n");
      out.write("            height:auto;\n");
      out.write("            background-position:center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size:cover;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .border \n");
      out.write("        {\n");
      out.write("            border:outset;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            border-color: black;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body class=\"bg\">\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .mheader {\n");
      out.write("                background-color: #ffcccc;\n");
      out.write("                margin:-15px; \n");
      out.write("                position: fixed;\n");
      out.write("                position:absolute;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a, .dropbtn {\n");
      out.write("                display: inline-block;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("\n");
      out.write("                background-color: brown;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            li.dropdown {\n");
      out.write("\n");
      out.write("                display: inline-block;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("\n");
      out.write("                display: none;\n");
      out.write("\n");
      out.write("                position: absolute;\n");
      out.write("\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("\n");
      out.write("                min-width: 160px;\n");
      out.write("\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("\n");
      out.write("                z-index: 1;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("\n");
      out.write("                color: black;\n");
      out.write("\n");
      out.write("                padding: 12px 16px;\n");
      out.write("\n");
      out.write("                text-decoration: none;\n");
      out.write("\n");
      out.write("                display: block;\n");
      out.write("\n");
      out.write("                text-align: left;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("\n");
      out.write("                display: block;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <header position=\"absolute\">\n");
      out.write("\n");
      out.write("            <img src=\"images/logo.jpg\" height=\"90\" width=\"110\" >\n");
      out.write("            <a href=\"Login.jsp\"><img src=\"images/login2.png\" height=\"40\" width=\"40\" style=\"float: right\"></a><p style=\"float: right\">login</p>\n");
      out.write("            <a href=\"ViewCart.jsp\"><img src=\"images/cart.png\" height=\"40\" width=\"40\" style=\"float: right\"></a><p style=\"float: right\">cart</p>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"Pakistani.jsp\" class=\"dropbtn\">Pakistani</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"Karahi.jsp\">Karahi</a>\n");
      out.write("                    <a href=\"PakistanRice.jsp\">Rice</a>\n");
      out.write("                    <a href=\"Daal.jsp\">Daal</a>\n");
      out.write("                    <a href=\"BarBQ.jsp\">Barbecue</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"Italian.jsp\" class=\"dropbtn\">Italian</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"Burger.jsp\">Burgers</a>\n");
      out.write("                    <a href=\"Pizza.jsp\">Pizza</a>\n");
      out.write("                    <a href=\"Pasta.jsp\">Pastas</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"Chinese.jsp\" class=\"dropbtn\">Chinese</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"Chinese Rice.jsp\">Chinese Rice</a>\n");
      out.write("                    <a href=\"Chinese Soup.jsp\">Soups</a>\n");
      out.write("                    <a href=\"Chinese Noodles.jsp\">Noodles</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"Indian.jsp\" class=\"dropbtn\">Indian</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"Bombay.jsp\">Bombay</a>\n");
      out.write("                    <a href=\"Bengoli.jsp\">Bengoli</a>\n");
      out.write("                    <a href=\"Punjabi.jsp\">Punjabi</a>\n");
      out.write("                    <a href=\"Gujrati.jsp\">Gujrati</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <div >\n");
      out.write("            <h1 align=center style=\"font-size:300%; font-family:Comic Sans MS\">Bar B. Q.</h1>\n");
      out.write("            <table cellspacing=\"40\" align=center>\n");
      out.write("\n");
      out.write("                ");

                    try {

                        name = "BBQ";
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");

                        query4 = "Select * from items where  catId = ANY (Select cid from categories where category='" + name + "')";
                        stmt4 = con.createStatement();
                        rs4 = stmt4.executeQuery(query4);

                        while (rs4.next()) {
                            count++;

                        }

                        rs4.beforeFirst();

                        size = count;
                        count = 0;
                        rows = size;
                        /*while (rows > 4) {
                            rows = rows / 2;
                        }*/
                        
                        if ( rows%4==0)
                        {
                            rows=rows/4;
                        }
                        else if(rows%4!=0)
                        {
                            rows=rows/4+1;
                        }
                        for (i = 0; i < rows; i++) {
                            j = size / rows + (size % rows);
      out.write("\n");
      out.write("                <tr> \n");
      out.write("                    ");

                        while (j > 0 && rs4.next()) {
      out.write("\n");
      out.write("\n");
      out.write("                    <td><form action=\"AddToCart.jsp\"> \n");
      out.write("                            <img class=\"border\" src=\"images/");
      out.print(rs4.getString("image"));
      out.write("\" width=\"250\" height=\"200\"><br>\n");
      out.write("                            <b style=\"font-size:100%; font-family:Comic Sans MS\"><input type=\"hidden\" name=\"item\" value=\"");
      out.print(rs4.getString("itemName"));
      out.write('"');
      out.write('>');
      out.print(rs4.getString("itemName"));
      out.write("<br>\n");
      out.write("                                Price: <input type=\"hidden\" name=\"price\" value=\"");
      out.print(rs4.getDouble("price"));
      out.write('"');
      out.write('>');
      out.print(rs4.getDouble("price"));
      out.write("<br>\n");
      out.write("                                Quantity:  <input type=text name=\"quan\" required size = \"6\"><br>\n");
      out.write("                                <input type=\"submit\" name=\"order\" value=\"order\"></b></form>\n");
      out.write("                    </td>                            ");

                        j--;
                    
      out.write("\n");
      out.write("\n");
      out.write("                    ");
   }
      out.write("\n");
      out.write("\n");
      out.write("                </tr> \n");
      out.write("                ");
        }
                    } catch (Exception exe) {
                        exe.printStackTrace();
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
