<%-- 
    Document   : admin
    Created on : Jan 14, 2018, 6:43:17 PM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        html,body{
            margin: 0px;
            padding: 0px;
        }
               .button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
.button3 {background-color: #f44336;
        width:250px;
} /* Red */

        
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin View</title>
    </head>

    <body bgcolor="#EDA252">
        <%@ include file="Header.jsp" %> 


        <form  name = "Home"  method="post" class="form">
            <table class = "table" cellspacing="4" cellpadding="2"  align="center" bgcolor="#EDA252" >
                <tr align="center"><td><h1><b>Admin</b></h1></td></tr>
                <tr>
                    <td><a href="http://localhost:8080/Online_Restaurant/AddNew.jsp">
                            <input class="button button3" type="button"  value="Add New Item" ></a>
                    </td><td></td>
                </tr>

                <tr>
                    <td><a href="http://localhost:8080/Online_Restaurant/ViewOrderDesign.jsp">
                            <input class="button button3" type="button"  value="View Orders" ></a>
                    </td><td></td>
                </tr>
                
                <tr>
                    <td><a href="http://localhost:8080/Online_Restaurant/ViewAllOrder.jsp">
                            <input class="button button3" type="button"  value="All Orders" ></a>
                    </td><td></td>
                </tr>
                
                <tr>
                    <td><a href="http://localhost:8080/Online_Restaurant/ViewTodaysOrder.jsp">
                            <input class="button button3" type="button"  value="Today's Orders" ></a>
                    </td><td></td>
                </tr>
                

                <tr><td><br><br><br><br></td></tr>
            </table><br><br><br><br><br><br><br><br>
        </form>
    </body>
    <%@ include file="Footer.jsp" %> 

</html>



