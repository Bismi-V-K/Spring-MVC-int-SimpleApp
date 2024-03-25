<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1 align="center">Please register here</h1>
	<form:form action="Registration-success" method="GET" modelAttribute="userReg">
		<label>User: </label>
		<form:input path="name" />
		<br />
		<label>UserName: </label>
		<form:input path="username" />
		<br />
		<label>Password: </label>
		<form:password path="password" />
		<br />
		<label>Country: </label>
		<form:select path="countryName">
			<form:option value="Ind" label="India"></form:option>
			<form:option value="US" label="USA"></form:option>
			<form:option value="Pak" label="Pakistan"></form:option>
			<form:option value="Sl" label="Srilanka"></form:option>
		</form:select>
		<br/>
		<label>Hobbies: </label>
		Cricket: <form:checkbox path="hobbbies" value="cri"/>
		Reading: <form:checkbox path="hobbbies" value="reading"/>
		Coding: <form:checkbox path="hobbbies" value="coding"/>
		<br/>
		<label>Gender: </label>
		Male<form:radiobutton path="gender" value="male"/>
		Female<form:radiobutton path="gender" value="female"/>
		<br/>
		<input type="submit" value="register">
	</form:form>
</div>
</body>
</html>