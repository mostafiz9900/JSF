<%-- 
    Document   : login
    Created on : Jan 5, 2019, 10:21:20 AM
    Author     : Mostafizur
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Please Login!</h1>
        <form action="authentic.jsp">
            User Name : <input type="text" name="username">
            Password : <input type="password" name="password">
            <input type="submit" value="Login">
            
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}"></c:if>
        </font>
    </body>
</html>
