<%-- 
    Document   : login
    Created on : Jan 4, 2018, 2:02:00 PM
    Author     : Asma Munir
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%
    String error = request.getParameter("error");
    if (error == null || error == "null") {
        error = "";
    }
%>

<html>

    <head>
        <title>Login File</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <%@ include file="Header.jsp" %> 

    <body bgcolor="#EDA252">
        <style>
            html, body {
            margin: 0;
            padding: 0;
        }
            .button {
                background-color: white;
                border: 2px solid #EDA252;
                color: #D55A3F;

                padding-bottom: -30px;
                height: 30px;
                width: 173px;
                text-align: center;
                text-decoration:none;
                display: inline-block;
                font-size: 16px;
                font:bold;
                font-family: Comic Sans MS;
                cursor: pointer;
            }
            .form
            {
                padding-top: 50px;

            }
            .table
            {
                border: outset;
                border-radius: 30px;
                border-color: #0E6251;
            }
        </style>

        <%
            if (error.equals("No user or password matched")) {%>
        <script>
            window.alert("Wrong username or password");
        </script><%
            }

            if (error.equals("You need to login first")) {%>
        <script>
            window.alert("You need to login first");
        </script><%
            }

if (error.equals("you are not logged in")) {%>
        <script>
            window.alert("You need to login first to logout :)");
        </script><%
            }
        %>


        <form  action="http://localhost:8080/Online_Restaurant/Validation.jsp" name = "loginform" method="post" class="form">
            <table class="table" cellspacing="4" cellpadding="2"  align="center" bgcolor="#D55A3F" >
                <tr><td style="text-align:right" ><h1 >Welcome</h1></td></tr>
                <tr>
                    <td>Name: </td><td><input type="text"  name="name" required ></td>
                </tr>
                <tr>
                    <td>Password: </td><td><input type="password"  name="password" required></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" class="button" value="Sign In" height="100" width="100"></td>
                </tr>
                <tr>
                    <td></td><td style="font-size: 15px; text-align: center; color: white"><b>OR</b></td>
                </tr>
                <tr>
                    <td></td><td><a href="http://localhost:8080/Online_Restaurant/Signup.jsp"><input type="button" class="button" value="Sign Up" height="100" width="100"></a></td>
                </tr>

                <tr><td><br><br><br><br><br><br></td></tr>
            </table>
        </form>
        
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    
</body>
                             <%@include file="Footer.jsp" %>

</html>

