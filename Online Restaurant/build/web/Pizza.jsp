<%-- 
    Document   : Karahi
    Created on : Jan 14, 2018, 7:39:01 PM
    Author     : Asma Munir
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<html>
    <title>
        Italian Cuisine
    </title>
    <style>
        html, body {
            margin: 0;
            padding: 0;
        }
        .bg {

            background-image: url("images/pizza bk1.jpg");
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
        <%!
            Connection con = null;
            Statement stmt4 = null;
            ResultSet rs4 = null;
            String query4 = null;
            String name = null;
            int count = 0;
            int size = 0;
            int rows = 0;
            int j = 0;
            int i = 0;
            String iname=null;

        %>
        
        <div >
            <h1 align=center style="font-size:300%; font-family:Comic Sans MS">Pizza</h1>
            <table cellspacing="40" align=center>
                <%
                    try {

                        name = "Pizza";
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");

                        query4 = "Select * from items where  catId = ANY (Select cid from categories where category='" + name + "')";
                        stmt4 = con.createStatement();
                        rs4 = stmt4.executeQuery(query4);

                        while (rs4.next()) {
                            count++;

                        }
                       
                        rs4.beforeFirst();
                        
                        size = count;
                        count = 0;
                        rows = size;
                        /*while (rows > 4) {
                            rows = rows / 2;
                        }*/
                        
                        if ( rows%4==0)
                        {
                            rows=rows/4;
                        }
                        else if(rows%4!=0)
                        {
                            rows=rows/4+1;
                        }
                        for (i = 0; i < rows; i++) {
                            j = size / rows + (size % rows);%>
                                    
                <tr> 
                    <%
                               while ( j > 0 && rs4.next() ) {  
                    %>
                               <td><form action="AddToCart.jsp"> 
                                   <img class="border" src="images/<%=rs4.getString("image")%>" width="250" height="200"><br>
                                   <b style="font-size:100%; font-family:Comic Sans MS"><input type="hidden" name="item" value="<%=rs4.getString("itemName")%>"><%=rs4.getString("itemName")%><br>
                                       Price: <input type="hidden" name="price" value="<%=rs4.getDouble("price")%>"><%=rs4.getDouble("price")%><br>
                                       Quantity:  <input type=text name="quan" required size = "6"><br>
                                       <input type="submit" name="order" value="order"></b></form>
                               </td>
                               <%
                                   j--;
                               %>
                            
                    <%   }%>
              
                     </tr> 
                       
                    <%        }
                        } catch (Exception exe) {
                            exe.printStackTrace();
                        }
                    %>
               
            </table>
        </div>
    </body>
                             <%@include file="Footer.jsp" %>

</html>