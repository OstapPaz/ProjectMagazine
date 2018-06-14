<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/login" method="post" style="margin-left: 100px">
		Login: <input type="text" name="login"> <br>
		Password: <input type="password" name="password"> <br>
		Remember me: <input type="checkbox" name="rememberMe"> <br>
		<button type="submit">Sign in</button>
	</form:form>

</body>
</html>