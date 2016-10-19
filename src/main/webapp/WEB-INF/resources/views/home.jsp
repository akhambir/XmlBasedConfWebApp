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

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/cover.css"/>" rel="stylesheet">

</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand"><a href="#">Cover</a></h3>
                    <nav>
                        <ul class="nav masthead-nav">
                            <li><a href="<c:url value="/"/>">Home</a></li>
                            <li><a href="#">Features</a></li>
                            <li><a href="#">Contact</a></li>
                            <li><a href="<c:url value="/loginPage"/>">Sign In</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
                <h1 class="cover-heading">Hi Pasha!</h1>
                <p class="lead">Cover is a one-page template for building simple and beautiful home pages. Download, edit the text, and add your own fullscreen background photo to make it your own.</p>
                <p class="lead">
                    <a href="<c:url value="/flood"/>" class="btn btn-lg btn-default">I want to flood!</a>
                </p>
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>Welcome to my <a href="https://github.com/akhambir" target="_blank">GitHub</a> and <a href="https://ua.linkedin.com/in/akhambir" target="_blank">LinkedIn</a>.</p>
                </div>
            </div>

        </div>

    </div>

</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value="/resources/js/jquery-3.1.0.min.js"/>"></script>
<script>window.jQuery || document.write('<script src="<c:url value="/resources/js/jquery-3.1.0.min.js"/>"><\/script>')</script>
<script src="<c:url value="/resources/js/jquery-3.1.0.min.js"/>"></script>
</body>
</html>

