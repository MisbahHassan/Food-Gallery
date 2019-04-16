package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");

    String error = request.getParameter("error");
    if (error == null || error == "null") {
        error = "";
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Login File</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    ");
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
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("                background-color: brown;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li.dropdown {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <header position=\"absolute\">\n");
      out.write("            <img src=\"images/logo.jpg\" height=\"90\" width=\"110\" >\n");
      out.write("            <a href=\"Login.jsp\"><img src=\"images/login1.png\" height=\"40\" width=\"40\" style=\"float: right\"></a>\n");
      out.write("            <a href=\"Logout.jsp\"><img src=\"images/logout.png\" height=\"40\" width=\"40\" style=\"float: right\"></a>\n");
      out.write("            <a href=\"ViewCart.jsp\"><img src=\"images/cart.png\" height=\"40\" width=\"40\" style=\"float: right\"></a>    \n");
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
      out.write("\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"Beverages.jsp\" class=\"dropbtn\">Beverages</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"Shakes.jsp\">Shakes</a>\n");
      out.write("                    <a href=\"Cold Drinks.jsp\">Cold drinks</a>\n");
      out.write("                    <a href=\"Tea_Coffee.jsp\">Tea/Coffee</a>\n");
      out.write("                    <a href=\"Juices.jsp\">Juice</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"Desserts.jsp\" class=\"dropbtn\">Desserts</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"Ice cream.jsp\">Ice creams</a>\n");
      out.write("                    <a href=\"Halvay.jsp\">Halvay</a>\n");
      out.write("                    <a href=\"Puddings.jsp\">Puddings</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <body bgcolor=\"#EDA252\">\n");
      out.write("        <style>\n");
      out.write("            html, body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("            .button {\n");
      out.write("                background-color: white;\n");
      out.write("                border: 2px solid #EDA252;\n");
      out.write("                color: #D55A3F;\n");
      out.write("\n");
      out.write("                padding-bottom: -30px;\n");
      out.write("                height: 30px;\n");
      out.write("                width: 173px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration:none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font:bold;\n");
      out.write("                font-family: Comic Sans MS;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .form\n");
      out.write("            {\n");
      out.write("                padding-top: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .table\n");
      out.write("            {\n");
      out.write("                border: outset;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                border-color: #0E6251;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        ");

            if (error.equals("No user or password matched")) {
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.alert(\"Wrong username or password\");\n");
      out.write("        </script>");

            }

            if (error.equals("You need to login first")) {
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.alert(\"You need to login first\");\n");
      out.write("        </script>");

            }

if (error.equals("you are not logged in")) {
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.alert(\"You need to login first to logout :)\");\n");
      out.write("        </script>");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form  action=\"http://localhost:8080/Online_Restaurant/Validation.jsp\" name = \"loginform\" method=\"post\" class=\"form\">\n");
      out.write("            <table class=\"table\" cellspacing=\"4\" cellpadding=\"2\"  align=\"center\" bgcolor=\"#D55A3F\" >\n");
      out.write("                <tr><td style=\"text-align:right\" ><h1 >Welcome</h1></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name: </td><td><input type=\"text\"  name=\"name\" required ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password: </td><td><input type=\"password\"  name=\"password\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td><input type=\"submit\" class=\"button\" value=\"Sign In\" height=\"100\" width=\"100\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td style=\"font-size: 15px; text-align: center; color: white\"><b>OR</b></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td><a href=\"http://localhost:8080/Online_Restaurant/Signup.jsp\"><input type=\"button\" class=\"button\" value=\"Sign Up\" height=\"100\" width=\"100\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr><td><br><br><br><br><br><br></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("                             ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .footer {\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #FAD7A0;\n");
      out.write("                float: left;\n");
      out.write("                height:80px;\n");
      out.write("                text-align: right;\n");
      out.write("                border-top: 5px ridge #F8C471;\n");
      out.write("            }\n");
      out.write("            #content a:link, a:visited {\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding-right: 20px;\n");
      out.write("                display:block;\n");
      out.write("                font-size: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("           \n");
      out.write("            #content a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("                                color:black;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <img src=\"images/logo.jpg\" height=\"70\" width=\"90\" style=\"padding-left: 20px;padding-top: 5px\" align=\"left\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("            <a href=\"Feedback.html\" style=\"text-align: right; padding-top: 5px;\" >Feedback</a>\n");
      out.write("            <a href=\"About US.html\" style=\"text-align: right\">About Us</a>\n");
      out.write("            <a href=\"Mission%20Statement.jsp\" style=\"text-align: right\">Mission Statement</a>\n");
      out.write("            <a href=\"FAQ.html\" style=\"text-align: right\">FAQs</a>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
