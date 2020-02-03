<%-- 
    Document   : index
    Created on : 29-Jan-2020, 11:34:21
    Author     : danielscheitler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    Cookie zipcode = new Cookie("zipcode", "000000");
    
    zipcode.setMaxAge(60*60*24);
    
    response.addCookie(zipcode);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Cookies</title>
    </head>
    <body>
    <center><h1>List of User Cookies:</h1></center>
    <ul>
         <li><p><b>Zip-code:</b>
            <%= request.getParameter("zipcode")%>
         </p></li>
      </ul>
</body>
</html>
