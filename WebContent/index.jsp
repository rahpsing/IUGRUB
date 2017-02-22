<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    
<!-- CHARACTER ENCODING -->    
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
<!-- TITLE -->        
    
        <title>
            IU GRUB - Say hello to hunger
        </title>
    
<!-- LINK SECTION -->
<link href= "/css/bootstrap-theme.css" rel="stylesheet">
<link href="/css/base.css" rel="stylesheet">
<link href= "/fonts/glyphicons-halflings-regular.svg" rel="stylesheet">
<link href= "/css/glyphicons.css" rel="stylesheet">

    
<!-- META SECTION -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="keywords" content="Food, Restaurants, Indiana, Bloomington, Indiana University, IU GRUB, IU">
<meta name="description" content="Restaurants and food in Indiana University at Bloomington. Discover new eateries and offers on pizzas, burgers, sandwiches and other local cuisines around you.">
    
<!-- BACKGROUND OVERRIDE -->
<style>
    body{background: #FCFCFC !important;}
</style>
<script type = "text/javascript">

function sendSearchRequest() {
	
	var searchText = jQuery("#homeSearch").val();
	
	jQuery.ajax({
	    url : "/search",
	    type: "POST",
	    data : {SEARCH_TEXT:searchText},
	    success: function(data, textStatus, jqXHR)
	    {
	        //data - response from server
	        alert(data);
	    },
	    error: function (jqXHR, textStatus, errorThrown)
	    {
	 		alert("error");
	    }
	});
}

</script>
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
                    <input type="text" id="homeSearch" class="form-control" placeholder="Search" name="q">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit" onclick="javascript:sendSearchRequest()";><i class="glyphicon glyphicon-search"></i></button>
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
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="offers.html">Offers</a></li>
                    <li><a href="all-restaurants.html">Restaurants</a></li>
                    <li class = "dropdown">
                        <a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">Contact Us <b class="caret"></b></a>
                        <ul class = "dropdown-menu">
                            <li><a href="contact.html">Feedback</a></li>
                            <li><a href="contact.html">Become an Affiliate</a></li>
                        </ul>        
                    </li>
                    <li><a href="#">Login/Register</a></li>                
                </ul>
            </div>           
        </div>
</div> 


<!-- HOME PAGE CAROUSEL -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->

  <div class="carousel-inner" role="listbox">
    <div class="item active img-responsive">
      <img src="images/Burgers.jpg" alt="Burger">
        <div class="container">
            <div class="carousel-caption">
              <h1>You can find your way across this country using burger joints the way a navigator uses stars</h1>
              <p>-Charles Pope</p>
              <p><a href="all-restaurants.html" class="btn btn-lg btn-primary" href="#" role="button">Find Food</a></p>
            </div>
          </div>
    </div>

    <div class="item img-responsive">
      <img src="images/Pizza.jpg" alt="Pizzas">
        <div class="container">
        <div class="carousel-caption">
              <h1>There's no better feeling in the world than a warm pizza box on your lap</h1>
              <p>-Kevin James</p>
              <p><a href="all-restaurants.html" class="btn btn-lg btn-primary" href="#" role="button">Find Food</a></p>
            </div>
          </div>
    </div>  

    <div class="item img-responsive">
      <img src="images/Sandwich.jpg" alt="Sandwiches">
        <div class="container">
        <div class="carousel-caption">
              <h1>Your mouth isn't watering. It's crying for a Sandwich.</h1>
              <p>-Ali G.</p>
              <p><a href="all-restaurants.html" class="btn btn-lg btn-primary" href="#" role="button">Find Food</a></p>
            </div>
          </div>       
    </div>

    <div class="item img-responsive">
      <img src="images/Desserts.jpg" alt="Logo">
        <div class="container">
        <div class="carousel-caption">
              <h1>Let's face it, a nice creamy chocolate cake does a lot for a lot of people; it does for me</h1>
              <p>-Audrey Hepburn</p>
              <p><a href="all-restaurants.html" class="btn btn-lg btn-primary" href="#" role="button">Find Food</a></p>
            </div>
          </div>
    </div>
  </div>

      
      
  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    
    
<br>
<br>
    
    
<!-- SELECTION ZONE -->
<div class="row offset">
        <div class="col-lg-4">
          <a href="all-restaurants.html"><img class="img-circle central" src="images/cuisine.png" alt="Cuisine Image" width="140" height="140" ></a>
          <h2 class="centered">Cuisines</h2>
          <p class="centered">Browse restaurants by your favourite cuisines</p>
        </div>
        <div class="col-lg-4">
          <a href="all-restaurants.html"><img class="img-circle central" src="images/location.png" alt="Generic placeholder image" width="140" height="140"></a>
          <h2 class="centered">Location</h2>
          <p class="centered">Find out the best restaurants closest to you</p>
        </div>
        <div class="col-lg-4">
          <a href="offers.html"><img class="img-circle central" src="images/offers.png" alt="Generic placeholder image" width="140" height="140"></a>
          <h2 class="centered">Offers</h2>
          <p class="centered">Check out the latest offers and mouth-watering deals</p>
        </div>
</div>
    
<br/>
<br/>

<!-- OFFERS BUILD UP -->
<div class="container">
    <hr class="custom">
    <br/>
    <br/>

      <div class="row">
          <a href="offers.html">
        <div class="col-md-7">
          <h2 class="aligner"> Restaurant Name <span class="text-muted">(Save upto $5)</span></h2>
          <p class="aligner">Big savings this weekend</p>
        </div>
        <div class="col-md-5">
          <img class="img-responsive center-block offerlist" src="images/bk.png" alt="Generic placeholder image">
        </div>
          </a>
      </div>
    
    <br/>
    <br/>
    
      <hr class="custom">

      <div class="row">
          <a href="offers.html">
        <div class="col-md-7 col-md-push-5">
          <h2 class="aligner">Restaurant Name <span class="text-muted">(Save upto $5)</span></h2>
          <p class="aligner">Big savings this weekend</p>
        </div>
        <div class="col-md-5 col-md-pull-7">
          <img class="img-responsive center-block offerlist" src="images/kfc.png" alt="Generic placeholder image">
        </div>
          </a>
      </div>
    
    <br/>
    <br/>

      <hr class="custom">

      <div class="row">
        <a href="offers.html">
        <div class="col-md-7">
         <h2 class="aligner">Restaurant Name <span class="text-muted">(Save upto $5)</span></h2>
          <p class="aligner">Big savings this weekend</p>
        </div>
        <div class="col-md-5">
          <img class="img-responsive center-block offerlist" src="images/pizzahut.png" alt="Generic placeholder image">
        </div>
        </a>
      </div>
    <br/>
    <br/>
<hr class="custom">
   
</div>  


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


<!-- SCRIPT SECTION -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="js/root.js" type="text/javascript"></script>
<script type="text/javascript">

    $(document).ready(function(){
            $('.carousel').carousel({
            interval:2000
            });
            $('.carousel').carousel('cycle')
</script>

</body>
</html>


