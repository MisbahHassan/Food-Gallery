<!DOCTYPE html>
<html lang="en" >

    <head>
        <meta charset="UTF-8">
        <title>Sign up form</title>
        <style>

            *:focus {
                outline: none;
            }

            body {
                margin: 0;
                padding: 0;
                background: #DDD;
                font-size: 16px;
                color: #222;
                font-family: 'Roboto', sans-serif;
                font-weight: 300;
            }

            #login-box {
                position: relative;
                margin: 5% auto;
                width: 600px;
                height: 420px;
                background: #FFF;
                border-radius: 2px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
            }

            .left {
                position: absolute;
                top: 0;
                left: 0;
                box-sizing: border-box;
                padding: 40px;
                width: 300px;
                height: 400px;
            }

            h1 {
                margin: 0 0 20px 0;
                font-weight: 300;
                font-size: 28px;
            }

            input[type="text"],
            input[type="password"] {
                display: block;
                box-sizing: border-box;
                margin-bottom: 20px;
                padding: 4px;
                width: 220px;
                height: 32px;
                border: none;
                border-bottom: 1px solid #AAA;
                font-family: 'Roboto', sans-serif;
                font-weight: 400;
                font-size: 15px;
                transition: 0.2s ease;
            }

            input[type="text"]:focus,
            input[type="password"]:focus {
                border-bottom: 2px solid #16a085;
                color: #16a085;
                transition: 0.2s ease;
            }

            input[type="submit"] {
                margin-top: 9px;
                width: 120px;
                height: 32px;
                background: #16a085;
                border: none;
                border-radius: 2px;
                color: #FFF;
                font-family: 'Roboto', sans-serif;
                font-weight: 500;
                text-transform: uppercase;
                transition: 0.1s ease;
                cursor: pointer;
            }

            input[type="submit"]:hover,
            input[type="submit"]:focus {
                opacity: 0.8;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
                transition: 0.1s ease;
            }

            input[type="submit"]:active {
                opacity: 1;
                box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);
                transition: 0.1s ease;
            }

            .or {
                position: absolute;
                top: 180px;
                left: 280px;
                width: 40px;
                height: 40px;
                background: #DDD;
                border-radius: 50%;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
                line-height: 40px;
                text-align: center;
            }

            .right {
                position: absolute;
                top: 0;
                right: 0;
                box-sizing: border-box;
                padding: 40px;
                width: 300px;
                height: 420px;
                background: url('bg.jpg');
                background-size: cover;
                background-position: center;
                border-radius: 0 2px 2px 0;
            }

            .right .loginwith {
                display: block;
                margin-bottom: 40px;
                font-size: 28px;
                color: #FFF;
                text-align: center;
            }

            button.social-signin {
                margin-bottom: 20px;
                width: 220px;
                height: 36px;
                border: none;
                border-radius: 2px;
                color: #FFF;
                font-family: 'Roboto', sans-serif;
                font-weight: 500;
                transition: 0.2s ease;
                cursor: pointer;
            }

            button.social-signin:hover,
            button.social-signin:focus {
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
                transition: 0.2s ease;
            }

            button.social-signin:active {
                box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);
                transition: 0.2s ease;
            }

            button.social-signin.facebook {
                background: #32508E;
            }

            button.social-signin.twitter {
                background: #55ACEE;
            }

            button.social-signin.google {
                background: #DD4B39;
            }
        </style>
        <script>
            var request;
            function sendInfo()
            {
                var u = document.signup.username.value;
                var url = "SignupValidation.jsp?username=" + u;

                if (window.XMLHttpRequest) {
                    request = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    request = new ActiveXObject("Microsoft.XMLHTTP");
                }

                try {
                    request.onreadystatechange = getInfo;
                    request.open("GET", url, true);
                    request.send();
                } catch (e) {
                    alert("Unable to connect to server");
                }
            }
            function getInfo() {
                if (request.readyState == 4) {
                    var val = request.responseText;
                    document.getElementById('mylocation').innerHTML = val;
                }
            }
        </script>
    </head>

    <body>
        <form name ="signup" >
            <div id="login-box">
                <div class="left">
                    <h1>Sign Up</h1>
                    <input type="text" id =" email" name="email" placeholder="E-mail" required />
                    <input type="text" id =" name" name="name" placeholder="Name" required />
                    <input type="password" id =" password"  name="password" placeholder="Password" required/>
                    <%!
                        String name = null;
                        String email = null;
                        String pwd = null;
                        
                        %>
                    <%
                         session = request.getSession(true);
                        name = request.getParameter("name");
                        email = request.getParameter("email");
                        pwd = request.getParameter("password");
                        
                        session.setAttribute("name", name);
                        session.setAttribute("email", email);
                        session.setAttribute("password", pwd);
                       
                    %>
                     <input type="text" id =" username" name="username" placeholder="Username" onblur="sendInfo()" required/> <span id="mylocation"></span>
                  
                     <input type="submit" name="signup_submit" value="Sign me up" />
                </div>
                <div class="right">
                    <span class="loginwith">Sign in with<br />social network</span>
                    <button class="social-signin facebook" onclick="window.location.href = 'https://www.facebook.com/'">Log in with Facebook </button>
                    <button class="social-signin twitter" onclick="window.location.href = 'https://twitter.com/'">Log in with Twitter</button>
                    <button class="social-signin google" onclick="window.location.href = 'https://plus.google.com/discover'">Log in with Google+</button>
                </div>
                <div class="or">OR</div>
            </div>
        </form>
    </body>

</html>