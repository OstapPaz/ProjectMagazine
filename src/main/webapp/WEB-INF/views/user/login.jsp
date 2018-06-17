<%@ include file="/WEB-INF/taglib.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet"> 
<title>Login page</title>
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