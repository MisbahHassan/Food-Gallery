<%-- 
    Document   : PlaceAddress
    Created on : Jan 23, 2018, 1:52:47 PM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
        String error= request.getParameter("error");
        if (error == null || error == "null") {
            error = "";
        }
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>details</title>
    </head>
     <body style="background-color: #EDA252">
    <style>
        html, body {
            margin: 0;
            padding: 0;
        }
    </style>
    <%
        if (error.equals("Order placed successfully")) {%>
    <script>
        window.alert("Your Order Placed.");
    </script><%
        }%>
   
        
        <form action="PlaceOrder.jsp">
            <h1 align="center">Please Enter Delivery details</h1>
            <table cellspacing="4" cellpadding="2" align="center">

                <tr><td>Name</td><td><input type="text" required name="name" id="name"><br/> </td></tr>
                <tr><td>Mobile Number</td><td><input type="text" required name="number" id="num" placeholder='0321-2823728'> <br/></td></tr>
                <tr><td>Address</td><td><textarea name="address" rows="5" cols="15" required>
                        </textarea><br/><input type="hidden" name="total" value="<%=Double.parseDouble(request.getParameter("total"))%>"></td></tr>
                <tr><td></td><td>
                        <input type="submit" name="submit" value="submit"></td>
                </tr>

            </table>
        </form>
    </body>
</html>

