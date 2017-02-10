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
			<a href='/Logout'> Logout</a>
		</div>
			<table>
			<form action='/TourPackage'>
			<tr><td> select a cab service</td>
			<td><select name='cab'>
				<option value='Select'>Select</option>
				<option value='Royal'>Royal</option>
				<option value='Kangaroo'>Kangaroo</option>
				<option value='Derena'>Derena</option>
				<option value='ACE'>ACE</option>
			</select></td>
			<tr><td><input type='submit' value='submit'></td>
			</form>
			<form action='/HotelBooking'>
			<td><input type='submit' value='Back'></td></tr>
			</form>
			</table>
</body>
</html>