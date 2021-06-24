<%-- 
    Document   : Contact
    Created on : Jun 13, 2021, 9:19:55 PM
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
        <div class="body">\
            <div class="container">
                <h2>Contact</h2>
                <br>
                <br>
                <h2>PHOTOGRAPHER</h2>
                <br>
                <p>Address: ${introduction.address}</p>
                <p>City: ${introduction.city}</p>
                <p>Country ${introduction.country}</p>
                <br>
                <p>Tel:${introduction.tel}</p>
                <p>Email:${introduction.email}</p>
                <br>
                <br>
                <br>
                <img src="images/${introduction.map}"/>
            </div>
            <div>
                <jsp:include page="Right.jsp"/>
            </div>
        </div>
        <jsp:include page="Footer.jsp"/>

    </body>
</html>
