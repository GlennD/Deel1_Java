<%-- 
    Document   : festival
    Created on : Apr 21, 2013, 3:32:52 PM
    Author     : Ruben
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Create an Awesome Vertical Tabbed Content Area using CSS3 & jQuery | FarDesign.net</title>

       <!-- Include Styles -->
        <!--<link rel="stylesheet" href="assets/css/styles.css" />-->		
        <!--[if IE 7]><style type="text/css">#v-nav>ul>li.current{border-right:1px solid #fff!important}#v-nav>div.tab-content{z-index:-1!important;left:0}</style><![endif]-->
        <!--[if IE 8]><style type="text/css">#v-nav>ul>li.current{border-right:1px solid #fff!important}#v-nav>div.tab-content{z-index:-1!important;left:0}</style><![endif]-->
        <style>


            body
            {
                background-color: #f7f7f7;
            }

            .wrapper
            {
                width: 960px;
                margin: 0px auto;
                padding-top: 20px;
                min-height: 600px;
            }

            .wrapper h1, .wrapper h4, .wrapper p, .wrapper pre, .wrapper ul, .wrapper li
            {
                margin: 0;
                padding: 0;
                border: 0;
                vertical-align: baseline;
                background: transparent;
            }

            .wrapper li
            {
                outline: 0;
                text-decoration: none;
                -webkit-transition-property: background color;
                -moz-transition-property: background color;
                -o-transition-property: background color;
                -ms-transition-property: background color;
                transition-property: background color;
                -webkit-transition-duration: 0.12s;
                -moz-transition-duration: 0.12s;
                -o-transition-duration: 0.12s;
                -ms-transition-duration: 0.12s;
                transition-duration: 0.12s;
                -webkit-transition-timing-function: ease-out;
                -moz-transition-timing-function: ease-out;
                -o-transition-timing-function: ease-out;
                -ms-transition-timing-function: ease-out;
                transition-timing-function: ease-out;
            }

            #v-nav
            {
                height: 100%;
                margin: auto;
                color: #333;
                font: 12px/18px "Lucida Grande", "Lucida Sans Unicode", Helvetica, Arial, Verdana, sans-serif;
            }

            #v-nav >ul
            {
                float: left;
                width: 210px;
                display: block;
                position: relative;
                top: 0;
                border: 1px solid #DDD;
                border-right-width: 0;
                margin: auto 0 !important;
                padding:0;
            }

            #v-nav >ul >li
            {
                width: 180px;
                list-style-type: none;
                display: block;
                text-shadow: 0px 1px 1px #F2F1F0;
                font-size: 1.11em;
                position: relative;
                border-right-width: 0;
                border-bottom: 1px solid #DDD;
                margin: auto;
                padding: 10px 15px !important;  
                background: whiteSmoke; /* Old browsers */
                background: -moz-linear-gradient(top, #ffffff 0%, #f2f2f2 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #ffffff), color-stop(100%, #f2f2f2)); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top, #ffffff 0%, #f2f2f2 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top, #ffffff 0%, #f2f2f2 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top, #ffffff 0%, #f2f2f2 100%); /* IE10+ */
                background: linear-gradient(top, #ffffff 0%, #f2f2f2 100%); /* W3C */       
            }

            #v-nav >ul >li.current
            {
                color: black;
                border-right: none;
                z-index: 10;
                background: white !important;
                position: relative;
                moz-box-shadow: inset 0 0 35px 5px #fafbfd;
                -webkit-box-shadow: inset 0 0 35px 5px #fafbfd;
                box-shadow: inset 0 0 35px 5px #fafbfd;
            }

            #v-nav >ul >li.first.current
            {
                border-bottom: 1px solid #DDD;
            }

            #v-nav >ul >li.last
            {
                border-bottom: none;
            }

            #v-nav >div.tab-content
            {
                margin-left: 210px;
                border: 1px solid #ddd;
                background-color: #FFF;
                min-height: 400px;
                position: relative;
                z-index: 9;
                padding: 12px;
                moz-box-shadow: inset 0 0 35px 5px #fafbfd;
                -webkit-box-shadow: inset 0 0 35px 5px #fafbfd;
                box-shadow: inset 0 0 35px 5px #fafbfd;
                display: none;
                padding: 25px;
            }

            #v-nav >div.tab-content >h4
            {
                font-size: 1.2em;
                color: Black;
                text-shadow: 0px 1px 1px #F2F1F0;
                border-bottom: 1px dotted #EEEDED;
                padding-top: 5px;
                padding-bottom: 5px;
            }



        </style>
        
        <script type="text/javascript">

                    $(function () {
            var items = $('#v-nav>ul>li').each(function () {
                $(this).click(function () {
                    //remove previous class and add it to clicked tab
                    items.removeClass('current');
                    $(this).addClass('current');

                    //hide all content divs and show current one
                    $('#v-nav>div.tab-content').hide().eq(items.index($(this))).show('fast');

                    window.location.hash = $(this).attr('tab');
                });
            });

            if (location.hash) {
                showTab(location.hash);
            }
            else {
                showTab("tab1");
            }

            function showTab(tab) {
                $("#v-nav ul li:[tab*=" + tab + "]").click();
            }

            // Bind the event hashchange, using jquery-hashchange-plugin
            $(window).hashchange(function () {
                showTab(location.hash.replace("#", ""));
            })

            // Trigger the event hashchange on page load, using jquery-hashchange-plugin
            $(window).hashchange();
        });

        </script>
    </head>
    <body>

		<section id="wrapper" class="wrapper">

            <h1 class="title">Apple iPhone 5</h1>

            <div id="v-nav">

                <ul>
                    <li tab="tab1" class="first current">Design</li>
                    <li tab="tab2">Specs</li>
                    <li tab="tab3">Price</li>
                    <li tab="tab4" class="last">Release Date</li>
                </ul>

                <div class="tab-content">
                    <h4>Design</h4>
                </div>

                <div class="tab-content">
                    <h4>Specs</h4>
                </div>

                <div class="tab-content">
                    <h4>Price</h4>                   
                </div>

                <div class="tab-content">
                    <h4>Release Date</h4>                   
                </div>

            </div>

		</section>

        <!-- Include Scripts -->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script> 
        <script type="text/javascript" src="http://benalman.com/code/projects/jquery-hashchange/jquery.ba-hashchange.js"></script>       
        <script type="text/javascript" src="assets/js/script.js"></script>

    </body>
</html>

