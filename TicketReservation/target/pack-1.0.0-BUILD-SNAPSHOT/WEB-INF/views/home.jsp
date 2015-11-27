<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<form action="login" method="post">
		UserName:<input type="text" name="username" /><br />
		<br /> PassWord:<input type="password" name="password" /><br />
		<br /> <input type="submit" value="Login" />
	</form>
	<form action="register" method="get">
		<input type="Submit" value="register">
	</form>
	${msg}
	${msg1}
</body>
</html>
