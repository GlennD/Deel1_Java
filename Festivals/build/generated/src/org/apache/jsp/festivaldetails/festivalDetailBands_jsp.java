package org.apache.jsp.festivaldetails;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class festivalDetailBands_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Groepen op dit festival</title>\n");
      out.write("    \n");
      out.write("    <script src=\"js/modernizr-1.7.min.js\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/reset.css\" media=\"screen\" title=\"html5doctor.com Reset Stylesheet\" />\n");
      out.write("    \n");
      out.write("    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/css3.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/general.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/grid.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->\n");
      out.write("    \n");
      out.write("    <!--[if IE]> <style> .report_bugs {left:0px;} </style>\t<![endif]-->\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"../coin-slider/jquery-1.4.2.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../coin-slider/coin-slider.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../coin-slider/coin-slider-styles.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/buttons/demo_buttons.css\" media=\"screen\" />\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/buttons/style3_button.css\" media=\"screen\" />\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/custom.css\" media=\"screen\" />\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            section{\n");
      out.write("                border: 0px solid black;\n");
      out.write("            }\n");
      out.write("            header {padding-top:25px; border-bottom:1px solid #ccc; padding-bottom:20px;}\n");
      out.write("\t\theader .logo {font-size:3.52em;}\n");
      out.write("\t\theader nav ul li {float:left; margin-top:12px;}\n");
      out.write("\t\theader nav ul li a {display:block; padding:5px 15px; border-right:1px solid #eee; font-size:1.52em; font-family:Georgia, \"Times New Roman\", Times, serif; text-decoration:none;}\n");
      out.write("\t\theader nav ul li a:hover {background-color:#eee; border-right:1px solid #ccc; text-shadow:-1px -1px 0px #fff;}\n");
      out.write("\t\theader nav ul li.last a {border-right:none;}\n");
      out.write("\t\t\n");
      out.write("\t\t#css3 div > div {margin:0px 0px 50px 0px; padding:6px; border:1px solid #eee;}\n");
      out.write("\t\t#grid div {text-align:center;  }\n");
      out.write("\t\t\n");
      out.write("\t\th2 {border-bottom:1px dashed #ccc; margin-top:15px;}\n");
      out.write("\t\t\n");
      out.write("\t\t.documentation {display:block; background-color:#eee; padding:6px 13px; font-family:Georgia, \"Times New Roman\", Times, serif; color:#666; text-align:right; text-shadow:-1px -1px 0px #fff;}\n");
      out.write("\t\t\n");
      out.write("\t\tfooter {text-align:center; color:#666; font-size:0.9em; padding:4px 0px;}\n");
      out.write("                \n");
      out.write("                li{\n");
      out.write("                    margin-bottom: 20px;\n");
      out.write("                    text-align: right;\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            <a href=\"../index.jsp\"><img style=\"width: 100px; position: absolute; \" src=\"../images/Home-Button.png\" alt=\"\" /></a>\n");
      out.write("        <a HREF=\"javascript:javascript:history.go(-1)\"><img style=\"width: 100px; position: absolute; top: 105px; left: 5px; opacity: 0.4;\" src=\"../images/back-button.png\" alt=\"\"/></a>\n");
      out.write("        <a href=\"../viewFestivals.jsp\"><img style=\"width: 150px; left: -20px; position: absolute; top: 150px; opacity: 0.5;\" src=\"../images/festivallogo.png\" alt=\"\"/></a>\n");
      out.write("        <a href=\"../viewBands.jsp\"><img style=\"width: 100px; position: absolute; top: 260px; opacity: 0.5;\" src=\"../images/microphone.png\" alt=\"\"/></a>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String festivalID =  request.getParameter("festivalID"); 
      out.write('\n');
      out.write('\n');

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

      out.write("\n");
      out.write("\n");
      out.write("<section class=\"row\" id=\"grid\">\n");
      out.write("        <h1>");
 out.print(festivalNaam); 
      out.write(" - Artists</h1><br />\n");
      out.write("         \n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div id=\"container_buttons\" style=\"position: absolute; top: 80px;\">\n");
      out.write("    <p style=\"float:left; margin-bottom: 10px;\">\n");
      out.write("    <a class=\"a_demo_three \" href=\"festivalDetailHome.jsp?festivalID=");
 out.print(festivalID); 
      out.write("\">\n");
      out.write("    Home\n");
      out.write("    </a>\n");
      out.write("    </p>\n");
      out.write("    <br />\n");
      out.write("    <p style=\"float:left; margin-bottom: 10px;\">\n");
      out.write("    <a class=\"a_demo_three actief\"  href=\"festivalDetailBands.jsp?festivalID=");
 out.print(festivalID); 
      out.write("\">\n");
      out.write("    Bands\n");
      out.write("    </a>\n");
      out.write("    </p>\n");
      out.write("    <br />\n");
      out.write("    <p style=\"float:left; margin-bottom: 10px;\">\n");
      out.write("    <a class=\"a_demo_three\" href=\"festivalDetailStages.jsp?festivalID=");
 out.print(festivalID); 
      out.write("\">\n");
      out.write("    Stages\n");
      out.write("    </a>\n");
      out.write("    </p>\n");
      out.write("    <br />\n");
      out.write("    <p style=\"float:left; margin-bottom: 10px;\">\n");
      out.write("    <a class=\"a_demo_three\" href=\"festivalDetailCamping.jsp?festivalID=");
 out.print(festivalID); 
      out.write("\">\n");
      out.write("    Campings\n");
      out.write("    </a>\n");
      out.write("    </p>\n");
      out.write("    <br />\n");
      out.write("    <p style=\"float:left; margin-bottom: 10px;\">\n");
      out.write("    <a class=\"a_demo_three\" href=\"festivalDetailTickets.jsp?festivalID=");
 out.print(festivalID); 
      out.write("\" >\n");
      out.write("    Tickets\n");
      out.write("    </a>\n");
      out.write("    </p>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<form>\n");

int count = 0;
while(rs1.next()){

      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("         <div class=\"col col_13 container_buttons borderBottomTop \" style=\"margin-left: 200px; \">\n");
      out.write("                \n");
      out.write("                    ");
  if (count%2 == 0) {
        
        
      out.write("\n");
      out.write("      \n");
      out.write("        <table class=\"festivalInfo\"  >\n");
      out.write("         ");
  
        }
        
        else{
        
      out.write("\n");
      out.write("        <table class=\"festivalInfo\">\n");
      out.write("            ");

            
            } 
      out.write("\n");
      out.write("            \n");
      out.write("            <tr><th colspan=\"2\"><h2>");
      out.print(rs1.getString("band_naam"));
      out.write("</h2></th></tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\" >\n");
      out.write("                            Date:\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"festivalInfoSub\">\n");
      out.write("                            ");
      out.print(rs1.getDate("datum"));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\">\n");
      out.write("                            Time:\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"festivalInfoSub\">\n");
      out.write("                            ");
      out.print(rs1.getString("uur"));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\">\n");
      out.write("                            Stage:\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"festivalInfoSub\">\n");
      out.write("                            ");
      out.print(rs1.getString("pod_omschr"));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\">\n");
      out.write("                            Genre:\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"festivalInfoSub\">\n");
      out.write("                            ");
      out.print(rs1.getString("band_soortMuziek"));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\">\n");
      out.write("                            More info:\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"festivalInfoSub\">\n");
      out.write("                           <a href=\"");
      out.print(rs1.getString("band_url"));
      out.write("\"> ");
      out.print(rs1.getString("band_url"));
      out.write("</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: right; padding-right: 20px;\" colspan=\"2 \"class=\"festivalInfoTitle\">\n");
      out.write("                            <br/>\n");
      out.write("                        \n");
      out.write("                            ");

                           out.print("<a href='../banddetails/banddetail.jsp?bandID=" + rs1.getString("band_id") + "'>");
   
    out.print("Check out other gigs");
    out.print("</a>"); 
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("          \n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    count++;
    
}

      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");

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
      out.write("\n");
      out.write("<div style=\"text-align: center; \">\n");

int i=0;
int cPage=0;
if(totalRows!=0) {
cPage=((int)(Math.ceil((double)endResult/(totalRecords*showRows))));
int prePageNo=(cPage*totalRecords)-((totalRecords-1)+totalRecords);
if((cPage*totalRecords)-(totalRecords)>0){

      out.write("\n");
      out.write("<a href=\"festivalDetailBands.jsp?festivalID=");
 out.print(festivalID); 
      out.write("&iPageNo=");
      out.print(prePageNo);
      out.write("&cPageNo=");
      out.print(prePageNo);
      out.write("\"> << Previous</a>\n");

}
for(i=((cPage*totalRecords)-(totalRecords-1));i<=(cPage*totalRecords);i++){
if(i==((iPageNo/showRows)+1)){
      out.write("\n");
      out.write("<a href=\"festivalDetailBands.jsp?festivalID=");
 out.print(festivalID); 
      out.write("&iPageNo=");
      out.print(i);
      out.write("\" style=\"cursor: pointer;color: red; font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F\"><b>");
      out.print(i);
      out.write("</b></a>\n");

}
else if(i<=totalPages){

      out.write("\n");
      out.write("<a href=\"festivalDetailBands.jsp?festivalID=");
 out.print(festivalID); 
      out.write("&iPageNo=");
      out.print(i);
      out.write("\" style=\"font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F\">");
      out.print(i);
      out.write("</a>\n");

}
}
if(totalPages>totalRecords && i<totalPages){

      out.write("\n");
      out.write("<br />\n");
      out.write("<a href=\"festivalbands.jsp?festivalID=");
 out.print(festivalID); 
      out.write("&iPageNo=");
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
      out.write("</form>\n");
      out.write("</section>\n");
      out.write("<div id=\"footer\">&copy; 2013, all rights reserved PXL/PHL Belgium </div>\n");
      out.write("\n");
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
