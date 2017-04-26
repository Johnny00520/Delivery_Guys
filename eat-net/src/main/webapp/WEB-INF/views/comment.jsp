<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<!--  <meta charset = "utf-8"> -->
<meta name = "viewport" content = "width=device-width, initial-scale=1">
<link href = "css/bootstrap.css" rel = "stylesheet" type = "text/css"/>
<link href="css.css" rel="stylesheet" type="text/css"/>
<link rel = "stylesheet" href = "http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
<title>Comment page in JSP file</title>
</head>

<style>
	h1 {text-align:center;}
</style>
</head>
<body>
	
<!------------container------->

<div class="container">

<h1>Comment section</h1>
<!-------Wrap------------>
<div id="wrap">
<div id="main">
<div class="row">
<div class="col-md-5">
<h3 class="heading">Comments and Responses</h3>
</div>
<div class="col-md-7">
<div id="upper_blank"></div>
</div>
</div>
</div>

<p>Your email address will not be published. Required fields are marked *</p>
<p>Please leave your comments for our website.</p>

<!------------Form Start---------->

<div id='form'>
<div class="row">
<div class="col-md-12">

<form action="/" method="POST" id="commentform">

<div id="comment-name" class="form-row">
<input type = "text" placeholder = "Name (required)" name = "dname"  id = "name" >
</div>
<div id="comment-email" class="form-row">
<input type = "text" placeholder = "Mail (will not be published) (required)" name = "demail"  id = "email">
</div>
<div id="comment-url" class="form-row">
<input type = "text" placeholder = "Website" name = "url"  id = "url" >
</div>
<div id="comment-message" class="form-row">
<textarea name = "comment" placeholder = "Message" id = "comment" ></textarea>
</div>
<a href="#"><input type="submit" name="dsubmit" id="commentSubmit" value="Submit Comment"></a>
<input style="width: 30px" type="checkbox" value="1" name="subscribe" id="subscribe" checked="checked">
<p1><b>Notify me when new comments are added.</b></p1>
</form>

</div>
</div>
</div>
</div>

<!-------------------Reply Section------->
<!--  
<div id="second">
<div class="row">
<div class="col-md-2">
<h3 class="second_heading"><b>Leave a Reply</b></h3>
</div>
<div class="col-md-10">
<div class="blank"></div>
</div>
</div>
</div>
<div id="middle">
<form>
<a href=""><input type = "text" value = "reply" name = "dreply" id = "inner_reply"></a>
</form>
</div>

</div>
-->

</body>
</html>

