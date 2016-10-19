<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>Registration page</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">

</head>
<body>

    <div class="container">

        <form:form action="/register/addUser" method="post" commandName="newUser" class="form-signin">
        <h2 class="form-signin-heading" style="text-align: center">Registration page</h2>

            <div>
                <label for="name" class="sr-only">Name</label>
                <form:input path="userName" id="name" class="form-control" placeholder="Name"/>
            </div>

            <div>
                <label for="email" class="sr-only">Email</label>
                <form:input path="userEmail" id="email" class="form-control" placeholder="Email address"/>
            </div>

            <div>
                <label for="password" class="sr-only">Password</label>
                <form:password path="userPassword" id="password" class="form-control" placeholder="Password"/>
            </div>

            <br/>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>

        </form:form>
        <form action="<c:url value="/"/>" class="form-signin">

            <input type="submit" class="btn btn-lg btn-primary btn-block" value="Cancel"/>
        </form>

    </div>

</body>
</html>
