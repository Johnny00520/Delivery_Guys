<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/favicon.ico">

    <title>Narrow Jumbotron Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/jumbotron-narrow.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
              <li name="navbar-li-elem" role="presentation"><a href="/">Home</a></li>
                <li name="navbar-li-elem" role="presentation"><a href="/cart">Cart</a></li>
                <li name="navbar-li-elem" role="presentation"><a href="/home">Business Users</a></li>
                <li name="navbar-li-elem" role="presentation"><a href="/signup">Signup</a></li>
                <li name="navbar-li-elem" role="presentation"><a href="/login">Login</a></li>
          </ul>
        </nav>
        <h3 class="text-muted"><i>Eat-net</i></h3>
        <h3>${shoppingcart}</h3>
      </div>

      <div class="row">
        <div class="col-md-4">
          <h1>Thank you for using Eat-net!</h1>
          <div class="list-group" name="restaurants">
            <c:forEach var="order" items="${neworders}">
                <li class="list-group-item">${order.string()}</li>
            </c:forEach>
          </div>
        </div>
      </div>

      <footer class="footer">
        <p>&copy; 2017 Eat-net, LLC.</p>
      </footer>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="/js/ie10-viewport-bug-workaround.js"></script>
    <script type="application/javascript">

function addtocart(name, count) {
    location.href = "/cart/add?name=" + name + "&count=" + count;
}
function get_list_elements() {
    return document.getElementsByName("navbar-li-elem");
}
function append_active_to_class(element) {
    element.className = element.className.concat(" active");
}
function remove_active_from_class(element) {
    const index = element.className.indexOf(" active");
    const active_length = " active".length;
    element.className = element.className.slice(0, index) + element.className.slice(index + active_length);
}
var elements = get_list_elements();
for (var i in elements) {
    elements[i].addEventListener("mouseover", function() {
        append_active_to_class(this);
    });
    elements[i].addEventListener("mouseout", function() {
        remove_active_from_class(this);
    });
}
    </script>
  </body>
</html>
