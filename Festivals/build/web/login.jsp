<%-- 
    Document   : login
    Created on : Apr 21, 2013, 4:20:38 PM
    Author     : Ruben
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="css/general.css" media="screen" />    
    <link rel="stylesheet" type="text/css" href="css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="css/forms.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="css/css3.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="css/custom.css" media="screen" />
    
    <style>   
        body
        {
            background-color: #f2f2f2;
        }
    </style>
    
    </head>
    <body>        
            <div class="col_8 box_shadow rounded" style="margin-left: 34%; margin-top: 15%; background-color: #00ADEF;">
                <center><h1>LOGIN PAGE</h1></center>
                <form method="POST" action="${pageContext.request.contextPath}/loginServlet">
                    <table align="center">
                        <thead>
                            <tr>
                                <th><label for="username">Username :</label></th>
                                <th><input name="uname" type="email" id="username" required="required" class="box_shadow" /></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><label for="password">Password :</label></td>
                                <td><input type="password" name="pass" id="password" required="required" class="box_shadow" value="" /></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" value="Login" /></td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
                
            <div id="footer"><a href = 'login.jsp'>Admin login</a>&copy; 2013, all rights reserved PXL/PHL Belgium</div>
     
    </body>
</html>