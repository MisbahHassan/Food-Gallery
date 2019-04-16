<%-- 
    Document   : insertInDb
    Created on : Jan 14, 2018, 10:51:12 AM
    Author     : tehreem
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insertInDb</title>
    </head>
    <body>
        <%!
            Connection con = null;
            Statement stmt1 = null;
            Statement stmt2 = null;
            Statement stmt3 = null;
            Statement stmt4 = null;
            String query1 = null;
            String query2 = null;
            String query3 = null;
            String query4 = null;
            String itemName = null;
            double price = 0;
            String image = null;
            String place = null;
            String category = null;
            ResultSet rs1 = null;
            ResultSet rs2 = null;
            ResultSet rs4 = null;
            int rs3 = 0;
            int catID = -1;
            int pid = -1;
            String message=null;
        %>
        <%
            itemName = request.getParameter("item");
            price = Double.parseDouble(request.getParameter("price"));
            image = ( request.getParameter("image"));
            place = request.getParameter("place");
            category = request.getParameter("category");
           out.println(category);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");

                out.println("Connection created");

                stmt1 = con.createStatement();
                query1 = "Select cid from categories where category='" + category + "'";
                rs1 = stmt1.executeQuery(query1);

                stmt2 = con.createStatement();
                query2 = "Select pid from places where place='" + place + "'";
                rs2 = stmt2.executeQuery(query2);
                if (rs1.next()) {
                    catID = rs1.getInt("cid");
                }

              

                if (rs2.next()) {
                    pid = rs2.getInt("pid");
                }
                out.println(itemName + "    " + price + "   " + image + "   " + place + "    " + pid + "  " + category + "  " + catID);

                stmt3 = con.createStatement();
                query3 = "insert into items (itemName,price,placeId,catId,image) values('" + itemName + "','" + price + "','" + pid + "','" + catID + "','" + image + "')";
                rs3 = stmt3.executeUpdate(query3);
                if (rs3 > 0) {
                    message = "New Item Inserted";
                response.sendRedirect("AddNew.jsp?error=" + message);
                } else {
                    out.println("image not inserted");
                }

                
            } catch (Exception exe) {
                exe.printStackTrace();
            }


        %>
        


    </body>
</html>
