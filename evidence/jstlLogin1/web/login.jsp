<%-- 
    Document   : login
    Created on : Jan 3, 2019, 5:19:57 PM
    Author     : Mostafizur
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>
        <h1>Please login World!</h1>
        <form action="authentic.jsp" method="post">
            UserName : <input type="text" name="username"><br>
            Password : <input type="password"  name="password"><br>
            <input type="submit" value="Login">
            
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        </font>
    </body>
</html>
