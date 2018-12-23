<%-- 
    Document   : index
    Created on : Dec 23, 2018, 12:05:04 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@include  file="header.jsp" %> 
        <!--create database jstllogin2;
        CREATE table user(id int(10) primary key auto_increment unsigned not null, 
        username varchar(45) not null, password varchar(30) not null;
        
        insert into user (id, username, password) values(1, 'admin', '1234');
        -->
    </body>
</html>
