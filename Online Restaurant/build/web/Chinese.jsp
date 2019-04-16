<%-- 
    Document   : Chinese
    Created on : Jan 15, 2018, 3:06:57 AM
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

            background-image: url("images/chinesebg.jpg");
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
            <h1 align=center style="font-size:300%; font-family:Comic Sans MS">Chinese Foods</h1>
            <table cellspacing="40" align=center>
                <tr>
                    <td align=center><a  href="Chinese Rice.jsp"><img class="border" src="images/cr.jpg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Chinese Rice</b></td>
                    <td align=center><a  href="Chinese Soup.jsp"><img class="border" src="images/chineseChickenCornSoup.jpeg" width="250" height="200"></a><br><b style="font-size:150%; font-family:Comic Sans MS">Chinese Soups</b></td>
                    <td align=center><a  href="Chinese Noodles.jsp"><img class="border" src="images/chineseNooldes.jpg"width="250" height="200"></a><br><b style="font-size:150% ; font-family:Comic Sans MS">Chinese Noodles</b></td>
                </tr>
            </table>
        </div>
    </body>
                                 <%@include file="Footer.jsp" %>

</html>
