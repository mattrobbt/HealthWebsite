
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.*"%>
<%@ page import="data.SearchSpecificTreatment"%>
<%@ page import="htmlgeneration.Treatment"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SearchSpecificTreatment.jsp" method="post">
                Search:<br><input type="text" name="Search" value="">
                <input type="radio" name="procedure" value="id" checked> Search By Procedure ID<br>
                <input type="radio" name="procedure" value="name"> Search By Procedure Name<br>
                <input type="submit" value="Submit">
            </form> 
        </form>
     <%@ page import="htmlgeneration.CardGeneratorTest"%>
     <%@ page import="htmlgeneration.TreatmentCardGenerator"%>
        <%
            SearchSpecificTreatment item=new SearchSpecificTreatment();
            String search=request.getParameter("Search");
            out.print(search);
            List<Treatment> result=new ArrayList<Treatment>();
            if(request.getParameter("procedure")=="id"){
                result=item.runDbQueryBySearchProcedureID(search);
            }
            else{
                result=item.runDbQueryBySearchProcedureName(search);
            }
            int index=1;
            for(Treatment obj:result){
                TreatmentCardGenerator test=new TreatmentCardGenerator(obj);
                String html=test.generateCard(index);
                out.print(html);
                index++;
                if(index==5)break;
            }
            %>
 <%   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  
%> 
   </body>
</html>
