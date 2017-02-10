<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome Page</title>
</head>
<body>
	<!--  <div align="right">
		<a href="/Logout">Logout</a>
	</div>-->

	<h1>Welcome ${name}</h1>
	<table border="0" align="center">
		<tr>
			<td><a href='/MainPage'> <img src="images/car.jpg"
					height="150" width="250">
			</a></td>
			<td><a href='/MainPage'> <img src="images/hotel.jpg"
					height="150" width="250">
			</a></td>
			<td><a href='/MainPage'> <img
					src="images/tourpackage.jpg" height="150" width="250">
			</a></td>
			<td><a href='/MainPage'> <img src="images/plantour.jpg"
					height="150" width="250">
			</a></td>
		</tr>
		<tr>
			<td align="center">Cab Bookings</td>
			<td align="center">Hotel Bookings</td>
			<td align="center">Tour Package Bookings</td>
			<td align="center">Plan Travel</td>
		</tr>
	</table>

</body>
</html>