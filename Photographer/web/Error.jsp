<%-- 
    Document   : Error
    Created on : Jun 15, 2021, 8:21:27 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/Home.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class="body">
            <div class="container">
                ${message}
            </div>
            <div>
                <jsp:include page="Right.jsp"/>
            </div>
        </div>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>
