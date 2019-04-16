<%-- 
    Document   : ViewTodaysOrder
    Created on : Feb 6, 2018, 9:42:48 AM
    Author     : Asma Munir
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
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
                                 <%@include file="Header.jsp" %>

    <body>
                <h1 style="text-align: center">Records</h1>

        <%!
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;

            String today = null;
            String query = null;
        %>


        <%
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.now();
            today = dtf.format(localDate).toString();

            query = "Select * from selecteditems where date = '" + today + "' ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (rs != null) {%>

        <table border='1' cellpadding='2' width='100%'>
            <tr>
                <th>Customer Id</th><th>Item Name</th>  <th>Item Price</th><th>Quantity</th><th>Date</th>
            </tr>
            <%
                while (rs.next()) {%>

            <tr>
                <td ><%=rs.getString(6)%></td>
                <td><%=rs.getString(1)%> </td>
                <td>  <%=rs.getDouble(2)%></td> 
                <td><%=rs.getInt(3)%></td>
                <td><%=rs.getString(7)%></td>
            </tr>
            <%   }%>
        </table><br><br><br><br><br><br><br><br><br><br><br><br>

        <% } else {
                out.println("<p>No Record Found!</p>");
            }
        %>
    </body>
                                 <%@include file="Footer.jsp" %>

</html>
