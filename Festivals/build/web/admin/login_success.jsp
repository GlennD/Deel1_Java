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
    <p> Welkom, <%=uname%> </p>
    <a href="logout.jsp"> Logout </a>

    </head>
    <body>

        <h1>Login success !</h1>
        
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

            <table>
                <tr>
                    <td>
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

                            <section class="row" id="styled" style="margin-top: 4em; ">
                                <div>
                                    <%
                                    int i=0;
                                    int cPage=0;
                                    if(totalRows!=0) {
                                    cPage=((int)(Math.ceil((double)endResult/(totalRecords*showRows))));
                                    int prePageNo=(cPage*totalRecords)-((totalRecords-1)+totalRecords);
                                    if((cPage*totalRecords)-(totalRecords)>0){
                                    %>
                                    <a href="viewFestivals.jsp?iPageNo=<%=prePageNo%>&cPageNo=<%=prePageNo%>"> << Previous</a>
                                    <%
                                    }
                                    for(i=((cPage*totalRecords)-(totalRecords-1));i<=(cPage*totalRecords);i++){
                                    if(i==((iPageNo/showRows)+1)){%>
                                    <a href="viewFestivals.jsp?iPageNo=<%=i%>" style="cursor: pointer;color: red; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><b><%=i%></b></a>
                                    <%
                                    }
                                    else if(i<=totalPages){
                                    %>
                                    <a href="viewFestivals.jsp?iPageNo=<%=i%>" style="padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F"><%=i%></a>
                                    <%
                                    }
                                    }
                                    if(totalPages>totalRecords && i<totalPages){
                                    %>
                                    <br />
                                    <a href="viewFestivals.jsp?iPageNo=<%=i%>&cPageNo=<%=i%>"> >> Next</a>
                                    <%
                                    }
                                    }
                                    %>
                                    <br />
                                    <p>Rijen <%=startResult%>-<%=endResult%> van <%=totalRows%></p>
                                </div>
                            </section>
                        </form>
                    </td>
                    <td style="border: 1px solid black;">
                        
                        <h1>Add festival</h1>
                        <div style="margin-top: 0px;">
                            
                            <form method="POST" action="${pageContext.request.contextPath}/addFestivalServlet">
                                
                                <p>
                                    Name: <input type="text" name="festName" /><br />
                                    Location: <input type="text" name="festLocation" /><br />
                                    Date: <input type="date" name="festDate" /><br />
                                    Days: <input type="text" name="festDays" /><br />
                                    <input type="submit" />
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