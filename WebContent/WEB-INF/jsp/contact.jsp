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
    IU GRUB - Say hello to hunger
</title>
    
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

</head>
    
<!--BASIC STYLES-->
<style>
<!--#searchForm {
	position:absolute;
  	top:40%;-->
div#myCarousel {
    position:relative;
}
.wrap {
width: 100%;
}

.floatleft{
    float:left;
    width: 50%;
}
.floatright{
    float:right;
    width: 50%;
}
</style>    

<!--START BODY-->
<body>
    <!--MENU BAR-->
    <div class="navbar navbar-default navbar-static-top">
        <div class="container">
            <a href="#" class="navbar-brand">IU GRUB</a>    <!-- INSERT LOGO HERE -->
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
			<!--<div class="form-group">    
				<div class="container">
					<div class="row">
						<div class="col-md-6">
							<input type="text" class="form-control input-lg" placeholder="Where do you wanna go?">  
						</div>
           				<div class="col-md-2">
							<a class="btn btn-lg btn-success" href="#" role="button">GO</a>
						</div>
					</div>
				</div>
			</div>-->
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            
			<div class="collapse navbar-collapse navHeaderCollapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="home">Home</a></li>
                    <li><a href="offers">Offers</a></li>
                    <li><a href="restaurants">Restaurants</a></li>
                    <li class = "dropdown">
                        <a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">Contact Us <b class="caret"></b></a>
                        <ul class = "dropdown-menu">
                            <li><a href="#">Feedback</a></li>
                            <li><a href="#">Become an Affiliate</a></li>
                        </ul>        
                    </li>
                    <li><a href="#">Login/Register</a></li>                
                </ul>
            </div>
			     
        </div>
</div> 
    <div class="container-fluid">
		<div class="row-fluid">
		<div class="col-xs-6">
		
			<form>
			  <div class="form-group">
				<label for="exampleInputEmail1">Email address</label>
				<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
				<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			  </div>
			  <div class="form-group">
				<label for="exampleTextarea">How are we doing ?</label>
				<textarea class="form-control" id="exampleTextarea" rows="10"></textarea>
			  </div>
			  <div class="form-group">
				<label for="exampleInputFile">Screenshot</label>
				<input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
				<small id="fileHelp" class="form-text text-muted">This is some placeholder block-level help text for the above input. It's a bit lighter and easily wraps to a new line.</small>
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
			</br>
			</br>
				<p> Like our services. Please feel free to share with your friends. </p>
				<a class="btn btn-social-icon btn-twitter">
					<span class="fa fa-twitter"></span>
				</a>
		</div>
		<div class="col-xs-6">
			<p> Want to be featured in IU GRUB ? Help ud add you as an affiliate</p>
			<form>
			  <div class="form-group">
				<label for="exampleTextarea">Name of outlet</label>
				
				<textarea class="form-control" id="exampleTextarea" rows="1"></textarea>
			  </div>
			  <label for="exampleTextarea">Locations</label>
			  <div class="form-check">
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Wells Library
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Indiana Memorial Union (IMU)
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Downtown
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Others
				</label>
			  </div>
			  <div class="form-group">
				<label for="exampleInputEmail1">Email address</label>
				<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
				<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			  </div>
			  		  
			  <fieldset class="form-group">
				<!--<legend>Offers and Discouts</legend>-->
				<label for="exampleTextarea">Offers and Discounts</label>
				<div class="form-check">
				  <label class="form-check-label">
					<input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios1" value="option1" checked>
					Offer student discounts
				  </label>
				</div>
				<div class="form-check">
				<label class="form-check-label">
					<input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios2" value="option2">
					Do not offer student discounts
				  </label>
				</div>
			</fieldset>
			  <label for="exampleTextarea">Cuisines</label>
			  <div class="form-check">
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Italian
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  American
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Indian
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Mexican
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Chinese
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Continental
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Japanese
				</label>
				<label class="form-check-label">
				  <input type="checkbox" class="form-check-input">
				  Others
				</label>
			  </div>
			  <div class="form-group">
				<label for="exampleInputFile">Images for menu</label>
				<input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
				<small id="fileHelp" class="form-text text-muted">This is some placeholder block-level help text for the above input. It's a bit lighter and easily wraps to a new line.</small>
			  </div>
			  <div class="form-group">
				<label for="exampleInputFile">Other images</label>
				<input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
				<small id="fileHelp" class="form-text text-muted">This is some placeholder block-level help text for the above input. It's a bit lighter and easily wraps to a new line.</small>
			  </div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
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
            $('.carousel').carousel({
            interval:2000;
            });
            $('.carousel').carousel('cycle');
</script>

</body>
</html>

