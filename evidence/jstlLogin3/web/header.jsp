<%-- 
    Document   : header
    Created on : Dec 23, 2018, 12:13:07 PM
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
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <a href="login.jsp">Logout
            <c:out value="${sessionScope['loginUser']}"></c:out>
        </a>
    </body>
</html>