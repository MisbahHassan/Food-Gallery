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
            <h1 align=center style="font-size:300%; font-family:Comic Sans MS">Pakistani Foods</h1>
            <table cellspacing="40" align=center>
                <tr>
                    <td align=center><a  href="Karahi.jsp"><img class="border" src="images/1.jpg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Karahi</b></td>
                    <td align=center><a  href="PakistanRice.jsp"><img class="border" src="images/2.jpg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Rice</b></td>
                    <td align=center><a  href="BarBQ.jsp"><img class="border" src="images/3.jpg"width="250" height="200"></a><br><b style="font-size:150% ; font-family:Comic Sans MS">BBQ</b></td>
                    <td align=center><a  href="Daal.jsp"><img class="border" src="images/daal.jpg"width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Daal</b></td>
                </tr>
            </table>
        </div>
    </body>
                             <%@include file="Footer.jsp" %>

</html>
