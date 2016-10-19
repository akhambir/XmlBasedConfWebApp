<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Cover Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Flood core CSS -->
    <link href="<c:url value="/resources/css/flood.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/cover.css"/>" rel="stylesheet">

</head>

<body>

<div class="site-wrapper-inner">

    <div class="blog-masthead">

        <div class="inner">

            <h3 class="masthead-brand"><a href="#">Cover</a></h3>
            <nav>
                <ul class="nav masthead-nav">
                    <li><a href="<c:url value="/"/>">Home</a></li>
                    <li><a href="<c:url value="/test"/>">Features</a></li>
                    <li><a href="#">Contact</a></li>
                    <li><a href="<c:url value="/loginPage"/>">Sign In</a></li>
                </ul>
            </nav>

        </div>

    </div>

    <div class="inner">
        <article class="comment">
            <a class="comment-img" href="#non">
                <img src="https://pbs.twimg.com/profile_images/444197466133385216/UA08zh-B.jpeg" alt="" width="50" height="50">
            </a>
            <div class="comment-body">
                <div class="text">
                    <p>Hello, this is an example from me</p>
                </div>
                <p class="attribution">by <a href="#non">Besnik Hetemi</a> at 14:23pm, 4 Dec 2015</p>
            </div>
        </article>
        <article class="comment">
            <a class="comment-img" href="#non">
                <img src="https://pbs.twimg.com/profile_images/444197466133385216/UA08zh-B.jpeg" alt="" width="50" height="50">
            </a>
            <div class="comment-body">
                <div class="text">
                    <p>if you are interested for  more about me visited my profile on social page</p>
                    <p>To visit me you can click my name  <a target="_blank" href="http://www.facebook.com/besnik.hetemii">Besnik Hetemi</a> and send me frends request or send me a message in inbox</p>
                </div>
                <p class="attribution">by <a href="#non">Besnik Hetemi</a> at 14:23pm, 4 Dec 2015</p>
            </div>
        </article>
    </div>

    <div class="inner">
        <div class="col-lg-8 col-lg-offset-2 text-center">
            <h2 class="margin-top-0 wow fadeIn">Get in Touch</h2>
            <hr class="primary">
            <p>We love feedback. Fill out the form below and we'll get back to you as soon as possible.</p>
        </div>

        <div class="col-lg-10 col-lg-offset-1 text-center">
            <form:form action="/flood/addComment" method="post" commandName="newComment" class="contact-form row">

                <div class="col-md-12">
                    <label></label>
                    <form:textarea path="commentBody" id="body" class="form-control" rows="9" placeholder="Your flood here.."/>
                </div>

                <p class="lead">
                    <button class="btn btn-lg btn-default" type="submit">Floood!</button>
                </p>
            </form:form>

        </div>
    </div>

    <%--<div class="mastfoot">
        <footer>
            <p>Welcome to my <a href="https://github.com/akhambir" target="_blank">GitHub</a> and <a href="https://ua.linkedin.com/in/akhambir" target="_blank">LinkedIn</a>.</p>
        </footer>
    </div>--%>

</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value="/resources/js/jquery-3.1.0.min.js"/>"></script>
<script>window.jQuery || document.write('<script src="<c:url value="/resources/js/jquery-3.1.0.min.js"/>"><\/script>')</script>
<script src="<c:url value="/resources/js/jquery-3.1.0.min.js"/>"></script>
</body>
</html>
