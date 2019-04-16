<%-- 
    Document   : RemoveFromCart
    Created on : Jan 20, 2018, 9:56:32 PM
    Author     : Asma Munir
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DTO.CartDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! 
            ArrayList<CartDTO> list = null;
            int index = 0;
        %>


        <%
            session = request.getSession(false);
            list = new ArrayList<CartDTO>();
            list = (ArrayList<CartDTO>) session.getAttribute("CartList");
            index = Integer.parseInt(request.getParameter("cartItemIndex"));
            list.remove(index);
            response.sendRedirect("/Online_Restaurant/ViewCart.jsp");
        %>

    </body>
</html>
