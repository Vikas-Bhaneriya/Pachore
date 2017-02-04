<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>


<%@ include file="../connection.jsp" %>


<html>

<head>
    
    <link rel="stylesheet" type="text/css" href="/style.css" />
    
    <link rel="stylesheet" href="../style.css" type="text/css"/>
</head>


<body>
    <div class="header-container">
<div class="header">
<h1 id="heading">Progress Scroll Bar Example</h1>
</div>
<div class="scroll-progress-container">
<div class="scroll-progress"></div>
</div>
</div>

<p class="filler-text">
The Lady of the Lake, her arm clad in the purest shimmering samite, held aloft Excalibur from the bosom of the water...
</p>

    <%
        
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
  
    
    %>
    
    <div class="pageheader">
                        <div class="headercontent">
                            <div class="section-container">
                                <div class="row">
                                    <div class="col-sm-2 visible-sm"></div>
                                    <div class="col-md-5">
                                        <div class="biothumb">
                                            <img alt="image" src="img/<% out.println(obj.img1);%>"  class="img-responsive" height="500px" weidth= 100% >
                                            <div class="overlay">
                                                <h1 class=""><% out.println(obj.name +"" +obj.id );  %></h1>
                                                <ul class="list-unstyled">
                                                    <li><<% out.println(obj.loc);%>></li>
                                                  
                                                </ul>
                                            </div>

                                        </div>
                                    </div>
                                    <div class="clearfix visible-sm visible-xs"></div>
                                    <div class="col-sm-12 col-md-7">
                                        <h3 class="style1">About</h3>
                                        <hr></hr>
                                        <p class="style2"><% out.println(" "+ obj.des1); %></p>
                                         <p class="style2"> <% out.println("        "+ obj.des2); %>   </p>
                                    </div>
                                </div>
                                
                                
                                <div  class="cont_star" >
                                    
                                    <section class="post_footer">
                                       
                               <div id="container">
                                   <div id="left"><a  href=" " style="text-decoration:none;" > <% out.println(" "+ obj.mob1); %></a></div>
                                 <div id="middle"><a href="" style="text-decoration:none;" ><% out.println(" "+ obj.mob2); %></a>  </div>
                                 <div id="right" ><a href="" style="text-decoration:none;" ><% out.println(" "+ obj.star); %></a></div>
                                </div>
                                    </section>
                                    
                                    
                                    
                                </div>
                            </div>
                        </div>
                    </div>
     <hr class="clear" height="10px"></hr>                           
                    
     <% } %>
     
     
     
     
     
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script>
    var school = ["Saab","vikas"];
    var i=0;
       var l;
      $(document).ready(function() {
      var docHeight = $(document).height(),
      windowHeight = $(window).height(),
      scrollPercent;

      $(window).scroll(function() {
        scrollPercent = $(window).scrollTop() / (docHeight - windowHeight) * 100;

        $('.scroll-progress').width(scrollPercent + '%');
   
    
    
       var s=<% int l;l=schoolList.size(); out.println(l); %>;
      
       l= parseInt((s*scrollPercent)/100 +1);
       
       document.getElementById("heading").innerHTML=""+ l;
     
    
    });
       
    
    
    });
  
   
     
    </script>
    
     

</body>
</html>