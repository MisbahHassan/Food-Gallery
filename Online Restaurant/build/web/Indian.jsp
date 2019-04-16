<%-- 
    Document   : Indian
    Created on : Jan 15, 2018, 3:08:54 AM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>
        Pakistani Cuisine
    </title>
    <style>
html, body {
            margin: 0;
            padding: 0;
        }
        .bg {

            background-image: url("images/5.jpg");
            height: 100%; 
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
        <div>
            <h1 align=center style="font-size:300%; font-family:Comic Sans MS">Indian Foods</h1>
            <table cellspacing="40" align=center>
                <tr>
                    <td align=center><a  href="Punjabi.jsp"><img class="border" src="images/punjabi.jpg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Punjabi</b></td>
                    <td align=center><a  href="Gujrati.jsp"><img class="border" src="images/gujrati.jpg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Gujrati</b></td>
                    <td align=center><a  href=Bombay.jsp"><img class="border" src="images/bombaytype.jpg"width="250" height="200"></a><br><b style="font-size:150% ; font-family:Comic Sans MS">Bombay</b></td>
                    <td align=center><a  href="Bengoli.jsp"><img class="border" src="images/bengoli.jpg"width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Bengoli</b></td>
                </tr>
            </table>
        </div>
    </body>
                             <%@include file="Footer.jsp" %>

</html>