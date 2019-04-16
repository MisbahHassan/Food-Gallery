<%-- 
    Document   : Italian
    Created on : Jan 15, 2018, 3:07:49 AM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <title>
        Pakistani Cuisine
    </title>
    <style>

       html, body {
            margin: 0;
            padding: 0;
        }

        .bg {

            background-image: url("images/italian_BK.jpg");
            height: auto;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        .border 
        {
            border:outset;
            border-radius: 30px;
            border-color: black;
        }
    </style>
    <body class="bg">
        <%@ include file="Header.jsp" %> 

        <div >
            <h1 align=center style="font-size:300%; font-family:Comic Sans MS; color: white">Italian Food</h1>
            <table cellspacing="40" align=center>
                <tr>
                    <td align=center><a href="Pasta.jsp"><img class="border" src="images/noddles.png" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS; color: white">Pasta</b></td>
                    <td align=center><a  href="Pizza.jsp"><img class="border" src="images/pizza.jpg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS; color: white">Pizza</b></td>
                    <td align=center><a  href="Burger.jsp"><img class="border" src="images/burger.jpg"width="250" height="200"></a><br><b style="font-size:150% ; font-family:Comic Sans MS; color: white">Burgers</b></td>
                </tr>
            </table>
        </div>
    </body>
                                 <%@include file="Footer.jsp" %>

</html>
