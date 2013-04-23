<%-- 
    Document   : viewBands
    Created on : 20-apr-2013, 12:49:05
    Author     : Arnout
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selecteer een band</title>

        <script src="js/modernizr-1.7.min.js"></script><!-- this is the javascript allowing html5 to run in older browsers -->

        <link rel="stylesheet" type="text/css" href="css/reset.css" media="screen" title="html5doctor.com Reset Stylesheet" />

        <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->
        <link rel="stylesheet" type="text/css" href="css/css3.css" media="screen" />

        <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->
        <link rel="stylesheet" type="text/css" href="css/general.css" media="screen" />

        <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->
        <link rel="stylesheet" type="text/css" href="css/grid.css" media="screen" />


        <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->

        <!--[if IE]> <style> .report_bugs {left:0px;} </style>	<![endif]-->

        <script type="text/javascript" src="coin-slider/jquery-1.4.2.js"></script>
        <script type="text/javascript" src="coin-slider/coin-slider.min.js"></script>
        <link rel="stylesheet" href="coin-slider/coin-slider-styles.css" type="text/css" />
        <link rel="stylesheet" type="text/css" href="css/custom.css" media="screen" />

    </head>
    <body>

        <a href="index.jsp"><img style="width: 100px; position: absolute; top: -50px;" src="images/Home-Button.png" /></a>
        <a HREF="javascript:javascript:history.go(-1)"><img style="width: 100px; position: absolute; top: 55px; left: 5px; opacity: 0.4;" src="images/back-button.png" /></a>
        <a href="viewFestivals.jsp"><img style="width: 150px; left: -20px; position: absolute; top: 100px; opacity: 0.5;" src="images/festivallogo.png" /></a>
        <a href="viewBands.jsp"><img style="width: 100px; position: absolute; top: 210px; opacity: 0.5;" src="images/microphone.png" /></a>

        <%@ page language="java" %>
        <%@ page import="java.sql.*" %>
        <%!
            public int nullIntconvert(String str) {
                int num = 0;
                if (str == null) {
                    str = "0";
                } else if ((str.trim()).equals("null")) {
                    str = "0";
                } else if (str.equals("")) {
                    str = "0";
                }
                try {
                    num = Integer.parseInt(str);
                } catch (Exception e) {
                }
                return num;
            }
        %>
        <%
            Connection conn = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/groep11_festivals", "root", "");
            ResultSet rs1 = null;
            ResultSet rs2 = null;
            PreparedStatement ps1 = null;
            PreparedStatement ps2 = null;

            int showRows = 3;
            int totalRecords = 10;
            int totalRows = nullIntconvert(request.getParameter("totalRows"));
            int totalPages = nullIntconvert(request.getParameter("totalPages"));
            int iPageNo = nullIntconvert(request.getParameter("iPageNo"));
            int cPageNo = nullIntconvert(request.getParameter("cPageNo"));

            int startResult = 0;
            int endResult = 0;
            if (iPageNo == 0) {
                iPageNo = 0;
            } else {
                iPageNo = Math.abs((iPageNo - 1) * showRows);
            }
            String query1 = "SELECT SQL_CALC_FOUND_ROWS * FROM bands limit " + iPageNo + "," + showRows + "";
            ps1 = conn.prepareStatement(query1);
            rs1 = ps1.executeQuery();
            String query2 = "SELECT FOUND_ROWS() as cnt";
            ps2 = conn.prepareStatement(query2);
            rs2 = ps2.executeQuery();
            if (rs2.next()) {
                totalRows = rs2.getInt("cnt");
                System.out.println(totalRows);
            }
        %>

        <section class="row" id="styled" style="margin-top: 4em; ">
            <div style="position: absolute; z-index: 30;"> <span class="rotateTitle"><h1 style="font-family: Rockwell extra bold; position: absolute; background-color: white; left: 50px;  width: 410px; top: 50px; -webkit-transform: rotate(-20deg); ">Select an artist</h1></span>
            </div>
            <div id='coin-slider' style="margin: auto; opacity: 0.8; position: absolute;">
                <a href="" target="_blank">
                    <img src='images/artists/NIN_edit.png' >
                    <span>
                        Nine Inch Nails
                    </span>
                </a>

                <a href="">
                    <img src='images/artists/neil_young_edit.png' >
                    <span>
                        Neil Young
                    </span>
                </a>

                <a href="">
                    <img src='images/artists/the_prodigy_edit.png' >
                    <span>
                        The prodigy
                    </span>
                </a>
            </div>

        </section>


        <form>


            <%
                int count = 0;
                while (rs1.next()) {
            %>
            <section class="row" id="styled" style="margin-top: 4em;">





                <a href="banddetails/banddetail.jsp?bandID=<%= rs1.getInt("band_id")%>" style="text-decoration: none; color:black;">
                    <%  if (count % 2 == 0) {

                    %>
                    <div class="col_13 col" style="margin-left: 10%;border-top: 7px dashed #fff; border-bottom: 7px dashed #efefef;  border-radius: 20px;">
                        <table class="oneFestival" >
                            <%            } else {
                            %>
                            <div class="col_13 col" style="border-top: 7px dashed #cfcfcf; border-bottom: 7px dashed #bfbfbf; border-radius: 20px;">
                                <table class="oneFestival">
                                    <%                }
                                    %>
                                    <tr style="border: 0px solid black; "><th colspan="2" style="text-align: left; padding: 10px 50px 0px 10px;"><h1 style="font-family: algerian; "><%=rs1.getString("band_naam")%></h1> </th></tr>
                                    <tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3 style="font-family: david ;">Music-style:   </h3></td><td><%=rs1.getString("band_soortMuziek")%></td></tr>
                                    <tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">Gigs </h3></td><td>Link naar optredens</td></tr>
                                    <tr style="border: 0px solid black;"><td style="width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;"><h3  style="font-family: david;">Website: </h3></td><td><a href="<%=rs1.getString("band_url")%>"> <%=rs1.getString("band_url")%></a></td></tr>

                                </table>
                                </a> 

                            </div><!-- col_16 -->


                            </section><!-- row -->


                            <%
                                    count++;

                                }
                            %>

                            <%
                                try {
                                    if (totalRows < (iPageNo + showRows)) {
                                        endResult = totalRows;
                                    } else {
                                        endResult = (iPageNo + showRows);
                                    }
                                    startResult = (iPageNo + 1);
                                    totalPages = ((int) (Math.ceil((double) totalRows / showRows)));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>

                            <section class="row" id="styled" style="margin-top: 4em; ">
                                <div style="text-align: center; ">
                                    <%
                                        int i = 0;
                                        int cPage = 0;
                                        if (totalRows != 0) {
                                            cPage = ((int) (Math.ceil((double) endResult / (totalRecords * showRows))));
                                            int prePageNo = (cPage * totalRecords) - ((totalRecords - 1) + totalRecords);
                                            if ((cPage * totalRecords) - (totalRecords) > 0) {
                                    %>
                                    <a href="viewBands.jsp?iPageNo=<%=prePageNo%>&cPageNo=<%=prePageNo%>"> << Previous</a>
                                    <%
                                        }
                                        for (i = ((cPage * totalRecords) - (totalRecords - 1)); i <= (cPage * totalRecords); i++) {
                    if (i == ((iPageNo / showRows) + 1)) {%>
                                    <a href="viewBands.jsp?iPageNo=<%=i%>" style="cursor: pointer;color: red; font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><b><%=i%></b></a>
                                            <%
                                            } else if (i <= totalPages) {
                                            %>
                                    <a href="viewBands.jsp?iPageNo=<%=i%>" style="font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><%=i%></a>
                                    <%
                                            }
                                        }
                                        if (totalPages > totalRecords && i < totalPages) {
                                    %>
                                    <br />
                                    <a href="viewBands.jsp?iPageNo=<%=i%>&cPageNo=<%=i%>"> >> Next</a>
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
                            <script type="text/javascript">
                                $(document).ready(function() {
                                    $('#coin-slider').coinslider({width: 800, height: 200, navigation: true, delay: 5000, opacity: 0.3});
                                });
                            </script>
                            </body>
                            </html>
                            <%
                                try {
                                    if (ps1 != null) {
                                        ps1.close();
                                    }
                                    if (rs1 != null) {
                                        rs1.close();
                                    }

                                    if (ps2 != null) {
                                        ps2.close();
                                    }
                                    if (rs2 != null) {
                                        rs2.close();
                                    }
                                    if (conn != null) {
                                        conn.close();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>
