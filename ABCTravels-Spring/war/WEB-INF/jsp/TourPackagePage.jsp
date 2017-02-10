<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tour Package</title>
</head>
<body>
	<div align="right">
		<a href="/Logout">Logout</a>
	</div>
	<form action="/HotelBooking">
		<table>

			<tr>
				<td><h3>Tour package Booking</h3></td>
			</tr>
			<tr>
				<td>select a destination</td>
				<td><select name="destionation">
						<option value='select'>Select</option>
						<option value='colombo'>colombo</option>
						<option value='Ella'>Ella</option>
						<option value='Sigiriya'>Sigiriya</option>
						<option value='Galle'>Galle</option>
						<option value='kandy'>Kandy</option>
				</select></td>
			</tr>
			<tr>
				<td><input type='submit' value='Next'></td>
			</tr>

		</table>
	</form>
</body>
</html>