<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All products</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container" style="margin-left: 100px">

		<%-- <form:form modelAttribute="filterModel" action="/product/search"
			method="GET">
		First <form:input path="searchName" />
		Last  <form:input path="searchType" /> 
		Input <form:input path="searchMaker" /> 
		Login <form:input path="searchCountry" />
			<br> 
		Min salary <form:input path="searchMinSalary" type="number" /> 
		Max salary <form:input path="searchMaxSalary" type="number" />
			<br>
			<button type="submit">Search</button>
		</form:form> --%>

		<table id="example" class="display" cellspacing="0" width="75%">
			<thead>
				<tr>
					<th>Name</th>
					<th>Type</th>
					<th>Maker</th>
					<th>Color</th>
					<th>Price</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>Name</th>
					<th>Type</th>
					<th>Maker</th>
					<th>Color</th>
					<th>Price</th>
				</tr>
			</tfoot>
			<tbody>
				<c:forEach items="${ product }" var="p">
					<tr>
						<td>${ p.name }</td>
						<td>${ p.type }</td>
						<td>${ p.maker }</td>
						<td>${ p.color }</td>
						<td>${ p.price }</td>
						<td><a href="product/full/${ p.id }"> Full info </a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script type="text/javascript">
		'use strict';
		var $ = jQuery;
		$.getScript(
				"https://cdn.datatables.net/v/dt/dt-1.10.13/datatables.min.js",
				function() {

					$('#example').DataTable({
						"paging" : true,
						"ordering" : true,
						"info" : false
					});
				});
	</script>

</body>
</html>