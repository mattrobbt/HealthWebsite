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
import data.SearchSpecificTreatment;
import htmlgeneration.Treatment;
import data.SortingByPrice;
import htmlgeneration.CardGeneratorTest;
import htmlgeneration.TreatmentCardGenerator;
import htmlgeneration.TreatmentCardGenerator;

public final class SearchSpecificTreatment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"SearchSpecificTreatment.jsp\" method=\"post\">\r\n");
      out.write("                Search:<br><input type=\"text\" name=\"Search\" value=\"\">\r\n");
      out.write("                \r\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("            </form> \r\n");
      out.write("        </form>\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("        ");

            SearchSpecificTreatment item=new SearchSpecificTreatment();
            if(request.getParameter("Search")==null){
                
            }else {
                Cookie SearchResult = new Cookie("Search", request.getParameter("Search"));
                SearchResult.setMaxAge(60*60*24);
                response.addCookie(SearchResult);
                
                out.println(request.getParameter("Search"));
                
                List<Treatment> result=new ArrayList<Treatment>();
                result=item.runDbQueryBySearchProcedure(request.getParameter("Search"));
                
                out.println("=====================enter Searching=====================");
                
                out.println("no search input");
                int index=1;
                for(Treatment obj:result){
                    TreatmentCardGenerator test=new TreatmentCardGenerator(obj);
                    String html=test.generateCard(index);
                    out.print(html);
                    index++;
                    if(index==5)break;
                }
            }
            
            
      out.write("\r\n");
      out.write(" ");
   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  

      out.write(" \r\n");
      out.write("<form action=\"SearchSpecificTreatment.jsp\" method=\"post\">\r\n");
      out.write("          <!-- Side card used to take input of location-->\r\n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <div class=\"filter-content\">\r\n");
      out.write("                <h5 class=\"card-title\">Sort By</h5>\r\n");
      out.write("                 <!-- Group of material radios - option 1 -->\r\n");
      out.write("                 <div class=\"form-check\">\r\n");
      out.write("                     \r\n");
      out.write("<!--                     rename these two labels as price-->\r\n");
      out.write("\r\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample1\" name=\"price\" value=\"pricelowtohigh\">\r\n");
      out.write("                  <label class=\"form-check-label\" for=\"materialGroupExample1\">Price (Low - High)</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <!-- Group of material radios - option 2 -->\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample2\" name=\"price\" value=\"pricehightolow\" checked>\r\n");
      out.write("                  <label class=\"form-check-label\" for=\"materialGroupExample2\">Price (High - Low)</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <!-- Group of material radios - option 3 -->\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                  <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample3\" name=\"groupOfMaterialRadios\">\r\n");
      out.write("                  <label class=\"form-check-label\" for=\"materialGroupExample3\"> Distance</label>\r\n");
      out.write("                  </div>  \r\n");
      out.write("\r\n");
      out.write("                  <!-- Group of material radios - option 4 -->\r\n");
      out.write("                  <div class=\"form-check\">\r\n");
      out.write("                    <input type=\"radio\" class=\"form-check-input\" id=\"materialGroupExample3\" name=\"groupOfMaterialRadios\">\r\n");
      out.write("                    <label class=\"form-check-label\" for=\"materialGroupExample3\"> Ranking</label>\r\n");
      out.write("                    </div>  \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           </div>\r\n");
      out.write("          </br>\r\n");
      out.write("            <!-- Side card with range slider to filter maximum price/distance-->\r\n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <div class=\"filter-content\">\r\n");
      out.write("                <h5 class=\"card-title\">Filters</h5>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"slidecontainer\">\r\n");
      out.write("                  <label>Maximum Price</label>\r\n");
      out.write("                  <input type=\"range\" class=\"custom-range\" name=\"pricerange\" min=\"1\" max=\"100000\" onchange=\"updateTextInput(this.value);\">\r\n");
      out.write("                  <label>$<input type=\"text\" id=\"textInput\" value=\"500000\" style=\"border: none;\"></label>\r\n");
      out.write("                </div>\r\n");
      out.write("             \r\n");
      out.write("              </br>\r\n");
      out.write("                <div class=\"slidecontainer2\">\r\n");
      out.write("                  <label></label>Distance</label>\r\n");
      out.write("                  <input type=\"range\" class=\"custom-range \"name=\"distancerange\" min=\"0\" max=\"2000\" onchange=\"updateTextInput2(this.value);\">\r\n");
      out.write("                  <label><input type=\"text\" id=\"textInput2\" value=\"10\" style=\"border: none;\"> .mi</label>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div> \r\n");
      out.write("          </br>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\">Submit</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        ");

           Cookie cookie=null;
           Cookie[] cookies=null;
           cookies=request.getCookies();
           if(cookies!=null){
               
               out.println("Find Cookies");
               out.println("=====================enter Sorting=====================");
            
               for(int i=0;i<cookies.length;i++){
                   out.print(i);
                   cookie=cookies[i];
                   out.print("Name : " + cookie.getName( ) + ",  ");
                   out.print("Value: " + cookie.getValue( )+" <br/>");
                   if(cookie.getName().equals("Search"))break;
               }
               
               
           }else {
            out.println("<h2>No cookies founds</h2>");
         }
           
           String search=request.getParameter("search");
           String maxprice_String=request.getParameter("pricerange");
           out.println(search);
           out.println(maxprice_String);
           List<Treatment> result_SF=new ArrayList<Treatment>();
           SortingByPrice item_SF=new SortingByPrice();
           out.print(request.getParameter("price"));
           if(request.getParameter("price")==null){
               
           }
           
           else if(request.getParameter("price").equals("pricehightolow"))
           {
               int maxprice=Integer.parseInt(maxprice_String);
               result_SF=item_SF.sortingByPriceHightoLow(cookie.getValue(), maxprice);
           }else if(request.getParameter("price").equals("pricelowtohigh")){
               int maxprice=Integer.parseInt(maxprice_String);
               result_SF=item_SF.sortingByPriceLowtoHigh(cookie.getValue(), maxprice);
           }
           int index_SF=1;
           for(Treatment obj:result_SF){
                TreatmentCardGenerator test=new TreatmentCardGenerator(obj);
                String html=test.generateCard(index_SF);
                out.print(html);
                index_SF++;
                if(index_SF==5)break;
            }
           
      out.write('\r');
      out.write('\n');
   
  
String name1=request.getParameter("uname");  
out.print("Welcome "+name1);  
  
pageContext.setAttribute("user",name1,PageContext.SESSION_SCOPE);  
  

      out.write(" \r\n");
      out.write("   </body>\r\n");
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
