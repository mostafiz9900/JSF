<%-- 
    Document   : login
    Created on : Dec 23, 2018, 11:03:39 PM
    Author     : Mostafizur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login to our app</title>
    </head>
    <body>
        <h1>Please Login</h1>
        <form action="loginAuthenticate.jsp">
            Username : <input type="text" name="username"/>
            Password : <input type="password" name="password"/>
            <input value="Login" type="submit"> 

        </form>
        <font color="red"><c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>

        </font>
    </body>
</html>
