<%-- 
    Document   : banddetail
    Created on : 22-apr-2013, 23:09:37
    Author     : Glenn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Banddetails  </title>
    
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
		
		
		footer {text-align:center; color:#666; font-size:0.9em; padding:4px 0px;}
                
                li{
                    margin-bottom: 20px;
                    text-align: right;
                    
                }
        </style>
    </head>
    <body>
         <a href="../index.jsp"><img style="width: 100px; position: absolute; " src="../images/Home-Button.png" alt=""/></a>
        <a HREF="javascript:javascript:history.go(-1)"><img style="width: 100px; position: absolute; top: 105px; left: 5px; opacity: 0.4;" src="../images/back-button.png" alt="" /></a>
        <a href="../viewFestivals.jsp"><img style="width: 150px; left: -20px; position: absolute; top: 150px; opacity: 0.5;" src="../images/festivallogo.png" alt="" /></a>
        <a href="../viewBands.jsp"><img style="width: 100px; position: absolute; top: 260px; opacity: 0.5;" src="../images/microphone.png" alt=""/></a>
        
        <section class="row" id="grid">
            <br/>
       
       

        <%@ page language="java" %>
        <%@ page import="java.sql.*" %>
        <% String bandID =  request.getParameter("bandID"); %>

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
        ResultSet rs1 = null, rs2=null, rs3=null;
        PreparedStatement ps1=null, ps2=null, ps3=null;
        String query1="SELECT SQL_CALC_FOUND_ROWS * FROM bands where band_id = "+ bandID ;
        String query2="SELECT SQL_CALC_FOUND_ROWS * FROM bandsperfestival where band_id = "+ bandID ;
        ps1=conn.prepareStatement(query1);
        ps2=conn.prepareStatement(query2);
        rs1=ps1.executeQuery();
        rs2=ps2.executeQuery();
        if(rs1.next()){
        String genre = rs1.getString("band_soortMuziek");
        String website = rs1.getString("band_url");
        String naam = rs1.getString("band_naam");
        %>
        <div class="row">
             <h1 style="width: 100%;"><%= naam %></h1><br />
            <div class="col col_13 container_buttons borderBottomTop" >
                <table class="festivalInfo">
                    <tr>
                        <td class="festivalInfoTitle">
                            Genre:
                        </td>
                        <td class="festivalInfoSub">
                           <%= genre %>
                        </td>
                    </tr>
                    <tr>
                        <td class="festivalInfoTitle">
                            Website:
                        </td>
                        <td class="festivalInfoSub">
                            <a href="<%= website %>"><%= website %></a>
                        </td>
                    </tr>
                    <tr>
                        <td class="festivalInfoTitle">
                            Gigs:
                        </td>
                        <td class="festivalInfoSub">
                           
                        
                
        
        
        <%
        

        int count = 1;
        while(rs2.next()){
            int festivalID = rs2.getInt("fest_id");
          
            ps3 = conn.prepareStatement("Select SQL_CALC_FOUND_ROWS * FROM festivals WHERE fest_id ="+festivalID);
            rs3 = ps3.executeQuery();
            
            while(rs3.next()){
            String festival = rs3.getString("fest_naam");
            if(count != 1) out.println(" - ");
            out.println("<a href='../festivaldetails/festivalDetailHome.jsp?festivalID=" + festivalID + "'>" + festival + "</a>");
            
            
            }
            count++;
        }
    
        }


        rs1.close();

        %>
        </td>
                    </tr>
        </table>
            </div>
        </div>
        </section>
    </body>
</html>
