

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Festival App Project</title>
    
    <script src="js/modernizr-1.7.min.js"></script><!-- this is the javascript allowing html5 to run in older browsers -->
    
    <link rel="stylesheet" type="text/css" href="css/reset.css" media="screen" title="html5doctor.com Reset Stylesheet" />
    
    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->
    <link rel="stylesheet" type="text/css" href="css/css3.css" media="screen" />
    
    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->
    <link rel="stylesheet" type="text/css" href="css/general.css" media="screen" />
    
    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->
    <link rel="stylesheet" type="text/css" href="css/grid.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="css/custom.css" media="screen" />

    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->
    
    <!--[if IE]> <style> .report_bugs {left:0px;} </style>	<![endif]-->
    
    <script type="text/javascript" src="coin-slider/jquery-1.4.2.js"></script>
<script type="text/javascript" src="coin-slider/coin-slider.min.js"></script>
<link rel="stylesheet" href="coin-slider/coin-slider-styles.css" type="text/css" />

    </head>
    
    

<body>
      <!-- <a href="index.jsp"><img style="width: 100px; position: absolute; top: -50px;" src="images/Home-Button.png" /></a>
        <a HREF="javascript:javascript:history.go(-1)"><img style="width: 100px; position: absolute; top: 55px; left: 5px; opacity: 0.4;" src="images/back-button.png" /></a>
        <a href="viewFestivals.jsp"><img style="width: 150px; left: -20px; position: absolute; top: 100px; opacity: 0.5;" src="images/festivallogo.png" /></a>
        <a href="viewBands.jsp"><img style="width: 100px; position: absolute; top: 210px; opacity: 0.5;" src="images/microphone.png" /></a>
        
-->




<section class="row" id="styled">
    <div class="title" >Welcome to Festify</div>
    <div class="col_6 col" style="margin-left: 10%;">
        <button onclick="location.href = 'viewFestivals.jsp'" class="mainButton"><a href="viewFestivals.jsp"><img style="position: absolute; left: -180px; top: -67px; width: 400px; opacity: 0.3; "  src="images/festivallogo.png" alt="sliderphoto"/><h1 class="fontface" style="background: none;">Festivals</h1></a></button>
    </div><!-- col_8 -->
    
    <div class="col_6 col" style="float: right; margin-right: 10%;">
        <button style="float: right;" onclick="location.href = 'viewBands.jsp'" class="mainButton"><a href="viewBands.jsp"><img style="position: absolute; left: 35px; top: -0px; width: 200px; opacity: 0.3;"  src="images/microphone.png" alt="sliderPhoto"/><h1 style="background: none;" class="fontface">Artists</h1></a></button>
    </div><!-- col_8 -->
</section>

<section class="row" id="styled" style="margin-top: 0em;">
    <div class="col_16 col">
       <span class="rotateTitle"><h1 style="background-color: white; padding: 2px 25px 2px 5px;">Upcoming festivals</h1></span>
    </div><!-- col_8 -->
    
    


</section><!-- row -->

<section class="row" id="styled" style="margin-top: -3em;">
<div id='coin-slider' style="margin: auto;">
	<a href="img01_url" target="_blank">
		<img src='images/rockwerchterslider.jpg' alt="rockwerchter" />
		<span>
			Rock Werchter 2013 - 4, 5, 6 and 7th of July 
		</span>
	</a>
	
	<a href="imgN_url">
		<img src='images/pukkelpop2013_2.PNG' alt="Pukkelpop" />
		<span>
			Pukkelpop 2013 - 15, 17 and 17th and August
		</span>
	</a>
    
        <a href="imgN_url">
		<img src='images/Tomorrowland-2013-banner.png' alt="Tomorrowland" />
		<span>
			Tomorrowland 2013 - 26, 27 and 28th of July
		</span>
	</a>
    
    <a href="imgN_url">
		<img src='images/graspop2013.jpg' alt="Graspop" />
		<span>
			Graspop 2013 - 28, 29 and 30th of June 
		</span>
	</a>
    </div>
</section>

<div id="footer">&copy; 2013, all rights reserved PXL/PHL Belgium </div>


<script type="text/javascript">
	$(document).ready(function() {
		$('#coin-slider').coinslider({ width: 800, height: 200, navigation: true, delay: 5000 });
	});
</script>
    
<!-- voor alle opties die bij slider horen kijk http://workshop.rs/2010/04/coin-slider-image-slider-with-unique-effects/ -->



</body>
</html>
