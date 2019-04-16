<%-- 
    Document   : PlaceOrder
    Created on : Feb 4, 2018, 11:51:38 PM
    Author     : Asma Munir
--%>


<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DTO.CartDTO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            Connection con = null;
            Statement stmt1 = null;
            Statement stmt2 = null;
            Statement stmt3 = null;
            Statement stmt4 = null;
            Statement stmt5 = null;
            int rs1 = 0;
            ResultSet rs2 = null;
            ResultSet rs3 = null;
            int rs4 = 0;
            int rs5 = 0;
            ArrayList<CartDTO> list = null;
            String query1 = null;
            String query2 = null;
            String query3 = null;
            String query4 = null;
            String query5=null;
            String username = null;
            String customer = null;
            String message = null;
            String custName=null;
            String phoneNum=null;
            String Address=null;
            double bill = 0.0;
            int orderNo = 0;
            String date = null;
        %>
        <%
            try {
                //date = Calendar.getInstance().getTime().toString();

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate localDate = LocalDate.now();
                date = dtf.format(localDate).toString(); //2016-11-16

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");
                session = request.getSession(false);
                username = (String) session.getAttribute("name");
                list = (ArrayList<CartDTO>) session.getAttribute("CartList");
                bill = Double.parseDouble(request.getParameter("total"));
                query1 = "INSERT INTO `order` (`orderNo`, `customer`, `bill`, `date`) VALUES (NULL, '" + username + "', " + bill + ",'" + date + "');";
                stmt1 = con.createStatement();
                rs1 = stmt1.executeUpdate(query1);

                query2 = "SELECT MAX(orderNo) FROM `order`";
                stmt2 = con.createStatement();
                rs2 = stmt2.executeQuery(query2);
                if (rs2.next()) {
                    orderNo = rs2.getInt(1);
                }

                query3 = "select name from user where username='" + username + "'";
                stmt3 = con.createStatement();
                rs3 = stmt3.executeQuery(query3);
                if (rs3.next()) {
                    customer = rs3.getString("name");
                }
             
                custName=request.getParameter("name");
               phoneNum=request.getParameter("number");
            Address=request.getParameter("address");
          
                query5="INSERT INTO `customer` (`customerID`, `PhoneNo`, `Address`, `Name`) VALUES ('"+username+"', '"+phoneNum+"', '"+Address+"', '"+custName+"')";
                stmt5=con.createStatement();
                rs5=stmt5.executeUpdate(query5);
                
                stmt4 = con.createStatement();
                for (CartDTO d : list) {
                    query4 = "INSERT INTO `selecteditems` (`itemName`, `itemPrice`, `itemQuan`, `orderNo`, `itemId`, `customerId`, `date`) VALUES ('" + d.getName() + "', " + d.getPrice() + "," + d.getQuantity() + ", " + orderNo + ", NULL, '" + username + "','" + date + "');";
                    rs4 = stmt4.executeUpdate(query4);
                    message="Order placed successfully";
                   response.sendRedirect("Home.jsp?error="+message);
                }

            } catch (Exception exe) {
                exe.printStackTrace();
            } finally {
                if (rs4 > 0) {
                    out.println("order inserted");
                    out.println(orderNo);
                    out.println(customer);
                    out.println(date);
                }
            }
        %>

    </body>
</html>
