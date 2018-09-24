<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Defender</title>
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>

	<table id="example" class="display" cellspacing="0" width="75%" style="margin-left: 100px">
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
				<td> ${ p.name } </td>
				<td> ${ p.type } </td>
				<td> ${ p.maker } </td>
				<td> ${ p.color } </td>
				<td> ${ p.price } </td>
				<td> <a href="product/full/${ p.id }"> Full info </a> </td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>