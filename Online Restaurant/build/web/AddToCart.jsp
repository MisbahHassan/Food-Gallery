<%-- 
    Document   : AddToCart
    Created on : Jan 19, 2018, 3:27:25 PM
    Author     : Asma Munir
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DTO.CartDTO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            HttpSession sess = null;
            ArrayList<CartDTO> list = null;
            String name = null;
            double price = 0;
            int quan = 0;
            CartDTO cart = null;
            String message = null;

        %>
        <%
            session = request.getSession(false);
            if (session.getAttribute("name") != (String) null) {
                list = (ArrayList<CartDTO>) session.getAttribute("CartList");
                name = request.getParameter("item");
                price = Double.parseDouble(request.getParameter("price"));
                quan = Integer.parseInt(request.getParameter("quan"));
                cart = new CartDTO();
                cart.setName(name);
                cart.setPrice(price);
                cart.setQuantity(quan);
                list.add(cart);
                session.setAttribute("CartList", list);
                response.sendRedirect(request.getHeader("referer"));
            } else {
                message = "You need to login first";
                response.sendRedirect("Login.jsp?error=" + message);
            }
            
        %>
    </body>
</html>
