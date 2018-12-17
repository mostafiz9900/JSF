<%-- 
    Document   : newjs
    Created on : Dec 15, 2018, 10:55:38 AM
    Author     : User
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

            <h1>Student Form</h1>
             <h:form>  
                 <h:inputText value="#{studentCon.student.name}" size="35"/>
                <h:commandButton action="submit"  value="Regi"/>  
            </h:form>

        </body>
    </f:view>

</html>
