<%-- 
    Document   : Right
    Created on : Jun 13, 2021, 8:13:07 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/Right.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <table>
            <tr>
                <th><p>Share this page</p></th>
            </tr>
            <c:forEach items="${socialNetworks}" var="s">
                <tr>
                    <td>
                        <div class="right">
                            <img src="images/${s.url}">
                            <a  href="" >Share on ${s.name}</a>
                           
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>
