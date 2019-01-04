<%-- 
    Document   : index
<<<<<<< HEAD
    Created on : Jan 3, 2019, 9:24:18 AM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

=======
    Created on : Jan 3, 2019, 5:19:35 PM
    Author     : Mostafizur
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
>>>>>>> 9d38709a5ea444086bc2b2fa68c8e855f465c24b
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index Page</title>
    </head>
    <body>
<<<<<<< HEAD
        <h1>index page!</h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>

        </c:if>
        <a href="login.jsp">Login
            <c:out value="${sessionScope['loginUser']}"/>
        </a>
=======
        <h1>Login success </h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        
        <c:out value="${sessionScope['loginUser']}" />
        <br>
        <a href="login.jsp">login
            
        </a>
        
>>>>>>> 9d38709a5ea444086bc2b2fa68c8e855f465c24b
    </body>
</html>
