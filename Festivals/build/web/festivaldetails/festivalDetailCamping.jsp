
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Festival campings</title>
         <script src="js/modernizr-1.7.min.js"></script><!-- this is the javascript allowing html5 to run in older browsers -->
    
    <link rel="stylesheet" type="text/css" href="../css/reset.css" media="screen" title="html5doctor.com Reset Stylesheet" />
    
    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->
    <link rel="stylesheet" type="text/css" href="../css/css3.css" media="screen" />
    
    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->
    <link rel="stylesheet" type="text/css" href="../css/general.css" media="screen" />
            <link rel="stylesheet" type="text/css" href="../css/buttons/demo_buttons.css" media="screen" />
        
        <link rel="stylesheet" type="text/css" href="../css/buttons/style3_button.css" media="screen" />
        
    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->
    <link rel="stylesheet" type="text/css" href="../css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="../css/custom.css" media="screen" />
    
    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->
    
    <!--[if IE]> <style> .report_bugs {left:0px;} </style>	<![endif]-->
    
    <script type="text/javascript" src="../coin-slider/jquery-1.4.2.js"></script>
    <script type="text/javascript" src="./coin-slider/coin-slider.min.js"></script>
    <link rel="stylesheet" href="../coin-slider/coin-slider-styles.css" type="text/css" />
     <style type="text/css">
            section{
                border: 0px solid black;
            }
            header {padding-top:25px; border-bottom:1px solid #ccc; padding-bottom:20px;}
		header .logo {font-size:3.52em;}
		header nav ul li {float:left; margin-top:12px;}
		header nav ul li a {display:block; padding:5px 15px; border-right:1px solid #eee; font-size:1.52em; font-family:Georgia, "Times New Roman", Times, serif; text-decoration:none;}
		header nav ul li a:hover {background-color:#eee; border-right:1px solid #ccc; text-shadow:-1px -1px 0px #fff;}
		header nav ul li.last a {border-right:none;}
		
		#css3 div > div {margin:0px 0px 50px 0px; padding:6px; border:1px solid #eee;}
		#grid div {text-align:center;  }
		
		h2 {border-bottom:1px dashed #ccc; margin-top:15px;}
		
		.documentation {display:block; background-color:#eee; padding:6px 13px; font-family:Georgia, "Times New Roman", Times, serif; color:#666; text-align:right; text-shadow:-1px -1px 0px #fff;}
		
		footer {text-align:center; color:#666; font-size:0.9em; padding:4px 0px;}
                
                li{
                    margin-bottom: 20px;
                    text-align: right;
                    
                }
                
                .tooltip {
	display:none;
	position:absolute;
	border:1px solid #333;
	background-color:#161616;
	border-radius:5px;
	padding:10px;
	color:#fff;
	font-size:12px Arial;
        height: auto;
        width: 250px;
}
        </style>
    </head>
    
    <body>
                <a href="../index.jsp"><img style="width: 100px; position: absolute; " src="../images/Home-Button.png" alt=""/></a>
        <a HREF="javascript:javascript:history.go(-1)"><img style="width: 100px; position: absolute; top: 105px; left: 5px; opacity: 0.4;" src="../images/back-button.png" alt="" /></a>
        <a href="../viewFestivals.jsp"><img style="width: 150px; left: -20px; position: absolute; top: 150px; opacity: 0.5;" src="../images/festivallogo.png" alt="" /></a>
        <a href="../viewBands.jsp"><img style="width: 100px; position: absolute; top: 260px; opacity: 0.5;" src="../images/microphone.png" alt="" /></a>
        
    
<script type="text/javascript">
$(document).ready(function() {
        // Tooltip only Text
        $('.masterTooltip').hover(function(){
                // Hover over code
                var title = $(this).attr('title');
                $(this).data('tipText', title).removeAttr('title');
                $('<p class="tooltip"></p>')
                .text(title)
                .appendTo('body')
                .fadeIn('slow');
        }, function() {
                // Hover out code
                $(this).attr('title', $(this).data('tipText'));
                $('.tooltip').remove();
        }).mousemove(function(e) {
                var mousex = e.pageX + 20; //Get X coordinates
                var mousey = e.pageY + 10; //Get Y coordinates
                $('.tooltip')
                .css({ top: mousey, left: mousex })
        });
});
</script>

    <%@ page language="java" %>
<%@ page import="java.sql.*" %>
<% String festivalID =  request.getParameter("festivalID"); %>

<%!
public int nullIntconvert(String str){
int num=0;
if(str==null) {
str="0";
}
else if((str.trim()).equals("null")) {
str="0";
}
else if(str.equals("")) {
str="0";
}
try{
num=Integer.parseInt(str);
}
catch(Exception e) { }
return num;
}
%>

<%
Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/groep11_festivals","root", "");
ResultSet rs1 = null;

PreparedStatement ps1=null;
String query1="SELECT SQL_CALC_FOUND_ROWS c.* from campings c, campingsperfestival cp "
        + " where c.camp_id = cp.camp_id and cp.fest_id = "+ festivalID ;

ResultSet resultFestival = null;
PreparedStatement statementFestival = null;
String queryFestival = "Select SQL_CALC_FOUND_ROWS fest_naam from festivals where fest_id = " + festivalID;
statementFestival = conn.prepareStatement(queryFestival);
resultFestival = statementFestival.executeQuery();
String festivalNaam = "";
if(resultFestival.next()){
   festivalNaam = resultFestival.getString("fest_naam");
}


ps1=conn.prepareStatement(query1);
rs1=ps1.executeQuery();

Array[] campings;
%>




    <section class="row">
        <h1><% out.print(festivalNaam); %> - Campings</h1><br />
         
    <div class="row">
    <div id="container_buttons" style="position: absolute; top: 80px;">
    <p style="float:left; margin-bottom: 10px;">
    <a class="a_demo_three" href="festivalDetailHome.jsp?festivalID=<% out.print(festivalID); %>">
    Home
    </a>
    </p>
    <br />
    <p style="float:left; margin-bottom: 10px;">
    <a class="a_demo_three"  href="festivalDetailBands.jsp?festivalID=<% out.print(festivalID); %>">
    Bands
    </a>
    </p>
    <br />
    <p style="float:left; margin-bottom: 10px;">
    <a class="a_demo_three" href="festivalDetailStages.jsp?festivalID=<% out.print(festivalID); %>">
    Stages
    </a>
    </p>
    <br />
    <p style="float:left; margin-bottom: 10px;">
    <a class="a_demo_three actief" href="festivalDetailCamping.jsp?festivalID=<% out.print(festivalID); %>">
    Campings
    </a>
    </p>
    <br />
    <p style="float:left; margin-bottom: 10px;">
    <a class="a_demo_three" href="festivalDetailTickets.jsp?festivalID=<% out.print(festivalID); %>" >
    Tickets
    </a>
    </p>
    </div>
    </div>
    </section><section class="row" id="grid">
    <%
while(rs1.next()){
    %>
     <div class="row">
            <div class="col col_13 container_buttons borderBottomTop" style="margin-left: 200px;">
                <table class="festivalInfo">
                    <tr>
                        <td class="festivalInfoTitle">
                            Location:
                        </td>
                        <td class="festivalInfoSub">
                             <%=rs1.getString("camp_adres")%>
                        </td>
                    </tr>
                    <tr>
                        <td class="festivalInfoTitle">
                            Capacity:
                        </td>
                        <td class="festivalInfoSub">
                             <%=rs1.getString("camp_cap")%> persons
                        </td>
                    </tr>
                    <tr>
                        <td class="festivalInfoTitle">
                            Facilities
                        </td>
                    </tr>
                </table>
                
                        <%
                ResultSet rs3 = null;
                PreparedStatement st3 = null;
                String query3 = "Select SQL_CALC_FOUND_ROWS f.* from faciliteiten f, facpercamp fp where fp.fac_id = f.fac_id and fp.camp_id = " + rs1.getString("camp_id");
               
                
                st3 = conn.prepareStatement(query3);
                rs3 = st3.executeQuery();

                while(rs3.next()){
                   int facid = rs3.getInt("fac_id");
                   
                   switch(facid){
                       case 1: out.print("<div id='facility1' class='masterTooltip' title='" + rs3.getString("fac_omschr") +  "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/charge.png' /></div>");
                           break;
                       case 2: out.print("<div id='facility2' class='masterTooltip' title='" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/drinking_water.png' /></div>");
                           break;
                       case 3: out.print("<div id='facility3' class='masterTooltip' title= '" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/Black-Tap-Water-128.png' /></div>"); 
                           break;
                       case 4: out.print("<div id='facility4' class='masterTooltip' title= '" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/shower.png' /></div>");
                           break;
                       case 5: out.print("<div id='facility5' class='masterTooltip' title='" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/ehbo.png' /></div>");
                           break;
                       case 6: out.print("<div id='facility6' class='masterTooltip' title='" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/Fast-Food-256.png' /></div>");
                           break;
                       
                     }
                }

                        %>
                        
                   
            </div>
        </div>
    <%
}



%>
       
    </section>
    <div id="footer">&copy; 2013, all rights reserved PXL/PHL Belgium </div>
    </body>
</html>
