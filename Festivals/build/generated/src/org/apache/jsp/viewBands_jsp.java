package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewBands_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Selecteer een band</title>\n");
      out.write("\n");
      out.write("        <script src=\"js/modernizr-1.7.min.js\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\" media=\"screen\" title=\"html5doctor.com Reset Stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/css3.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("        <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/general.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("        <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->\n");
      out.write("\n");
      out.write("        <!--[if IE]> <style> .report_bugs {left:0px;} </style>\t<![endif]-->\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"coin-slider/jquery-1.4.2.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"coin-slider/coin-slider.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"coin-slider/coin-slider-styles.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/custom.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <a href=\"index.jsp\"><img style=\"width: 100px; position: absolute; top: -50px;\" src=\"images/Home-Button.png\" /></a>\n");
      out.write("        <a HREF=\"javascript:javascript:history.go(-1)\"><img style=\"width: 100px; position: absolute; top: 55px; left: 5px; opacity: 0.4;\" src=\"images/back-button.png\" /></a>\n");
      out.write("        <a href=\"viewFestivals.jsp\"><img style=\"width: 150px; left: -20px; position: absolute; top: 100px; opacity: 0.5;\" src=\"images/festivallogo.png\" /></a>\n");
      out.write("        <a href=\"viewBands.jsp\"><img style=\"width: 100px; position: absolute; top: 210px; opacity: 0.5;\" src=\"images/microphone.png\" /></a>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"row\" id=\"styled\" style=\"margin-top: 4em; \">\n");
      out.write("            <div style=\"position: absolute; z-index: 30;\"> <span class=\"rotateTitle\"><h1 style=\"font-family: Rockwell extra bold; position: absolute; background-color: white; left: 50px;  width: 410px; top: 50px; -webkit-transform: rotate(-20deg); \">Select an artist</h1></span>\n");
      out.write("            </div>\n");
      out.write("            <div id='coin-slider' style=\"margin: auto; opacity: 0.8; position: absolute;\">\n");
      out.write("                <a href=\"\" target=\"_blank\">\n");
      out.write("                    <img src='images/artists/NIN_edit.png' >\n");
      out.write("                    <span>\n");
      out.write("                        Nine Inch Nails\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <img src='images/artists/neil_young_edit.png' >\n");
      out.write("                    <span>\n");
      out.write("                        Neil Young\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <img src='images/artists/the_prodigy_edit.png' >\n");
      out.write("                    <span>\n");
      out.write("                        The prodigy\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                int count = 0;
                while (rs1.next()) {
            
      out.write("\n");
      out.write("            <section class=\"row\" id=\"styled\" style=\"margin-top: 4em;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"banddetails/banddetail.jsp?bandID=");
      out.print( rs1.getInt("band_id"));
      out.write("\" style=\"text-decoration: none; color:black;\">\n");
      out.write("                    ");
  if (count % 2 == 0) {

                    
      out.write("\n");
      out.write("                    <div class=\"col_13 col\" style=\"margin-left: 10%;border-top: 7px dashed #fff; border-bottom: 7px dashed #efefef;  border-radius: 20px;\">\n");
      out.write("                        <table class=\"oneFestival\" >\n");
      out.write("                            ");
            } else {
                            
      out.write("\n");
      out.write("                            <div class=\"col_13 col\" style=\"border-top: 7px dashed #cfcfcf; border-bottom: 7px dashed #bfbfbf; border-radius: 20px;\">\n");
      out.write("                                <table class=\"oneFestival\">\n");
      out.write("                                    ");
                }
                                    
      out.write("\n");
      out.write("                                    <tr style=\"border: 0px solid black; \"><th colspan=\"2\" style=\"text-align: left; padding: 10px 50px 0px 10px;\"><h1 style=\"font-family: algerian; \">");
      out.print(rs1.getString("band_naam"));
      out.write("</h1> </th></tr>\n");
      out.write("                                    <tr style=\"border: 0px solid black;\"><td style=\"width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;\"><h3 style=\"font-family: david ;\">Music-style:   </h3></td><td>");
      out.print(rs1.getString("band_soortMuziek"));
      out.write("</td></tr>\n");
      out.write("                                    <tr style=\"border: 0px solid black;\"><td style=\"width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;\"><h3  style=\"font-family: david;\">Gigs </h3></td><td>Link naar optredens</td></tr>\n");
      out.write("                                    <tr style=\"border: 0px solid black;\"><td style=\"width: 300px; padding: 20px 50px 0px 20px;border: 0px solid black;\"><h3  style=\"font-family: david;\">Website: </h3></td><td><a href=\"");
      out.print(rs1.getString("band_url"));
      out.write("\"> ");
      out.print(rs1.getString("band_url"));
      out.write("</a></td></tr>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                </a> \n");
      out.write("\n");
      out.write("                            </div><!-- col_16 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </section><!-- row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                    count++;

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <section class=\"row\" id=\"styled\" style=\"margin-top: 4em; \">\n");
      out.write("                                <div style=\"text-align: center; \">\n");
      out.write("                                    ");

                                        int i = 0;
                                        int cPage = 0;
                                        if (totalRows != 0) {
                                            cPage = ((int) (Math.ceil((double) endResult / (totalRecords * showRows))));
                                            int prePageNo = (cPage * totalRecords) - ((totalRecords - 1) + totalRecords);
                                            if ((cPage * totalRecords) - (totalRecords) > 0) {
                                    
      out.write("\n");
      out.write("                                    <a href=\"viewBands.jsp?iPageNo=");
      out.print(prePageNo);
      out.write("&cPageNo=");
      out.print(prePageNo);
      out.write("\"> << Previous</a>\n");
      out.write("                                    ");

                                        }
                                        for (i = ((cPage * totalRecords) - (totalRecords - 1)); i <= (cPage * totalRecords); i++) {
                    if (i == ((iPageNo / showRows) + 1)) {
      out.write("\n");
      out.write("                                    <a href=\"viewBands.jsp?iPageNo=");
      out.print(i);
      out.write("\" style=\"cursor: pointer;color: red; font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F\"><b>");
      out.print(i);
      out.write("</b></a>\n");
      out.write("                                            ");

                                            } else if (i <= totalPages) {
                                            
      out.write("\n");
      out.write("                                    <a href=\"viewBands.jsp?iPageNo=");
      out.print(i);
      out.write("\" style=\"font-family: algerian; padding: 10px 20px 0px 20px; border-left: 1px solid #898F8F\">");
      out.print(i);
      out.write("</a>\n");
      out.write("                                    ");

                                            }
                                        }
                                        if (totalPages > totalRecords && i < totalPages) {
                                    
      out.write("\n");
      out.write("                                    <br />\n");
      out.write("                                    <a href=\"viewBands.jsp?iPageNo=");
      out.print(i);
      out.write("&cPageNo=");
      out.print(i);
      out.write("\"> >> Next</a>\n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                    <br />\n");
      out.write("                                    <b>Rijen ");
      out.print(startResult);
      out.write('-');
      out.print(endResult);
      out.write(" van ");
      out.print(totalRows);
      out.write(" </b>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </section>\n");
      out.write("                            </form>\n");
      out.write("                            <div id=\"footer\">&copy; 2013, all rights reserved PXL/PHL Belgium </div>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                $(document).ready(function() {\n");
      out.write("                                    $('#coin-slider').coinslider({width: 800, height: 200, navigation: true, delay: 5000, opacity: 0.3});\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("                            </body>\n");
      out.write("                            </html>\n");
      out.write("                            ");

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
