<%-- 
    Document   : ViewCart
    Created on : Jan 19, 2018, 8:00:32 PM
    Author     : Asma Munir
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DTO.CartDTO"%>
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

            background-color: #DC7633;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            text-align: center;
        }
        .border 
        {
            border:outset;
            border-color: black;
            color:black;
        }



    </style>
    <body class="bg">
        <%@include file="Header.jsp" %>

        <div >
            <%! HttpSession sess = null;
                ArrayList<CartDTO> list = null;
                Double amount = 0.0;
                Double total = 0.0;
                String message = null;
                String name = null;
            %>
            <%
                session = request.getSession(false);
                list = new ArrayList<CartDTO>();
                list = (ArrayList<CartDTO>) session.getAttribute("CartList");
                name = (String) session.getAttribute("name");

                if (name != null) {
                    if (list.size() == 0) {
            %>
            <b style="color:white;"><br><br><br>No Item In The Cart...</b><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                <%
                } else {%>
            <h1 style="color:white; text-align: center">Items in cart are </h1>
            <%    for (CartDTO d : list) {%>
            <form action="RemoveFromCart.jsp"><table align="center">
                    <table class="border" cellspacing="4" cellpadding="2"  align="center" bgcolor="white"  >

                        <tr>
                            <td>
                                <%=d.getName()%></td>
                            <td>  <%=d.getQuantity()%></td>
                            <%
                                amount = d.getQuantity() * d.getPrice();
                                total = total + amount;
                            %>
                            <td>  <%=amount%></td>

                        <input type="hidden" name="cartItemIndex" value="<%=list.indexOf(d)%>">
                        <td>    <input type="submit" value="remove" >
                        </td>
                        </tr>

                    </table>

            </form>
            <% }
                session.setAttribute("bill", total);
            %>
            <form action="PlaceAddress.jsp"><table class="border" cellspacing="4" cellpadding="2"  align="center" bgcolor="white"  >
                    <tr>
                        <td>
                            <input type="hidden" name="total" value="<%=total%>">
                            <b style="color:#C0392B"> Your Total Amount is <%=session.getAttribute("bill")%></b>
                        </td>
                        <td>
                            <input type="submit" value="Deliver">
                        </td>
                    </tr>
                </table>
            </form><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>      
            <% total = 0.0;
                }

            } else if (session.getAttribute("name") == null) {
            %>
            <b style="color:white; text-align: center">Login First</b>
            <%
                    message = "You need to login first";
                    response.sendRedirect("Login.jsp?error=" + message);

                }
            %>
        </div>
    </body>
    <%@include file="Footer.jsp" %>
</html>
