package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.ArrayList;
import java.lang.*;
import htmlgeneration.Treatment;
import data.DbConTemplate;
import data.SortingByPrice;
import htmlgeneration.TreatmentCardGenerator;

public final class SortAndFilter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <title>SELECT Operation</title>\n");
      out.write("   </head>\n");
      out.write("\n");
      out.write("   <body>\n");
      out.write("        <form action=\"SortAndFilter.jsp\" method=\"post\">\n");
      out.write("          <!-- Side card used to take input of location-->\n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"filter-content\">\n");
      out.write("                <h5 class=\"card-title\">Sort By</h5>\n");
      out.write("                 <!-- Group of material radios - option 1 -->\n");
      out.write("                 <div class=\"form-check\">\n");
      out.write("                     \n");
      out.write("<!--                     rename these two labels as price-->\n");
      out.write("\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample1\" name=\"price\" value=\"1\">\n");
      out.write("                  <label class=\"form-check-label\" for=\"materialGroupExample1\">Price (Low - High)</label>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <!-- Group of material radios - option 2 -->\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample2\" name=\"price\" value=\"0\" checked>\n");
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
      out.write("          </br>\n");
      out.write("            <!-- Side card with range slider to filter maximum price/distance-->\n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"filter-content\">\n");
      out.write("                <h5 class=\"card-title\">Filters</h5>\n");
      out.write("\n");
      out.write("                <div class=\"slidecontainer\">\n");
      out.write("                  <label>Maximum Price</label>\n");
      out.write("                  <input type=\"range\" class=\"custom-range\" name=\"pricerange\" min=\"1\" max=\"100000\" onchange=\"updateTextInput(this.value);\">\n");
      out.write("                  <label>$<input type=\"text\" id=\"textInput\" value=\"500000\" style=\"border: none;\"></label>\n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("              </br>\n");
      out.write("                <div class=\"slidecontainer2\">\n");
      out.write("                  <label></label>Distance</label>\n");
      out.write("                  <input type=\"range\" class=\"custom-range \"name=\"distancerange\" min=\"0\" max=\"2000\" onchange=\"updateTextInput2(this.value);\">\n");
      out.write("                  <label><input type=\"text\" id=\"textInput2\" value=\"10\" style=\"border: none;\"> .mi</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div> \n");
      out.write("          </br>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\">Submit</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("       ");

           Cookie cookie=null;
           Cookie[] cookies=null;
           cookies=request.getCookies();
           if(cookies!=null){
               out.print("Find Cookies");
               
               cookie = cookies[1];
               out.print("Name : " + cookie.getName( ) + ",  ");
               out.print("Value: " + cookie.getValue( )+" <br/>");
           }else {
            out.println("<h2>No cookies founds</h2>");
         }
           
          
           String search=request.getParameter("search");
           String maxprice_String=request.getParameter("pricerange");
           out.print(search);
           out.print(maxprice_String);
           List<Treatment> result=new ArrayList<Treatment>();
           SortingByPrice item=new SortingByPrice();
           out.print("///" + request.getParameter("price"));
           String price_String = request.getParameter("price");
           out.print(price_String == null);
           out.print(request.getParameter("price"));
           
           if (price_String != null){
               int price=Integer.parseInt(price_String);
               out.print("==============================" + price);

 
     
           if(price==1)
           {
               int maxprice=Integer.parseInt(maxprice_String);
               out.print("enter1");
               result=item.sortingByPriceHightoLow(cookie.getValue(), maxprice);
           }else if(price==0){
               out.print("enter2");
               int maxprice=Integer.parseInt(maxprice_String);
               result=item.sortingByPriceLowtoHigh(cookie.getValue(),maxprice);
              }
           int index=1;
           for(Treatment obj:result){
               TreatmentCardGenerator test=new TreatmentCardGenerator(obj);
               String html=test.generateCard(index);
                out.print(html);
                index++;
                if(index==5)break;
            }
           }
          // out.print(Integer.parseInt("6455546"));
        //  out.print("==============" + Integer.parseInt(price_String) + "=======================");

           
      out.write('\n');
   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  

      out.write(" \n");
      out.write("   </body>\n");
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
