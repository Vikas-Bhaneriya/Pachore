
<%@page import="java.util.ArrayList"%>
<%@ include file="connection.jsp" %>


<% 

   String id="";
   
    if (request.getParameter("id") == null) {
        id = "lihome";
     
    } 
    else {
        id=request.getParameter("id");
        
    }
%>


<html lang="en">
<head>
    <meta charset="UTF-8"/>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <title>pachore.com
</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" id="main_css" href="/main_v2.00.css" />
<link rel="shortcut icon" href="/cor-layout/content/static/styles/images/favicon.ico" />
<link rel="icon" type="image/ico" href="/cor-layout/content/static/styles/images/favicon.ico" />
<link rel="stylesheet" href="main_v2.00.css" type="text/css">

</head>
<body>
<div class="wrapper">
            <div id='navigation'>

                     <div id="Header">
                                <div id="CitySeal" onClick="window.location='/'">
                                <img src="images/cimage.png" alt="Official City of Raleigh Seal" class="logo"/>
                                 <div class="raleigh">Pachore City
                                 <br>
                                 
                                 
                              </div>
   
                                 </div>  
        
      
                          
                         
                       </div>


                
                
                  <div id="Nav" >
                      <ul>
                     <li id="lihome" class="current"><a href="index.jsp?id=lihome"><span class="homeicon">Home</span></a></li>
                     
                 
                     <li ><a id="liedu"  href="index.jsp?id=liedu"  >Education</a></li>
                               
                       <li ><a id="lisns" href="index.jsp?id=lisns" onclick="mytopicjs(this.id);">Shops & Services</a> </li>
                     <li ><a id="lihns" href="index.jsp?id=lihnp" onclick="mytopicjs(this.id);" > Hotel & Parks</a></li>
                     <li>  <a id="lihealth"  href="index.jsp?id=lihealth" onclick="mytopicjs(this.id);" > Health</a></li>
                     <li><a id="lirel" href="index.jsp?id=lirel" onclick="mytopicjs(this.id);" >Religion</a> </li>
                     <li> <a id="lidev" href="index.jsp?id=lidev" onclick="mytopicjs(this.id);" >Development;</a></li>
                      <li ><a id="ligov" href="index.jsp?id=ligov" onclick="mytopicjs(this.id);" >Government</a> </li>
                     
              
                 
                     </ul>
                     </div>
              </div>
            
         <div id="contentArea">

        <div id="col1">
                    <div id='left'>
<!-- from DivWindowRenderer -->


                                    

    <!--\switch to inflate specific Topic -->

       
                      <%
                       switch(id){
                           
                            case "lihome":
                      {
                       %>
                     <DIV class="box1" >
                                 <H3 class="head1">Home</H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                       <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-location">Maps</SPAN></A>
                                        </LI>
                                    <LI>
                                    <A href="/directory" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);">
                                    <SPAN class="icon-user">Directory</SPAN></A>
                                     </LI>
                                    <LI>
                                       <A href="/home/content/ITechWebServices/Articles/Calendar.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);">
                                       <SPAN class="icon-calendar">Calendar</SPAN></A>
                                     </LI>
                                     <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-shop">Subscriptions</SPAN></A>
                                     </LI>   
                                       </UL>
                              </DIV>
                     
                     
                     
                      <DIV class="leftnav">
                     <H3>Pay</H3>
                    <UL>
                        <LI>
                        <A href="/services/content/FinUtilityBilling/Articles/UtilityPayments.html" onclick="">Utility Bill</A>
                         </LI>
                       <LI>
                         <A href="/services/content/PWksParkingMgmt/Articles/PayingAParkingCitation.html" onclick=" ">Parking Citations</A>
                       </LI>
                       <LI>
                      <A href="/services/content/PWksTrafficEng/Articles/SafeLightPayments.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/PWksTrafficEng/Articles/SafeLightPayments.html']);">Safelight Citations</A>
                </LI>
                </UL>
                <H3>Find</H3>
                <UL>
                 <LI>
                <A href="/jobs" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/jobs']);">Jobs</A>
                </LI>
                <LI>
                <A href="/services/content/PWksTransit/Articles/BusRoutes.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/PWksTransit/Articles/BusRoutes.html']);">Bus Routes</A>
                </LI>
                <LI>
                    <A href="/parks/content/ParksRec/Articles/ParksFacilities.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/parks/content/ParksRec/Articles/ParksFacilities.html']);">Parks</A>
                    </LI>
                        <LI>
                    <A href="/home/content/ITechWebServices/Articles/FindMyService.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/content/ITechWebServices/Articles/FindMyService.html']);">My Service Day</A>
                    </LI>
                    </UL>
                    <H3>Report</H3>
                    <UL>
                    <LI>
                    <A href="/safety/content/Police/Articles/OnlineCrimeReporting.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/safety/content/Police/Articles/OnlineCrimeReporting.html']);">Crimes Online</A>
                     </LI>
                    <LI>
                    <A href="/home/content/SolidWaste/Contacts/SWSCustomerSupport.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/content/SolidWaste/Contacts/SWSCustomerSupport.html']);">Missed Garbage/Recycling Collection</A>
                    </LI>
                <LI>
                <A href="/ext/SeeClickFix" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/ext/SeeClickFix']);">Citizen Service Request (SeeClickFix)</A>
                </LI>
                 </UL>
                <H3>Manage</H3>
                <UL>
            <LI>
                <A class="taskevent"     href="https://reclink.raleighnc.gov/Start/Start.asp" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'https://reclink.raleighnc.gov/Start/Start.asp']);">RecLink Account</A>
            </LI>
                    <LI>
                    <A href="/services/content/FinUtilityBilling/Articles/UtilityBillingServiceRequests.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/FinUtilityBilling/Articles/UtilityBillingServiceRequests.html']);">Water/Sewer Service</A>
                    </LI>
                    </UL>
                    <H3>Status & Notices</H3>
                <UL>
                <LI>
                <A href="/parks/content/CorStatus/Articles/ParksFieldStatus.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/parks/content/CorStatus/Articles/ParksFieldStatus.html']);">Park Status</A>
                  </LI>
                    <LI>
                        <A href="/home/content/CorStatus/Articles/DowntownTrafficAlert.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/content/CorStatus/Articles/DowntownTrafficAlert.html']);">Street Closings & Road Races</A>
                    </LI>
                    <LI>
                <A href="/services/content/CorStatus/Articles/TransitAnnouncements.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', '/services/content/CorStatus/Articles/TransitAnnouncements.html']);">Bus Service Alerts</A>
                </LI>
                <LI>
                <A href="http://www.ncdot.gov/fortifync/" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'http://www.ncdot.gov/fortifync/']);">40/440 Fortify</A>
                    </LI>
                <LI>
                <A href="http://www.ncdot.gov/projects/CapitalBlvdBridges/" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'http://www.ncdot.gov/projects/CapitalBlvdBridges/']);">Capital Boulevard Bridge Project</A>
                </LI>
                <LI>
                <A href="https://hillsboroughst.raleighnc.gov/" onclick="_gaq.push(['_trackEvent', 'Menu', 'Subnav', 'https://hillsboroughst.raleighnc.gov/']);">Hillsborough St. Renewal Project</A>
                </LI>
                    </UL>
                </DIV>
                     
                     
                     
                       <%
                      break;
                      }
                      case "liedu":
                      {



                 

             
  
                        %>
                      <DIV class="box1" >
                                 <H3 class="head1">Schools</H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                           
                                 
                                         <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                            <SPAN class="icon-school">Schools</SPAN></A>
                                        </LI>
                                        
                                        
                                        
                                          <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                            <SPAN class="icon-college"> Colleges</SPAN></A>
                                        </LI>
                                        
                                        
                                          <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                            <SPAN class="icon-coaching"> Coachings</SPAN></A>
                                        </LI>
                                        
                                          <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                            <SPAN class="icon-hometutor"> Home Tutors</SPAN></A>
                                        </LI>
                                         
                                        
                                  
                                       </UL>
                              </DIV><%
                      break;
                      }
                          
                          case "lihnp":{

                        %>
                      <DIV class="box1" >
                                 <H3 class="head1">Hotels and Parks </H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                          <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-hotel1" > TO Stay</SPAN></A>
                                        </LI>
                                        <LI>
                                    <A href="/directory" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);">
                                    <SPAN class="icon-hotel2"> Dhabaas</SPAN></A>
                                     </LI>
                                    <LI>
                                       <A href="/home/content/ITechWebServices/Articles/Calendar.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);">
                                       <SPAN class="icon-hotel3"> Restorents</SPAN></A>
                                     </LI>
                                     
                                     
                                     <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-hotel4"> Fast Food</A>
                                       </LI>   
                                       
                                      
                                       
                                       </UL>
                              </DIV> <%
                         break; 
                          }
                          case "lisns":
                        {
                       %>
                       <DIV class="box1" >
                                 <H3 class="head1">Shops and Services</H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                       <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-art"> Art And Craft</SPAN></A>
                                        </LI>
                                   
                                        
                                        <LI>
                                    <A href="/directory" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);">
                                    <SPAN class="icon-generl"> General store</SPAN></A>
                                     </LI>
                                    <LI>
                                        
                                            <LI>
                                    <A href="/directory" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);">
                                    <SPAN class="icon-snakes"> Snacks</SPAN></A>
                                     </LI>
                                    <LI>
                                       
                                       <A href="/home/content/ITechWebServices/Articles/Calendar.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);">
                                       <SPAN class="icon-stationary"> Stationary</SPAN></A>
                                     </LI>   
                                       <LI>
                                       
                                       <A href="/home/content/ITechWebServices/Articles/Calendar.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);">
                                       <SPAN class="icon-cyber"> CyberCafe</SPAN></A>
                                     </LI>   
                                    
                                         <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-mall"> Mall</SPAN></A>
                                     </LI>  
                                     
                                         <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-optics"> Optics</SPAN></A>
                                     </LI>  
                               
                                     
                                            <LI>
                                    <A href="/directory" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);">
                                    <SPAN class="icon-salon"> Salon</SPAN></A>
                                     </LI>
                                     
                                     
                                     
                                      <LI>
                                    <A href="/directory" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);">
                                    <SPAN class="icon-stitches"> Stitches</SPAN></A>
                                     </LI>
                                     
                                        <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-garments"> Garments</SPAN></A>
                                     </LI>  
                                     
                                      <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-ele"> Electronics</SPAN></A>
                                     </LI>  
                                    
                                     <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-hrd"> Hardwares</SPAN></A>
                                     </LI>  
                                     
                                     
                                     
                                       </UL>
                              </DIV>  <%
                           break;

                        }

                     case "lihealth": 
                        {%><DIV class="box1" >
                                 <H3 class="head1">Health</H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                       <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-gym"> Gym</SPAN></A>
                                         </LI>
                                       <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-hospital"> Hospital</SPAN></A>
                                        </LI>
                                        <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-medi"> Medicals</SPAN></A>
                                        </LI>
                                        
                                        
                                        
                                       </UL>
                              </DIV>
                       <%
                           break;
                            }
                      case "lidev":
                       {%>
                      <DIV class="box1" >
                                 <H3 class="head1">Development</H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                       <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-location">Maps</SPAN></A>
                                        </LI>
                                    <LI>
                                    <A href="/directory" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Directory']);">
                                    <SPAN class="icon-user">Directory</SPAN></A>
                                     </LI>
                                    <LI>
                                       <A href="/home/content/ITechWebServices/Articles/Calendar.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Calendar']);">
                                       <SPAN class="icon-calendar">Calendar</SPAN></A>
                                     </LI>
                                     <LI>
                                       <A href="/home/content/ITechWebServices/Articles/MyRaleighSubscriptions.html" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Subscriptions']);">
                                      <SPAN class="icon-shop">Subscriptions</SPAN></A>
                                     </LI>   
                                       </UL>
                              </DIV> <%
                           break;
                            }
                          case "lirel":
                      
                         {%>
                       <DIV class="box1" >
                                 <H3 class="head1">Religious Spots</H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                       <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-temple"> Temple</SPAN></A>
                                        </LI>
                                
                                          <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-mosque"> Mosque</SPAN></A>
                                        </LI>
                                        
                                          <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-church"> Church</SPAN></A>
                                        </LI>
                                        
                                        
                                        
                                       </UL>
                              </DIV> <%
                            break;
                              }
                         case "ligov":{ 
                              %>
                              
                              <DIV class="box1" >
                                 <H3 class="head1">Government</H3>
                  
      
                                       </DIV>
                             <DIV class="box icons">
                                       <UL class="nolist">
                                       <LI>
                                        <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-tahsil"> Tahsil </SPAN></A>
                                        </LI>
                                        <li>
                                         <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-powerhouse"> Powerhouse</SPAN></A>
                                        </LI>
                                    
                                        <li>
                                         <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-postoffice"> Post Office</SPAN></A>
                                        </LI>
                                        
                                        
                                        <li>
                                         <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-telephone"> Telephone</SPAN></A>
                                        </LI>
                                        
                                    
                                        <li>
                                         <A href="/maps" onclick="_gaq.push(['_trackEvent', 'Menu', 'Icons', 'Maps']);">
                                          <SPAN class="icon-mandi"> Mandi</SPAN></A>
                                        </LI>
                                    
                                    
                                       </UL>
                              </DIV>
                              
                            <%
                                break;}
                                
                         }
                  
                          %>

    <!-- End OF the Switch -->


<!-- end DivWindowRenderer -->

<!-- from DivWindowRenderer -->

	
                    
                    

<!-- end DivWindowRenderer -->
                        </div>
                </div>
     
     
     
     
     
     
     
     
     
     
     
     
     
     <div id="col2">
            <div id='center'>
<!-- from DivWindowRenderer -->
                <UL class="tasks">
                <LI class="close"><A href="/services/content/PWksTransit/Articles/BusRoutes.html" onclick="_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Mobile Tasks', 'Bus']);"><SPAN class="icon-bus"></SPAN> View Bus Routes & Schedules <SPAN class="right arrow"></SPAN></A>
                 </LI><LI class="close"><A href="/services/content/FinUtilityBilling/Articles/UtilityPayments.html" onclick="_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Mobile Tasks', 'Utility']);"><SPAN class="icon-pay"></SPAN> Pay Utility Bill <SPAN class="right arrow"></SPAN></A></LI>
                  <LI class="close"><A href="/safety/content/Departments/Articles/Police.html" onclick="_gaq.push(['_setAccount', 'UA-9880547-1'],['_trackEvent', 'Mobile Tasks', 'Police']);"><SPAN class="icon-shield"></SPAN> Police Department <SPAN class="right arrow"></SPAN></A></LI>
                </UL>


              <DIV class="box related">
                  
                      <%
                       switch(id){
                           
                            case "lihome":
                      {
                       %>
                       <iframe id="iframe1" overflow-x='hidden' src="index1.html" height="900" width= 100% ></iframe>
                       <%
                      break;
                      }
                      case "liedu":
                      {
                        %>
                       <iframe id="iframe1" src="edu/edudetail.jsp" scrolling-x="no"  overflow-x='hidden' height="900" width= 100% ></iframe>
                       <%
                      
                      }
                          
                          case "lihnp":{

                        %>
                       <iframe id="iframe1" src="hnp/hnp.jsp" height="900" width= 100% ></iframe>
                       <%
                         break; 
                          }
                          case "lisns":
                        {
                       %>
                       <iframe id="iframe1" src="sns/anc.jsp" height="900" width= 100% ></iframe>
                       <%
                           break;

                        }

                     case "lihealth": 
                        {%>
                       <iframe id="iframe1" src="health/health.jsp" height="900" width= 100% ></iframe>
                       <%
                           break;
                            }
                      case "lidev":
                       {%>
                       <iframe id="iframe1" src="dev/dev.jsp" height="900" width= 100% ></iframe>
                       <%
                           break;
                            }
                          case "lirel":
                      
                         {%>
                         <iframe id="iframe1" src="rel/rel.jsp" height="900" width= 100% ></iframe>
                        <%
                            break;
                            }
                         case "ligov":
                            {
                  
                          %>
                         <iframe id="iframe1" src="gov/gov.jsp" height="900" width= 100% ></iframe>
                      <%
                          break;
                          }
                                }
                      %>
                         
                         
           
                
               </DIV>


      

              <DIV class="box related">
                 <iframe src="index1.html" height="900" width= 98% ></iframe>
               </DIV>
              

<!-- tweeter api For use in future
 <DIV class="box related">
                    <H3>
                    <A href="https://www.facebook.com/BuySell-at-Nitrr--1648901902029549/" style="color:white; text-decoration:none">Facebook or Tweeter Page Of the City</A>
                    </H3>
                    <UL>
                    <LI>
                    <A class="twitter-timeline" data-chrome="noheader nofooter noborders transparent" data-widget-id="704776484540588032" href="https://www.facebook.com/BuySell-at-Nitrr--1648901902029549/" width="98%">Tweets by RaleighGov</A><SCRIPT>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</SCRIPT>
                    </LI>
                    </UL>
                </DIV>



-->
           </div>
     </div>
     
       <div  id="col3">
     
           
                  
           
           <div class="mainarticlelinks ">
                               <h2 >News</h2>
                                   
                                <div class='newsList'>
                                    <ul>
                                    <li><div class="newsAlert">[Alert]</div><a href="/home/news/content/CorNews/Articles/0CityHolidaysNews.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/0CityHolidaysNews.html']);" >City to Observe Martin Luther King Jr. Holiday on Jan. 16</a> <span class="malDate">(2 days ago)</span></li>
                                    <li><a href="/home/news/content/CorNews/Articles/ChicosArmy.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class="malDate">(2 days ago)</span></li>
                                    <li><a href="/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);" >Citizen Engagement Task Force</a> <span class="malDate">(3 days ago)</span></li>
                                     <li><a href="/home/news/content/CorNews/Articles/RaleighPlowing.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/RaleighPlowing.html']);" >Raleigh Prepared to Treat, Plow Roads</a> <span class="malDate">(January  06, 2017)</span></li>
                                        <li><a href="/home/news/content/CorNews/Articles/HumanRelationsAwardsNominations.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/HumanRelationsAwardsNominations.html']);" >2017 Raleigh Human Relations Awards Nominations Now Open!</a> <span class="malDate">(December 16, 2016)</span></li>
			<li><a href="/home/news/content/CorNews/Articles/ChicosArmy.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class="malDate">(2 days ago)</span></li>
                                    <li><a href="/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);" >Citizen Engagement Task Force</a> <span class="malDate">(3 days ago)</span></li>
                                     <li>
                                         
                                         <li><a href="/home/news/content/CorNews/Articles/ChicosArmy.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class="malDate">(2 days ago)</span></li>
                                    <li><a href="/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);" >Citizen Engagement Task Force</a> <span class="malDate">(3 days ago)</span></li>
                                     <li>
                                         <li><a href="/home/news/content/CorNews/Articles/ChicosArmy.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/ChicosArmy.html']);" >Raleigh Fire Dept. Joins ?Chico?s Army? to Raise Awareness of Cancer Dangers</a> <span class="malDate">(2 days ago)</span></li>
                                    <li><a href="/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);" >Citizen Engagement Task Force</a> <span class="malDate">(3 days ago)</span></li>
                                     <li>
                                         
                                     <li><a href="/home/news/content/CorNews/Articles/CitizenEngagementTaskForce.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/CitizenEngagementTaskForce.html']);" >Citizen Engagement Task Force</a> <span class="malDate">(3 days ago)</span></li>
                                        <li><a href="/home/news/content/CorNews/Articles/RaleighPlowing.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/RaleighPlowing.html']);" >Raleigh Prepared to Treat, Plow Roads</a> <span class="malDate">(January  06, 2017)</span></li>
                                        <li><a href="/home/news/content/CorNews/Articles/HumanRelationsAwardsNominations.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','News', 'Home','/content/CorNews/Articles/HumanRelationsAwardsNominations.html']);" >2017 Raleigh Human Relations Awards Nominations Now Open!</a> <span class="malDate">(December 16, 2016)</span></li>
			
                
                                     </ul>
                                         <a href="/home/news/AllNewsEvents" class="more">View all</a>
        
                                </div>
                            </div>



                                <div class="maineventslinks">
                                        <h2>Events</h2>
                                        <div class="mainRss">
                                            <h2><a class="icon-feed" href="/content/CorNews/Articles/RaleighNewsRSS_home.xml" onclick="event.preventDefault(); url = this.href; _gaq.push(['_trackEvent', 'Events', 'RSS', '/home/news/content/CorNews/Articles/RaleighNewsRSS_home', 1]); setTimeout(function(){window.location = url;}, 150);">
                                            <span class="ally">RSS</span></a></h2>	</div>
                                                <div class='eventsList'>
                                             <ul>
                                                 <li>
                                                    <div class="eventDate">
							<div class="eventMonth">Jan</div>
							<div class="eventDay">16</div>
                                                     </div>
                                                    <div class="eventTitle"><a href="/home/news/content/CorNews/Articles/0CityHolidays.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','Events', 'Home','/content/CorNews/Articles/0CityHolidays.html']);" >City Holiday</a></div>
                                                    <div class="message">Martin Luther King Jr.</div>
                                                 </li>
                                               <li>
                                                    <div class="eventDate">
							<div class="eventMonth">Jan</div>
							<div class="eventDay">17</div>
                                                    </div>
                                                    <div class="eventTitle"><a href="/home/news/content/CorNews/Articles/CityCouncilSchedule.html" onclick="_gaq.push(['_setAccount','UA-9880547-1'],['_trackEvent','Events', 'Home','/content/CorNews/Articles/CityCouncilSchedule.html']);" >City Council Meeting</a></div>
                                                    <div class="message">Work Session</div>
                                                        <div class="eventTimes">11:30 am</div>
                                                      </li>
                                              </ul>
                                                <a href="/home/news/AllNewsEvents" class="more">View all</a>	</div>
                                </div>

                </div>
      </div>
   <!--end of the contane pages-!>
       
<!--/PAGEWATCH start-->
            

             

<!-- Social Footer, Colour Matching Icons -->
<!-- Include Font Awesome Stylesheet in Header -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<!-- // -->


<br />

<!-- Social Footer, Single Coloured -->
<!-- Include Font Awesome Stylesheet in Header -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<!-- // -->
 <div id="contentArea">
     <div id="col2" class="container" style=" margin-left: 10%;"  >
    
         <div class="col-sm-12">
     <h3>Like us</h3>
        <hr />
        <div class="text-center center-block">
            <p class="txt-railway">- PachoreCity@gmail.com -</p>
            <br />
                <a href="https://www.facebook.com/bootsnipp"><i class="fa fa-facebook-square fa-3x social"></i></a>
	            <a href="https://twitter.com/bootsnipp"><i class="fa fa-twitter-square fa-3x social"></i></a>
	            <a href="https://plus.google.com/+Bootsnipp-page"><i class="fa fa-google-plus-square fa-3x social"></i></a>
	            <a href="mailto:bootsnipp@gmail.com"><i class="fa fa-envelope-square fa-3x social"></i></a>
         </div>
    <hr />
    
    
    
                <p class="container-fluid text-center align-center color-9">Copyright &copy; 2017 |Pachore.com | All Rights Reserved | <a href="javascript:cortextonly();" id="textonly"  onclick="_gaq.push(['_trackEvent', 'Text Only', 'Click']);">Text Only</a></p>
      </div>
         </div>
   
</div>


                 <script type="text/javascript" src="/content/static/scripts/textOnly.js"></script>
</div>

  <!--facebook login Script-->
          <script>
  // This is called with the results from from FB.getLoginStatus().
  function statusChangeCallback(response) {
    console.log('statusChangeCallback');
    console.log(response);
    // The response object is returned with a status field that lets the
    // app know the current login status of the person.
    // Full docs on the response object can be found in the documentation
    // for FB.getLoginStatus().
    if (response.status === 'connected') {
      // Logged into your app and Facebook.
      testAPI();
      
    } else if (response.status === 'not_authorized') {
      // The person is logged into Facebook, but not your app.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this app.';
    } else {
      // The person is not logged into Facebook, so we're not sure if
      // they are logged into this app or not.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into Facebook.';
    }
  }

  // This function is called when someone finishes with the Login
  // Button.  See the onlogin handler attached to it in the sample
  // code below.
  function checkLoginState() {
    FB.getLoginStatus(function(response) {
      statusChangeCallback(response);
    });
  }
  
 function logoutfb(){
    FB.logout(function(response) {
   // Person is now logged out
    });
 }
  
  
  

  window.fbAsyncInit = function() {
  FB.init({
    appId      : '1877973365817870',
    cookie     : true,  // enable cookies to allow the server to access 
                        // the session
    xfbml      : true,  // parse social plugins on this page
    version    : 'v2.8' // use graph api version 2.8
  });

  // Now that we've initialized the JavaScript SDK, we call 
  // FB.getLoginStatus().  This function gets the state of the
  // person visiting this page and can return one of three states to
  // the callback you provide.  They can be:
  //
  // 1. Logged into your app ('connected')
  // 2. Logged into Facebook, but not your app ('not_authorized')
  // 3. Not logged into Facebook and can't tell if they are logged into
  //    your app or not.
  //
  // These three cases are handled in the callback function.

  FB.getLoginStatus(function(response) {
    statusChangeCallback(response);
  });

  };

  // Load the SDK asynchronously
  (function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));

  // Here we run a very simple test of the Graph API after login is
  // successful.  See statusChangeCallback() for when this call is made.
  function testAPI() {
    console.log('Welcome!  Fetching your information.... ');
   
    
   
    FB.api('/me', function(response) {
      console.log('Successful login for: ' + response.name);
      
    
    document.getElementById('status').innerHTML =
        'Thanks for logging in, ' + response.name + '!';
    
    });



  }
  

</script>            
                      
                      
</body>







</html>
