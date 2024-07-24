<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
	<meta name="author" content="Kalecia McNeal">
	<link rel="icon" href="favicon.ico">

	<title>My Online Portfolio</title>

	<%@ include file="/css/include_css.jsp" %>
		

<!-- Carousel styles -->
<style type="text/css">
h2, h3
{
	margin: 0;     
	color: #ff6ab2dc;
	padding-top: 50px;
	font-size: 50px;
	font-family: Georgia, 'Times New Roman', Times, serif;
}
.item
{
	background: #d663ff;    
	text-align: center;
	height: 300px !important;
	opacity: 0.9;
}
.carousel
{
  margin: 20px 0px 20px 0px;
}
.bs-example
{
  margin: 20px;
}
p {
	color:#0188ff;
	font-size: 20px; 
	font-family: Georgia, 'Times New Roman', Times, serif;
}
</style>
	
</head>
<body>
	
	<%@ include file="/global/nav_global.jsp" %>	
	
	<div class="container">
		 <div class="starter-template">
						<div class="page-header">
						<%@ include file="/global/header.jsp" %>							
						</div>

<!-- Start Bootstrap Carousel  -->
<div class="bs-example">
	<div
      id="myCarousel"
		class="carousel"
		data-interval="1000"
		data-pause="hover"
		data-wrap="true"
		data-keyboard="true"			
		data-ride="carousel">
		
    	<!-- Carousel indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>   
       <!-- Carousel items -->
        <div class="carousel-inner">

				 <div class="active item" style="background: url(img/stripe.jpg) no-repeat left center; background-size: cover;">
					 <div class="container">
						 <div class="carousel-caption">
								<h3>Welcome!</h3>
							 <p class="lead">This is my homepage!</p>
						 </div>
					 </div>
				 </div>					

         <div class="item" style="background: url(img/linkedin.jpg) no-repeat left center; background-size: cover;">
                <h2>My LinkedIn</h2>
                <div class="carousel-caption">
                  <p>Here is my LinkedIn page!</p>
						 <!--  <img src="img/slide2.png" alt="Slide 2">		
															 -->
					<a class="btn btn-large btn-primary" href="https://www.linkedin.com/in/kalecia-mcneal/">My LinkedIn</a>										 						
                </div>
            </div>

         <div class="item" style="background: url(img/tech.jpg) no-repeat left center; background-size: cover;">
                <h2>My Resume</h2>
                <div class="carousel-caption"></div>
                  <p>Here is my Resume!</p>
						<!--  <img src="img/slide3.png" class="img-responsive" alt="Slide 3">							 -->	
						<a class="btn btn-large btn-primary" href="https://docs.google.com/document/d/1idsYp58ppcSVNk9hfjPb7KiNXt6nOI7oN6L2sahRWac/edit">Resume</a>							
                </div>
            </div>

        </div>
        <!-- Carousel nav -->
        <a class="carousel-control left" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a class="carousel-control right" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>
</div>
<!-- End Bootstrap Carousel  -->

 	<%@ include file="/global/footer.jsp" %>

	</div> <!-- end starter-template -->
</div> <!-- end container -->

 	<%@ include file="/js/include_js.jsp" %>
	
</body>
</html>
