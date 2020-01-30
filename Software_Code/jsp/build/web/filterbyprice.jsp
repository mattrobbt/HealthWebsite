<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.*"%>
<%@ page import="data.FilterByPrice"%>
<%@ page import="data.Procedure"%>
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
 
      <table border = "1" width = "100%">
         <tr>
            <th>ProceduresID</th>
            <th>Description</th>
            
         </tr>
         
         <%         
            FilterByPrice item = new FilterByPrice(); 
            String query = "SELECT * FROM 19agileteam16db.Procedures"; 
            List<Procedure> result=item.runDbQuery();
            for(Procedure obj:result){
                out.print("<td>"+obj.getProceduresID()+"</td>");
                out.print("<td>"+obj.getDescription()+"</td><tr>");
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