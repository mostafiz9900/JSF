<%-- 
    Document   : logOut
    Created on : Dec 23, 2018, 12:49:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
        session.removeAttribute("loginUser");
        %>
        <a href="index.jsp">index.jsp</a>
    </body>
</html>
