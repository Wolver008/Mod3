<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">
<h2>Welcome to Players Unknown Battle Ground<h2> <marquee><h1>[-> PUBG Tournament <-]</h1></marquee>
	<form:form action="store.go" modelAttribute="playerObj" method="POST">
<h3>	Name : <form:input path="PlayerName"/></h3><br>
<h3>	Type: <form:input path="PlayerType"/></h3><br>
<h3>	Level: <form:input path="PlayerLevel"/></h3><br>
<h3>	Role: <form:input path="PlayerRole"/></h3><br>
	
	<input type="submit" value="play"/>
	</form:form>

</body>
</html>