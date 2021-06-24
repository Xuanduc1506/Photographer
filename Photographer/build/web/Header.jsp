<%-- 
    Document   : Header
    Created on : Jun 10, 2021, 9:22:34 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="PreHeader">
            <li><a class="" href="Home" >My front page</a></li> 
                <c:forEach items="${galleries}" var="g">
                <li><a  href="Detail?id=${g.id}&headerIndex=${pageIndex}" >${g.name}</a></li> 
                </c:forEach>
            <li><a class="" href="Contact?headerIndex=${pageIndex}" >Contact</a></li>   
        </div>
        <div class="header">
            <div class="image">
                <img src="images/logo.png"/>
            </div>
            <div class="title">
                <h1>PHOTOGRAPHER</h1>
                <h3>Wellcome to this website</h3>
            </div>
        </div>
    </body>
</html>
