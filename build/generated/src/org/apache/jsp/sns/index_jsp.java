package org.apache.jsp.sns;

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
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/reset.css\"> <!-- CSS reset -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\"> <!-- Resource style -->\n");
      out.write("\t<script src=\"js/modernizr.js\"></script> <!-- Modernizr -->\n");
      out.write("  \t\n");
      out.write("\t<title>Reading Progress Indicator | CodyHouse</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"cd-header\">\n");
      out.write("\t<h1>Reading Progress Indicator</h1>\n");
      out.write("\t<div class=\"cd-nugget-info\">\n");
      out.write("\t\t<a href=\"https://codyhouse.co/?p=6512\">\n");
      out.write("\t\t\t<span>\n");
      out.write("\t\t\t\t<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" width=\"16px\" height=\"16px\" viewBox=\"0 0 16 16\" style=\"enable-background:new 0 0 16 16;\" xml:space=\"preserve\">\n");
      out.write("\t\t\t\t\t<style type=\"text/css\">\n");
      out.write("\t\t\t\t\t\t.cd-nugget-info-arrow{fill:#383838;}\n");
      out.write("\t\t\t\t\t</style>\n");
      out.write("\t\t\t\t\t<polygon class=\"cd-nugget-info-arrow\" points=\"15,7 4.4,7 8.4,3 7,1.6 0.6,8 0.6,8 0.6,8 7,14.4 8.4,13 4.4,9 15,9 \"/>\n");
      out.write("\t\t\t\t</svg>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t\tArticle &amp; Download\n");
      out.write("\t\t</a>\n");
      out.write("\t</div> <!-- cd-nugget-info -->\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<div class=\"cd-articles\">\n");
      out.write("\t<article>\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<img src=\"img/img-1.png\" alt=\"article image\">\n");
      out.write("\t\t\t<h1>20 Star Wars Secrets Revealed: From Leia?s ?Cocaine Nail? to the Ronald Reagan Connection</h1>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis maxime id, sunt, eum sed blanditiis aliquid! Minus assumenda tempore perspiciatis, numquam est aliquam, quis molestias enim consequuntur suscipit similique cumque ut natus facilis laboriosam quidem, nesciunt quasi doloribus tenetur. Quas doloremque suscipit, molestias odit, et quasi? Quas hic numquam, vitae?\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti cum quibusdam eaque, autem porro fuga laudantium culpa beatae laboriosam quos.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa eaque error quos consequuntur totam, esse commodi magnam dignissimos explicabo modi. Laborum temporibus enim eius quidem eum voluptatum eligendi. Nemo fuga at provident accusantium tempore eligendi alias sed! Provident veritatis adipisci deserunt. Totam repudiandae ducimus nemo aperiam assumenda. Odio quos, quam quod illum reiciendis sapiente doloremque quasi deserunt alias provident! Labore voluptatibus excepturi, ipsum et sint nihil delectus enim, commodi quis!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Labore dicta praesentium dolor asperiores nesciunt quod sapiente est minus, architecto corrupti, excepturi hic ipsa, saepe dignissimos similique ullam repudiandae rem voluptate. Ipsa iusto, voluptate doloremque facere expedita, molestias omnis facilis. Adipisci voluptatum, quia alias aut sint totam facere porro aperiam repellat ipsa? Odio ut sint dicta magnam molestias maiores eos impedit natus iste quas perspiciatis voluptas autem, illum qui aperiam labore necessitatibus incidunt, placeat reiciendis facilis iusto reprehenderit. Ad, quisquam, voluptatibus!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Vero laborum omnis iure cumque veritatis reiciendis, optio ad. Praesentium, illum. Deleniti ab rem laboriosam numquam natus explicabo sit cumque provident maxime.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Recusandae modi facilis vel distinctio itaque ea, commodi a autem, amet explicabo harum libero vero earum doloremque officiis, dolorum beatae soluta officia dignissimos. Ad odit ab, error illo! Iure numquam recusandae unde dignissimos aspernatur quia neque, voluptatibus ea, iste eaque corporis doloribus.\n");
      out.write("\t\t</p>\n");
      out.write("\t</article>\n");
      out.write("\n");
      out.write("\t<article>\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<img src=\"img/img-1.png\" alt=\"article image\">\n");
      out.write("\t\t\t<h1>How ?Star Wars? Brought Kim Kardashian and Kanye West Together</h1>\n");
      out.write("\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis maxime id, sunt, eum sed blanditiis aliquid! Minus assumenda tempore perspiciatis, numquam est aliquam, quis molestias enim consequuntur suscipit similique cumque ut natus facilis laboriosam quidem, nesciunt quasi doloribus tenetur. Quas doloremque suscipit, molestias odit, et quasi? Quas hic numquam, vitae?\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti cum quibusdam eaque, autem porro fuga laudantium culpa beatae laboriosam quos.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa eaque error quos consequuntur totam, esse commodi magnam dignissimos explicabo modi. Laborum temporibus enim eius quidem eum voluptatum eligendi. Nemo fuga at provident accusantium tempore eligendi alias sed! Provident veritatis adipisci deserunt. Totam repudiandae ducimus nemo aperiam assumenda. Odio quos, quam quod illum reiciendis sapiente doloremque quasi deserunt alias provident! Labore voluptatibus excepturi, ipsum et sint nihil delectus enim, commodi quis!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Labore dicta praesentium dolor asperiores nesciunt quod sapiente est minus, architecto corrupti, excepturi hic ipsa, saepe dignissimos similique ullam repudiandae rem voluptate. Ipsa iusto, voluptate doloremque facere expedita, molestias omnis facilis. Adipisci voluptatum, quia alias aut sint totam facere porro aperiam repellat ipsa? Odio ut sint dicta magnam molestias maiores eos impedit natus iste quas perspiciatis voluptas autem, illum qui aperiam labore necessitatibus incidunt, placeat reiciendis facilis iusto reprehenderit. Ad, quisquam, voluptatibus!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Vero laborum omnis iure cumque veritatis reiciendis, optio ad. Praesentium, illum. Deleniti ab rem laboriosam numquam natus explicabo sit cumque provident maxime.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Recusandae modi facilis vel distinctio itaque ea, commodi a autem, amet explicabo harum libero vero earum doloremque officiis, dolorum beatae soluta officia dignissimos. Ad odit ab, error illo! Iure numquam recusandae unde dignissimos aspernatur quia neque, voluptatibus ea, iste eaque corporis doloribus.\n");
      out.write("\t\t</p>\n");
      out.write("\t</article>\n");
      out.write("\n");
      out.write("\t<article>\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<img src=\"img/img-1.png\" alt=\"article image\">\n");
      out.write("\t\t\t<h1>How Audiences Reacted to the Star Wars: The Force Awakens Premiere</h1>\n");
      out.write("\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis maxime id, sunt, eum sed blanditiis aliquid! Minus assumenda tempore perspiciatis, numquam est aliquam, quis molestias enim consequuntur suscipit similique cumque ut natus facilis laboriosam quidem, nesciunt quasi doloribus tenetur. Quas doloremque suscipit, molestias odit, et quasi? Quas hic numquam, vitae?\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti cum quibusdam eaque, autem porro fuga laudantium culpa beatae laboriosam quos.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa eaque error quos consequuntur totam, esse commodi magnam dignissimos explicabo modi. Laborum temporibus enim eius quidem eum voluptatum eligendi. Nemo fuga at provident accusantium tempore eligendi alias sed! Provident veritatis adipisci deserunt. Totam repudiandae ducimus nemo aperiam assumenda. Odio quos, quam quod illum reiciendis sapiente doloremque quasi deserunt alias provident! Labore voluptatibus excepturi, ipsum et sint nihil delectus enim, commodi quis!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Labore dicta praesentium dolor asperiores nesciunt quod sapiente est minus, architecto corrupti, excepturi hic ipsa, saepe dignissimos similique ullam repudiandae rem voluptate. Ipsa iusto, voluptate doloremque facere expedita, molestias omnis facilis. Adipisci voluptatum, quia alias aut sint totam facere porro aperiam repellat ipsa? Odio ut sint dicta magnam molestias maiores eos impedit natus iste quas perspiciatis voluptas autem, illum qui aperiam labore necessitatibus incidunt, placeat reiciendis facilis iusto reprehenderit. Ad, quisquam, voluptatibus!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Vero laborum omnis iure cumque veritatis reiciendis, optio ad. Praesentium, illum. Deleniti ab rem laboriosam numquam natus explicabo sit cumque provident maxime.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Recusandae modi facilis vel distinctio itaque ea, commodi a autem, amet explicabo harum libero vero earum doloremque officiis, dolorum beatae soluta officia dignissimos. Ad odit ab, error illo! Iure numquam recusandae unde dignissimos aspernatur quia neque, voluptatibus ea, iste eaque corporis doloribus.\n");
      out.write("\t\t</p>\n");
      out.write("\t</article>\n");
      out.write("\n");
      out.write("\t<article>\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t<img src=\"img/img-1.png\" alt=\"article image\">\n");
      out.write("\t\t\t<h1>The Ultimate Star Wars Dictionary for Dummies</h1>\n");
      out.write("\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis maxime id, sunt, eum sed blanditiis aliquid! Minus assumenda tempore perspiciatis, numquam est aliquam, quis molestias enim consequuntur suscipit similique cumque ut natus facilis laboriosam quidem, nesciunt quasi doloribus tenetur. Quas doloremque suscipit, molestias odit, et quasi? Quas hic numquam, vitae?\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti cum quibusdam eaque, autem porro fuga laudantium culpa beatae laboriosam quos.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa eaque error quos consequuntur totam, esse commodi magnam dignissimos explicabo modi. Laborum temporibus enim eius quidem eum voluptatum eligendi. Nemo fuga at provident accusantium tempore eligendi alias sed! Provident veritatis adipisci deserunt. Totam repudiandae ducimus nemo aperiam assumenda. Odio quos, quam quod illum reiciendis sapiente doloremque quasi deserunt alias provident! Labore voluptatibus excepturi, ipsum et sint nihil delectus enim, commodi quis!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Labore dicta praesentium dolor asperiores nesciunt quod sapiente est minus, architecto corrupti, excepturi hic ipsa, saepe dignissimos similique ullam repudiandae rem voluptate. Ipsa iusto, voluptate doloremque facere expedita, molestias omnis facilis. Adipisci voluptatum, quia alias aut sint totam facere porro aperiam repellat ipsa? Odio ut sint dicta magnam molestias maiores eos impedit natus iste quas perspiciatis voluptas autem, illum qui aperiam labore necessitatibus incidunt, placeat reiciendis facilis iusto reprehenderit. Ad, quisquam, voluptatibus!\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Vero laborum omnis iure cumque veritatis reiciendis, optio ad. Praesentium, illum. Deleniti ab rem laboriosam numquam natus explicabo sit cumque provident maxime.\n");
      out.write("\t\t</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Recusandae modi facilis vel distinctio itaque ea, commodi a autem, amet explicabo harum libero vero earum doloremque officiis, dolorum beatae soluta officia dignissimos. Ad odit ab, error illo! Iure numquam recusandae unde dignissimos aspernatur quia neque, voluptatibus ea, iste eaque corporis doloribus.\n");
      out.write("\t\t</p>\n");
      out.write("\t</article>\n");
      out.write("\n");
      out.write("\t<aside class=\"cd-read-more\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<a href=\"index.html\">\n");
      out.write("\t\t\t\t\t<em>20 Star Wars Secrets Revealed</em>\n");
      out.write("\t\t\t\t\t<b>by J. Morrison</b>\n");
      out.write("\t\t\t\t\t<svg x=\"0px\" y=\"0px\" width=\"36px\" height=\"36px\" viewBox=\"0 0 36 36\"><circle fill=\"none\" stroke-width=\"2\" cx=\"18\" cy=\"18\" r=\"16\" stroke-dasharray=\"100 100\" stroke-dashoffset=\"100\" transform=\"rotate(-90 18 18)\"></circle></svg>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<a href=\"how-star-wars-brought-kim-and-kanye.html\">\n");
      out.write("\t\t\t\t\t<em>How ?Star Wars? Brought Kim and Kanye</em>\n");
      out.write("\t\t\t\t\t<b>by J. Morrison</b>\n");
      out.write("\t\t\t\t\t<svg x=\"0px\" y=\"0px\" width=\"36px\" height=\"36px\" viewBox=\"0 0 36 36\"><circle fill=\"none\" stroke-width=\"2\" cx=\"18\" cy=\"18\" r=\"16\" stroke-dasharray=\"100 100\" stroke-dashoffset=\"100\" transform=\"rotate(-90 18 18)\"></circle></svg>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<a href=\"how-audiences-reacted-to-the-star-wars.html\">\n");
      out.write("\t\t\t\t\t<em>How Audiences Reacted to the Star Wars</em>\n");
      out.write("\t\t\t\t\t<b>by J. Morrison</b>\n");
      out.write("\t\t\t\t\t<svg x=\"0px\" y=\"0px\" width=\"36px\" height=\"36px\" viewBox=\"0 0 36 36\"><circle fill=\"none\" stroke-width=\"2\" cx=\"18\" cy=\"18\" r=\"16\" stroke-dasharray=\"100 100\" stroke-dashoffset=\"100\" transform=\"rotate(-90 18 18)\"></circle></svg>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<a href=\"the-ultimate-star-wars-dictionary.html\">\n");
      out.write("\t\t\t\t\t<em>The Ultimate Star Wars Dictionary</em>\n");
      out.write("\t\t\t\t\t<b>by J. Morrison</b>\n");
      out.write("\t\t\t\t\t<svg x=\"0px\" y=\"0px\" width=\"36px\" height=\"36px\" viewBox=\"0 0 36 36\"><circle fill=\"none\" stroke-width=\"2\" cx=\"18\" cy=\"18\" r=\"16\" stroke-dasharray=\"100 100\" stroke-dashoffset=\"100\" transform=\"rotate(-90 18 18)\"></circle></svg>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</aside> <!-- .cd-read-more -->\n");
      out.write("</div> <!-- .cd-articles -->\n");
      out.write("\n");
      out.write("<footer class=\"cd-footer\">\n");
      out.write("\t<p>Footer</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-2.1.4.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script> <!-- Resource jQuery -->\n");
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
