<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style>
	.error {
		color: red;
	}
</style>
</head>
<body>
	
	<form:form action="/register" method="post" modelAttribute="userDto" style="margin-left: 100px">
		
		<form:errors path="*" cssClass="error" />
		
		Login: <input type="text" name="login">  <form:errors path="login" cssClass="error" /> <br>
		Name: <input type="text" name="firstName">  <br>
		Email: <input type="email" name="email">  <form:errors path="email" cssClass="error" /> <br>
		Phone: <input type="tel" name="phoneNumber"> <br>
		Password: <input type="password" name="password"> <form:errors path="password" cssClass="error" /> <br>
		Password confirm: <input type="password" name="passwordConfirm"> <form:errors path="passwordConfirm" cssClass="error" /> <br>
		<button type="submit">Register</button>
		
	</form:form>
	

</body>
</html>