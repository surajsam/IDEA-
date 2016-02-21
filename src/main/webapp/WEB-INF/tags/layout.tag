<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="pageTitle" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><jsp:invoke fragment="pageTitle"/></title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <link href="css/navbar-fixed-top.css" rel="stylesheet">
  </head>
  <body>
  <div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">API Test</a>
      </div>
      <div class="navbar-collapse collapse">
        <ul class="nav navbar-nav">
          <li><a href="Archive.jsp">Home</a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">About <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="#">This is just a test for demonstration purposes</a></li>
              <li><a href="/Archive.jsp?fandom=Cabin%20Pressure">It doesn't mean the Archive is getting an API!</a></li>
            </ul>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sample Fandoms <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="/Archive.jsp?fandom=The+Avengers+(2012)">The Avengers (2012)</a></li>
              <li><a href="/Archive.jsp?fandom=Cabin%20Pressure">Cabin Pressure</a></li>
              <li><a href="/Archive.jsp?fandom=Harry Potter - J. K. Rowling ">Harry Potter - J. K. Rowling</a></li>
              <li class="divider"></li>
              <li class="dropdown-header">More fandoms!</li>
              <li><a href="/Archive.jsp?fandom=Merlin+(TV)">Merlin (TV)</a></li>
              <li><a href="/Archive.jsp?fandom=Sherlock+(TV)">Sherlock (TV)</a></li>
              <li class="divider"></li>
              <li class="dropdown-header">Fun with WorkSearch</li>
              <li><a href="/Archive.jsp">Random default from Elasticsearch</a></li>
            </ul>
          </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="http://archiveofourown.org">Archive of Our Own</a></li>
        </ul>
      </div><!--/.nav-collapse -->
    </div>
  </div>
    <div class="container">
      <h1><jsp:invoke fragment="pageTitle"/></h1>
      <jsp:doBody/>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
  </body>
</html>