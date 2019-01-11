<%-- 
    Document   : index
    Created on : Jan 11, 2019, 6:03:15 PM
    Author     : Mostafizur
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${empty sessionScope['LoginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <c:out value="${sessionScope['Loginuser']}"></c:out>
        <a href="login.jsp">Login</a>
    </body>
</html>
