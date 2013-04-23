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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Festival App Project</title>\n");
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
      out.write("    \n");
      out.write("    <!-- the following style is for demonstartion purposes only and is not needed for anything but inspiration -->\n");
      out.write("    \n");
      out.write("    <!--[if IE]> <style> .report_bugs {left:0px;} </style>\t<![endif]-->\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"coin-slider/jquery-1.4.2.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"coin-slider/coin-slider.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"coin-slider/coin-slider-styles.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-color: #cccccc;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .mainButton{\n");
      out.write("            width: 300px; \n");
      out.write("            height: 250px; \n");
      out.write("            border-radius: 7px; \n");
      out.write("            background-color: white; \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .rotateTitle{\n");
      out.write("            \n");
      out.write("            display: inline-block;\n");
      out.write("            -webkit-transform: rotate(340deg);\n");
      out.write("            -moz-transform: rotate(340deg);\n");
      out.write("            -o-transform: rotate(340deg);\n");
      out.write("            writing-mode: lr-tb;\n");
      out.write("            z-index: 999;\n");
      out.write("            padding-top: 5em;\n");
      out.write("            padding-bottom: 5em;\n");
      out.write("            float: left;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- this section shows you most of the styled elements from the general stylesheet -->\n");
      out.write("<section class=\"row\" id=\"styled\">\n");
      out.write("    <div class=\"col_16 col\">\n");
      out.write("    \t<h1 class=\"fontface\"></h1>\n");
      out.write("    </div><!-- col_16 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</section><!-- row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"row\" id=\"styled\" style=\"margin-top: 4em;\">\n");
      out.write("    <div class=\"col_8 col\">\n");
      out.write("        <button class=\"mainButton\"><a href=\"viewFestivals.jsp\"><h1 class=\"fontface\">Festivals</h1></a></button>\n");
      out.write("    </div><!-- col_8 -->\n");
      out.write("    \n");
      out.write("    <div class=\"col_8 col\">\n");
      out.write("        <button class=\"mainButton\"><a href=\"viewBands.jsp\"><h1 class=\"fontface\">Artists</h1></a></button>\n");
      out.write("    </div><!-- col_8 -->\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"row\" id=\"styled\" style=\"margin-top: 0em;\">\n");
      out.write("    <div class=\"col_16 col\">\n");
      out.write("       <span class=\"rotateTitle\"><h3>Upcoming festivals</h3></span>\n");
      out.write("    </div><!-- col_8 -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</section><!-- row -->\n");
      out.write("\n");
      out.write("<div id='coin-slider'>\n");
      out.write("\t<a href=\"img01_url\" target=\"_blank\">\n");
      out.write("\t\t<img src='design/rockwerchterbanner.jpg' >\n");
      out.write("\t\t<span>\n");
      out.write("\t\t\tRock Werchter 2013\n");
      out.write("\t\t</span>\n");
      out.write("\t</a>\n");
      out.write("\t\n");
      out.write("\t<a href=\"imgN_url\">\n");
      out.write("\t\t<img src='design/rockwerchterbanner.jpg' >\n");
      out.write("\t\t<span>\n");
      out.write("\t\t\tPukkelpop 2013\n");
      out.write("\t\t</span>\n");
      out.write("\t</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$('#coin-slider').coinslider({ width: 800, height: 125, navigation: true, delay: 5000 });\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("<!-- voor alle opties die bij slider horen kijk http://workshop.rs/2010/04/coin-slider-image-slider-with-unique-effects/ -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
