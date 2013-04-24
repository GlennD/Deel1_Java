package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_005fsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Selecteer een festival</title>\n");
      out.write("    \n");
      out.write("    <script src=\"js/modernizr-1.7.min.js\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\" media=\"screen\" title=\"html5doctor.com Reset Stylesheet\" />\n");
      out.write("    \n");
      out.write("    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/css3.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/general.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\" media=\"screen\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/custom.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->\n");
      out.write("    \n");
      out.write("    <!--[if IE]> <style> .report_bugs {left:0px;} </style>\t<![endif]-->\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"coin-slider/jquery-1.4.2.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"coin-slider/coin-slider.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"coin-slider/coin-slider-styles.css\" type=\"text/css\" />\n");
      out.write("    \n");
      out.write("    ");
String uname = (String) request.getParameter("uname");
                    if (uname == null) {
                        response.sendRedirect("index.jsp");
                    }
        
      out.write("\n");
      out.write("    <p> Welkom, ");
      out.print(uname);
      out.write(" </p>\n");
      out.write("    <a href=\"logout.jsp\"> Logout </a>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write('\n');

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

      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"row\" id=\"styled\" style=\"margin-top: 4em; \">\n");
      out.write("        <div style=\"position: absolute; z-index: 30;\"> <span class=\"rotateTitle\"><h1 style=\"font-family: Rockwell extra bold; position: absolute; background-color: white; left: 50px;  width: 410px; top: 50px;\">Select your festival</h1></span>\n");
      out.write("        </div>\n");
      out.write("        <div id='coin-slider' style=\"margin: auto; opacity: 0.8; position: absolute;\">\n");
      out.write("\t<a href=\"img01_url\" target=\"_blank\">\n");
      out.write("\t\t<img src='images/rockwerchterslider.jpg' alt=\"\">\n");
      out.write("\t\t<span>\n");
      out.write("\t\t\tRock Werchter 2013 - 4, 5, 6 and 7th of July \n");
      out.write("\t\t</span>\n");
      out.write("\t</a>\n");
      out.write("\t\n");
      out.write("\t<a href=\"imgN_url\">\n");
      out.write("\t\t<img src='images/pukkelpop2013_2.PNG' alt=\"\">\n");
      out.write("\t\t<span>\n");
      out.write("\t\t\tPukkelpop 2013 - 15, 17 and 17th and August\n");
      out.write("\t\t</span>\n");
      out.write("\t</a>\n");
      out.write("    \n");
      out.write("        <a href=\"imgN_url\">\n");
      out.write("\t\t<img src='images/Tomorrowland-2013-banner.png' alt=\"\">\n");
      out.write("\t\t<span>\n");
      out.write("\t\t\tTomorrowland 2013 - 26, 27 and 28th of July\n");
      out.write("\t\t</span>\n");
      out.write("\t</a>\n");
      out.write("    \n");
      out.write("    <a href=\"imgN_url\">\n");
      out.write("\t\t<img src='images/graspop2013.jpg' alt=\"\">\n");
      out.write("\t\t<span>\n");
      out.write("\t\t\tGraspop 2013 - 28, 29 and 30th of June \n");
      out.write("\t\t</span>\n");
      out.write("\t</a>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("<form>\n");
      out.write("\n");
      out.write("\n");

int count = 0;
while(rs1.next()){

      out.write("\n");
      out.write("<section class=\"row\" id=\"styled\" style=\"margin-top: 4em; \">\n");
      out.write("                 <div class=\"clear\"></div>\n");
      out.write("    <div class=\"col_16 col\">\n");
      out.write("         \n");
      out.write("       <a href=\"admin/festivaldetailEdit.jsp?festivalID=");
      out.print( rs1.getInt("fest_id") );
      out.write("\" style=\"text-decoration: none; \">\n");
      out.write("        ");
  if (count%2 == 0) {
        
        
      out.write("\n");
      out.write("        <table class=\"oneFestival\"  >\n");
      out.write("         ");
  
        }
        
        else{
        
      out.write("\n");
      out.write("        <table class=\"oneFestival\" style=\"background-color: #B8CFFF;\">\n");
      out.write("            ");

            } 
      out.write("      \n");
      out.write("             <tr style=\"border: 0px solid black; \"><th colspan=\"2\" style=\"text-align: left; padding: 10px 50px 0px 10px;\"><h1 style=\"font-family: algerian;\">");
      out.print(rs1.getString("fest_naam"));
      out.write("</h1> </th></tr>  \n");
      out.write("        </table>\n");
      out.write("</a> \n");
      out.write("        \n");
      out.write("    </div><!-- col_16 -->\n");
      out.write("\n");
      out.write("    </section><!-- row -->\n");
      out.write("\n");
      out.write("\n");

    count++;
    
}

      out.write('\n');
      out.write('\n');

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

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"row\" style=\"margin-top: 4em;\">\n");
      out.write("<div style=\"text-align: center; \">\n");

int i=0;
int cPage=0;
if(totalRows!=0) {
cPage=((int)(Math.ceil((double)endResult/(totalRecords*showRows))));
int prePageNo=(cPage*totalRecords)-((totalRecords-1)+totalRecords);
if((cPage*totalRecords)-(totalRecords)>0){

      out.write("\n");
      out.write("<a href=\"viewFestivals.jsp?iPageNo=");
      out.print(prePageNo);
      out.write("&cPageNo=");
      out.print(prePageNo);
      out.write("\"> << Previous</a>\n");

}
for(i=((cPage*totalRecords)-(totalRecords-1));i<=(cPage*totalRecords);i++){
if(i==((iPageNo/showRows)+1)){
      out.write("\n");
      out.write("<a href=\"viewFestivals.jsp?iPageNo=");
      out.print(i);
      out.write("\" style=\"cursor: pointer;color: red; font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F\"><b>");
      out.print(i);
      out.write("</b></a>\n");

}
else if(i<=totalPages){

      out.write("\n");
      out.write("<a href=\"viewFestivals.jsp?iPageNo=");
      out.print(i);
      out.write("\" style=\"font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F\">");
      out.print(i);
      out.write("</a>\n");

}
}
if(totalPages>totalRecords && i<totalPages){

      out.write("\n");
      out.write("<br />\n");
      out.write("<a href=\"viewFestivals.jsp?iPageNo=");
      out.print(i);
      out.write("&cPageNo=");
      out.print(i);
      out.write("\"> >> Next</a>\n");

}
}

      out.write("\n");
      out.write("<br />\n");
      out.write("<b>Rijen ");
      out.print(startResult);
      out.write('-');
      out.print(endResult);
      out.write(" van ");
      out.print(totalRows);
      out.write(" </b>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("</form>\n");
      out.write("<div id=\"footer\">&copy; 2013, all rights reserved PXL/PHL Belgium </div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$('#coin-slider').coinslider({ width: 800, height: 200, navigation: true, delay: 5000, opacity: 0.3 });\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");

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

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
