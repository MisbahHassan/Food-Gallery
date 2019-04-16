<%-- 
    Document   : Logout
    Created on : Feb 5, 2018, 11:34:43 PM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            String message = null;
        %>
        <%
            session = request.getSession(false);
            if (session.getAttribute("name") != null){
                session.invalidate();
                message="Successfully logged out";
                response.sendRedirect("Home.jsp?error=" + message);
            }
            else if (session.getAttribute("name") == null)
            {
                message="you are not logged in";
                response.sendRedirect("Home.jsp?error=" + message);
            }
        %>
</body>
</html>
