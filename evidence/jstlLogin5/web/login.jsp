<%-- 
    Document   : login
    Created on : Dec 24, 2018, 10:47:54 PM
    Author     : Mostafizur
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
        <h1>Please login</h1>
        <form action="loginAuthontication.jsp"> 
           User Name : <input type="text" name="username"><br>
           PassWord : <input type="text" name="password"><br>
           <input type="submit" value="Login">
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        <font>
    </body>
</html>
