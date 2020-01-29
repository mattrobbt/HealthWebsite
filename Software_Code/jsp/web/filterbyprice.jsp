<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://silva.computing.dundee.ac.uk"
         user = "19agileteam16"  password = "3244.at16.4423"/>
 
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from 19agileteam16db.procedures;
      </sql:query>
 
      <table border = "1" width = "100%">
         <tr>
            <th>ProceduresID</th>
            <th>Description</th>
            
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.ProceduresID}"/></td>
               <td><c:out value = "${row.Description}"/></td>
            </tr>
         </c:forEach>
      </table>
 
   </body>
</html>