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
		
		<form:errors path="*" cssClass="error" /> <br>
		
		Login: <form:input type="text" path="login" />  <form:errors path="login" cssClass="error" />  <br>
		Name: <form:input type="text" path="firstName" />  <br>
		Email: <form:input type="email" path="email" />  <form:errors path="email" cssClass="error" /> <br>
		Phone: <form:input type="tel" path="phoneNumber" /> <br>
		Password: <form:input type="password" path="password" /> <form:errors path="password" cssClass="error" /> <br>
		Password confirm: <form:input type="password" path="passwordConfirm" /> <form:errors path="passwordConfirm" cssClass="error" /> <br>
		
		<button type="submit">Register</button>
		
	</form:form>
	

</body>
</html>