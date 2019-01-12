<%-- 
    Document   : studentResult
    Created on : Dec 17, 2018, 12:51:15 AM
    Author     : MAHBUB
--%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <f:view>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Data IDB</h1>
    <h:form>
        ID: <h:outputText value="#{std.stdu.id}" /><br><br>
       Name: <h:outputText value="#{std.stdu.name}" /><br><br>
       Gender: <h:outputText value="#{std.stdu.gender}" /><br><br>
       Round: <h:outputText value="#{std.stdu.round}" /><br><br>
       Email: <h:outputText value="#{std.stdu.email}" /><br><br>
       Password: <h:outputText value="#{std.stdu.password}" /><br>
        
        
    </h:form>
        
    </body>
    </f:view>
</html>
