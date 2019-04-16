<%-- 
    Document   : Beverages
    Created on : Feb 3, 2018, 8:14:14 PM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
      html, body {
            margin: 0;
            padding: 0;
        }
        .bg {

            background-image: url("images/Beverages_BK.jpg");
            height:auto;
            background-position:center;
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
            <h1 align=center style="font-size:300%; font-family:Comic Sans MS">Beverages</h1>
            <table cellspacing="40" align=center>
                <tr>
                    <td align=center><a  href="Cold Drinks.jsp"><img class="border" src="images/cold drink.jpg" width="250" height="175"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Cold Drinks</b></td>
                    <td align=center><a  href="Shakes.jsp"><img class="border" src="images/Shakes.jpg" width="250" height="175"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Shakes</b></td>
                    <td align=center><a  href="Tea_Coffee.jsp"><img class="border" src="images/Tea_Coffee.jpg"width="250" height="175"></a><br><b style="font-size:150% ; font-family:Comic Sans MS">Tea/Coffee</b></td>
                    <td align=center><a  href="Juices.jsp"><img class="border" src="images/Juices.jpg"width="250" height="175"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Juices</b></td>
                </tr>
            </table>
        </div>
    </body>
                             <%@include file="Footer.jsp" %>

</html>
