<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Student Confirmation</title>
	</head>
	<body>
		<h3> The student data: </h3>
		<p>First Name: ${student.firstName}</p>
		<p>Last Name: ${student.lastName}</p>
		<p>Favorite Language: ${student.favCode}</p>
		<p>Favorite OS:
			<ul>
				<c:forEach var="temp" items="${student.operatingSystems }">
					<li>${temp }</li>
				</c:forEach>
			</ul> 
		</p>
		<p>Email: ${student.email}</p>
		<p>Country: ${student.country}</p>
	
	</body>
</html>