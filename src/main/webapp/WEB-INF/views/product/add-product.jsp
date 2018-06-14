<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add product</title>
</head>
<body>

		<form:form action="/product/add" method="post" modelAttribute="productDto" style="margin-left: 100px">
		
		Name: <input type="text" name="name">  <br>
		Type: <input type="text" name="type">  <br>
		Description: <input type="text" name="description" 
		<textarea name="textarea" style="width:250px;height:150px;"></textarea>>  <br>
		Color: <input type="text" name="color">  <br>
		Maker: <input type="text" name="maker"> <br>
		Country: <input type="text" name="country">  <br>
		Guarantee: <input type="text" name="garanties"> <br>
		<button type="submit">Add product</button>
		
	</form:form>

</body>
</html>