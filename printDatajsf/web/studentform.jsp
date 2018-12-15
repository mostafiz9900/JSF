<%-- 
    Document   : studentform
    Created on : Dec 15, 2018, 9:58:02 PM
    Author     : Mostafizur
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
            <h1>Hello World!</h1>
            <h:form>
                <h:inputText value="#{studentCon.student.name}" size="35"></h:inputText>
                <h:inputText value="#{studentCon.student.emain}" size="35"></h:inputText>
                <h:inputText value="#{studentCon.student.id}" size="35"></h:inputText>

                <h:commandButton  action="submit" value="Reg"></h:commandButton>
            </h:form>
        </body>
    </f:view>
</html>
