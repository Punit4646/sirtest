<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Employee Register</title>
<style>
@import
	url('https://fonts.googleapis.com/css?family=Montserrat:400,800');
</style>
</head>
<body>
	<div class="container" id="container">
		<div class="form-container log-in-container">
			<form action="employeeconroller" method="get">
				<h1>Employee Register</h1>

				<input type="text" placeholder="Name" name="name" required="" /> 
				<input type="text" placeholder="Contact" name="contact" required="" />
				<input type="radio" name="gender" value="Male" />Male 
				<input type="radio" name="gender" value="Female" />Female 
				<input type="text" placeholder="Address" name="address" required="" /> 
				<input type="date" placeholder="Date Of Birth" name="dob" required="">
				<input type="email" placeholder="Email" name="email" required="" />
				<input type="password" placeholder="Password" name="password"
					required="" />
	 			 <!-- <button name="action" type="submit" value="register">Register</button>  -->
				 <a href="employeeconroller?action=register">Register</a>
			</form>
		</div>

	</div>
</body>
</html>