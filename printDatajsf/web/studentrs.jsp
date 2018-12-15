<%-- 
    Document   : studentrs
    Created on : Dec 15, 2018, 10:09:45 PM
    Author     : Mostafizur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
   <f:view>
        <body>
            <h1>Hello World!</h1>
            <h:form>
                <h:outputText value="#{studentCon.student.name}" ></h:outputText>>
                <h:outputText value="#{studentCon.student.emain}"></h:outputText>>
                <h:outputText value="#{studentCon.student.id}" ></h:outputText>>

              
            </h:form>
        </body>
    </f:view>
</html>
