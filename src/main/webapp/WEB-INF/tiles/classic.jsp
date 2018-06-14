<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="/resources/css/style.css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>

	<tiles:insertAttribute name="header" />

	<div class="container text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<tiles:insertAttribute name="sidebar" />
			</div>
			<div class="col-sm-10 text-left" >
				<tiles:insertAttribute name="body"/>
			</div>
		</div>
	</div>
	
	<tiles:insertAttribute name="footer"/>
</body>
</html>