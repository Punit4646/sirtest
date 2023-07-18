<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	
	<title>Login</title>
    <style>
        @import url('https://fonts.googleapis.com/css?family=Montserrat:400,800');


    </style>
</head>
<body>
	<div class="container" id="container">
		<div class="form-container log-in-container">
			<form action="employeeconroller" method="get">
				<h1>Employee Login</h1>
				<!-- <div class="social-container">
					<a href="#" class="social"><i class="fa fa-facebook fa-2x"></i></a>
					<a href="#" class="social"><i class="fab fa fa-twitter fa-2x"></i></a>
				</div> -->
				<!-- <span>or use your account</span> -->
				<input type="email" placeholder="Email" name="email" required=""/>
				<input type="password" placeholder="Password" name="password" required="" />
				<a href="customer-forget-password.jsp">Forgot your password?</a>
				<button type="submit" value="login" name="action">Log In</button>
			</form>
		</div>
		<div class="overlay-container">
			<div class="overlay">
				<div class="overlay-panel overlay-right">
					
				</div>
			</div>
		</div>
	</div>
</body>
</html>