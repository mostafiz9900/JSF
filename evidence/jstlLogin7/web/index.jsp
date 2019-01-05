<%-- 
    Document   : index
    Created on : Jan 5, 2019, 10:21:36 AM
    Author     : Mostafizur
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>Login success</h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <c:out value="${sessionScope['loginUser']}"/><hr><br>
        <a href="login.jsp">Login</a>
    </body>
</html>
