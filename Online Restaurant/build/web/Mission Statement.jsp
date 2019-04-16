<%-- 
    Document   : Mission Statement
    Created on : Feb 3, 2018, 1:07:12 AM
    Author     : Asma Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Mission Statment</title>
    </head>
     
    <style>
        * {box-sizing:border-box}

        body{
            background-color:rgb(222,184,135);
            font-family: "Times New Roman", Times, serif;
            font-size:20px;
            margin-right: 30px;
            margin-left: 30px;

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
            transition-color:none;
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
    </style>



    <body>
       
    <marquee>
        <h2 style="color:saddle brown; font-size:200% ;font-family:Garamond">Food Gallery</h2> 
    </marquee>

    
     <div class="slideshow-container">

            <div class="mySlides fade">
                <img src="images/m1.jpg" style="width:100%">

            </div>

            <div class="mySlides fade"> 
                <img src="images/m2.jpg" style="width:100%">

            </div>

            <div class="mySlides fade">
                <img src="images/m3.jpg" style="width:100%">

            </div>

         <div class="mySlides fade">
                <img src="images/m4.jpg" style="width:100%">

            </div>
         
         <div class="mySlides fade">
                <img src="images/m5.jpg" style="width:100%">

            </div>
         
        </div>
    
    <br>

    <div style="text-align:center">
        <span class="dot" ></span> 
        <span class="dot"></span> 
        <span class="dot"></span>
        <span class="dot"></span> 
        <span class="dot"></span> 
    </div>
    <p style="color: black ; text-align:center; font-size:70%">
        <i>Within the next 12 months Food Gallery will become known to be no.1 in service, to have the best staff, and to serve the best food.
        </i></p>
    <b>
        <i>
            <h3 style="color:black;"><ins>THE MISSION:</ins></h3> 
        </i>
    </b>
    <p1>
        <p1 style="color: black ;">
            <b style ="font-family:Comic Sans MS">To develop</b> To help citizens of the world live better by making healthy food convenient & affordable.
        </p1>
    </p1>
    <br>
    <br>
    <p2>
        <p1 style="color: black ;">
            <b style ="font-family:Comic Sans MS">To contribute</b> Our mission is to make lives healthier, easier and richer. 
        </p1> </p2>

    <br>
    <br>
    <p3>
        <p1 style="color: black ;">

            <b style ="font-family:Comic Sans MS">To provide a platform </b> For Enjoying your life with colorful and delicious food 
        </p1>
    </p3>

    <br>
    <br>
    <p4>
        <p1 style="color: black ;">

            <b style ="font-family:Comic Sans MS">To document </b> To sell delicious and remarkable food and beverage to match our world class location, to consistently provide our customers with impeccable service by demonstrating warmth, graciousness, efficiency, knowledge, professionalism and integrity to our work. 
        </p1>
    </p4>

    <br>
    <br>
    <p5>
        <p1 style="color: black ;">

            <b style ="font-family:Comic Sans MS">Our Vision </b> We acknowledge our customer on arrival and say thank you to every customer at least once for choosing Food Gallery. </p1>

    </p5>

    <br>
    <br><br>
    <br>

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

</body>
</html>
