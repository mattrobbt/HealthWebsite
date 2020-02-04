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
import htmlgeneration.CardGeneratorTest;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"SearchSpecificTreatment.jsp\" method=\"post\">\n");
      out.write("                Search:<br><input type=\"text\" name=\"Search\" value=\"\">\n");
      out.write("                <input type=\"radio\" name=\"id\" value=\"id\" checked=\"checked\"> Search By Procedure ID<br>\n");
      out.write("                <input type=\"radio\" name=\"name\" value=\"name\"> Search By Procedure Name<br>\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("            </form> \n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("        ");

            SearchSpecificTreatment item=new SearchSpecificTreatment();
            Cookie SearchResult = new Cookie("Search", request.getParameter("Search"));
            SearchResult.setMaxAge(60*60*24);
            response.addCookie(SearchResult);
            out.print(request.getParameter("Search"));
            List<Treatment> result=new ArrayList<Treatment>();
            if(request.getParameter("id")!=null){
                
                result=item.runDbQueryBySearchProcedureID(request.getParameter("Search"));
            }
            else{
                
                result=item.runDbQueryBySearchProcedureName(request.getParameter("Search"));
            }
            int index=1;
            for(Treatment obj:result){
                TreatmentCardGenerator test=new TreatmentCardGenerator(obj);
                String html=test.generateCard(index);
                out.print(html);
                index++;
                if(index==5)break;
            }
            
      out.write('\n');
      out.write(' ');
   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  

      out.write(" \n");
      out.write("   </body>\n");
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
