package org.apache.jsp.client.public_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indextest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>Healthcare thing</title>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n");
      out.write("      integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyD4CBJappqMXhSoYXh3RmXt0-oiJaCjuGg\"></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\n");
      out.write("      integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n");
      out.write("      integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n");
      out.write("      integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("    <script\n");
      out.write("      src=\"../src/index.js\">\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"./index.css\">\n");
      out.write("  \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-danger mb-3 fixed-top\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\" style=\"max-width: 20%;\"><img src=\"images/hinder.png\" style=\"max-width: 55%;\"></a>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <div class=\"input-group offset-0\" style=\"max-width: 60%;\">\n");
      out.write("        <input class=\"form-control py-2 rounded-pill shadow-lg p-4 mb-2 bg-white rounded\"  type=\"search\" placeholder=\"Search\">\n");
      out.write("        <span class=\"input-group-append\">\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </span>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav offset-10 fixed-top\">\n");
      out.write("          <a class=\"navbar-brand display-1 offset-2 text-light\" href=\"#\" >Login </a>\n");
      out.write("            <a class=\"navbar-brand display-1 text-light\" href=\"#\" >Register</a>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div class=\"px-4 position-absolute\" id=\"sticky-sidebar\">\n");
      out.write("            <!-- Side card used to take input of location-->\n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"filter-content\">\n");
      out.write("                <h5 class=\"card-title\">Sort By</h5>\n");
      out.write("                 <!-- Group of material radios - option 1 -->\n");
      out.write("                 <div class=\"form-check\">\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample1\" name=\"groupOfMaterialRadios\">\n");
      out.write("                  <label class=\"form-check-label\" for=\"materialGroupExample1\">Price (Low - High)</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Group of material radios - option 2 -->\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample2\" name=\"groupOfMaterialRadios\" checked>\n");
      out.write("                  <label class=\"form-check-label\" for=\"materialGroupExample2\">Price (High - Low)</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Group of material radios - option 3 -->\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample3\" name=\"groupOfMaterialRadios\">\n");
      out.write("                  <label class=\"form-check-label\" for=\"materialGroupExample3\"> Distance</label>\n");
      out.write("                  </div>  \n");
      out.write("\n");
      out.write("                  <!-- Group of material radios - option 4 -->\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample3\" name=\"groupOfMaterialRadios\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"materialGroupExample3\"> Ranking</label>\n");
      out.write("                    </div>  \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("          </br> \n");
      out.write("\n");
      out.write("            <!-- Side card used to take input of location-->\n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"filter-content\">\n");
      out.write("                <h5 class=\"card-title\">Location</h5>\n");
      out.write("                  <div class=\"input-group mb-3\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" placeholder=\" Zip Code\" aria-label=\"Recipient's username\" aria-describedby=\"button-addon2\">\n");
      out.write("                  <a class=\"col-5 offset-6 position-absolute \" href=\"#\" ><img src=\"images/currentlocation.png\" style=\"max-width: 50%;\"> </a>\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                    <button class=\"btn btn-outline-dark\" type=\"button\" id=\"button-addon2\">Search</button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("          </br>\n");
      out.write("\n");
      out.write("            <!-- Side card with range slider to filter maximum price/distance-->\n");
      out.write("            \n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"filter-content\">\n");
      out.write("                <h5 class=\"card-title\">Filters</h5>\n");
      out.write("\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                  <label for=\"customRange1\">Maximum Price</label>\n");
      out.write("                  <input type=\"range\" class=\"custom-range\" id=\"ex6\" type=\"text\" data-slider-min=\"-5\" data-slider-max=\"20\" data-slider-step=\"1\" data-slider-value=\"3\">\n");
      out.write("                  \n");
      out.write("                  <span id=\"ex6CurrentSliderValLabel\">Current Slider Value: <span id=\"ex6SliderVal\">3</span></span>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                  <label for=\"customRange1\">Maximum Distance</label>\n");
      out.write("                  <input type=\"range\" class=\"custom-range\" id=\"customRange1\">\n");
      out.write("                  <label for=\"customRange1\">$1000</label> \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <div class=\"col offset-4\" id=\"main\">\n");
      out.write("            \n");
      out.write("          <!-- Procedure/hopsital information cards-->\n");
      out.write("          <div class=\"container-fluid offset-1\">  \n");
      out.write("            \n");
      out.write("          <!--Card 1-->\n");
      out.write("          <div class=\"card col-lg-10 col\"> \n");
      out.write("              <div class=\"card-body\" id=\"card1\">\n");
      out.write("              <a class=\"col-lg-10 col offset-11\" data-toggle=\"modal\" data-target=\"#myModal\"><img  id=\"map\" src=\"images/map.png\" style=\"max-width: 10%;\" ></a>\n");
      out.write("              <h6 class=\"card-title offset-10\">6.0 mi</h6>\n");
      out.write("              <h4 class=\"card-title\">Ninewells Hospital</h4>\n");
      out.write("              <h6 class=\"card-subtitle\">Heart Surgery</h6>\n");
      out.write("              <h6 class=\"\">$120,000</h6>  \n");
      out.write("              <p class=\"card-text\">........1</p>\n");
      out.write("\n");
      out.write("              <div class=\"showing-hidden\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card1'))\">Show more</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"hide\">\n");
      out.write("\n");
      out.write("                Hellooo11\n");
      out.write("                <button class=\"btn btn-outline-primary btn-block\" onclick=\"onClickShow(document.getElementById('card1'))\">Show less</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!--Card1 END-->\n");
      out.write("\n");
      out.write("          <div class=\"card col-lg-10 col\">\n");
      out.write("            <div class=\"card-body\" id=\"card2\">\n");
      out.write("            <a class=\"col-lg-10 col offset-11\" data-toggle=\"modal\" data-target=\"#myModal\"><img  id=\"map\" src=\"images/map.png\" style=\"max-width: 10%;\" ></a> \n");
      out.write("            <h6 class=\"card-title offset-10\">6.0 mi</h6>           \n");
      out.write("            <h4 class=\"card-title\">Ninewells Hospital</h4>\n");
      out.write("            <h6 class=\"card-subtitle\">Heart Surgery</h6>\n");
      out.write("            <h6 class=\"\">$120,000</h6>\n");
      out.write("            \n");
      out.write("            <p class=\"card-text\">........2</p>\n");
      out.write("\n");
      out.write("              <div class=\"showing-hidden\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card2'))\">Show more</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"hide\">\n");
      out.write("                Hellooo11\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card2'))\">Show less</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"card col-lg-10 col\">\n");
      out.write("            <div class=\"card-body\" id=\"card3\">\n");
      out.write("            <a class=\"col-lg-10 col offset-11\" data-toggle=\"modal\" data-target=\"#myModal\"><img  id=\"map\" src=\"images/map.png\" style=\"max-width: 10%;\" ></a>\n");
      out.write("            <h6 class=\"card-title offset-10\">6.0 mi</h6>\n");
      out.write("            <h4 class=\"card-title\">Ninewells Hospital</h4>\n");
      out.write("            <h6 class=\"card-subtitle\">Heart Surgery</h6>\n");
      out.write("            <h6 class=\"\">$120,000</h6>\n");
      out.write("              \n");
      out.write("            <p class=\"card-text\">........3</p>\n");
      out.write("\n");
      out.write("              <div class=\"showing-hidden\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card3'))\">Show more</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"hide\">\n");
      out.write("                Hellooo11\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card3'))\">Show less</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"card col-lg-10 col\">\n");
      out.write("            <div class=\"card-body\" id=\"card4\">\n");
      out.write("            <a class=\"col-lg-10 col offset-11\" data-toggle=\"modal\" data-target=\"#myModal\"><img  id=\"map\" src=\"images/map.png\" style=\"max-width: 10%;\" ></a>\n");
      out.write("            <h6 class=\"card-title offset-10\">6.0 mi</h6>\n");
      out.write("            <h4 class=\"card-title\">Ninewells Hospital</h4>\n");
      out.write("            <h6 class=\"card-subtitle\">Heart Surgery</h6>\n");
      out.write("            <h6 class=\"\">$120,000</h6>\n");
      out.write("             \n");
      out.write("            <p class=\"card-text\">.......4</p>\n");
      out.write("\n");
      out.write("              <div class=\"showing-hidden\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card4'))\">Show more</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"hide\">\n");
      out.write("                Hellooo11\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card4'))\">Show less</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"card col-lg-10 col \">\n");
      out.write("            <div class=\"card-body\" id=\"card5\">\n");
      out.write("            <a class=\"col-lg-10 col offset-11\" data-toggle=\"modal\" data-target=\"#myModal\"><img  id=\"map\" src=\"images/map.png\" style=\"max-width: 10%;\" ></a>\n");
      out.write("            <h6 class=\"card-title offset-10\">6.0 mi</h6>\n");
      out.write("            <h4 class=\"card-title\">Ninewells Hospital</h4>\n");
      out.write("            <h6 class=\"card-subtitle\">Heart Surgery</h6>\n");
      out.write("            <h6 class=\"\">$120,000</h6>\n");
      out.write("             \n");
      out.write("            <p class=\"card-text\">.......5</p>\n");
      out.write("\n");
      out.write("              <div class=\"showing-hidden\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card5'))\">Show more</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"hide\">\n");
      out.write("                Hellooo11\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card5'))\">Show less</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"card col-lg-10 col\">\n");
      out.write("            <div class=\"card-body\" id=\"card6\">\n");
      out.write("            <a class=\"col-lg-10 col offset-11\" data-toggle=\"modal\" data-target=\"#myModal\"><img  id=\"map\" src=\"images/map.png\" style=\"max-width: 10%;\" ></a>\n");
      out.write("            <h6 class=\"card-title offset-10\">6.0 mi</h6>\n");
      out.write("            <h4 class=\"card-title\">Ninewells Hospital</h4>\n");
      out.write("            <h6 class=\"card-subtitle\">Heart Surgery</h6>\n");
      out.write("            <h6 class=\"\">$120,000</h6>\n");
      out.write("            \n");
      out.write("            <p class=\"card-text\">.......6</p>\n");
      out.write("\n");
      out.write("              <div class=\"showing-hidden\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card6'))\">Show more</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"hide\">\n");
      out.write("                Hellooo11\n");
      out.write("                <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card6'))\">Show less</button>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        </div>  \n");
      out.write("        \n");
      out.write("          <!-- Page Navigation -->\n");
      out.write("      </br> \n");
      out.write("      <nav aria-label=\"Page navigation example\">\n");
      out.write("        <ul class=\"pagination\">\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("              <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("              <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("          <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("          <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("              <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("              <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("  \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("  <!-- The Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\">\n");
      out.write("    <div class=\"modal-dialog-fluid \">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("      \n");
      out.write("        <!-- Modal Header -->\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h4 class=\"modal-title\">Location</h4>\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Modal body -->\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <embed class=\"card-fluid\" id=\"map\" src=\"maps.html\" width=200 height=200 />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("  </body>\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"page-footer font-small indigo\">\n");
      out.write("\n");
      out.write("  <!-- Footer Links -->\n");
      out.write("  <div class=\"container\">\n");
      out.write("\n");
      out.write("    <!-- Grid row-->\n");
      out.write("    <div class=\"row text-center d-flex justify-content-center pt-5 mb-3\">\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-2 mb-3\">\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\">\n");
      out.write("          <a href=\"#!\">About us</a>\n");
      out.write("        </h6>\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-2 mb-3\">\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\">\n");
      out.write("          <a href=\"#!\">Help</a>\n");
      out.write("        </h6>\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-2 mb-3\">\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\">\n");
      out.write("          <a href=\"#!\">Contact</a>\n");
      out.write("        </h6>\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Grid row-->\n");
      out.write("    <hr class=\"rgba-white-light\" style=\"margin: 0 15%;\">\n");
      out.write("\n");
      out.write("    <!-- Grid row-->\n");
      out.write("    <div class=\"row d-flex text-center justify-content-center mb-md-0 mb-4\">\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-8 col-12 mt-5\">\n");
      out.write("        <p style=\"line-height: 1.7rem\">Hinder Helps you find the best hospitals for the best price for your specific needs.</p>\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Grid row-->\n");
      out.write("    <hr class=\"clearfix d-md-none rgba-white-light\" style=\"margin: 10% 15% 5%;\">\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- Footer Links -->\n");
      out.write("\n");
      out.write("  <!-- Copyright -->\n");
      out.write("  <div class=\"footer-copyright text-center py-3\">© 2020 Copyright:\n");
      out.write("    <a href=\"https://mdbootstrap.com/education/bootstrap/\"> Hinder</a>\n");
      out.write("  </div>\n");
      out.write("  <!-- Copyright -->\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
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