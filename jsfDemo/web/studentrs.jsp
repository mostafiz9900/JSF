<%-- 
    Document   : StudentRs
    Created on : Dec 15, 2018, 11:02:24 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html>
<html>
    <f:view>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <body>

            <h1>Student Result</h1>

            <h:outputText value="#{studentCon.student.name}"></h:outputText>

        </body>
    </f:view>
</html>
