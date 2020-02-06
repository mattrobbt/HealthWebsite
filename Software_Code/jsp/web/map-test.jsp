
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.*"%>
<%@ page import="data.SearchSpecificTreatment"%>
<%@ page import="htmlgeneration.Treatment"%>
<%@ page import="data.SortingByPrice"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Maps Testing</title>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD4CBJappqMXhSoYXh3RmXt0-oiJaCjuGg"></script>
    <style>
      /* Always set the map height explicitly to define the size of the div
      * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html,
      body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
    </head>
    <body>
        
        <form action="map-test.jsp" method="post">
                Search:<br><input type="text" name="Search" value="">
                
                <input type="submit" value="Submit">
            </form> 
        </form>
     <%@ page import="htmlgeneration.CardGeneratorTest"%>
     <%@ page import="htmlgeneration.TreatmentCardGenerator"%>
     <div id="map"></div>
        <script src="./client/src/maps/geolocation.js"></script>
        <script src="./client/src/maps/maps.js"></script>
        <script src="./client/src/distances.js"></script>
        <script>
         let metaInfo = [];
        <%
            SearchSpecificTreatment item=new SearchSpecificTreatment();
            if(request.getParameter("Search")==null){
                
            }else {
                Cookie SearchResult = new Cookie("Search", request.getParameter("Search"));
                SearchResult.setMaxAge(60*60*24);
                response.addCookie(SearchResult);
                
                List<Treatment> result=new ArrayList<Treatment>();
                result=item.runDbQueryBySearchProcedure(request.getParameter("Search"));
                
                int index=1;
                for(Treatment obj:result){
                    
                    out.print("metaInfo = addToMetaInfo(metaInfo,"+ obj.ProviderID+"," + "\"" + obj.getProviderName() + "\"," + obj.getPrice() + "," + obj.provider_lat+","+obj.provider_lng+");\n");
                    index++;
                    //if(index==5)break;
                }
            }
            
            %>
                // initialising map
const map = createMap();

// getting location data, defaults to central USA if geolocation is rejected
let userLocation;
let tempUserLocation = geoLocation(map);

if (tempUserLocation !== undefined) {
  userLocation = tempUserLocation;
} else {
  userLocation = {
    lat: 38,
    lng: -98
  };
}

// calculate & add distances to metaInfo
metaInfo = updateDistances(userLocation, metaInfo);

// display markers on map
addMarkersFromMetaInfo(map, metaInfo);
addUserMarker(map, userLocation, 'You are here');

// optional circle for filter
let distanceRange = 1000000;
const circle = addCircle(map, distanceRange, userLocation);

                </script>
 <%   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  
%> 
   </body>
</html>
