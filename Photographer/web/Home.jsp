<%-- 
    Document   : Home
    Created on : Jun 11, 2021, 10:03:51 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/Home.css" rel="stylesheet" type="text/css"/>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class="body">
            <div class="container">
                <img src="images/${introduction.image}"/>
                <div class="name">${introduction.name}</div>
                <div class="galleries">
                    <c:forEach items="${galleries}" var="g">
                        <div class="gallery">
                            <img src="images/${g.image}"/>
                            <div><a class="title" href="Detail?id=${g.id}&headerIndex=${pageIndex}" >View ${g.name}</a></div>
                            <p>${g.description}}</p>
                        </div>
                    </c:forEach>
                </div>
                <div class="intro">
                    <h2>About me</h2>
                    <p>${introduction.description}</p>
                </div>
                <div id="bottomPagger" class="pagger">
                    <c:forEach begin="1" end="${totalpage}" var="i">
                        <a class="${i==pageindex?"active":""}" href="Home?page=${i}">${i}</a>
                    </c:forEach>
                </div>
            </div>
            <div>
                <jsp:include page="Right.jsp"/>
            </div>
        </div>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>
