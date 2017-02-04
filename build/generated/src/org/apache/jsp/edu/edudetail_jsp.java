package org.apache.jsp.edu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;

public final class edudetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


Connection con;
Statement stat;
ResultSet rs;
ResultSetMetaData md;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/edu/../connection.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

//MS Access or SQL Serve
//MySql
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pachore", "root", "");


stat=con.createStatement();

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/style.css\" />\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"../style.css\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header-container\">\n");
      out.write("<div class=\"header\">\n");
      out.write("<h1 id=\"heading\">Progress Scroll Bar Example</h1>\n");
      out.write("</div>\n");
      out.write("<div class=\"scroll-progress-container\">\n");
      out.write("<div class=\"scroll-progress\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<p class=\"filler-text\">\n");
      out.write("The Lady of the Lake, her arm clad in the purest shimmering samite, held aloft Excalibur from the bosom of the water...\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("    ");

        
    class School{
    
        int id;
        String name;
        String des1;
        String des2;
        String img1;
        String img2;
        String mob1;
        String mob2;
        String loc;
        int star;
        School(int id,String name,String des1, String des2, String img1,String img2,String mob1,String mob2,String loc,int star){
            this.id=id;
            this.name=name;
            this.des1=des1;
            this.des2=des2;
            this.img1=img1;
            this.loc=loc;
            this.star= star;
            this.img2= img2;
            this.mob1=mob1;
            this.mob2=mob2;
           
        }
      }
        ArrayList<School> schoolList =new ArrayList<School>();
        
      rs=stat.executeQuery("select * from edu ");
    while(rs.next())
    {  int ide =rs.getInt("id");
       String name= rs.getString("name");
       
        
        String des1=rs.getString("des1");
        String des2= rs.getString("des2");
        String img1=rs.getString("imgurl1");
        String img2=rs.getString("imgurl2");
        String mob1=rs.getString("mob1");
        String mob2=rs.getString("mob2");
        String loc= rs.getString("loc");
        int star=rs.getInt("star");
       School school1= new School(ide,name,des1,des2,img1,img2,mob1,mob2,loc,star);
       schoolList.add(school1);
       
       
    }
             
    for(int i =0;i<schoolList.size();i++){

      School obj=schoolList.get(i);
  
    
    
      out.write("\n");
      out.write("    <div class=\"pageheader\">\n");
      out.write("                        <div class=\"headercontent\">\n");
      out.write("                            <div class=\"section-container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-2 visible-sm\"></div>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <div class=\"biothumb\">\n");
      out.write("                                            <img alt=\"image\" src=\"img/");
 out.println(obj.img1);
      out.write("\"  class=\"img-responsive\" height=\"500px\" weidth= 100% >\n");
      out.write("                                            <div class=\"overlay\">\n");
      out.write("                                                <h1 class=\"\">");
 out.println(obj.name +"" +obj.id );  
      out.write("</h1>\n");
      out.write("                                                <ul class=\"list-unstyled\">\n");
      out.write("                                                    <li><");
 out.println(obj.loc);
      out.write("></li>\n");
      out.write("                                                  \n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix visible-sm visible-xs\"></div>\n");
      out.write("                                    <div class=\"col-sm-12 col-md-7\">\n");
      out.write("                                        <h3 class=\"style1\">About</h3>\n");
      out.write("                                        <hr></hr>\n");
      out.write("                                        <p class=\"style2\">");
 out.println(" "+ obj.des1); 
      out.write("</p>\n");
      out.write("                                         <p class=\"style2\"> ");
 out.println("        "+ obj.des2); 
      out.write("   </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div  class=\"cont_star\" >\n");
      out.write("                                    \n");
      out.write("                                    <section class=\"post_footer\">\n");
      out.write("                                       \n");
      out.write("                               <div id=\"container\">\n");
      out.write("                                   <div id=\"left\"><a  href=\" \" style=\"text-decoration:none;\" > ");
 out.println(" "+ obj.mob1); 
      out.write("</a></div>\n");
      out.write("                                 <div id=\"middle\"><a href=\"\" style=\"text-decoration:none;\" >");
 out.println(" "+ obj.mob2); 
      out.write("</a>  </div>\n");
      out.write("                                 <div id=\"right\" ><a href=\"\" style=\"text-decoration:none;\" >");
 out.println(" "+ obj.star); 
      out.write("</a></div>\n");
      out.write("                                </div>\n");
      out.write("                                    </section>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("     <hr class=\"clear\" height=\"10px\"></hr>                           \n");
      out.write("                    \n");
      out.write("     ");
 } 
      out.write("\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("    \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write(" <script>\n");
      out.write("    \n");
      out.write("     var name2=\"");
 out.println(schoolList.get(2).name); 
      out.write("\";\n");
      out.write("      $(document).ready(function() {\n");
      out.write("      var docHeight = $(document).height(),\n");
      out.write("      windowHeight = $(window).height(),\n");
      out.write("      scrollPercent;\n");
      out.write("\n");
      out.write("      $(window).scroll(function() {\n");
      out.write("        scrollPercent = $(window).scrollTop() / (docHeight - windowHeight) * 100;\n");
      out.write("\n");
      out.write("        $('.scroll-progress').width(scrollPercent + '%');\n");
      out.write("         var s=");
 int l;l=schoolList.size(); out.println(l); 
      out.write(";\n");
      out.write("           var l = (s*scrollPercent)/100 +1;\n");
      out.write("  \n");
      out.write("          document.getElementById(\"heading\").innerHTML=\"\" +l;\n");
      out.write("     \n");
      out.write("    \n");
      out.write("    });\n");
      out.write("       \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    });\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("     \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
