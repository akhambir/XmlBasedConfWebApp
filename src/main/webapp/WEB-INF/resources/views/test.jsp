<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 15.08.16
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
    <link href="<c:url value="/resources/css/test.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/cover.css"/>" rel="stylesheet">

</head>
<body>
<div class="container">
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
</div>
</body>
</html>
