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
        <form action="authentic.jsp">
            Username : <input type="text" name="username"/>
            Passwore : <input type="password" name="password"/>
            <input type="submit" value="Login"/>
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        </font>
    </body>
</html>
