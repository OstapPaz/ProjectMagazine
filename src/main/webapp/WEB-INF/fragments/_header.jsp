<%@ include file="/WEB-INF/taglib.jsp"%>
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
	<div class="row">
		<div class="span12">
			<div class="head">
				<div class="row-fluid">
					<div class="span12">
						<div class="span6">
							<h1 class="muted">Defender</h1>
						</div>

					</div>
				</div>

				<div class="navbar">
					<div class="navbar-inner">
						<div class="container">
							<ul class="nav">
								<li><a href="http://localhost:8080/login">Sign in</a></li>

								<li><a href="http://localhost:8080">Main</a></li>

								<li><a href="#">Search</a></li>
								
								<sec:authorize access="isAuthenticated()">
								<li><a href="/my-profile">Profile</a></li>
								</sec:authorize>
								
								<sec:authorize access="!isAuthenticated()">
								<li><a href="/login">Profile</a></li>
								</sec:authorize>
								
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
