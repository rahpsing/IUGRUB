<%@page import="app.com.iugrub.pojo.FoodStore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    
<!-- CHARACTER ENCODING -->    
<meta charset="utf-8">
    
<!-- TITLE -->        
    
    <title>
    Restaurants - IU GRUB - Say hello to hunger
    </title>
    
<!-- LINK SECTION -->
 <link href= "<c:url value="/ui-resources/css/bootstrap-theme.css" />" rel="stylesheet" type="text/css">
 

<link href="<c:url value="/ui-resources/css/base.css" />" rel="stylesheet" type="text/css">
<link href= "<c:url value = "/ui-resources/fonts/glyphicons-halflings-regular.svg"/>" rel="stylesheet" type="text/css">
<link href= "<c:url value="/ui-resources/css/glyphicons.css"/>" rel="stylesheet" type="text/css"> 
  
  <!-- SCRIPT SECTION -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="<c:url value="/ui-resources/js/root.js"/>" type="text/javascript"></script>

    
<!-- META SECTION -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="keywords" content="Food, Restaurants, Indiana, Bloomington, Indiana University, IU GRUB, IU">
<meta name="description" content="Restaurants and food in Indiana University at Bloomington. Discover new eateries and offers on pizzas, burgers, sandwiches and other local cuisines around you.">
    
<!-- BACKGROUND OVERRIDE -->
<style>
    body{background: #FCFCFC !important;}
</style>

<%
FoodStore objStore = (FoodStore)request.getAttribute("objStore");

%>
</head>
    
<body>
<!-- PRIMARY NAV BAR -->
    <div class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <a href="menu.html" class="navbar-brand">IU GRUB</a>    <!-- INSERT LOGO HERE -->
            
            <!-- SEARCH BAR -->
            <div class="col-sm-3 col-md-3">
            <form class="navbar-form" role="search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search" name="q">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                </div>
            </form>
            </div>
            
            <!-- RESPONSIVE COLLAPSE -->
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            
            <!--MENU ITEMS-->
            <div class="collapse navbar-collapse navHeaderCollapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="home">Home</a></li>
                    <li><a href="offers">Offers</a></li>
                    <li class="active"><a href="restaurants">Restaurants</a></li>
                    <li class = "dropdown">
                        <a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">Contact Us <b class="caret"></b></a>
                        <ul class = "dropdown-menu">
                            <li><a href="contact">Feedback</a></li>
                            <li><a href="contact">Become an Affiliate</a></li>
                        </ul>        
                    </li>
                    <li><a href="#">Login/Register</a></li>                
                </ul>
            </div>           
      </div>
</div>


<!-- RESTAURANT PAGE MASTHEAD -->
<div class="jumbotron">
<div class="container-fluid">
    <img src="/IUGRUB/ui-resources/images/<%= request.getAttribute("image") %>" class="img-responsive pull-right jumboposition" height="25%" width="25%">
    <h1 class="marginer">'<%= objStore.getStrStoreName() %>'</h1>
    <br>
    <p>Located at <b>Indiana Memorial Union <span class="glyphicon glyphicon-map-marker"></span></b></p>
    <br>
    <br>
    <p><i>Have it your way!</i></p>
        
    

</div>    
</div>    
<br><br>
    
<!-- TAB BAR -->
    
<div class="container">
<ul class="nav nav-tabs">
  <li role="presentation"><a href="#pricetable" id="overview">Overview</a></li>
  <li role="presentation"><a href="#reviewsection" id="review">Reviews</a></li>
  <li role="presentation"><a href="#gallery" id="photos">Photos</a></li>
</ul>
    
<!--Presentation Area-->

    <p class="align-to-panel">Location : Indiana Memorial Union</p>    
    <p class="align-to-panel">Hotline : 8123698563 </p>
    <div class="panel-body active" id="pricetable">
    <table class="table">
				<tr>
					<td>Item 1</td>
					<td class="table-content-align">USD 3.50</td>
				</tr>
				<tr>
					<td>Item 2</td>
					<td class="table-content-align">USD 3.00</td>
				</tr>
				<tr>
					<td>Item 3</td>
					<td class="table-content-align">USD 5.50</td>
				</tr>
				<tr>
					<td>Item 4</td>
					<td class="table-content-align">USD 3.50</td>
				</tr>
				<tr>
					<td>Item 5</td>
					<td class="table-content-align">USD 3.00</td>
				</tr>
				<tr>
					<td>Item 6</td>
					<td class="table-content-align">USD 5.50</td>
				</tr>
				<tr>
					<td>Item 7</td>
					<td class="table-content-align">USD 3.50</td>
				</tr>
				<tr>
					<td>Item 8</td>
					<td class="table-content-align">USD 3.00</td>
				</tr>
				<tr>
					<td>Item 9</td>
					<td class="table-content-align">USD 5.50</td>
				</tr>
        </table>
    </div>

    
<!--REVIEW SECTION-->

<div class="panel panel-primary hidden" id="reviewsection">
    <div class="panel-heading">Reviewer comment&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-star" aria-hidden="true"></span></div>
    <div class="panel-body">
    <p class="justify">5 star experience. You must try the whopper!</p>
    </div>
</div>

<div class="panel panel-primary hidden" id="reviewsection">
    <div class="panel-heading">Reviewer comment&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-star" aria-hidden="true"></span></div>
    <div class="panel-body">
    <p class="justify">5 star experience. You must try the whopper!</p>
    </div>
</div>


<!--PHOTO SECTION-->

<div class="row hidden" id="gallery">
    <div class="col-xs-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="/IUGRUB/ui-resources/images/burger1.jpg" height="100px" width="100px">
        </a>    
    </div>
    <div class="col-xs-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="/IUGRUB/ui-resources/images/burger1.jpg" height="100px" width="100px">
        </a>    
    </div>
    <div class="col-xs-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="/IUGRUB/ui-resources/images/burger1.jpg" height="100px" width="100px">
        </a>    
    </div>
</div>   
    
</div><!--CLOSING CONTAINER TAG-->
    
    
<!-- BOTTOM BAR -->

<div class="navbar navbar-default navbar-fixed-bottom" id="bottombar">
<div class="container-fluid">
    <p class="navbar-text pull-left">Site in Alpha</p>
    <a class="navbar-btn btn btn-danger pull-right" id="bottombutton"><small>Close X</small></a>
    </div>
</div>

<!--PAGE FOOTER-->
<footer class="centered">
<p><small>Copyright. All rights reserved.</small></p>
</footer>


    
    
</body>
</html>

