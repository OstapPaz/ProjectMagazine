<%@ include file="/WEB-INF/taglib.jsp"%>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="/resources/css/style.css">
<!------ Include the above in your HEAD tag ---------->

<head>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
</head>
<h2 style="text-align: center;">Welcome to our page!</h2>
<br>

<div style="margin-left: 100px">
	   <sec:authorize access="!isAuthenticated()">
		 <a href="/register" class="list-group-item">
            <i class="fa fa-user"></i> Register
        </a>  <br>
        
	</sec:authorize> 
	
	<sec:authorize access="isAuthenticated()">
		<form:form action="logout" method="post">
			<button type="submit">Logout</button>
		</form:form>
	</sec:authorize>  
	
</div>