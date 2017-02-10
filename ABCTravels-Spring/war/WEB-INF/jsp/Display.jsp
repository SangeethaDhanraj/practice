<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display user Requirement</title>
</head>
<body>
<div align='right'>
			<a href='/Logout'>Logout</a>
			</div>
			<h2>Hi  ${name} ,you have requested for the following booking</h2>
			<h4><br>Destination: ${destination}
			<br>Hotel: ${hotel}
			<br>No of days: ${noofdays}
			<br>cab service: ${cab} </h4>
</body>
</html>