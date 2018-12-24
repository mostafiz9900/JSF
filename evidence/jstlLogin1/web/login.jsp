<%-- 
    Document   : login
    Created on : Dec 24, 2018, 8:46:33 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Please login!</h1>
        <form action="loginAuthentication.jsp">
            UserName : <input type="text" name="username"><br><br>
            PassWord : <input type="password" name="password"><br><br>
            <input type="submit" value="Login">
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
            
        </font>
    </body>
</html>
