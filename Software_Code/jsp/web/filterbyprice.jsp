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
            String query = "SELECT * FROM 19agileteam16.Procedures"; 
            List<Procedure> result=item.dbQuery(query);
            for(Procedure obj: result){
                out.println("<td>"+obj.getProceduresID()+"</td>");
                out.println("<td>"+obj.getDescription()+"</td><tr>");
            }
            %>
      </table>
 
   </body>
</html>