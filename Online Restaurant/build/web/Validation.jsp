<%-- 
    Document   : validation
    Created on : Jan 4, 2018, 9:33:55 PM
    Author     : Asma Munir
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DTO.CartDTO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
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
        <h1>Hello World!</h1>
        <%!
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
            String name = null;
            String pwd = null;
            String query = null;
            HttpSession sess = null;
            String message = null;
            ArrayList<CartDTO> list = null;
        %>
        <%  name = request.getParameter("name");
            pwd = request.getParameter("password");
            session = request.getSession(true);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");
                out.println("connection created");
                query = "select username ,password from user where username='" + name + "' and password ='" + pwd + "'";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                list = new ArrayList<CartDTO>();
                if (rs.next()) {
                    if (rs.getString("username").equalsIgnoreCase("admin") && rs.getString("password").equals(pwd)) {

                        session.setAttribute("name", name);
                        session.setAttribute("passwd", pwd);
                        response.sendRedirect("/Online_Restaurant/Admin.jsp");
                 
                    } else if (rs.getString("username").equals(name) && rs.getString("password").equals(pwd)){

                        session.setAttribute("name", name);
                        session.setAttribute("password", pwd);
                        session.setAttribute("CartList", list);
                        response.sendRedirect("/Online_Restaurant/Home.jsp");
                    }
                } else {
                    message = "No user or password matched";
                    response.sendRedirect("Login.jsp?error=" + message);
                }

            } catch (Exception exe) {
                exe.printStackTrace();
            }
        %>

    </body>
</html>
