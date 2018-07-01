<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Student Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
		
			First Name: <form:input path="firstName" />
			<br /><br />
			Last Name: <form:input path="lastName" />
			<br /><br />
			Email: <form:input path="email" />
			<br /><br />
			Country: 
			<form:select path="country">
				<form:options items="${student.countryOptions }" />				
			</form:select>
			<br /><br />
			Favorite Programming Language:
			<br />
			<form:radiobuttons path="favCode" items="${student.favoriteLanguageOptions}" />
			<br /><br />
			Operating Systems:
			<br />
			<form:checkbox path="operatingSystems" value="Linux" /> Linux
			<form:checkbox path="operatingSystems" value="MacOS" /> MacOS
			<form:checkbox path="operatingSystems" value="Windows" /> Windows
			<br /><br />
			<input type="submit" value="Submit" />
			<!-- on submit spring will set student.setFirstName and the rest   -->		
		</form:form>
	
	</body>
</html>