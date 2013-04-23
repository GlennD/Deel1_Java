<%-- 
    Document   : viewFestivals
    Created on : 20-apr-2013, 12:49:32
    Author     : Arnout
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Festival stages</title>
    
    <script src="js/modernizr-1.7.min.js"></script><!-- this is the javascript allowing html5 to run in older browsers -->
    
    <link rel="stylesheet" type="text/css" href="../css/reset.css" media="screen" title="html5doctor.com Reset Stylesheet" />
    
    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->
    <link rel="stylesheet" type="text/css" href="../css/css3.css" media="screen" />
    
    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->
    <link rel="stylesheet" type="text/css" href="../css/general.css" media="screen" />
    
    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->
    <link rel="stylesheet" type="text/css" href="../css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="../css/custom.css" media="screen" />
    
    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->
    
    <!--[if IE]> <style> .report_bugs {left:0px;} </style>	<![endif]-->
    
    <script type="text/javascript" src="../coin-slider/jquery-1.4.2.js"></script>
    <script type="text/javascript" src="../coin-slider/coin-slider.min.js"></script>
    <link rel="stylesheet" href="../coin-slider/coin-slider-styles.css" type="text/css" />

    </head>
    <body>
        
       
    

<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<% String stageID =  request.getParameter("stageID"); %>
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

ResultSet rs2 = null;
PreparedStatement ps2 = null;

String query1="SELECT SQL_CALC_FOUND_ROWS b.band_naam FROM bands b, bandsperfestival bp where bp.pod_id = " + stageID + " and bp.band_id = b.band_id";
ps1=conn.prepareStatement(query1);
rs1=ps1.executeQuery();

String query2 = "SELECT SQL_CALC_FOUND_ROWS pod_omschr, pod_locatie from podia where pod_id = " + stageID + "";
ps2 = conn.prepareStatement(query2);
rs2 = ps2.executeQuery();
rs2.next();

%>

<%
out.print("<h2>");
out.print(rs2.getString("pod_omschr"));
out.print("<br />");
out.print(rs2.getString("pod_locatie"));
out.print("</h2>");
out.print("<br/>");
int count = 0;
while(rs1.next()){
    out.print(rs1.getString("band_naam"));
    out.print("<br />");    
}

%>
<section class="row" id="styled" style="margin-top: 4em; ">

    
                 
                 <div class="clear"></div>
    <div class="col_16 col">
        
    </div>

    
      
      
<div id="footer">&copy; 2013, all rights reserved PXL/PHL Belgium </div>

</body>
</html>
<%
try{
if(ps1!=null){
ps1.close();
}
if(rs1!=null){
rs1.close();
}

if(conn!=null){
conn.close();
}
}
catch(Exception e)
{
e.printStackTrace();
}
%>
