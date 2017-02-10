<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Page</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
<table>
			<tr>
				<th colspan="2">Registration Details</th></tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" id="name" required="true"/></td></tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" id="address" required="true"></td></tr>
			<tr>
				<td>Contact Number</td>
				<td><input type="text" name="contactno" id="contactno"  required="true" /></td></tr>
			<tr>
				<td>Login ID</td>
				<td><input type="text" name="loginId" id="loginId" required="true"/></td></tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password"  required="true"/></td></tr>
			<tr>
				<td>Re-enter password</td>
				<td><input type="password" name="repassword" id="repassword" required="true" /></td></tr>
			<tr>
				<td colspan="3"><input type="submit" name="submit" onclick="btnClick()"
					value="submit" />
					</td></tr>
		</table>
		
		<script type="text/javascript">
		
		function btnClick(){
			var data= {"name":$('#name').val(),"address":$('#address').val(),"contactno":$('#contactno').val(), "loginId":$('#loginId').val(), "password":$("#password").val(), "repassword":$("#repassword").val()}
		
		$.ajax({
			url: "/Registration",
			type: "post",
			dataType: "json",
			contentType: "application/json",
			data: JSON.stringify(data),
			success: function(response) {
			if (response == "success") {
			window.location="/index";
			} 
			},
			error: function(response) {
				if (response == "Error") {
				window.location="/Error";
			}
			}
			
		})
		}
		</script>
		

</body>
</html>