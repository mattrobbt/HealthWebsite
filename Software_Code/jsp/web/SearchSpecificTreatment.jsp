
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.*"%>
<%@ page import="data.SearchSpecificTreatment"%>
<%@ page import="htmlgeneration.TreatmentFake"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
      <table border = "1" width = "100%">
         <tr>
            <th>ProviderName</th>
            <th>ProcedureDescription</th>
            <th>Price</th>
            <th>Address</th>
         </tr>
         
         <%         
            SearchSpecificTreatment item = new SearchSpecificTreatment(); 
            List<TreatmentFake> result=item.runDbQueryBySearchProcedureID("375");
            for(TreatmentFake obj:result){
                out.print("<td>"+obj.getProviderName()+"</td>");
                out.print("<td>"+obj.getProcedureName()+"</td>");
                out.print("<td>"+obj.getPrice()+"</td>");
                out.print("<td>"+obj.getAddress()+"</td><tr>");
            }
            %>
      </table>
 <%   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  
%> 
   </body>
</html>
