<%-- 
    Document   : index
    Created on : Jan 3, 2019, 12:06:55 AM
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
        <h1>Index World!</h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <a href="login.jsp">Login
            <c:out value="${sessionScope['loginUser']}"/>
        </a>
        
    </body>
</html>
