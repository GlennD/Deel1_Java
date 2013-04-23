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

    
    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->
    
    <!--[if IE]> <style> .report_bugs {left:0px;} </style>	<![endif]-->
    
    <script type="text/javascript" src="../coin-slider/jquery-1.4.2.js"></script>
    <script type="text/javascript" src="../coin-slider/coin-slider.min.js"></script>
    <link rel="stylesheet" href="../coin-slider/coin-slider-styles.css" type="text/css" />

            <link rel="stylesheet" type="text/css" href="../css/buttons/demo_buttons.css" media="screen" />
        
        <link rel="stylesheet" type="text/css" href="../css/buttons/style3_button.css" media="screen" />
            <link rel="stylesheet" type="text/css" href="../css/custom.css" media="screen" />
        
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
		#grid div > .col {border-bottom:1px solid #ddd; background-color: #fff; border-right: 1px solid #eee;  padding:10px 0px;  border-radius: 0px 20px 20px 20px;}
		
		h2 {border-bottom:1px dashed #ccc; margin-top:15px;}
		
		.documentation {display:block; background-color:#eee; padding:6px 13px; font-family:Georgia, "Times New Roman", Times, serif; color:#666; text-align:right; text-shadow:-1px -1px 0px #fff;}
		
		footer {text-align:center; color:#666; font-size:0.9em; padding:4px 0px;}
                
                li{
                    margin-bottom: 20px;
                    text-align: right;
                    
                }
        </style>
    </head>
    <body>
        
            <a href="../index.jsp"><img style="width: 100px; position: absolute; " src="../images/Home-Button.png" /></a>
        <a HREF="javascript:javascript:history.go(-1)"><img style="width: 100px; position: absolute; top: 105px; left: 5px; opacity: 0.4;" src="../images/back-button.png" /></a>
        <a href="../viewFestivals.jsp"><img style="width: 150px; left: -20px; position: absolute; top: 150px; opacity: 0.5;" src="../images/festivallogo.png" /></a>
        <a href="../viewBands.jsp"><img style="width: 100px; position: absolute; top: 260px; opacity: 0.5;" src="../images/microphone.png" /></a>
        
    

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


ResultSet resultFestival = null;
PreparedStatement statementFestival = null;
String queryFestival = "Select SQL_CALC_FOUND_ROWS fest_naam from festivals where fest_id = " + festivalID;
statementFestival = conn.prepareStatement(queryFestival);
resultFestival = statementFestival.executeQuery();
String festivalNaam = "";
if(resultFestival.next()){
   festivalNaam = resultFestival.getString("fest_naam");
}


int showRows=3;
int totalRecords=3;

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

<section class="row" id="grid">
        <h1 style="font-size: 55px;"><% out.print(festivalNaam); %> - Artists</h1><br />
         
    <div class="row">
    <div id="container_buttons" style="position: absolute; top: 80px;">
    <p style="float:left; margin-bottom: 10px;">
    <a class="a_demo_three " href="festivalDetailHome.jsp?festivalID=<% out.print(festivalID); %>">
    Home
    </a>
    </p>
    <br />
    <p style="float:left; margin-bottom: 10px;">
    <a class="a_demo_three actief"  href="festivalDetailBands.jsp?festivalID=<% out.print(festivalID); %>">
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
    <a class="a_demo_three" href="festivalDetailCamping.jsp?festivalID=<% out.print(festivalID); %>">
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
    
<form>
<%
int count = 0;
while(rs1.next()){
%>

        <div class="row">
         <div class="col col_13 container_buttons " style="margin-left: 200px;">
                
                    <%  if (count%2 == 0) {
        
        %>
      
        <table class="festivalInfo"  >
         <%  
        }
        
        else{
        %>
        <table class="festivalInfo">
            <%
            
            } %>
            
            <tr><th colspan="2"><h1><%=rs1.getString("band_naam")%></h1></th></tr>
                    <tr>
                        <td class="festivalInfoSub">
                            Date:
                        </td>
                        <td>
                            <%=rs1.getDate("datum")%>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Time:
                        </td>
                        <td>
                            <%=rs1.getString("uur")%>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Stage:
                        </td>
                        <td>
                            <%=rs1.getString("pod_omschr")%>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Genre:
                        </td>
                        <td>
                            <%=rs1.getString("band_soortMuziek")%>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            More info:
                        </td>
                        <td>
                           <a href="<%=rs1.getString("band_url")%>"> ga naar de website</a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Other gigs:
                        </td>
                        <td>
                            not implemented
                        </td>
                    </tr>
                </table>
          
   </div>
  </div>





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


<div style="text-align: center; ">
<%
int i=0;
int cPage=0;
if(totalRows!=0) {
cPage=((int)(Math.ceil((double)endResult/(totalRecords*showRows))));
int prePageNo=(cPage*totalRecords)-((totalRecords-1)+totalRecords);
if((cPage*totalRecords)-(totalRecords)>0){
%>
<a href="festivalDetailBands.jsp?festivalID=<% out.print(festivalID); %>&iPageNo=<%=prePageNo%>&cPageNo=<%=prePageNo%>"> << Previous</a>
<%
}
for(i=((cPage*totalRecords)-(totalRecords-1));i<=(cPage*totalRecords);i++){
if(i==((iPageNo/showRows)+1)){%>
<a href="festivalDetailBands.jsp?festivalID=<% out.print(festivalID); %>&iPageNo=<%=i%>" style="cursor: pointer;color: red; font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><b><%=i%></b></a>
<%
}
else if(i<=totalPages){
%>
<a href="festivalDetailBands.jsp?festivalID=<% out.print(festivalID); %>&iPageNo=<%=i%>" style="font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><%=i%></a>
<%
}
}
if(totalPages>totalRecords && i<totalPages){
%>
<br />
<a href="festivalbands.jsp?festivalID=<% out.print(festivalID); %>&iPageNo=<%=i%>&cPageNo=<%=i%>"> >> Next</a>
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
