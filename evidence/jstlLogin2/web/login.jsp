<%-- 
    Document   : login
    Created on : Jan 3, 2019, 8:16:59 PM
    Author     : Mostafizur
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login  Page</title>
    </head>
    <body>
        <h1>Please Login </h1>
        <form action="authentic.jsp" method="post">
            Username : <input type="text" name="username">
            Password : <input type="password" name="password">
            <input type="submit" value="Login">
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out  value="please enter username and password"/>
        </c:if>
        </font>
    </body>
</html>
