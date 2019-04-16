<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body, html {
                height: 100%;
                margin: 0;
                background-color: #FAD7A0 ;
            }
             .form
            {
                padding-top: 50px;

            }
            .table
            {
                border: outset;
                
                border-color:#FAD7A0 ;
            }
        </style>
    </head>
                                 <%@include file="Header.jsp" %>

    <body>

        <form action="ViewOrderCode.jsp" class="form">
            <table class="table" cellspacing="4" cellpadding="2"  align="center"" >
                <tr><td>From:</td><td><input type="date" name="from"></td>
                    <td>To:</td><td><input type="date" name="to"></td>
                </tr>
                <tr>
                    <td></td><td></td><td></td>
                    <td><input type="submit" value="View">
                    
                    </td>
                </tr>
            </table><br><br><br><br><br><br>
        </form>
    </body>
                                 <%@include file="Footer.jsp" %>

</html>
