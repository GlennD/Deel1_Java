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
        <title>Banddetails</title>

        <script src="../js/modernizr-1.7.min.js"></script><!-- this is the javascript allowing html5 to run in older browsers -->

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
        <link rel="stylesheet" type="text/css" href="../css/custom.css" media="screen" />


    </head>
    <body>
        <h1>Geselecteerde band: <%= request.getParameter("bandID") %>leviosaaaah </h1>

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
        
        out.println("Artist: ");
        out.println(naam); 
        out.println("<br />");
        
        out.println("Genre: ");
        out.println(genre); 
        out.println("<br />");

        out.println("Website: ");
        out.println(website); 
        out.println("<br />");

        out.println("Gigs:  ");
        if(rs2.next()){
            int festivalID = rs2.getInt("fest_id");
            ps3 = conn.prepareStatement("Select SQL_CALC_FOUND_ROWS * FROM festivals WHERE fest_id ="+festivalID);
            rs3 = ps3.executeQuery();
            int count = 1;
            while(rs3.next()){
            String festival = rs3.getString("fest_naam");
            
            out.println(count +" "+festival);
            out.println("<br />");
            count++;
            }
        }
        out.println("<br />");
        }


        rs1.close();

        %>
    </body>
</html>
