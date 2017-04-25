<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/css/comment.css" rel="stylesheet">
<link href="/css/bootstrap.min.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comment page in JSP file</title>
</head>
<body>
	<div class="container"></div>
	<div class="row"></div>
	<div class="col-sm-12"></div>
	<h1>User comment section</h1>
	
	<div class="row"></div>
	<div class="col-sm-1"></div>
	<div class="thumbnail">
	<img class="img-responsive user-photo" src="https://ssl.gstatic.com/accounts/ui/avatar_2x.png">
	
	
	<div class="col-sm-5">
	<div class="panel panel-default">
	<div class="panel-heading">
	
		<form method="post" action="/comment"></form>
		<!-- <strong>myusername</strong> <span class="text-muted"></span> -->
		<input type="text" placeholder="Username"> <!-- class="form-control"> -->

		<div class="form-group">
              <input type="text" placeholder="Comment" class="form-control">
        </div>
        
	</div>
	<div class="panel-body">
	</div><!-- /panel-body -->
	</div><!-- /panel panel-default -->
	</div><!-- /col-sm-5 -->
	

</body>
</html>

