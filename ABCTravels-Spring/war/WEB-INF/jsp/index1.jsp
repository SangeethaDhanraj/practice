<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>


	<h1>${message}</h1>
<div>
	  <a href="/signup">SignUp</a>
	</div>
			Login ID:<input type="text" name="loginId" id="loginId"><br> <br>
			Password:<input type="password" name="Password" id="password"><br> <br>
			<input class="button" type="submit" value="Login" onclick="btnClick()"> 
			<input class="button" type="reset">


		<script type="text/javascript">
		
		function btnClick(){
			var data= {"loginId":$('#loginId').val(), "password":$("#password").val()}
		
			
		$.ajax({
			url: "/Login",
			type: "post",
			dataType: "json",
			contentType: "application/json",
			data: JSON.stringify(data),
			success: function(response) {
			if (response == "success") {
				window.location="/welcome;"
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