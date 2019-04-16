<%--
    Document   : Home
    Created on : Jan 14, 2018, 8:03:28 PM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String error = request.getParameter("error");
    if (error == null || error == "null") {
        error = "";
    }
%>

<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <style>
        html, body {
                margin: 0;
                padding: 0;
        }
             .mySlides {display:none}

            /* Slideshow container */
            .slideshow-container {
                max-width: 900px;
                position: relative;
                margin:0px auto;
                text-align:center;

            }
            /*border Class*/
            .solid
            {
                background-color:#F5CBA7;
                color:crimson;
                width:30px;
                height:40px;
                font-size:25px;
                font-family:Comic Sans MS;
                margin-left:600px;
                margin-right:600px;


            }
            .solid2
            {
                background-color:#F5CBA7;
                color:crimson;
                width:100px;
                height:250px;
                font-size:20px;
                font-family:Time New Roman;
                margin-left:100px;
                margin-right:100px;
                margin-top:10px;
                padding-top:30px;
                padding-right:80px;
                padding-left:80px;
                text-align:center;
            }

            /* Caption text */
            .text {
                font-family:Verdana;
                color: black;
                font-size: 20px;
                padding: 8px 12px;
                position: absolute;
                bottom: 8px;
                width: 100%;
                text-align: center;
            }

            /* Number text (1/3 etc) */
            .numbertext {
                color: #f2f2f2;
                font-size: 12px;
                padding: 8px 12px;
                position: absolute;
                top: 0;
            }

            /* The dots/bullets/indicators */
            .dot {
                height: 10px;
                width: 10px;
                margin: 0 2px;
                background-color: #F5CBA7;
                border-radius: 50%;
                display: inline-block;
                transition: background-color 0.6s ease;
                margin-bottom:20px;

            }

            .active {
                background-color:crimson;
            }

            /* Fading animation */
            .fade {
                transition:none;
                -webkit-animation-name: fade;
                -webkit-animation-duration: 1.5s;
                animation-name: fade;
                animation-duration: 1.5s;
                padding-top:50px;
                margin-left:-60px;
                margin-right:-60px;


            }

            @-webkit-keyframes fade {
                from {opacity: .2} 
                to {opacity: 1}
            }

            @keyframes fade {
                from {opacity: .2} 
                to {opacity: 1}
            }

            /* On smaller screens, decrease text size */
            @media only screen and (max-width: 300px) {
                .text {font-size: 1200px;
                       color:Red;
                }
            }


            .mheader {
                background-color: #ffcccc;
                margin:-15px;  

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
        <%
            if (error.equals("Successfully logged out")) {%>
        <script>
            window.alert("Successfully logged out");
        </script><%
            }
            if (error.equals("you are not logged in")) {%>
        <script>
            window.alert("You need to login first");
        </script><%
            }
if (error.equals("Order placed successfully")) {%>
        <script>
            window.alert("Order placed successfully");
        </script><%
            }
        %>
   <body style="background-color:#ffffcc;">
        <header >
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


        <div class="slideshow-container">

            <div class="mySlides fade">
                <img src="images/a.jpeg" style="width:100%">

            </div>

            <div class="mySlides fade"> 
                <img src="images/b.jpeg" style="width:100%">

            </div>

            <div class="mySlides fade">
                <img src="images/c.jpeg" style="width:100%">

            </div>

            <div class="mySlides fade">
                <img src="images/d.png" style="width:100%">

            </div>

        </div>
        <br>

        <div style="text-align:center">
            <span class="dot" ></span> 
            <span class="dot"></span> 
            <span class="dot"></span> 
            <span class="dot"></span> 
        </div>

        <script>
            var slideIndex = 0;
            showSlides();

            function showSlides() {
                var i;
                var slides = document.getElementsByClassName("mySlides");
                var dots = document.getElementsByClassName("dot");
                for (i = 0; i < slides.length; i++) {
                    slides[i].style.display = "none";
                }
                slideIndex++;
                if (slideIndex > slides.length) {
                    slideIndex = 1
                }
                for (i = 0; i < dots.length; i++) {
                    dots[i].className = dots[i].className.replace(" active", "");
                }
                slides[slideIndex - 1].style.display = "block";
                dots[slideIndex - 1].className += " active";
                setTimeout(showSlides, 2000); // Change image every 2 seconds
            }

            sName = dots[i].className.replace(" active", "");
            slides[slideIndex - 1].style.display = "block";
            dots[slideIndex - 1].className += " active";
            setTimeout(showSlides, 2000); // Change image every 2 seconds

        </script>
        <br><br><br>
    </body>
            <%@include file="Footer.jsp" %>

</html>
