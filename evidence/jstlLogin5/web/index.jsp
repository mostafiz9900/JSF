<%-- 
    Document   : index
    Created on : Jan 12, 2019, 9:00:35 AM
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
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <c:out value="${sessionScope['loginUser']}"/>
        <a href="login.jsp">login</a>
    </body>
</html>
