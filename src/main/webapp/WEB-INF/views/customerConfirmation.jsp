<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<p>The customer is confirmed: ${customer.firstName} ${customer.lastName}</p>
	<p>postal code: ${customer.postalCode}</p>
	<p>free passes = ${customer.freePasses}</p>
	<p>Course Code = ${customer.courseCode}</p>
</body>
</html>