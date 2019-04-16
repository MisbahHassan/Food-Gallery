<%-- 
    Document   : Footer
    Created on : Jan 20, 2018, 12:26:54 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer</title>
    </head>
    <body>
        <style>
            .footer {
                width: 100%;
                background-color: #FAD7A0;
                float: left;
                height:80px;
                text-align: right;
                border-top: 5px ridge #F8C471;
            }
            #content a:link, a:visited {
                text-decoration: none;
                padding-right: 20px;
                display:block;
                font-size: 100%;
            }

           
            #content a:hover {
                text-decoration: underline;
                                color:black;

            }
        </style>



        <footer class="footer">
            <img src="images/logo.jpg" height="70" width="90" style="padding-left: 20px;padding-top: 5px" align="left">
            <div id="content">
            <a href="Feedback.html" style="text-align: right; padding-top: 5px;" >Feedback</a>
            <a href="About US.html" style="text-align: right">About Us</a>
            <a href="Mission%20Statement.jsp" style="text-align: right">Mission Statement</a>
            <a href="FAQ.html" style="text-align: right">FAQs</a>
            </div>
        </footer>
    </body>

</html>
