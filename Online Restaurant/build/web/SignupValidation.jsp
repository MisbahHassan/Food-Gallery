<%@ page import="java.sql.*" %>

        <%!
            Connection con = null;
            int num = 0;
            PreparedStatement ps = null;
            String username = null;
            String email = null;
            String pwd = null;
            String name = null;
            String query = null;
            Statement stmt = null;
            ResultSet rs = null;
        %>
        <%
            session = request.getSession(false);
            username = request.getParameter("username");
            name = (String)session.getAttribute("name");
            email = (String)session.getAttribute("email");
            pwd = (String)session.getAttribute("password");
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");
                    ps = con.prepareStatement("select * from user where username=?");
                    ps.setString(1, username);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        out.print(" Username Already Exits");
                    }
                } catch (Exception e) {
                    out.print(e);
                }
        
            try {
                
                stmt = con.createStatement();
                query = "Insert into user (username, email, name, password) values ('" + username + "', '" + email + "','" + name + "','" + pwd + "')";
                stmt.executeUpdate(query);

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                        stmt = null;
                    }
                    if (con != null) {
                        con.close();
                        con = null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        %>  
    