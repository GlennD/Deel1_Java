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
    <title>Groepen op dit festival</title>
    
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
ResultSet rs2 = null;
PreparedStatement ps1=null;
PreparedStatement ps2=null;

int showRows=5;
int totalRecords=10;
int totalRows=nullIntconvert(request.getParameter("totalRows"));
int totalPages=nullIntconvert(request.getParameter("totalPages"));
int iPageNo=nullIntconvert(request.getParameter("iPageNo"));
int cPageNo=nullIntconvert(request.getParameter("cPageNo"));

int startResult=0;
int endResult=0;
if(iPageNo==0){
iPageNo=0;
}
else{
iPageNo=Math.abs((iPageNo-1)*showRows);
}
String query1="SELECT SQL_CALC_FOUND_ROWS b.*, bp.*, pod.pod_omschr FROM bands b, bandsperfestival bp, podia pod where pod.pod_id = bp.pod_id and bp.fest_id = "+ festivalID  +" and bp.band_id = b.band_id limit "+iPageNo+","+showRows+"";
ps1=conn.prepareStatement(query1);
rs1=ps1.executeQuery();
String query2="SELECT FOUND_ROWS() as cnt";
ps2=conn.prepareStatement(query2);
rs2=ps2.executeQuery();
if(rs2.next()) {
totalRows=rs2.getInt("cnt");
System.out.println(totalRows);
}
%>



    
<form>


<%
int count = 0;
while(rs1.next()){
%>
<section class="row" id="styled" style="margin-top: 4em; ">

    
                 
                 <div class="clear"></div>
    <div class="col_16 col">
        
  

    
      
        <%  if (count%2 == 0) {
        
        %>
        <table class="oneFestival"  >
         <%  
        }
        
        else{
        %>
        <table class="oneFestival" style="background-color: #B8CFFF;" >
            <%
            
            } %>
        
        
             <tr style="border: 0px solid black; "><th colspan="2" style="text-align: left; padding: 10px 50px 0px 10px;"><h1 style="font-family: algerian;"><%=rs1.getString("band_naam")%></h1> </th></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3 style="font-family: david ;">more info:   </h3></td><td><%=rs1.getString("band_url")%></td></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">date: </h3></td><td><%=rs1.getDate("datum")%></td></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">startuur: </h3></td><td><%=rs1.getString("uur")%></td></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">genre: </h3></td><td><%=rs1.getString("band_soortMuziek")%></td></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">podium: </h3></td><td><%=rs1.getString("pod_omschr")%></td></tr>
<tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;"><a href="">Other gigs</a> </h3></td><td></td></tr>

        </table>
  
    </div><!-- col_16 -->


    </section><!-- row -->


<%
    count++;
    
}
%>

<%
try{
if(totalRows<(iPageNo+showRows)) {
endResult=totalRows;
}
else{
endResult=(iPageNo+showRows);
}
startResult=(iPageNo+1);
totalPages=((int)(Math.ceil((double)totalRows/showRows)));
}
catch(Exception e){
e.printStackTrace();
}
%>

<section class="row" id="styled" style="margin-top: 4em; ">
<div style="text-align: center; ">
<%
int i=0;
int cPage=0;
if(totalRows!=0) {
cPage=((int)(Math.ceil((double)endResult/(totalRecords*showRows))));
int prePageNo=(cPage*totalRecords)-((totalRecords-1)+totalRecords);
if((cPage*totalRecords)-(totalRecords)>0){
%>
<a href="festivaldetails/festivalbands.jsp?iPageNo=<%=prePageNo%>&cPageNo=<%=prePageNo%>"> << Previous</a>
<%
}
for(i=((cPage*totalRecords)-(totalRecords-1));i<=(cPage*totalRecords);i++){
if(i==((iPageNo/showRows)+1)){%>
<a href="festivaldetails/festivalbands.jsp?iPageNo=<%=i%>" style="cursor: pointer;color: red; font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><b><%=i%></b></a>
<%
}
else if(i<=totalPages){
%>
<a href="viewFestivals.jsp?iPageNo=<%=i%>" style="font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><%=i%></a>
<%
}
}
if(totalPages>totalRecords && i<totalPages){
%>
<br />
<a href="festivaldetails/festivalbands.jsp?iPageNo=<%=i%>&cPageNo=<%=i%>"> >> Next</a>
<%
}
}
%>
<br />
<b>Rijen <%=startResult%>-<%=endResult%> van <%=totalRows%> </b>
</div>
</section>
</form>
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

if(ps2!=null){
ps2.close();
}
if(rs2!=null){
rs2.close();
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
