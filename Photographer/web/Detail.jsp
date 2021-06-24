<%-- 
    Document   : Detail
    Created on : Jun 11, 2021, 8:51:15 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/Detail.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class="body">
            <div class="container">
                <div>
                    <h2>${gallery.name}</h2>
                </div>

                <div class="slider">
                    <div id="slideshow" class="slideshow-container">
                        <c:forEach items="${gallery.images}" var="i">
                            <div class="mySlides fade">
                                <img src="images/${i.url}" >
                            </div>
                        </c:forEach>
                        <div class="button">
                            <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
                            <button class="controls" id="pause">&#9612;&#9612;</button>
                            <a class="next" onclick="plusSlides(1)">&#10095;</a>
                        </div>

                    </div>
                    <br>
                </div>
                <div class="allPic">
                    <table>
                        <tr>
                            <c:forEach items="${gallery.images}" var="i">
                                <td><img src="images/${i.url}" ></td>
                                </c:forEach>
                        </tr>
                    </table>
                </div>

                <div id="bottomPagger" class="pagger">
                    <c:forEach begin="1" end="${totalpage}" var="i">
                        <a class="${i==pageindex?"active":""}" href="Detail?page=${i}&id=${gallery.id}&headerIndex=${pageIndex}">${i}</a>
                    </c:forEach>
                </div>
            </div>
            <div>
                <jsp:include page="Right.jsp"/>
            </div>
        </div>
    </body>
    <script>
        var slideIndex = 1;
        showSlides(slideIndex);

        function plusSlides(n) {
            showSlides(slideIndex += n);
        }
        function plus() {
            showSlides(slideIndex += 1);
        }

        function currentSlide(n) {
            showSlides(slideIndex = n);
        }

        function showSlides(n) {
            var i;
            var slides = document.getElementsByClassName("mySlides");

            if (n > slides.length) {
                slideIndex = 1;
            }
            if (n < 1) {
                slideIndex = slides.length;
            }
            for (i = 0; i < slides.length; i++) {
                slides[i].style.display = "none";
            }
            slides[slideIndex - 1].style.display = "block";
        }
        timer = setInterval(plus, 1000);
        plus();

        var playing = true;
        var pauseButton = document.getElementById('pause');

        function pauseSlideshow() {
            pauseButton.innerHTML = '&#5125;';
            playing = false;
            clearInterval(timer);
        }

        function playSlideshow() {
            pauseButton.innerHTML = '&#9612;&#9612;';
            playing = true;
            slideInterval = setInterval(plus, 1000);
        }

        pauseButton.onclick = function () {
            if (playing) {
                pauseSlideshow();
            } else {
                playSlideshow();
            }
        };

    </script>
</html>
