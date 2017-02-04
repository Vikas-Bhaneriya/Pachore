package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("  window.fbAsyncInit = function() {\n");
      out.write("    FB.init({\n");
      out.write("      appId      : '1877973365817870',\n");
      out.write("      xfbml      : true,\n");
      out.write("      version    : 'v2.8'\n");
      out.write("    });\n");
      out.write("    FB.AppEvents.logPageView();\n");
      out.write("  };\n");
      out.write("\n");
      out.write("\n");
      out.write("FB.getLoginStatus(function(response) {\n");
      out.write("    if(response.status === 'connected'){\n");
      out.write("       document.getElementById('status').innerHTMl=\"we are commected\";\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    else if (response.status === 'not_authorized')\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("       document.getElementById('status').innerHTMl=\" you are not logged in\";\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    else{\n");
      out.write("         document.getElementById('status').innerHTMl=\" you are not logged in\";\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    statusChangeCallback(response);\n");
      out.write("    \n");
      out.write("    \n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  (function(d, s, id){\n");
      out.write("     var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("     if (d.getElementById(id)) {return;}\n");
      out.write("     js = d.createElement(s); js.id = id;\n");
      out.write("     js.src = \"//connect.facebook.net/en_US/sdk.js\";\n");
      out.write("     fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("   }(document, 'script', 'facebook-jssdk'));\n");
      out.write("   \n");
      out.write("   function login(){\n");
      out.write("       FB.login(fuction(response))\n");
      out.write("       {\n");
      out.write("           \n");
      out.write("           \n");
      out.write("             if(response.status === 'connected'){\n");
      out.write("       document.getElementById('status').innerHTMl=\"we are commected\";\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    else if (response.status === 'not_authorized')\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("       document.getElementById('status').innerHTMl=\" you are not logged in\";\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    else{\n");
      out.write("         document.getElementById('status').innerHTMl=\" you are not logged in\";\n");
      out.write("      \n");
      out.write("        }\n");
      out.write("          \n");
      out.write("        }   \n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"status\">  </div>\n");
      out.write("\n");
      out.write("<button onclick=\"login()\">Login</button>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body></htnl.");
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
