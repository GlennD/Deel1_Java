<%-- 
    Document   : index
    Created on : 18-apr-2013, 9:39:06
    Author     : Wouter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Festivals!</title>
    
        <script src="js/modernizr-1.7.min.js"></script><!-- this is the javascript allowing html5 to run in older browsers -->
    
        <link rel="stylesheet" type="text/css" href="css/reset.css" media="screen" title="html5doctor.com Reset Stylesheet" />
    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->
        <link rel="stylesheet" type="text/css" href="css/css3.css" media="screen" />
    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->
        <link rel="stylesheet" type="text/css" href="css/general.css" media="screen" />
    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->
        <link rel="stylesheet" type="text/css" href="css/grid.css" media="screen" />
        
        <!-- Slider stylesheets -->
        <link rel="stylesheet" href="image/themes/dark/dark.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="image/themes/bar/bar.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
        
    </head>

<body>
    <div id="clear_50"></div>
    <section class="row" id="styled">
        <div class="col_16 col">
            <h1 class="fontface" id="titel_main">Welcome to Festivals!!</h1>
        </div>
        <div id="clear_50"></div>
        <div class="col_8 col">
            <a id="btn_main" href="festival_list.jsp"><img src="image/btn_festivals.png" alt="Festivals" height="300"></img></a>
        </div>
        <div class="col_8 col">
            <a id="btn_main" href="groep_list.jsp"><img src="image/btn_groepen.png" alt="Festivals" height="300"></img></a>
        </div>
    </section>
    
    <!-- slider -->
    <div id="wrapper">
        <div class="slider-wrapper theme-bar">
            <div id="slider" class="nivoSlider">
                <img src="image/graspop.png" data-thumb="image/graspop.png" alt="" data-transition="slideInLeft" />
                <a href="www.graspop.be/"><img src="image/graspop.png" data-thumb="images/graspop.jpg" alt="" title="Visit the Graspop Metal Meeting site!" data-transition="Fold"/></a>
                <img src="image/graspop.png" data-thumb="image/graspop.png" alt="" data-transition="slideInLeft" />
                <img src="image/graspop.png" data-thumb="image/graspop.png" alt="" data-transition="Fade" />
            </div>
            <div id="htmlcaption" class="nivo-html-caption">
                <strong>This</strong> is an example of a <em>HTML</em> caption with <a href="#">a link</a>. 
            </div>
        </div>

    </div>
    <script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
    <script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
    <script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script>
</body>
</html>
