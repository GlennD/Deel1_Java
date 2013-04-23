package org.apache.jsp.festivaldetails;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class festivalDetailCamping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Festival campings</title>\n");
      out.write("         <script src=\"js/modernizr-1.7.min.js\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/reset.css\" media=\"screen\" title=\"html5doctor.com Reset Stylesheet\" />\n");
      out.write("    \n");
      out.write("    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/css3.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/general.css\" media=\"screen\" />\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/buttons/demo_buttons.css\" media=\"screen\" />\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/buttons/style3_button.css\" media=\"screen\" />\n");
      out.write("        \n");
      out.write("    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/grid.css\" media=\"screen\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/custom.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->\n");
      out.write("    \n");
      out.write("    <!--[if IE]> <style> .report_bugs {left:0px;} </style>\t<![endif]-->\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"../coin-slider/jquery-1.4.2.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"./coin-slider/coin-slider.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../ coin-slider/coin-slider-styles.css\" type=\"text/css\" />\n");
      out.write("     <style type=\"text/css\">\n");
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
      out.write("                \n");
      out.write("                .tooltip {\n");
      out.write("\tdisplay:none;\n");
      out.write("\tposition:absolute;\n");
      out.write("\tborder:1px solid #333;\n");
      out.write("\tbackground-color:#161616;\n");
      out.write("\tborder-radius:5px;\n");
      out.write("\tpadding:10px;\n");
      out.write("\tcolor:#fff;\n");
      out.write("\tfont-size:12px Arial;\n");
      out.write("        height: auto;\n");
      out.write("        width: 250px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("                <a href=\"../index.jsp\"><img style=\"width: 100px; position: absolute; \" src=\"../images/Home-Button.png\" /></a>\n");
      out.write("        <a HREF=\"javascript:javascript:history.go(-1)\"><img style=\"width: 100px; position: absolute; top: 105px; left: 5px; opacity: 0.4;\" src=\"../images/back-button.png\" /></a>\n");
      out.write("        <a href=\"../viewFestivals.jsp\"><img style=\"width: 150px; left: -20px; position: absolute; top: 150px; opacity: 0.5;\" src=\"../images/festivallogo.png\" /></a>\n");
      out.write("        <a href=\"../viewBands.jsp\"><img style=\"width: 100px; position: absolute; top: 260px; opacity: 0.5;\" src=\"../images/microphone.png\" /></a>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function() {\n");
      out.write("        // Tooltip only Text\n");
      out.write("        $('.masterTooltip').hover(function(){\n");
      out.write("                // Hover over code\n");
      out.write("                var title = $(this).attr('title');\n");
      out.write("                $(this).data('tipText', title).removeAttr('title');\n");
      out.write("                $('<p class=\"tooltip\"></p>')\n");
      out.write("                .text(title)\n");
      out.write("                .appendTo('body')\n");
      out.write("                .fadeIn('slow');\n");
      out.write("        }, function() {\n");
      out.write("                // Hover out code\n");
      out.write("                $(this).attr('title', $(this).data('tipText'));\n");
      out.write("                $('.tooltip').remove();\n");
      out.write("        }).mousemove(function(e) {\n");
      out.write("                var mousex = e.pageX + 20; //Get X coordinates\n");
      out.write("                var mousey = e.pageY + 10; //Get Y coordinates\n");
      out.write("                $('.tooltip')\n");
      out.write("                .css({ top: mousey, left: mousex })\n");
      out.write("        });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
 String festivalID =  request.getParameter("festivalID"); 
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/groep11_festivals","root", "");
ResultSet rs1 = null;

PreparedStatement ps1=null;
String query1="SELECT SQL_CALC_FOUND_ROWS c.* from campings c, campingsperfestival cp "
        + " where c.camp_id = cp.camp_id and cp.fest_id = "+ festivalID ;

ResultSet resultFestival = null;
PreparedStatement statementFestival = null;
String queryFestival = "Select SQL_CALC_FOUND_ROWS fest_naam from festivals where fest_id = " + festivalID;
statementFestival = conn.prepareStatement(queryFestival);
resultFestival = statementFestival.executeQuery();
String festivalNaam = "";
if(resultFestival.next()){
   festivalNaam = resultFestival.getString("fest_naam");
}


ps1=conn.prepareStatement(query1);
rs1=ps1.executeQuery();

Array[] campings;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"row\" id=\"grid\">\n");
      out.write("        <h1>");
 out.print(festivalNaam); 
      out.write(" - Campings</h1><br />\n");
      out.write("         \n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div id=\"container_buttons\" style=\"position: absolute; top: 80px;\">\n");
      out.write("    <p style=\"float:left; margin-bottom: 10px;\">\n");
      out.write("    <a class=\"a_demo_three\" href=\"festivalDetailHome.jsp?festivalID=");
 out.print(festivalID); 
      out.write("\">\n");
      out.write("    Home\n");
      out.write("    </a>\n");
      out.write("    </p>\n");
      out.write("    <br />\n");
      out.write("    <p style=\"float:left; margin-bottom: 10px;\">\n");
      out.write("    <a class=\"a_demo_three\"  href=\"festivalDetailBands.jsp?festivalID=");
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
      out.write("    <a class=\"a_demo_three actief\" href=\"festivalDetailCamping.jsp?festivalID=");
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
      out.write("    </section><section class=\"row\" id=\"grid\">\n");
      out.write("    ");

while(rs1.next()){
    
      out.write("\n");
      out.write("     <div class=\"row\">\n");
      out.write("            <div class=\"col col_13 container_buttons borderBottomTop\" style=\"margin-left: 200px;\">\n");
      out.write("                <table class=\"festivalInfo\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\">\n");
      out.write("                            Location:\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"festivalInfoSub\">\n");
      out.write("                             ");
      out.print(rs1.getString("camp_adres"));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\">\n");
      out.write("                            Capacity:\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"festivalInfoSub\">\n");
      out.write("                             ");
      out.print(rs1.getString("camp_cap"));
      out.write(" persons\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"festivalInfoTitle\">\n");
      out.write("                            Facilities\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                        ");

                ResultSet rs3 = null;
                PreparedStatement st3 = null;
                String query3 = "Select SQL_CALC_FOUND_ROWS f.* from faciliteiten f, facpercamp fp where fp.fac_id = f.fac_id and fp.camp_id = " + rs1.getString("camp_id");
               
                
                st3 = conn.prepareStatement(query3);
                rs3 = st3.executeQuery();

                while(rs3.next()){
                   int facid = rs3.getInt("fac_id");
                   
                   switch(facid){
                       case 1: out.print("<div id='facility1' class='masterTooltip' title='" + rs3.getString("fac_omschr") +  "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/charge.png' /></div>");
                           break;
                       case 2: out.print("<div id='facility2' class='masterTooltip' title='" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/drinking_water.png' /></div>");
                           break;
                       case 3: out.print("<div id='facility3' class='masterTooltip' title= '" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/Black-Tap-Water-128.png' /></div>"); 
                           break;
                       case 4: out.print("<div id='facility4' class='masterTooltip' title= '" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/shower.png' /></div>");
                           break;
                       case 5: out.print("<div id='facility5' class='masterTooltip' title='" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/ehbo.png' /></div>");
                           break;
                       case 6: out.print("<div id='facility6' class='masterTooltip' title='" + rs3.getString("fac_omschr") + "' style='float: left; margin-left: 20px;'><img style='width: 40px;' src='../images/Fast-Food-256.png' /></div>");
                           break;
                       
                     }
                }

                        
      out.write("\n");
      out.write("                        \n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    ");

}




      out.write("\n");
      out.write("       \n");
      out.write("    </section>\n");
      out.write("    <div id=\"footer\">&copy; 2013, all rights reserved PXL/PHL Belgium </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
