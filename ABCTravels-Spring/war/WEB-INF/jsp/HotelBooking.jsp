<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tour package Booking page</title>
</head>
<body>
	<div align='right'>
		<a href='/Logout'>Logout</a>
	</div>
	<tabel>
	<form action='/CabBooking'>
		<tr>
			<td><h3>Tour package Booking</h3></td>
		</tr>
		<tr>
			<td>Select a hotel</td>
			<td><select name='hotel'>
					<option value='Jetwings'>Jetwings</option>
					<option value='Kells'>Kells</option>
					<option value='Heritance'>Heritance</option>
					<option value='Devon'>Devon</option>
					<option value='Hiliton'>Hiliton</option>
			</select></td></tr>
			<br>
			<br>
		<tr>
			<td>Number of days</td>
			<input type='text' name='noofdays'>
			</td>
		</tr>
		<tr>
			<td><input type='submit' value='Next'></td>
	</form>
	<form action='TourPackagePage.jsp'>
		<td><input type='submit' value='back'></td>
		</tr>
	</form>
	</table>
</body>
</html>