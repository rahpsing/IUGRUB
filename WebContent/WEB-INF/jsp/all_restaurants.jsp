<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    
<!-- CHARACTER ENCODING -->    
<meta charset="utf-8">
<!-- ------------------------- -->        

    <title>
    Offers - IU GRUB - Say hello to hunger
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
    
</head>

<body>
<!-- PRIMARY NAV BAR -->
    <div class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <a href="home" class="navbar-brand">IU GRUB</a>    <!-- INSERT LOGO HERE -->
            
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
            
            
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <div class="collapse navbar-collapse navHeaderCollapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="home">Home</a></li>
                    
                    <li> <a href="offers">Offers</a></li>
                     <li class="active"><a href="#">Restaurants</a></li>
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
    
<br/>
<br/>

<!-- OFFERS BUILD UP -->
<div class="container-fluid">
    <hr class="custom">
    
<div class="row">
    <div class="col-sm-3 col-md-3">
    <a href="#" class="btn btn-info btn-block btn-compose-email">Filter Results</a>
            <div class="panel panel-default">
    			<div class="panel-heading">
					<h3 class="panel-title">Cuisines</h3>
					<span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
				</div>
				<div id = "cuisineSelection"></div>
              <!--   <div class="panel-body">Indian
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                
                <div class="panel-body">American
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                
               <div class="panel-body">Chinese
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                    
               <div class="panel-body">Lebanese
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input">
                        <span class="custom-control-indicator"></span>
                </label>
                </div> -->
                
                <!--<div class="panel-body">American</div>
                <div class="panel-body">Chinese</div>
                <div class="panel-body">Continental</div>-->
			</div>
            <div class="panel panel-default">
        		<div class="panel-heading">
					<h3 class="panel-title">Location</h3>
					<span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
				</div>
                
                <div class="panel-body">Indiana Memorial Union
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                <div class="panel-body">Wells Library
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                <div class="panel-body">Downtown
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                
			</div>
        </div>
        <div class="col-sm-9 col-md-9">
    <div id = "selectedRestaurants">

    <div class="panel panel-success">
        <div class="panel-heading"><b>Burger King</b></div>
        <div class="panel-body"></div>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <p class="link-align"><i>American</i></p>
        <a href="www.bk.com" class="link-align">Visit Burger King</a>
    </div>

    <div class="panel panel-success">
        <div class="panel-heading"><b>KFC</b></div>
        <div class="panel-body"></div>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <p class="link-align"><i>American</i></p>
        <a href="www.kfc.com" class="link-align">Visit KFC</a>
        
    </div>

    <div class="panel panel-success">
        <div class="panel-heading"><b>Pizza Hut</b></div>
        <div class="panel-body"></div>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <p class="link-align"><i>American</i></p>
        <a href="www.pizzahut.com" class="link-align">Visit Pizza Hut</a>
        
    </div>
    
     <div class="panel panel-success">
        <div class="panel-heading"><b>Bookmarket Eatery</b></div>
        <div class="panel-body"></div>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <p class="link-align"><i>American</i></p>
        <a href="http://bookmarketeatery.indiana.edu/" class="link-align">Visit Bookmarket Eatery</a>
    </div>
    
     <div class="panel panel-success">
        <div class="panel-heading"><b>Red Mango</b></div>
        <div class="panel-body"></div>
        <span class="glyphicon glyphicon-star pull-right manage-right"></span>
        <p class="link-align"><i>American</i></p>
        <a href="http://www.redmangousa.com/" class="link-align">Visit Red Mango</a>
    </div>
            
     <div class="panel panel-success">
         <div class="panel-heading"><b>Qdoba</b></div>
        <div class="panel-body"></div>
        <p class="link-align"><i>American</i></p>
        <a href="https://www.qdoba.com/" class="link-align">Visit Qdoba</a> 
    </div>
    
    </div>
            
    <br/>
    <br/>
  </div>
  </div>
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
    

<script type="text/javascript">

$(document).ready(function(){
    
	loadCuisines();
	var blankArray = [];
	var blankArray2 = [];
	searchRestaurants(blankArray,blankArray2)
	
	

    $(document).on('click', '.panel-heading span.clickable', function(e){
    var $this = $(this);
    if(!$this.hasClass('panel-collapsed')) {
		$this.parents('.panel').find('.panel-body').slideUp();
		$this.addClass('panel-collapsed');
		$this.find('i').removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');
	} else {
		$this.parents('.panel').find('.panel-body').slideDown();
		$this.removeClass('panel-collapsed');
		$this.find('i').removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');
	}
 });  

});

function cuisineSelect(object) {
	
	var cuisineArray = [];
	var campusArray = [];
	jQuery( ".cuisineSelection" ).each(function( index ) {
		   if( jQuery(this).prop('checked') ) {
			   cuisineArray.push(jQuery(this).attr("id"));
		   }
	}); 
	 
	findRestaurants(cuisineArray,campusArray);
}

function findRestaurants(cuisineArray,campusArray) {
	
	jQuery.ajax({
		
	    url : "/IUGRUB/filters/foodStores",
	    type: "POST",
	    data : {CUISINE_SELECTION:cuisineArray,CAMPUS_SELECTION:campusArray},
	    success: function(data, textStatus, jqXHR)
	    {
	        //data - response from server
	        jQuery("#selectedRestaurants").html(data);
	    },
	    error: function (jqXHR, textStatus, errorThrown)
	    {
	 		console.log(errorThrown);
	    }
	});
}

function searchRestaurants(cuisineArray,campusArray) {
	
	jQuery.ajax({
		
	    url : "/IUGRUB/restaurants/foodStores",
	    type: "POST",
	    data : {CUISINE_SELECTION:cuisineArray,CAMPUS_SELECTION:campusArray},
	    success: function(data, textStatus, jqXHR)
	    {
	        //data - response from server
	        jQuery("#selectedRestaurants").html(data);
	    },
	    error: function (jqXHR, textStatus, errorThrown)
	    {
	 		console.log(errorThrown);
	    }
	});
}

function loadCuisines() {
	
	jQuery.ajax({
    		
    	    url : "/IUGRUB/filters/cuisines",
    	    type: "POST",
    	    data : {},
    	    success: function(data, textStatus, jqXHR)
    	    {
    	        //data - response from server
    	    	 jQuery("#cuisineSelection").html(data);
    	    },
    	    error: function (jqXHR, textStatus, errorThrown)
    	    {
    	 		console.log(errorThrown);
    	    }
    	});
    }
    
    function loadCampuses() {
    	
	jQuery.ajax({
    		
    	    url : "/IUGRUB/filters/campuses",
    	    type: "POST",
    	    data : {},
    	    success: function(data, textStatus, jqXHR)
    	    {
    	        //data - response from server
    	      //  alert(data);
    	    },
    	    error: function (jqXHR, textStatus, errorThrown)
    	    {
    	 		console.log(errorThrown);
    	    }
    	});
    }
</script> 
    
</body>    
</html>

