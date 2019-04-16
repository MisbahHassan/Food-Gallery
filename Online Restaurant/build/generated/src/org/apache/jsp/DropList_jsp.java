package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class DropList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            ArrayList<String> pak=new ArrayList<String>();
           ArrayList<String> ind=new ArrayList<String>();
           ArrayList<String> chin=new ArrayList<String>();
           ArrayList<String> ital=new ArrayList<String>();
        
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("          ");

           pak.add("Karahi");
           pak.add("Rice");
           pak.add("BBQ");
           pak.add("Daal");
           ind.add("Bombay");
           ind.add("Bengoli");
           ind.add("Punjabi");
           ind.add("Gujrati");
           ital.add("Burger");
           ital.add("Pizza");
           ital.add("Pasta");
           chin.add("Noodles");
           chin.add("Soup");
           chin.add("Rice");
           String valajax=request.getParameter("valajax");
           
           if(valajax.equals("Pakistani"))
           {
               response.getWriter().write("Category: <select>");
               for(int i=0;i<pak.size();i++)
               {
                   response.getWriter().write("<option>"+pak.get(i)+"/option");
               }
               response.getWriter().write("</select>");
           }
           if(valajax.equals("Indian"))
           {
                response.getWriter().write("Category: <select>");
               for(int i=0;i<ind.size();i++)
               {
                   response.getWriter().write("<option>"+ind.get(i)+"/option");
               }
               response.getWriter().write("</select>");
           }
           if(valajax.equals("Chinese"))
           {
                response.getWriter().write("Category: <select>");
               for(int i=0;i<chin.size();i++)
               {
                   response.getWriter().write("<option>"+chin.get(i)+"/option");
               }
               response.getWriter().write("</select>");
           }
           if(valajax.equals("Italian"))
           {
                response.getWriter().write("Category: <select>");
               for(int i=0;i<ital.size();i++)
               {
                   response.getWriter().write("<option>"+ital.get(i)+"/option");
               }
               response.getWriter().write("</select>");
           }
        
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
