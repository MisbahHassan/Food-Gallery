package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    String error = request.getParameter("error");
    if (error == null || error == "null") {
        error = "";
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        html, body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("        }\n");
      out.write("             .mySlides {display:none}\n");
      out.write("\n");
      out.write("            /* Slideshow container */\n");
      out.write("            .slideshow-container {\n");
      out.write("                max-width: 900px;\n");
      out.write("                position: relative;\n");
      out.write("                margin:0px auto;\n");
      out.write("                text-align:center;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            /*border Class*/\n");
      out.write("            .solid\n");
      out.write("            {\n");
      out.write("                background-color:#F5CBA7;\n");
      out.write("                color:crimson;\n");
      out.write("                width:30px;\n");
      out.write("                height:40px;\n");
      out.write("                font-size:25px;\n");
      out.write("                font-family:Comic Sans MS;\n");
      out.write("                margin-left:600px;\n");
      out.write("                margin-right:600px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .solid2\n");
      out.write("            {\n");
      out.write("                background-color:#F5CBA7;\n");
      out.write("                color:crimson;\n");
      out.write("                width:100px;\n");
      out.write("                height:250px;\n");
      out.write("                font-size:20px;\n");
      out.write("                font-family:Time New Roman;\n");
      out.write("                margin-left:100px;\n");
      out.write("                margin-right:100px;\n");
      out.write("                margin-top:10px;\n");
      out.write("                padding-top:30px;\n");
      out.write("                padding-right:80px;\n");
      out.write("                padding-left:80px;\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Caption text */\n");
      out.write("            .text {\n");
      out.write("                font-family:Verdana;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 8px 12px;\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 8px;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Number text (1/3 etc) */\n");
      out.write("            .numbertext {\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                font-size: 12px;\n");
      out.write("                padding: 8px 12px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* The dots/bullets/indicators */\n");
      out.write("            .dot {\n");
      out.write("                height: 10px;\n");
      out.write("                width: 10px;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                background-color: #F5CBA7;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                display: inline-block;\n");
      out.write("                transition: background-color 0.6s ease;\n");
      out.write("                margin-bottom:20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active {\n");
      out.write("                background-color:crimson;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Fading animation */\n");
      out.write("            .fade {\n");
      out.write("                transition:none;\n");
      out.write("                -webkit-animation-name: fade;\n");
      out.write("                -webkit-animation-duration: 1.5s;\n");
      out.write("                animation-name: fade;\n");
      out.write("                animation-duration: 1.5s;\n");
      out.write("                padding-top:50px;\n");
      out.write("                margin-left:-60px;\n");
      out.write("                margin-right:-60px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @-webkit-keyframes fade {\n");
      out.write("                from {opacity: .2} \n");
      out.write("                to {opacity: 1}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes fade {\n");
      out.write("                from {opacity: .2} \n");
      out.write("                to {opacity: 1}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* On smaller screens, decrease text size */\n");
      out.write("            @media only screen and (max-width: 300px) {\n");
      out.write("                .text {font-size: 1200px;\n");
      out.write("                       color:Red;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .mheader {\n");
      out.write("                background-color: #ffcccc;\n");
      out.write("                margin:-15px;  \n");
      out.write("\n");
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
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

            if (error.equals("Successfully logged out")) {
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.alert(\"Successfully logged out\");\n");
      out.write("        </script>");

            }
            if (error.equals("you are not logged in")) {
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.alert(\"You need to login first\");\n");
      out.write("        </script>");

            }
if (error.equals("Order placed successfully")) {
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.alert(\"Order placed successfully\");\n");
      out.write("        </script>");

            }
        
      out.write("\n");
      out.write("   <body style=\"background-color:#ffffcc;\">\n");
      out.write("        <header >\n");
      out.write("            <img src=\"images/logo.jpg\" height=\"90\" width=\"110\" >\n");
      out.write("            <a href=\"Login.jsp\"><img src=\"images/login1.png\" height=\"40\" width=\"40\" style=\"float: right\"></a>\n");
      out.write("            <a href=\"Logout.jsp\"><img src=\"images/logout.png\" height=\"40\" width=\"40\" style=\"float: right\"></a>\n");
      out.write("            <a href=\"ViewCart.jsp\"><img src=\"images/cart.png\" height=\"40\" width=\"40\" style=\"float: right\"></a>\n");
      out.write("        </header>\n");
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
      out.write("        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"images/a.jpeg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mySlides fade\"> \n");
      out.write("                <img src=\"images/b.jpeg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"images/c.jpeg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mySlides fade\">\n");
      out.write("                <img src=\"images/d.png\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div style=\"text-align:center\">\n");
      out.write("            <span class=\"dot\" ></span> \n");
      out.write("            <span class=\"dot\"></span> \n");
      out.write("            <span class=\"dot\"></span> \n");
      out.write("            <span class=\"dot\"></span> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var slideIndex = 0;\n");
      out.write("            showSlides();\n");
      out.write("\n");
      out.write("            function showSlides() {\n");
      out.write("                var i;\n");
      out.write("                var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("                for (i = 0; i < slides.length; i++) {\n");
      out.write("                    slides[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                slideIndex++;\n");
      out.write("                if (slideIndex > slides.length) {\n");
      out.write("                    slideIndex = 1\n");
      out.write("                }\n");
      out.write("                for (i = 0; i < dots.length; i++) {\n");
      out.write("                    dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("                }\n");
      out.write("                slides[slideIndex - 1].style.display = \"block\";\n");
      out.write("                dots[slideIndex - 1].className += \" active\";\n");
      out.write("                setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            sName = dots[i].className.replace(\" active\", \"\");\n");
      out.write("            slides[slideIndex - 1].style.display = \"block\";\n");
      out.write("            dots[slideIndex - 1].className += \" active\";\n");
      out.write("            setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <br><br><br>\n");
      out.write("    </body>\n");
      out.write("            ");
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
      out.write("                background: #F8C471;\n");
      out.write("                float: left;\n");
      out.write("                height:80px;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <img src=\"images/logo.jpg\" height=\"70\" width=\"90\" style=\"padding-left: 20px\" align=\"left\">\n");
      out.write("            <a href=\"Feedback.html\" style=\"text-align: right\">Feedback</a>\n");
      out.write("            <a href=\"About US.html\" style=\"text-align: right\">About Us</a><br>\n");
      out.write("            <a href=\"Mission%20Statement.jsp\" style=\"text-align: right\">Mission Statement</a>\n");
      out.write("            <a href=\"FAQ.html\" style=\"text-align: right\">FAQs</a>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
