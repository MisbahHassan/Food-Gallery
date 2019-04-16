<%-- 
    Document   : Header
    Created on : Jan 20, 2018, 12:21:23 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
    </head>
    <body>
        <style>
            .mheader {
                background-color: #ffcccc;
                margin:-15px; 
                position: fixed;
                position:absolute;
            }

            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333;
            }

            li {
                float: left;
            }

            li a, .dropbtn {
                display: inline-block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover, .dropdown:hover .dropbtn {
                background-color: brown;
            }

            li.dropdown {
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
            }

            .dropdown-content a:hover {background-color: #f1f1f1}
            .dropdown:hover .dropdown-content {
                display: block;

            }
        </style>

        <header position="absolute">
            <img src="images/logo.jpg" height="90" width="110" >
            <a href="Login.jsp"><img src="images/login1.png" height="40" width="40" style="float: right"></a>
            <a href="Logout.jsp"><img src="images/logout.png" height="40" width="40" style="float: right"></a>
            <a href="ViewCart.jsp"><img src="images/cart.png" height="40" width="40" style="float: right"></a>    
        </header>

        <ul>
            <li><a href="Home.jsp">Home</a></li>
            <li class="dropdown">
                <a href="Pakistani.jsp" class="dropbtn">Pakistani</a>
                <div class="dropdown-content">
                    <a href="Karahi.jsp">Karahi</a>
                    <a href="PakistanRice.jsp">Rice</a>
                    <a href="Daal.jsp">Daal</a>
                    <a href="BarBQ.jsp">Barbecue</a>
                </div>
            </li>

            <li class="dropdown">
                <a href="Italian.jsp" class="dropbtn">Italian</a>
                <div class="dropdown-content">
                    <a href="Burger.jsp">Burgers</a>
                    <a href="Pizza.jsp">Pizza</a>
                    <a href="Pasta.jsp">Pastas</a>
                </div>
            </li>

            <li class="dropdown">
                <a href="Chinese.jsp" class="dropbtn">Chinese</a>
                <div class="dropdown-content">
                    <a href="Chinese Rice.jsp">Chinese Rice</a>
                    <a href="Chinese Soup.jsp">Soups</a>
                    <a href="Chinese Noodles.jsp">Noodles</a>
                </div>
            </li>

            <li class="dropdown">
                <a href="Indian.jsp" class="dropbtn">Indian</a>
                <div class="dropdown-content">
                    <a href="Bombay.jsp">Bombay</a>
                    <a href="Bengoli.jsp">Bengoli</a>
                    <a href="Punjabi.jsp">Punjabi</a>
                    <a href="Gujrati.jsp">Gujrati</a>
                </div>
            </li>

            <li class="dropdown">
                <a href="Beverages.jsp" class="dropbtn">Beverages</a>
                <div class="dropdown-content">
                    <a href="Shakes.jsp">Shakes</a>
                    <a href="Cold Drinks.jsp">Cold drinks</a>
                    <a href="Tea_Coffee.jsp">Tea/Coffee</a>
                    <a href="Juices.jsp">Juice</a>
                </div>
            </li>

            <li class="dropdown">
                <a href="Desserts.jsp" class="dropbtn">Desserts</a>
                <div class="dropdown-content">
                    <a href="Ice cream.jsp">Ice creams</a>
                    <a href="Halvay.jsp">Halvay</a>
                    <a href="Puddings.jsp">Puddings</a>
                </div>
            </li>

        </ul>
    </body>
</html>
