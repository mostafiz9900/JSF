<%-- 
    Document   : authentication
    Created on : Jan 2, 2019, 11:35:27 PM
    Author     : Mostafizur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authentication Page</title>
    </head>
    <body>
        <c:if test="${empty param.user_name or empty param.password}">
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please Enter User Name and Password"/>
            </c:redirect>
        </c:if>
        <c:if test="${not empty param.user_name and not empty param.password}">
            <s:setDataSource driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/logino1"
                             user="root"
                             password="1234"
                             var="result"/>
            <s:query dataSource="${result}" var="selectQ">
                select count(*) as kount form user where user_name='${param.user_name}' and password='${param.password}'
            </s:query>
            <c:forEach items="${selectQ.rows}" var="r">
                <c:choose>
                    <c:when test="${r.kount gt 0}">
                        <c:set scope="session"
                               value="${param.user_name}"
                               var="loginUser"/>
                        <c:redirect url="index.jsp"/>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="login.jsp">
                            <c:param name="errMsg" value="Username/password does not match"/>
                        </c:redirect>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </c:if>
    </body>
</html>
