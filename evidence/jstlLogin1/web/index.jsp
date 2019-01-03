<%-- 
    Document   : index
    Created on : Jan 3, 2019, 5:19:35 PM
    Author     : Mostafizur
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index Page</title>
    </head>
    <body>
        <h1>Login success </h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        
        <c:out value="${sessionScope['loginUser']}" />
        <br>
        <a href="login.jsp">login
            
        </a>
        
    </body>
</html>
