<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form method="post" action="register">
		<fieldset>
			<legend>Register</legend>
			<label>Name</label> <input type="text" name="name" /> <br /> <br /> <label>Email</label>
			<input type="text" name="email" /> <br /> <br /> <label>Password</label>
			<input type="text" name="password" /> <br /> <br /> <label></label> <input
				type="submit" name="submit" value="Rgister" />
		</fieldset>
	</form>
</body>
</html>