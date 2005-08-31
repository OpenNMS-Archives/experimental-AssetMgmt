<html>
	<head>
		<title>Login</title>
		<link rel="stylesheet" type="test/css" href="styles/styleSheet.css">
	</head>
	
	<jsp:include page="styles/header.html" />
	
	<body bgcolor="white">
		<h1>Please Login</h1>
		<hr>
		
		<form action="j_security_check" method="post">
			<table>
				<tr>
				<td><label for="username">Username:</label>
				<td><input type="text" name="j_username" id="username">
				<tr>
				<td><label for="password">Password:</label>
				<td><input type="password" name="j_password" id="password">
			</table>
			<p>
			<input type="submit" value="Login"> <input type="reset">
		</form>
	</body>
</html>