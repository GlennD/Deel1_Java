package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <title>Festival App Project</title>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/modernizr-1.7.min.js\"></script><!-- this is the javascript allowing html5 to run in older browsers -->\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\" media=\"screen\" title=\"html5doctor.com Reset Stylesheet\" />\r\n");
      out.write("    \r\n");
      out.write("    <!-- in the CSS3 stylesheet you will find examples of some great new features CSS has to offer -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/css3.css\" media=\"screen\" />\r\n");
      out.write("    \r\n");
      out.write("    <!-- general stylesheet contains some default styles, you do not need this, but it helps you keep a uniform style -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/general.css\" media=\"screen\" />\r\n");
      out.write("    \r\n");
      out.write("    <!-- grid's will help you keep your website appealing to your users, view 52framework.com website for documentation -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/custom.css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->\r\n");
      out.write("    \r\n");
      out.write("    <!--[if IE]> <style> .report_bugs {left:0px;} </style>\t<![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"coin-slider/jquery-1.4.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"coin-slider/coin-slider.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"coin-slider/coin-slider-styles.css\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("      <!-- <a href=\"index.jsp\"><img style=\"width: 100px; position: absolute; top: -50px;\" src=\"images/Home-Button.png\" /></a>\r\n");
      out.write("        <a HREF=\"javascript:javascript:history.go(-1)\"><img style=\"width: 100px; position: absolute; top: 55px; left: 5px; opacity: 0.4;\" src=\"images/back-button.png\" /></a>\r\n");
      out.write("        <a href=\"viewFestivals.jsp\"><img style=\"width: 150px; left: -20px; position: absolute; top: 100px; opacity: 0.5;\" src=\"images/festivallogo.png\" /></a>\r\n");
      out.write("        <a href=\"viewBands.jsp\"><img style=\"width: 100px; position: absolute; top: 210px; opacity: 0.5;\" src=\"images/microphone.png\" /></a>\r\n");
      out.write("        \r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"row\" id=\"styled\">\r\n");
      out.write("    <div class=\"title\" >Welcome to Festify</div>\r\n");
      out.write("    <div class=\"col_6 col\" style=\"margin-left: 10%;\">\r\n");
      out.write("        <button onclick=\"location.href = 'viewFestivals.jsp'\" class=\"mainButton\"><a href=\"viewFestivals.jsp\"><img style=\"position: absolute; left: -180px; top: -67px; width: 400px; opacity: 0.3; \"  src=\"images/festivallogo.png\" alt=\"sliderphoto\"/><h1 class=\"fontface\" style=\"background: none;\">Festivals</h1></a></button>\r\n");
      out.write("    </div><!-- col_8 -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col_6 col\" style=\"float: right; margin-right: 10%;\">\r\n");
      out.write("        <button style=\"float: right;\" onclick=\"location.href = 'viewBands.jsp'\" class=\"mainButton\"><a href=\"viewBands.jsp\"><img style=\"position: absolute; left: 35px; top: -0px; width: 200px; opacity: 0.3;\"  src=\"images/microphone.png\" alt=\"sliderPhoto\"/><h1 style=\"background: none;\" class=\"fontface\">Artists</h1></a></button>\r\n");
      out.write("    </div><!-- col_8 -->\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section class=\"row\" id=\"styled\" style=\"margin-top: 0em;\">\r\n");
      out.write("    <div class=\"col_16 col\">\r\n");
      out.write("       <span class=\"rotateTitle\"><h1 style=\"background-color: white; padding: 2px 25px 2px 5px;\">Upcoming festivals</h1></span>\r\n");
      out.write("    </div><!-- col_8 -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section><!-- row -->\r\n");
      out.write("\r\n");
      out.write("<section class=\"row\" id=\"styled\" style=\"margin-top: -3em;\">\r\n");
      out.write("<div id='coin-slider' style=\"margin: auto;\">\r\n");
      out.write("\t<a href=\"img01_url\" target=\"_blank\">\r\n");
      out.write("\t\t<img src='images/rockwerchterslider.jpg' alt=\"rockwerchter\" />\r\n");
      out.write("\t\t<span>\r\n");
      out.write("\t\t\tRock Werchter 2013 - 4, 5, 6 and 7th of July \r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"imgN_url\">\r\n");
      out.write("\t\t<img src='images/pukkelpop2013_2.PNG' alt=\"Pukkelpop\" />\r\n");
      out.write("\t\t<span>\r\n");
      out.write("\t\t\tPukkelpop 2013 - 15, 17 and 17th and August\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("    \r\n");
      out.write("        <a href=\"imgN_url\">\r\n");
      out.write("\t\t<img src='images/Tomorrowland-2013-banner.png' alt=\"Tomorrowland\" />\r\n");
      out.write("\t\t<span>\r\n");
      out.write("\t\t\tTomorrowland 2013 - 26, 27 and 28th of July\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("    \r\n");
      out.write("    <a href=\"imgN_url\">\r\n");
      out.write("\t\t<img src='images/graspop2013.jpg' alt=\"Graspop\" />\r\n");
      out.write("\t\t<span>\r\n");
      out.write("\t\t\tGraspop 2013 - 28, 29 and 30th of June \r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">&copy; 2013, all rights reserved PXL/PHL Belgium </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#coin-slider').coinslider({ width: 800, height: 200, navigation: true, delay: 5000 });\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("<!-- voor alle opties die bij slider horen kijk http://workshop.rs/2010/04/coin-slider-image-slider-with-unique-effects/ -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
