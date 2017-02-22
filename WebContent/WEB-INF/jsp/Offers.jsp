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
                    <li class="active"><a href="#">Offers</a></li>
                    <li><a href="restaurants">Restaurants</a></li>
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
    
    
<!-- SELECTION ZONE -->
<br>
<br>
<div class="row magic offset">
        <div class="col-lg-4">
          <a href="restaurants"><img class="img-circle central" src="/IUGRUB/ui-resources/images/cuisine.png" alt="Cuisine Image" width="140" height="140" ></a>
          <h2 class="centered">Cuisines</h2>
          <p class="centered">Browse restaurants by your favourite cuisines</p>
        </div>
        <div class="col-lg-4">
          <a href="restaurants"><img class="img-circle central" src="/IUGRUB/ui-resources/images/location.png" alt="Generic placeholder image" width="140" height="140"></a>
          <h2 class="centered">Location</h2>
          <p class="centered">Find out the best restaurants closest to you</p>
        </div>
        <div class="col-lg-4">
          <a href="offers"><img class="img-circle central" src="/IUGRUB/ui-resources/images/offers.png" alt="Generic placeholder image" width="140" height="140"></a>
          <h2 class="centered">Offers</h2>
          <p class="centered">Check out the latest offers and mouth-watering deals</p>
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
					<h3 class="panel-title">FoodStores</h3>
					<span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
				</div>
				<div id="foodStoreSelection">
				
				</div>
              <!--   <div class="panel-body">Indian
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input cuisineSelection">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                
                <div class="panel-body">American
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input cuisineSelection">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                
               <div class="panel-body">Chinese
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input cuisineSelection">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                    
               <div class="panel-body">Lebanese
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input cuisineSelection">
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
                
                <div id = "campusSelection">
                <div class="panel-body">Indiana Memorial Union
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input campusSelection" onclick="javascript:campusSelect(this);">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                <div class="panel-body">Wells Library
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input campusSelection">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                <div class="panel-body">Downtown
				<label class="custom-control custom-checkbox pull-right">
                        <input type="checkbox" class="custom-control-input campusSelection">
                        <span class="custom-control-indicator"></span>
                </label>
                </div>
                </div>
                
			</div>
    
        </div>
        <div class="col-sm-9 col-md-9">
    
    <div id="CurrentOffers">
   

   <!--  <div class="panel panel-default">
        <div class="panel-heading"><a href="restaurants.html">Burger King</a></div>
        <div class="panel-body">Offer here</div>
    </div>

    <div class="panel panel-default">
        <div class="panel-heading"><a href="restaurants.html">KFC</a></div>
        <div class="panel-body">Offer here</div>
    </div>

    <div class="panel panel-default">
        <div class="panel-heading"><a href="restaurants.html">Pizza Hut</a></div>
        <div class="panel-body">Offer here</div>
    </div> -->
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
    

<!-- SCRIPT SECTION -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="<c:url value="/ui-resources/js/root.js"/>" type="text/javascript"></script>


<script type="text/javascript">

    jQuery(document).on('click', '.panel-heading span.clickable', function(e){
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
    
    jQuery(document).ready(function(){
    	
    	loadStores();
    	var blankArray = [];
    	var blankArray2 = [];
    	searchOffers(blankArray,blankArray2)
    //	loadCampuses();
    	
    
    
	/* 	jQuery(".storeSelection").change(function() {
			alert(1);
			var storeArray = [];
			 jQuery( ".storeSelection" ).each(function( index ) {
				   if( jQuery(this).prop('checked') ) {
					   cuisineArray.push(jQuery(this).attr("id"));
				   }
			}); 
			 
			 jQuery( ".campusSelection" ).each(function( index ) {
				 var campusArray = [];
				   if( jQuery(this).prop('checked') ) {
					   campusArray.push(jQuery(this).attr("id"));
				   }
			});
			 
			 searchOffers(storeArray,campusArray);
		});
		
		jQuery(".campusSelection").change(function() {
			
		}); */
    });
    
    function campusSelect(object) {
    	//alert(object);
    }
    
    
    function storeSelect(object) {
    	
    	var storeArray = [];
    	var campusArray = [];
    	jQuery( ".storeSelection" ).each(function( index ) {
			   if( jQuery(this).prop('checked') ) {
				   storeArray.push(jQuery(this).attr("id"));
			   }
		}); 
    	 
    	searchOffers(storeArray,campusArray);
    }
    
    function searchOffers(storeArray,campusArray) {
    	
    	jQuery.ajax({
    		
    	    url : "/IUGRUB/filteredOffers",
    	    type: "POST",
    	    data : {STORE_SELECTION:storeArray,CAMPUS_SELECTION:campusArray},
    	    success: function(data, textStatus, jqXHR)
    	    {
    	        //data - response from server
    	        jQuery("#CurrentOffers").html(data);
    	    },
    	    error: function (jqXHR, textStatus, errorThrown)
    	    {
    	 		console.log(errorThrown);
    	    }
    	});
    }

    	
    function loadStores() {
    	
	jQuery.ajax({
    		
    	    url : "/IUGRUB/foodStores",
    	    type: "POST",
    	    data : {},
    	    success: function(data, textStatus, jqXHR)
    	    {
    	        //data - response from server
    	    	   jQuery("#foodStoreSelection").html(data);
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
    	    	  jQuery("#campusSelection").html(data);
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

