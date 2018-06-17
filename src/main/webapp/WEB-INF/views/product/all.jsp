<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All products</title>
</head>
<body>

	<link
		href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<div class="container">
		<div class="row">
			<div class="col-md-12">
			<c:forEach items="${ product }" var="product">
				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<h4 class="text-center">
							<span class="label label-info">${ product.type }</span>
						</h4>
						<img src="http://placehold.it/650x450&text=Galaxy S5"
							class="img-responsive">
						<div class="caption">
							<div class="row">
								<div class="col-md-6 col-xs-6">
									<h3>${ product.name } $</h3>
								</div>
								<div class="col-md-6 col-xs-6 price">
									<h3>
										<label>${ product.price } $</label>
									</h3>
								</div>
							</div>
							<p>${ product.country }</p>
							<p>${ product.maker }</p>
							<p>${ product.color }</p>
							<p>${ product.garanties }</p>
							<p>${ product.description }</p>
							<div class="row">
							<sec:authorize access="isAuthenticated()">
								<div class="col-md-6">
									<a class="btn btn-primary btn-product"><span
										class="glyphicon glyphicon-thumbs-up"></span> Like</a>
								</div>
								<div class="col-md-6">
									<a href="#" class="btn btn-success btn-product"><span
										class="glyphicon glyphicon-shopping-cart"></span> Buy</a>
								</div>
							</sec:authorize>
							</div>

							<p></p>
						</div>
					</div>
				</div>
				</c:forEach>
			</div>

		</div>
	</div>

</body>
</html>