<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<title>Main Menu</title>
</head>
<body>
	<div class="jumbotron">
		<h1> ${greeting} </h1>
		<p> ${tagline} </p>
	</div>
	<a href="hello/showForm">showForm Link</a>
	<br /><br />
	<a href="student/showForm">Register Student Link</a>
	<br /><br />
	<a href="customer/showForm">Register Customer Link</a>
</body>
</html>