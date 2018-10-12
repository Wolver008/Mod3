<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="lightyellow">
<h1>Welcome Gamer!!!</h1><br>
<marquee><h2> Be ready for the Battle!!</h2><br></marquee>
<h1>${msg}</h1><br><h1> ${pid}</h1>

<br>
object : ${playerObj}
	<br /> Player No : ${playerObj.getPlayerId()}
	<br /> Player Name : ${playerObj.getPlayerName()}
	<br /> Player Type : ${playerObj.getPlayerType()}
	<br /> Player Level : ${playerObj.getPlayerLevel()}
	<br /> Player Role : ${playerObj.getPlayerRole()}
	<br />

</body>
</html>