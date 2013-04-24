<%-- 
    Document   : login_success
    Created on : Apr 21, 2013, 4:30:54 PM
    Author     : Ruben
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welkom</title>
        <%String uname = (String) request.getParameter("uname");
                    if (uname == null) {
                        response.sendRedirect("index.jsp");
                    }
        %>

        <link rel="stylesheet" type="text/css" href="css/custom.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="css/css3.css" media="screen" />
        
        <style>
            
            h1
            {
              font-family: Calibri;  
            }
            
        </style>
    </head>
    <body>
    <p> Welkom, <%=uname%> | <a href="logout.jsp"> Logout </a> </p>
    

            <%@ page language="java" %>
            <%@ page import="java.sql.*" %>
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

            int showRows=10;
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
            String query1="SELECT SQL_CALC_FOUND_ROWS * FROM festivals limit "+iPageNo+","+showRows+"";
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
            
            
            <h1>Festivals</h1>
            <table>
                <tr>
                   
                    <td>
                       <div class="col_8 box_shadow rounded" style="height:500px;  width:400px; border:1px solid #ccc;font:16px/26px Georgia, Garamond, Serif;overflow:auto;">

                        <form>
                            <%
                            int count = 0;
                            while(rs1.next()){
                            %>

                            <section class="row" id="styled">

                                <div class="clear"></div>
                                <div class="col_10" style="width: 500px;">

                                   <a href="festivaldetails/festivaldetail.jsp?festivalID=<%= rs1.getInt("fest_id") %>" style="text-decoration: none; color:black; ">
                                    <%  if (count%2 == 0) {

                                    %>
                                    <table>
                                     <%  
                                    }
                                    else{
                                    %>
                                    <table style="background-color: #B8CFFF;" >
                                        <%
                                        } %>


                                        <tr style="border-top: 1px solid black;"><th colspan="2" style="text-align: left;"><%=rs1.getString("fest_naam")%> </th></tr>
                                        <tr style="border: 0px solid black;"><td style="width: 150px; border: 0px solid black;">Location:</td><td><%=rs1.getString("fest_locatie")%></td></tr>
                                        <tr style="border: 0px solid black;"><td style="width: 150px; border: 0px solid black;">Start date:</td><td><%=rs1.getDate("fest_datum")%></td></tr>
                                        <tr style="border-bottom: 1px solid black;"><td style="width: 150px; border: 0px solid black;">Days:</td><td><%=rs1.getInt("fest_duur")%></td></tr>
                                        
                                        

                                    </table>
                                        <form method="POST" action="${pageContext.request.contextPath}/deleteFestivalServlet">
                                            <input type="hidden" name="id" value="<%= rs1.getInt("fest_id") %>" />
                                            <input type ="submit" value="Delete festival" />               
                                        </form>
                                   </a> 

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

                            
                        </form>
                        </div>
                    </td>
                    <td style="padding-left: 100px;">
                        
                        
                        <div class="col_8 box_shadow rounded" style="margin-top: 0px; background-color: #B8CFFF; padding: 10px;">
                         <h1>Add festival</h1>   
                            <form method="POST" action="${pageContext.request.contextPath}/addFestivalServlet">
                                
                                <p>
                                <table>
                                    <tr>
                                        <td>Name: <br />
                                            Location: <br />
                                            Date: <br />
                                            Days: <br />
                                             
                                        </td> 
                                        <td>
                                            <input type="text" name="festName" /> <br />
                                            <input type="text" name="festLocation" /><br />
                                            <input type="date" name="festDate" /><br />
                                            <input type="text" name="festDays" /><br />
                                        </td>
                                    </tr>
                                    <tr><td><input type="submit" value="Add" /></td></td></tr>
                                </p>
                                
                            </form>
                            
                        </div>
                        
                    </td>

                    
                </tr>
              </table>
            <div id="footer">&copy; 2013, all rights reserved PXL/PHL Belgium </div>
            <script type="text/javascript">
                    $(document).ready(function() {
                            $('#coin-slider').coinslider({ width: 800, height: 200, navigation: true, delay: 5000, opacity: 0.3 });
                    });
            </script>

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