<%-- 
    Document   : login
    Created on : Jan 2, 2019, 11:34:03 PM
    Author     : Mostafizur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to ure app</title>
    </head>
    <body>
        <h1>Please Login</h1>
        <form action="authentication">
            User Name : <input type="text" name="username">
            PassWord : <input type="password" name="password">
            <input type="submit" value="Login">
        </form>
        <font color="red">
        <c:if test="${ not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
            
        </font>
    </body>
</html>
