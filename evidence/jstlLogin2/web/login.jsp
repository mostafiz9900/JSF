<%-- 
    Document   : login
    Created on : Jan 8, 2019, 3:16:39 PM
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
        <form action="authentic.jsp">
            Username : <input type="text" name="username"><br>
            Possword : <input type="password" name="password"><br>
            <input type="submit" value="Login">
            
        </form>
        <font color="red">
        <c:if test="${empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        </font>
    </body>
</html>
