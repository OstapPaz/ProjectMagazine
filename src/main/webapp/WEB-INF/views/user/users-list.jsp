<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
<link rel="stylesheet" href="/resources/bootstrap.min.css">
<link rel="stylesheet" href="/resources/style.css">
</head>

<body>
<div class="row" style="margin-left: 100px">
			<div class="col-md-8">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Users</h3>
						<div class="pull-right">
							<span class="clickable filter" data-toggle="tooltip"
								title="Toggle table filter" data-container="body"> <i
								class="glyphicon glyphicon-filter"></i>
							</span>
						</div>
					</div>
					<div class="panel-body"></div>
					<table class="table table-hover" id="dev-table">
						<thead>
							<tr>
								<th>ID</th>
								<th>First Name</th>
								<th>Email</th>
								<th>Login</th>
								<th>Phone Number</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${ usersList }" var="user">
								<tr>
									<td>${ user.id }</td>
									<td>${ user.firstName }</td>
									<td>${ user.email }</td>
									<td>${ user.login }</td>
									<td>${ user.phoneNumber }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
