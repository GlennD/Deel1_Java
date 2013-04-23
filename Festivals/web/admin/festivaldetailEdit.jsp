<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Festivaldetails  </title>
    
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
    <script type="text/javascript" src="./coin-slider/coin-slider.min.js"></script>
    <link rel="stylesheet" href="../ coin-slider/coin-slider-styles.css" type="text/css" />
    </head>
    <body>
       
<h1>geselecteerde festival: <%= request.getParameter("festivalID") %>leviosaaaah </h1>
    
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
String query1="SELECT SQL_CALC_FOUND_ROWS * FROM festivals where fest_id = "+ festivalID ;
ps1=conn.prepareStatement(query1);
rs1=ps1.executeQuery();
if(rs1.next()){           
%>

<section class="row" id="styled" style="margin-top: 4em; ">

    
                 
                 <div class="clear"></div>
    <div class="col_16 col">
    <table class="oneFestival" style="background-color: #B8CFFF;" >
        
        
             <tr style="border: 0px solid black; "><th colspan="2" style="text-align: left; padding: 10px 50px 0px 10px;"><h1 style="font-family: algerian;"><%=rs1.getString("fest_naam")%></h1> </th></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3 style="font-family: david ;">Location:   </h3></td><td><%=rs1.getString("fest_locatie")%></td></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">Start date: </h3></td><td><%=rs1.getDate("fest_datum")%></td></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">Days: </h3></td><td><%=rs1.getInt("fest_duur")%></td></tr>
              
        </table>
<%
}

rs1.close();
            
%>
    </body>
</html>
