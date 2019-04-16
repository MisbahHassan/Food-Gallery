<%-- 
    Document   : DropList
    Created on : Feb 5, 2018, 7:16:57 PM
    Author     : Asma Munir
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            ArrayList<String> pak=new ArrayList<String>();
           ArrayList<String> ind=new ArrayList<String>();
           ArrayList<String> chin=new ArrayList<String>();
           ArrayList<String> ital=new ArrayList<String>();
           String valajax=null;
        %>
          <%
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
           valajax=request.getParameter("valajax");
           out.println(valajax);
           if(valajax.equals("Pakistan"))
           {
               response.getWriter().write("Category: <select>");
               for(int i=0;i<pak.size();i++)
               {
                   response.getWriter().write("<option>"+pak.get(i)+"</option>");
               }
               response.getWriter().write("</select>");
           }
           if(valajax.equals("Indian"))
           {
                response.getWriter().write("Category: <select>");
               for(int i=0;i<ind.size();i++)
               {
                   response.getWriter().write("<option>"+ind.get(i)+"</option>");
               }
               response.getWriter().write("</select>");
           }
           if(valajax.equals("Chinese"))
           {
                response.getWriter().write("Category: <select>");
               for(int i=0;i<chin.size();i++)
               {
                   response.getWriter().write("<option>"+chin.get(i)+"</option>");
               }
               response.getWriter().write("</select>");
           }
           if(valajax.equals("Italian"))
           {
                response.getWriter().write("Category: <select>");
               for(int i=0;i<ital.size();i++)
               {
                   response.getWriter().write("<option>"+ital.get(i)+"</option>");
               }
               response.getWriter().write("</select>");
           }
        %>
    </body>
</html>
