package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


Connection con;
Statement stat;
ResultSet rs;
ResultSetMetaData md;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connection.jsp");
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

      out.write('\n');
      out.write('\n');
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
 

   String id="";
   
    if (request.getParameter("id") == null) {
        id = "lihome";
     
    } 
    else {
        id=request.getParameter("id");
        
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\"/>\n");
      out.write("    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("    <title>pachore.com\n");
      out.write("</title>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" id=\"main_css\" href=\"/main_v2.00.css\" />\n");
      out.write("<link rel=\"shortcut icon\" href=\"/cor-layout/content/static/styles/images/favicon.ico\" />\n");
      out.write("<link rel=\"icon\" type=\"image/ico\" href=\"/cor-layout/content/static/styles/images/favicon.ico\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"main_v2.00.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("            <div id='navigation'>\n");
      out.write("\n");
      out.write("                     <div id=\"Header\">\n");
      out.write("                                <div id=\"CitySeal\" onClick=\"window.location='/'\">\n");
      out.write("                                <img src=\"images/cimage.png\" alt=\"Official City of Raleigh Seal\" class=\"logo\"/>\n");
      out.write("                                 <div class=\"raleigh\">Pachore City</div>\n");
      out.write("   \n");
      out.write("                                 </div>  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("  \n");
      out.write("                                 <form method=\"GET\" onsubmit=\"searchSubmit(); return false;\">\n");
      out.write("                                    <div id=\"SearchBox\">\n");
      out.write("                                     <label for=\"SearchInput\">Search</label>\n");
      out.write("                                       <input name=\"q\" maxlength=\"256\" placeholder=\"Search\" id=\"SearchInput\" type=\"text\"/>\n");
      out.write("                                      <button type=\"submit\" class=\"action icon-search\" value=\"Search\"></button>\n");
      out.write("                                <div>\n");
      out.write("                                      <fb:login-button  data-auto-logout-link=\"true\" data-max-rows=\"1\" data-show-faces=\"true\"    scope=\"public_profile,email\" background-color=\"black\" data-show-faces=\"true\"   onlogin=\"checkLoginState();\"</fb:login-button> \n");
      out.write("                                 </div>\n");
      out.write("                    \n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                         \n");
      out.write("                          \n");
      out.write("                         \n");
      out.write("                       </div>\n");
      out.write("                  <div id=\"Nav\" >\n");
      out.write("                <ul>\n");
      out.write("                     <li id=\"lihome\" class=\"current\"><a href=\"index.jsp?id=lihome\"><span class=\"homeicon\">Home</span></a></li>\n");
      out.write("                     \n");
      out.write("                 \n");
      out.write("                     <li ><a id=\"liedu\"  href=\"index.jsp?id=liedu\"  >Education</a></li>\n");
      out.write("                               \n");
      out.write("                       <li ><a id=\"lisns\" href=\"index.jsp?id=lisns\" onclick=\"mytopicjs(this.id);\">Shops & Services</a> </li>\n");
      out.write("                     <li ><a id=\"lihns\" href=\"index.jsp?id=lihnp\" onclick=\"mytopicjs(this.id);\" > Hotel & Parks</a></li>\n");
      out.write("                     <li>  <a id=\"lihealth\"  href=\"index.jsp?id=lihealth\" onclick=\"mytopicjs(this.id);\" > Health</a></li>\n");
      out.write("                     <li><a id=\"lirel\" href=\"index.jsp?id=lirel\" onclick=\"mytopicjs(this.id);\" >Religion</a> </li>\n");
      out.write("                     <li> <a id=\"lidev\" href=\"index.jsp?id=lidev\" onclick=\"mytopicjs(this.id);\" >Development;</a></li>\n");
      out.write("                      <li ><a id=\"ligov\" href=\"index.jsp?id=ligov\" onclick=\"mytopicjs(this.id);\" >Government</a> </li>\n");
      out.write("                     \n");
      out.write("              \n");
      out.write("                 \n");
      out.write("                     </ul>\n");
      out.write("                     </div>\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("         <div id=\"contentArea\">\n");
      out.write("\n");
      out.write("        <div id=\"col1\">\n");
      out.write("                    <div id='left'>\n");
      out.write("<!-- from DivWindowRenderer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("    <!--\\switch to inflate specific Topic -->\n");
      out.write("\n");
      out.write("       \n");
      out.write("                      ");

                       switch(id){
                           
                            case "lihome":
                      {
                       
      out.write("\n");
      out.write("                     <DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Home</H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                       <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-location\">Maps</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                    <LI>\n");
      out.write("                                    <A href=\"/directory\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);\">\n");
      out.write("                                    <SPAN class=\"icon-user\">Directory</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                    <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/Calendar.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);\">\n");
      out.write("                                       <SPAN class=\"icon-calendar\">Calendar</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                     <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-shop\">Subscriptions</SPAN></A>\n");
      out.write("                                     </LI>   \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                      <DIV class=\"leftnav\">\n");
      out.write("                     <H3>Pay</H3>\n");
      out.write("                    <UL>\n");
      out.write("                        <LI>\n");
      out.write("                        <A href=\"/services/content/FinUtilityBilling/Articles/UtilityPayments.html\" onclick=\"\">Utility Bill</A>\n");
      out.write("                         </LI>\n");
      out.write("                       <LI>\n");
      out.write("                         <A href=\"/services/content/PWksParkingMgmt/Articles/PayingAParkingCitation.html\" onclick=\" \">Parking Citations</A>\n");
      out.write("                       </LI>\n");
      out.write("                       <LI>\n");
      out.write("                      <A href=\"/services/content/PWksTrafficEng/Articles/SafeLightPayments.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/PWksTrafficEng/Articles/SafeLightPayments.html']);\">Safelight Citations</A>\n");
      out.write("                </LI>\n");
      out.write("                </UL>\n");
      out.write("                <H3>Find</H3>\n");
      out.write("                <UL>\n");
      out.write("                 <LI>\n");
      out.write("                <A href=\"/jobs\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/jobs']);\">Jobs</A>\n");
      out.write("                </LI>\n");
      out.write("                <LI>\n");
      out.write("                <A href=\"/services/content/PWksTransit/Articles/BusRoutes.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/PWksTransit/Articles/BusRoutes.html']);\">Bus Routes</A>\n");
      out.write("                </LI>\n");
      out.write("                <LI>\n");
      out.write("                    <A href=\"/parks/content/ParksRec/Articles/ParksFacilities.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/parks/content/ParksRec/Articles/ParksFacilities.html']);\">Parks</A>\n");
      out.write("                    </LI>\n");
      out.write("                        <LI>\n");
      out.write("                    <A href=\"/home/content/ITechWebServices/Articles/FindMyService.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/content/ITechWebServices/Articles/FindMyService.html']);\">My Service Day</A>\n");
      out.write("                    </LI>\n");
      out.write("                    </UL>\n");
      out.write("                    <H3>Report</H3>\n");
      out.write("                    <UL>\n");
      out.write("                    <LI>\n");
      out.write("                    <A href=\"/safety/content/Police/Articles/OnlineCrimeReporting.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/safety/content/Police/Articles/OnlineCrimeReporting.html']);\">Crimes Online</A>\n");
      out.write("                     </LI>\n");
      out.write("                    <LI>\n");
      out.write("                    <A href=\"/home/content/SolidWaste/Contacts/SWSCustomerSupport.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/content/SolidWaste/Contacts/SWSCustomerSupport.html']);\">Missed Garbage/Recycling Collection</A>\n");
      out.write("                    </LI>\n");
      out.write("                <LI>\n");
      out.write("                <A href=\"/ext/SeeClickFix\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/ext/SeeClickFix']);\">Citizen Service Request (SeeClickFix)</A>\n");
      out.write("                </LI>\n");
      out.write("                 </UL>\n");
      out.write("                <H3>Manage</H3>\n");
      out.write("                <UL>\n");
      out.write("            <LI>\n");
      out.write("                <A class=\"taskevent\"     href=\"https://reclink.raleighnc.gov/Start/Start.asp\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'https://reclink.raleighnc.gov/Start/Start.asp']);\">RecLink Account</A>\n");
      out.write("            </LI>\n");
      out.write("                    <LI>\n");
      out.write("                    <A href=\"/services/content/FinUtilityBilling/Articles/UtilityBillingServiceRequests.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/FinUtilityBilling/Articles/UtilityBillingServiceRequests.html']);\">Water/Sewer Service</A>\n");
      out.write("                    </LI>\n");
      out.write("                    </UL>\n");
      out.write("                    <H3>Status & Notices</H3>\n");
      out.write("                <UL>\n");
      out.write("                <LI>\n");
      out.write("                <A href=\"/parks/content/CorStatus/Articles/ParksFieldStatus.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/parks/content/CorStatus/Articles/ParksFieldStatus.html']);\">Park Status</A>\n");
      out.write("                  </LI>\n");
      out.write("                    <LI>\n");
      out.write("                        <A href=\"/home/content/CorStatus/Articles/DowntownTrafficAlert.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/content/CorStatus/Articles/DowntownTrafficAlert.html']);\">Street Closings & Road Races</A>\n");
      out.write("                    </LI>\n");
      out.write("                    <LI>\n");
      out.write("                <A href=\"/services/content/CorStatus/Articles/TransitAnnouncements.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/CorStatus/Articles/TransitAnnouncements.html']);\">Bus Service Alerts</A>\n");
      out.write("                </LI>\n");
      out.write("                <LI>\n");
      out.write("                <A href=\"http://www.ncdot.gov/fortifync/\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'http://www.ncdot.gov/fortifync/']);\">40/440 Fortify</A>\n");
      out.write("                    </LI>\n");
      out.write("                <LI>\n");
      out.write("                <A href=\"http://www.ncdot.gov/projects/CapitalBlvdBridges/\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'http://www.ncdot.gov/projects/CapitalBlvdBridges/']);\">Capital Boulevard Bridge Project</A>\n");
      out.write("                </LI>\n");
      out.write("                <LI>\n");
      out.write("                <A href=\"https://hillsboroughst.raleighnc.gov/\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'https://hillsboroughst.raleighnc.gov/']);\">Hillsborough St. Renewal Project</A>\n");
      out.write("                </LI>\n");
      out.write("                    </UL>\n");
      out.write("                </DIV>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                       ");

                      break;
                      }
                      case "liedu":
                      {



                 

             
  
                        
      out.write("\n");
      out.write("                      <DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Schools</H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                           \n");
      out.write("                                 \n");
      out.write("                                         <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                            <SPAN class=\"icon-school\">Schools</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                          <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                            <SPAN class=\"icon-college\"> Colleges</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                          <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                            <SPAN class=\"icon-coaching\"> Coachings</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                          <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                            <SPAN class=\"icon-hometutor\"> Home Tutors</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                         \n");
      out.write("                                        \n");
      out.write("                                  \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV>");

                      break;
                      }
                          
                          case "lihnp":{

                        
      out.write("\n");
      out.write("                      <DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Hotels and Parks </H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                          <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-hotel1\" > TO Stay</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        <LI>\n");
      out.write("                                    <A href=\"/directory\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);\">\n");
      out.write("                                    <SPAN class=\"icon-hotel2\"> Dhabaas</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                    <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/Calendar.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);\">\n");
      out.write("                                       <SPAN class=\"icon-hotel3\"> Restorents</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                                     <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-hotel4\"> Fast Food</A>\n");
      out.write("                                       </LI>   \n");
      out.write("                                       \n");
      out.write("                                      \n");
      out.write("                                       \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV> ");

                         break; 
                          }
                          case "lisns":
                        {
                       
      out.write("\n");
      out.write("                       <DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Shops and Services</H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                       <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-art\"> Art And Craft</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                   \n");
      out.write("                                        \n");
      out.write("                                        <LI>\n");
      out.write("                                    <A href=\"/directory\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);\">\n");
      out.write("                                    <SPAN class=\"icon-generl\"> General store</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                    <LI>\n");
      out.write("                                        \n");
      out.write("                                            <LI>\n");
      out.write("                                    <A href=\"/directory\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);\">\n");
      out.write("                                    <SPAN class=\"icon-snakes\"> Snacks</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                    <LI>\n");
      out.write("                                       \n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/Calendar.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);\">\n");
      out.write("                                       <SPAN class=\"icon-stationary\"> Stationary</SPAN></A>\n");
      out.write("                                     </LI>   \n");
      out.write("                                       <LI>\n");
      out.write("                                       \n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/Calendar.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);\">\n");
      out.write("                                       <SPAN class=\"icon-cyber\"> CyberCafe</SPAN></A>\n");
      out.write("                                     </LI>   \n");
      out.write("                                    \n");
      out.write("                                         <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-mall\"> Mall</SPAN></A>\n");
      out.write("                                     </LI>  \n");
      out.write("                                     \n");
      out.write("                                         <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-optics\"> Optics</SPAN></A>\n");
      out.write("                                     </LI>  \n");
      out.write("                               \n");
      out.write("                                     \n");
      out.write("                                            <LI>\n");
      out.write("                                    <A href=\"/directory\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);\">\n");
      out.write("                                    <SPAN class=\"icon-salon\"> Salon</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                                      <LI>\n");
      out.write("                                    <A href=\"/directory\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);\">\n");
      out.write("                                    <SPAN class=\"icon-stitches\"> Stitches</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                     \n");
      out.write("                                        <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-garments\"> Garments</SPAN></A>\n");
      out.write("                                     </LI>  \n");
      out.write("                                     \n");
      out.write("                                      <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-ele\"> Electronics</SPAN></A>\n");
      out.write("                                     </LI>  \n");
      out.write("                                    \n");
      out.write("                                     <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-hrd\"> Hardwares</SPAN></A>\n");
      out.write("                                     </LI>  \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV>  ");

                           break;

                        }

                     case "lihealth": 
                        {
      out.write("<DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Health</H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                       <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-gym\"> Gym</SPAN></A>\n");
      out.write("                                         </LI>\n");
      out.write("                                       <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-hospital\"> Hospital</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-medi\"> Medicals</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV>\n");
      out.write("                       ");

                           break;
                            }
                      case "lidev":
                       {
      out.write("\n");
      out.write("                      <DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Development</H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                       <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-location\">Maps</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                    <LI>\n");
      out.write("                                    <A href=\"/directory\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);\">\n");
      out.write("                                    <SPAN class=\"icon-user\">Directory</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                    <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/Calendar.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);\">\n");
      out.write("                                       <SPAN class=\"icon-calendar\">Calendar</SPAN></A>\n");
      out.write("                                     </LI>\n");
      out.write("                                     <LI>\n");
      out.write("                                       <A href=\"/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);\">\n");
      out.write("                                      <SPAN class=\"icon-shop\">Subscriptions</SPAN></A>\n");
      out.write("                                     </LI>   \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV> ");

                           break;
                            }
                          case "lirel":
                      
                         {
      out.write("\n");
      out.write("                       <DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Religious Spots</H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                       <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-temple\"> Temple</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                \n");
      out.write("                                          <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-mosque\"> Mosque</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                          <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-church\"> Church</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV> ");

                            break;
                              }
                         case "ligov":{ 
                              
      out.write("\n");
      out.write("                              \n");
      out.write("                              <DIV class=\"box1\" >\n");
      out.write("                                 <H3 class=\"head1\">Government</H3>\n");
      out.write("                  \n");
      out.write("      \n");
      out.write("                                       </DIV>\n");
      out.write("                             <DIV class=\"box icons\">\n");
      out.write("                                       <UL class=\"nolist\">\n");
      out.write("                                       <LI>\n");
      out.write("                                        <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-tahsil\"> Tahsil </SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        <li>\n");
      out.write("                                         <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-powerhouse\"> Powerhouse</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                    \n");
      out.write("                                        <li>\n");
      out.write("                                         <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-postoffice\"> Post Office</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <li>\n");
      out.write("                                         <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-telephone\"> Telephone</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                        <li>\n");
      out.write("                                         <A href=\"/maps\" onclick=\"_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);\">\n");
      out.write("                                          <SPAN class=\"icon-mandi\"> Mandi</SPAN></A>\n");
      out.write("                                        </LI>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                       </UL>\n");
      out.write("                              </DIV>\n");
      out.write("                              \n");
      out.write("                            ");

                                break;}
                                
                         }
                  
                          
      out.write("\n");
      out.write("\n");
      out.write("    <!-- End OF the Switch -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- end DivWindowRenderer -->\n");
      out.write("\n");
      out.write("<!-- from DivWindowRenderer -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("<!-- end DivWindowRenderer -->\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     <div id=\"col2\">\n");
      out.write("            <div id='center'>\n");
      out.write("<!-- from DivWindowRenderer -->\n");
      out.write("                <UL class=\"tasks\">\n");
      out.write("                <LI class=\"close\"><A href=\"/services/content/PWksTransit/Articles/BusRoutes.html\" onclick=\"_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Mobile Tasks', 'Bus']);\"><SPAN class=\"icon-bus\"></SPAN> View Bus Routes & Schedules <SPAN class=\"right arrow\"></SPAN></A>\n");
      out.write("                 </LI><LI class=\"close\"><A href=\"/services/content/FinUtilityBilling/Articles/UtilityPayments.html\" onclick=\"_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Mobile Tasks', 'Utility']);\"><SPAN class=\"icon-pay\"></SPAN> Pay Utility Bill <SPAN class=\"right arrow\"></SPAN></A></LI>\n");
      out.write("                  <LI class=\"close\"><A href=\"/safety/content/Departments/Articles/Police.html\" onclick=\"_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Mobile Tasks', 'Police']);\"><SPAN class=\"icon-shield\"></SPAN> Police Department <SPAN class=\"right arrow\"></SPAN></A></LI>\n");
      out.write("                </UL>\n");
      out.write("\n");
      out.write("\n");
      out.write("              <DIV class=\"box related\">\n");
      out.write("                  \n");
      out.write("                      ");

                       switch(id){
                           
                            case "lihome":
                      {
                       
      out.write("\n");
      out.write("                       <iframe id=\"iframe1\" overflow-x='hidden' src=\"index1.html\" height=\"900\" width= 100% ></iframe>\n");
      out.write("                       ");

                      break;
                      }
                      case "liedu":
                      {
                        
      out.write("\n");
      out.write("                       <iframe id=\"iframe1\" src=\"edu/edudetail.jsp\" scrolling-x=\"no\"  overflow-x='hidden' height=\"900\" width= 100% ></iframe>\n");
      out.write("                       ");

                      
                      }
                          
                          case "lihnp":{

                        
      out.write("\n");
      out.write("                       <iframe id=\"iframe1\" src=\"hnp/hnp.jsp\" height=\"900\" width= 100% ></iframe>\n");
      out.write("                       ");

                         break; 
                          }
                          case "lisns":
                        {
                       
      out.write("\n");
      out.write("                       <iframe id=\"iframe1\" src=\"sns/sns.jsp\" height=\"900\" width= 100% ></iframe>\n");
      out.write("                       ");

                           break;

                        }

                     case "lihealth": 
                        {
      out.write("\n");
      out.write("                       <iframe id=\"iframe1\" src=\"health/health.jsp\" height=\"900\" width= 100% ></iframe>\n");
      out.write("                       ");

                           break;
                            }
                      case "lidev":
                       {
      out.write("\n");
      out.write("                       <iframe id=\"iframe1\" src=\"dev/dev.jsp\" height=\"900\" width= 100% ></iframe>\n");
      out.write("                       ");

                           break;
                            }
                          case "lirel":
                      
                         {
      out.write("\n");
      out.write("                         <iframe id=\"iframe1\" src=\"rel/rel.jsp\" height=\"900\" width= 100% ></iframe>\n");
      out.write("                        ");

                            break;
                            }
                         case "ligov":
                            {
                  
                          
      out.write("\n");
      out.write("                         <iframe id=\"iframe1\" src=\"gov/gov.jsp\" height=\"900\" width= 100% ></iframe>\n");
      out.write("                      ");

                          break;
                          }
                                }
                      
      out.write("\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("           \n");
      out.write("                \n");
      out.write("               </DIV>\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("              <DIV class=\"box related\">\n");
      out.write("                 <iframe src=\"index1.html\" height=\"900\" width= 98% ></iframe>\n");
      out.write("               </DIV>\n");
      out.write("              \n");
      out.write("\n");
      out.write("<!-- tweeter api For use in future\n");
      out.write(" <DIV class=\"box related\">\n");
      out.write("                    <H3>\n");
      out.write("                    <A href=\"https://www.facebook.com/BuySell-at-Nitrr--1648901902029549/\" style=\"color:white; text-decoration:none\">Facebook or Tweeter Page Of the City</A>\n");
      out.write("                    </H3>\n");
      out.write("                    <UL>\n");
      out.write("                    <LI>\n");
      out.write("                    <A class=\"twitter-timeline\" data-chrome=\"noheader nofooter noborders transparent\" data-widget-id=\"704776484540588032\" href=\"https://www.facebook.com/BuySell-at-Nitrr--1648901902029549/\" width=\"98%\">Tweets by RaleighGov</A><SCRIPT>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</SCRIPT>\n");
      out.write("                    </LI>\n");
      out.write("                    </UL>\n");
      out.write("                </DIV>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("-->\n");
      out.write("           </div>\n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("       <div  id=\"col3\">\n");
      out.write("     \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("           \n");
      out.write("           <div class=\"mainarticlelinks \">\n");
      out.write("                               <h2 >News</h2>\n");
      out.write("                                   \n");
      out.write("                                <div class='newsList'>\n");
      out.write("                                    <ul>\n");
      out.write("                                    <li><div class=\"newsAlert\">[Alert]</div><a href=\"/home/news/content/CorNews/Articles/0CityHolidaysNews.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/0CityHolidaysNews.html']);\" >City to Observe Martin Luther King Jr. Holiday on Jan. 16</a> <span class=\"malDate\">(2 days ago)</span></li>\n");
      out.write("                                    <li><a href=\"/home/news/content/CorNews/Articles/ChicosArmy.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);\" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class=\"malDate\">(2 days ago)</span></li>\n");
      out.write("                                    <li><a href=\"/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);\" >Citizen Engagement Task Force</a> <span class=\"malDate\">(3 days ago)</span></li>\n");
      out.write("                                     <li><a href=\"/home/news/content/CorNews/Articles/RaleighPlowing.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/RaleighPlowing.html']);\" >Raleigh Prepared to Treat, Plow Roads</a> <span class=\"malDate\">(January  06, 2017)</span></li>\n");
      out.write("                                        <li><a href=\"/home/news/content/CorNews/Articles/HumanRelationsAwardsNominations.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/HumanRelationsAwardsNominations.html']);\" >2017 Raleigh Human Relations Awards Nominations Now Open!</a> <span class=\"malDate\">(December 16, 2016)</span></li>\n");
      out.write("\t\t\t<li><a href=\"/home/news/content/CorNews/Articles/ChicosArmy.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);\" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class=\"malDate\">(2 days ago)</span></li>\n");
      out.write("                                    <li><a href=\"/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);\" >Citizen Engagement Task Force</a> <span class=\"malDate\">(3 days ago)</span></li>\n");
      out.write("                                     <li>\n");
      out.write("                                         \n");
      out.write("                                         <li><a href=\"/home/news/content/CorNews/Articles/ChicosArmy.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);\" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class=\"malDate\">(2 days ago)</span></li>\n");
      out.write("                                    <li><a href=\"/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);\" >Citizen Engagement Task Force</a> <span class=\"malDate\">(3 days ago)</span></li>\n");
      out.write("                                     <li>\n");
      out.write("                                         <li><a href=\"/home/news/content/CorNews/Articles/ChicosArmy.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);\" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class=\"malDate\">(2 days ago)</span></li>\n");
      out.write("                                    <li><a href=\"/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);\" >Citizen Engagement Task Force</a> <span class=\"malDate\">(3 days ago)</span></li>\n");
      out.write("                                     <li>\n");
      out.write("                                         \n");
      out.write("                                     <li><a href=\"/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);\" >Citizen Engagement Task Force</a> <span class=\"malDate\">(3 days ago)</span></li>\n");
      out.write("                                        <li><a href=\"/home/news/content/CorNews/Articles/RaleighPlowing.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/RaleighPlowing.html']);\" >Raleigh Prepared to Treat, Plow Roads</a> <span class=\"malDate\">(January  06, 2017)</span></li>\n");
      out.write("                                        <li><a href=\"/home/news/content/CorNews/Articles/HumanRelationsAwardsNominations.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/HumanRelationsAwardsNominations.html']);\" >2017 Raleigh Human Relations Awards Nominations Now Open!</a> <span class=\"malDate\">(December 16, 2016)</span></li>\n");
      out.write("\t\t\t\n");
      out.write("                \n");
      out.write("                                     </ul>\n");
      out.write("                                         <a href=\"/home/news/AllNewsEvents\" class=\"more\">View all</a>\n");
      out.write("        \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"maineventslinks\">\n");
      out.write("                                        <h2>Events</h2>\n");
      out.write("                                        <div class=\"mainRss\">\n");
      out.write("                                            <h2><a class=\"icon-feed\" href=\"/content/CorNews/Articles/RaleighNewsRSS_home.xml\" onclick=\"event.preventDefault(); url = this.href; _gaq.push(['_trackEvent', 'Events', 'RSS', '/home/news/content/CorNews/Articles/RaleighNewsRSS_home', 1]); setTimeout(function(){window.location = url;}, 150);\">\n");
      out.write("                                            <span class=\"ally\">RSS</span></a></h2>\t</div>\n");
      out.write("                                                <div class='eventsList'>\n");
      out.write("                                             <ul>\n");
      out.write("                                                 <li>\n");
      out.write("                                                    <div class=\"eventDate\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"eventMonth\">Jan</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"eventDay\">16</div>\n");
      out.write("                                                     </div>\n");
      out.write("                                                    <div class=\"eventTitle\"><a href=\"/home/news/content/CorNews/Articles/0CityHolidays.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','Events', 'Home','/content/CorNews/Articles/0CityHolidays.html']);\" >City Holiday</a></div>\n");
      out.write("                                                    <div class=\"message\">Martin Luther King Jr.</div>\n");
      out.write("                                                 </li>\n");
      out.write("                                               <li>\n");
      out.write("                                                    <div class=\"eventDate\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"eventMonth\">Jan</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"eventDay\">17</div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"eventTitle\"><a href=\"/home/news/content/CorNews/Articles/CityCouncilSchedule.html\" onclick=\"_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','Events', 'Home','/content/CorNews/Articles/CityCouncilSchedule.html']);\" >City Council Meeting</a></div>\n");
      out.write("                                                    <div class=\"message\">Work Session</div>\n");
      out.write("                                                        <div class=\"eventTimes\">11:30 am</div>\n");
      out.write("                                                      </li>\n");
      out.write("                                              </ul>\n");
      out.write("                                                <a href=\"/home/news/AllNewsEvents\" class=\"more\">View all</a>\t</div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("      </div>\n");
      out.write("   <!--end of the contane pages-!>\n");
      out.write("       \n");
      out.write("<!--/PAGEWATCH start-->\n");
      out.write("            \n");
      out.write("                <div class=\"box accolades\"><h3>Pachore City</h3><h2>Write the Tag Of City Here</h2>\n");
      out.write("                                <a href=\"/government/content/PubAffairs/Articles/AccoladesRaleigh.html\">View our accolades >></a>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              <div id='Footer'>   \n");
      out.write("                        <!-- from DivWindowRenderer -->\n");
      out.write("                        <DIV class=\"fixedwidth\">\n");
      out.write("                                    <UL class=\"left fourth\">\n");
      out.write("                                      <LI><IMG alt=\"Pachore The cirt Of Tomorrow\" class=\"logo\" src=\"/images/cimage.png\"></LI>\n");
      out.write("                                    </UL>\n");
      out.write("                                    <UL class=\"left fourth\">\n");
      out.write("                                        <LI><H3>Stay Connected</H3></LI>\n");
      out.write("                                         <LI class=\"socialmedia\">\n");
      out.write("                                             <A class=\"icon-facebook\" href=\"http://www.facebook.com/BuySell-at-Nitrr--1648901902029549\" onclick=\"_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Social Icons', 'Facebook']);\"><SPAN class=\"ally\">Facebook</SPAN></A> \n");
      out.write("                                             <A class=\"icon-twitter\" href=\"http://twitter.com/RaleighGov\" onclick=\"_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Social Icons', 'Twitter']);\"><SPAN class=\"ally\">Twitter</SPAN></A> \n");
      out.write("                                             <A class=\"icon-youtube\" href=\"http://youtube.com/cityofraleigh\" onclick=\"_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Social Icons', 'Youtube']);\"><SPAN class=\"ally\">YouTube</SPAN></A> \n");
      out.write("                                             <A class=\"icon-flickr\" href=\"http://www.flickr.com/photos/raleighgov/\" onclick=\"_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Social Icons', 'Flickr']);\"><SPAN class=\"ally\">Flickr</SPAN></A>\n");
      out.write("                                           <BR>\n");
      out.write("                                            <A href=\"/home/content/PubAffairs/Articles/SocialMedia.html\">View all social media sites</A>\n");
      out.write("                                            </LI>\n");
      out.write("                                    </UL>\n");
      out.write("                                     <UL class=\"left fourth\">\n");
      out.write("                                                <LI><H3>Physical Address</H3></LI>\n");
      out.write("                                                 <LI>222 W. Hargett St. <BR>Raleigh, NC 27601</LI>\n");
      out.write("                                      </UL>\n");
      out.write("                                     <UL class=\"left fourth\">\n");
      out.write("                                        <LI><H3>Mailing Address</H3></LI>\n");
      out.write("                                        <LI>P.O. Box 590 <BR>Raleigh, NC 27602</LI>\n");
      out.write("                                      </UL>\n");
      out.write("                                    <UL class=\"legal\">\n");
      out.write("                                            <LI><A href=\"/home/content/ITechWebServices/Articles/WebPrivacyPolicy.html\">Privacy Policy</A></LI>\n");
      out.write("                                            <LI><A href=\"/home/content/ITechWebServices/Articles/WebLegalNotices.html\">Legal Notices</A></LI>\n");
      out.write("                                             <LI><A href=\"https://www.municode.com/library/nc/raleigh/codes/code_of_ordinances?nodeId=DIVIICOGEOR_PT4COSE_CH1THDECOSE_ARTAGEPR_S4-1004PONO\">Non-discrimination policy</A></LI>\n");
      out.write("                                              <LI><A href=\"/home/content/ITechWebServices/Articles/SiteInformation.html\">Site Info</A></LI>\n");
      out.write("                                             <LI><A href=\"/home/content/ITechWebServices/Articles/CityDepartments.html\">Contact Us</A></LI>\n");
      out.write("                                              <LI><A href=\"http://www.govtech.com/cdg/digital-government-achievement/Best-of-the-Web--Digital-Government-Achievement-Awards-2014---Winners-Announced.html\"><IMG alt=\"Best of Web\" class=\"bow\" src=\"/content/static/images/BOW.jpg\"></A></LI>\n");
      out.write("                                                <LI><A href=\"http://www.digitalcommunities.com/survey/cities/?year=2014\"><IMG alt=\"Digital City Survey Winner\" class=\"bow\" src=\"/content/static/images/DCW.jpg\"></A></LI>\n");
      out.write("                                     </UL>\n");
      out.write("                            </DIV>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <p class=\"copyright\">Copyright &copy; 2017 |Pachore.com | All Rights Reserved | <a href=\"javascript:cortextonly();\" id=\"textonly\"  onclick=\"_gaq.push(['_trackEvent', 'Text Only', 'Click']);\">Text Only</a></p>\n");
      out.write("                \n");
      out.write("                 <script type=\"text/javascript\" src=\"/content/static/scripts/textOnly.js\"></script>\n");
      out.write("</div>\n");
      out.write("                      \n");
      out.write("       <div id=\"status\">\n");
      out.write("</div>               \n");
      out.write("                  \n");
      out.write("         <div>\n");
      out.write(" <button onclick = \"fetchingUrl();\" >logout</button>\n");
      out.write(" \n");
      out.write(" </div>    \n");
      out.write("  <!--facebook login Script-->\n");
      out.write("          <script>\n");
      out.write("  // This is called with the results from from FB.getLoginStatus().\n");
      out.write("  function statusChangeCallback(response) {\n");
      out.write("    console.log('statusChangeCallback');\n");
      out.write("    console.log(response);\n");
      out.write("    // The response object is returned with a status field that lets the\n");
      out.write("    // app know the current login status of the person.\n");
      out.write("    // Full docs on the response object can be found in the documentation\n");
      out.write("    // for FB.getLoginStatus().\n");
      out.write("    if (response.status === 'connected') {\n");
      out.write("      // Logged into your app and Facebook.\n");
      out.write("      testAPI();\n");
      out.write("      \n");
      out.write("    } else if (response.status === 'not_authorized') {\n");
      out.write("      // The person is logged into Facebook, but not your app.\n");
      out.write("      document.getElementById('status').innerHTML = 'Please log ' +\n");
      out.write("        'into this app.';\n");
      out.write("    } else {\n");
      out.write("      // The person is not logged into Facebook, so we're not sure if\n");
      out.write("      // they are logged into this app or not.\n");
      out.write("      document.getElementById('status').innerHTML = 'Please log ' +\n");
      out.write("        'into Facebook.';\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // This function is called when someone finishes with the Login\n");
      out.write("  // Button.  See the onlogin handler attached to it in the sample\n");
      out.write("  // code below.\n");
      out.write("  function checkLoginState() {\n");
      out.write("    FB.getLoginStatus(function(response) {\n");
      out.write("      statusChangeCallback(response);\n");
      out.write("    });\n");
      out.write("  }\n");
      out.write("  \n");
      out.write(" function logoutfb(){\n");
      out.write("    FB.logout(function(response) {\n");
      out.write("   // Person is now logged out\n");
      out.write("    });\n");
      out.write(" }\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("  window.fbAsyncInit = function() {\n");
      out.write("  FB.init({\n");
      out.write("    appId      : '1877973365817870',\n");
      out.write("    cookie     : true,  // enable cookies to allow the server to access \n");
      out.write("                        // the session\n");
      out.write("    xfbml      : true,  // parse social plugins on this page\n");
      out.write("    version    : 'v2.8' // use graph api version 2.8\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  // Now that we've initialized the JavaScript SDK, we call \n");
      out.write("  // FB.getLoginStatus().  This function gets the state of the\n");
      out.write("  // person visiting this page and can return one of three states to\n");
      out.write("  // the callback you provide.  They can be:\n");
      out.write("  //\n");
      out.write("  // 1. Logged into your app ('connected')\n");
      out.write("  // 2. Logged into Facebook, but not your app ('not_authorized')\n");
      out.write("  // 3. Not logged into Facebook and can't tell if they are logged into\n");
      out.write("  //    your app or not.\n");
      out.write("  //\n");
      out.write("  // These three cases are handled in the callback function.\n");
      out.write("\n");
      out.write("  FB.getLoginStatus(function(response) {\n");
      out.write("    statusChangeCallback(response);\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  };\n");
      out.write("\n");
      out.write("  // Load the SDK asynchronously\n");
      out.write("  (function(d, s, id) {\n");
      out.write("    var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("    if (d.getElementById(id)) return;\n");
      out.write("    js = d.createElement(s); js.id = id;\n");
      out.write("    js.src = \"//connect.facebook.net/en_US/sdk.js\";\n");
      out.write("    fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("  }(document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("  // Here we run a very simple test of the Graph API after login is\n");
      out.write("  // successful.  See statusChangeCallback() for when this call is made.\n");
      out.write("  function testAPI() {\n");
      out.write("    console.log('Welcome!  Fetching your information.... ');\n");
      out.write("   \n");
      out.write("    \n");
      out.write("   \n");
      out.write("    FB.api('/me', function(response) {\n");
      out.write("      console.log('Successful login for: ' + response.name);\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    document.getElementById('status').innerHTML =\n");
      out.write("        'Thanks for logging in, ' + response.name + '!';\n");
      out.write("    \n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("\n");
      out.write("</script>            \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
