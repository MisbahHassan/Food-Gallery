<%-- <input type="submit" name="Add Item">
    Document   : AddNew
    Created on : Jan 15, 2018, 4:34:18 AM
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
            background-color: #F14D29; 
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
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Item</title>
        
        
        <script>
            function fill(){
            var place = document.getElementById("place");
            console.log(place.value);
            var cat = document.getElementById("cat");
            if(cat.options.length>0)
            {
                cat.options.length=0;
            }
            if (place.value ==="Pakistan"){
                
                var cat1= document.createElement("option");
                cat1.value="Karahi";
                cat1.innerText="Karahi";
                
                var cat2= document.createElement("option");
                cat2.value="Rice";
                cat2.innerText="Rice";
                
                var cat3= document.createElement("option");
                cat3.value="Daal";
                cat3.innerText="Daal";
                
                var cat4= document.createElement("option");
                cat4.value="BBQ";
                cat4.innerText="Bar B.Q";
                
                cat.appendChild(cat1);
                cat.appendChild(cat2);
                cat.appendChild(cat3);
                cat.appendChild(cat4);
            }
            else  if (place.value ==="Indian"){
                var cat1= document.createElement("option");
                cat1.value="Bengoli";
                cat1.innerText="Bengoli";
                
                var cat2= document.createElement("option");
                cat2.value="Gujrati";
                cat2.innerText="Gujrati";
                
                var cat3= document.createElement("option");
                cat3.value="Punjabi";
                cat3.innerText="Punjabi";
                
                var cat4= document.createElement("option");
                cat4.value="Bombay";
                cat4.innerText="Bombay";
                
                cat.appendChild(cat1);
                cat.appendChild(cat2);
                cat.appendChild(cat3);
                cat.appendChild(cat4);
                
            }
            else  if (place.value ==="Chinese"){
                var cat1= document.createElement("option");
                cat1.value="Chinese Soup";
                cat1.innerText="Chinese Soup";
                
                var cat2= document.createElement("option");
                cat2.value="Chinese Rice";
                cat2.innerText="Chinese Rice";
                
                var cat3= document.createElement("option");
                cat3.value="Chinese Noodles";
                cat3.innerText="Chinese Noodles";
     
                cat.appendChild(cat1);
                cat.appendChild(cat2);
                cat.appendChild(cat3);
                
            }
            else  if (place.value ==="Italian"){
                var cat1= document.createElement("option");
                cat1.value="Pasta";
                cat1.innerText="Pasta";
                
                var cat2= document.createElement("option");
                cat2.value="Burger";
                cat2.innerText="Burger";
                
                var cat3= document.createElement("option");
                cat3.value="Pizza";
                cat3.innerText="Pizza";
     
                cat.appendChild(cat1);
                cat.appendChild(cat2);
                cat.appendChild(cat3);
                
            }
            
            else  if (place.value ==="Beverages"){
                var cat1= document.createElement("option");
                cat1.value="Tea/Coffee";
                cat1.innerText="Tea/Coffee";
                
                var cat2= document.createElement("option");
                cat2.value="Juices";
                cat2.innerText="Juices";
                
                var cat3= document.createElement("option");
                cat3.value="Cold Drinks";
                cat3.innerText="Cold Drinks";
     
                cat.appendChild(cat1);
                cat.appendChild(cat2);
                cat.appendChild(cat3);
            }
            
            else  if (place.value ==="Desserts"){
                var cat1= document.createElement("option");
                cat1.value="Ice cream";
                cat1.innerText="Ice cream";
                
                var cat2= document.createElement("option");
                cat2.value="Puddings";
                cat2.innerText="Puddings";
                
                var cat3= document.createElement("option");
                cat3.value="Halvay";
                cat3.innerText="Halvay";
     
                cat.appendChild(cat1);
                cat.appendChild(cat2);
                cat.appendChild(cat3);
                
            }
            
            
        }
        </script>
        
    </head>
    <%
        String error = request.getParameter("error");
        if (error == null || error == "null") {
            error = "";
        }
    %>
    <%
        if (error.equals("New Item Inserted")) {%>
    <script>
        window.alert("New Item Inserted");
    </script><%
        }%>



    <body bgcolor="#EDA252">
        <%@include file="Header.jsp" %>

        <h1 align="center">New Item Insertion</h1>
        <form action="http://localhost:8080/Online_Restaurant/InsertInDb.jsp">
            <table cellspacing="4" cellpadding="10"  align="center">
                <tr>
                    <td><b>Select Place: </b></td>
                    <td> <select id="place" style="width:170px; " name="place" onchange="fill();">
                            <option value="">--Select--</option>
                            <option value="Pakistan">Pakistan</option>
                            <option value="Indian">Indian</option>
                            <option value="Italian">Italian</option>
                            <option value ="Chinese">Chinese</option>
                            <option value ="Beverages">Beverages</option>
                            <option value ="Desserts">Desserts</option>
                        </select>

                    </td>
                </tr>


                <tr><td>
                        <b>Select Category: </b></td><td>
                        <select name="category" style="width:170px; " id="cat">
                            <option value="">--Select--</option>
                            <%--  <option value="Karahi">Karahi</option>
                            <option value="Rice">Rice</option>
                            <option value="Daal">Daal</option>
                            <option value="BBQ">Bar B.Q</option>
                            <option value="Bengoli">Bengoli</option>
                            <option value="Bombay">Bombay</option>
                            <option value="Gujrati">Gujrati</option>
                            <option value="Punjabi">Punjabi</option>
                            <option value="Pizza">Pizza</option>
                            <option value="Burger">Burger</option>
                            <option value="Pasta">Pasta</option>
                            <option value="Chinese Rice">Chinese Rice</option>
                            <option value="Chinese Soups">Chinese Soups</option>
                            <option value="Chinese Noodles">Chinese Noodles</option>
                            <option value="Shakes">Shakes</option>
                            <option value="Cold Drinks">Cold Drinks</option>
                            <option value="Tea/Coffee">Tea/Coffee</option>
                            <option value="Juices">Juices</option>
                            <option value="Ice cream">Ice cream</option>
                            <option value="Puddings">Puddings</option>
                            <option value="Halvay">Halvay</option>--%>
                        </select>

                    </td>
                </tr>

                <tr>
                    <td><b>Item Name: </b></td>
                    <td>
                        <input type ="text" name="item" required>
                    </td>
                </tr>
                <tr>
                    <td><b>Price of Item: </b></td>
                    <td>
                        <input type="text" name ="price" required>
                    </td>
                </tr>

                <tr>
                    <td>
                        <b>Upload Image of Item: </b></td>
                    <td><input type="file" name="image" required>
                    </td>
                </tr>

                <tr>
                    <td></td>
                    <td>
                        <br> <input type="submit" class="button" value="Add Item">
                    </td>
                </tr>

            </table>
        </form>
        <br>
        <br>
        <br>
        <br>
        <br>

    </body>
    <%@include file="Footer.jsp" %>
</html>
