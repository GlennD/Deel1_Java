<%-- 
    Document   : logout
    Created on : Apr 21, 2013, 4:32:51 PM
    Author     : Ruben
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <%
                    session.invalidate();
                    response.sendRedirect("index.jsp");
        %>
    </body>
</html>