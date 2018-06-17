<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User profile</title>
</head>
<body>
<div class="container">
      <div class="row">
      <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
           <A href="edit.html" >Edit Profile</A>
      </div>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-2 toppad" >
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">${ user.login }</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png" class="img-circle img-responsive"> </div>
            
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <td>Name</td>
                        <td>${ user.firstName }</td>
                      </tr>
                      <tr>
                        <td>Login</td>
                        <td>${ user.login }</td>
                      </tr>
                      <tr>
                        <td>Email</td>
                        <td><a href="${ user.email }">${ user.email }</a></td>
                      </tr>
                      <tr>
                        <td>Phone Number</td>
                        <td><br>${ user.phoneNumber }</td>
                      </tr>
                      <tr>
                        <td>Role</td>
                        <td><br>${ user.role }</td>
                      </tr>
                      <tr>
                        <td>User appointment</td>
                        <td></td>
                      </tr>
                   
       
                    </tbody>
                  </table>
                  
                  <a href="#" class="btn btn-primary">Edit</a>
                  <a href="#" class="btn btn-primary">Delete</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
	

</body>
</html>