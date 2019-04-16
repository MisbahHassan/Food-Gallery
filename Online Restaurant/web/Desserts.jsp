<%-- 
    Document   : Pakistani
    Created on : Jan 15, 2018, 3:04:06 AM
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

            background-image: url("images/Pakistan BK.jpg");
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
            <h1 align=center style="font-size:300%; font-family:Comic Sans MS">Desserts</h1>
            <table cellspacing="40" align=center>
                <tr>
                    <td align=center><a  href="Ice cream.jsp"><img class="border" src="images/Ice cream.jpg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Ice cream</b></td>
                    <td align=center><a  href="Halvay.jsp"><img class="border" src="images/Halwa.png" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Halvay</b></td>
                    <td align=center><a  href="Puddings.jsp"><img class="border" src="images/Puddings.jpg"width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Puddings</b></td>
                </tr>
            </table>
        </div>
    </body>
                             <%@include file="Footer.jsp" %>

</html>
