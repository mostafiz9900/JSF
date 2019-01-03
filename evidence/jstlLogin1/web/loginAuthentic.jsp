<%-- 
    Document   : loginAuthentic
    Created on : Jan 3, 2019, 9:24:00 AM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authentication Page</title>
    </head>
    <body>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please Enter UserName and Password"/>
            </c:redirect>
        </c:if>
        <c:if test="${not empty param.username and not empty  param.password}">
            <s:setDataSource  var="ds" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/jstllogin1"
                             user="root"
                             password="1234"/>
                            
            <s:query dataSource="${ds}" var="sq">
                select count(*) as kount from users 
                where username='${param.username}' 
                and password='${param.password}'
            </s:query>
            <c:forEach items="${sq.rows}" var="r">
                <c:choose>
                    <c:when test="${r.kount gt 0}">
                        <c:set scope="session" 
                               value="${param.username}" 
                               var="loginUser"/>
                        <c:redirect url="index.jsp"/>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="login.jsp">
                            <c:param name="errMsg" value="Username / password does not match"/>
                        </c:redirect>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </c:if>
    </body>
</html>
