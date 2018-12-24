<%-- 
    Document   : loginAuthontication
    Created on : Dec 24, 2018, 10:48:52 PM
    Author     : Mostafizur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Authentication page!</h1>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please enter username and password"/>
            </c:redirect>
            
        </c:if>
        <c:if test="${not empty param.username and not empty param.password}">
            <s:setDataSource var="ds" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/jstllogin5"
                             user="root" password="1234"/>
            <s:query dataSource="${ds}" var="selectQ">
                select count(*) as ku from users 
                where username ='${param.username}'
                and password='${param.password}'
            </s:query>
                <c:forEach items="${selectQ.rows}" var="r">
                    <c:choose>
                        <c:when test="${r.ku gt 0}">
                            <c:set scope="session"
                                   value="${param.username}"
                                   var="loginUser"/>
                        </c:when>
                        <c:otherwise>
                            <c:redirect url="login.jsp">
                                <c:param name="errMsg" value="Username /password does not match"></c:param>
                            </c:redirect>
                        </c:otherwise>
                    </c:choose>
                    
                </c:forEach>
            
        </c:if>
    </body>
</html>
