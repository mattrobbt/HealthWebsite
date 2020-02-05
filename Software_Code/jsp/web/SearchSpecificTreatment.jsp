
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SearchSpecificTreatment.jsp" method="post">
                Search:<br><input type="text" name="Search" value="">
                
                <input type="submit" value="Submit">
            </form> 
        </form>
     <%@ page import="htmlgeneration.CardGeneratorTest"%>
     <%@ page import="htmlgeneration.TreatmentCardGenerator"%>
        <%
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
            
            %>
 <%   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  
%> 
<form action="SearchSpecificTreatment.jsp" method="post">
          <!-- Side card used to take input of location-->
            <div class="card" style="width: 18rem;">
              <div class="card-body">
                <div class="filter-content">
                <h5 class="card-title">Sort By</h5>
                 <!-- Group of material radios - option 1 -->
                 <div class="form-check">
                     
<!--                     rename these two labels as price-->

                  <input type="radio" class="form-check-input" id="materialGroupExample1" name="price" value="pricelowtohigh">
                  <label class="form-check-label" for="materialGroupExample1">Price (Low - High)</label>
                  </div>

                  <!-- Group of material radios - option 2 -->
                  <div class="form-check">
                  <input type="radio" class="form-check-input" id="materialGroupExample2" name="price" value="pricehightolow" checked>
                  <label class="form-check-label" for="materialGroupExample2">Price (High - Low)</label>
                  </div>

                  <!-- Group of material radios - option 3 -->
                  <div class="form-check">
                  <input type="radio" class="form-check-input" id="materialGroupExample3" name="groupOfMaterialRadios">
                  <label class="form-check-label" for="materialGroupExample3"> Distance</label>
                  </div>  

                  <!-- Group of material radios - option 4 -->
                  <div class="form-check">
                    <input type="radio" class="form-check-input" id="materialGroupExample3" name="groupOfMaterialRadios">
                    <label class="form-check-label" for="materialGroupExample3"> Ranking</label>
                    </div>  
              </div>
            </div>
           </div>
          </br>
            <!-- Side card with range slider to filter maximum price/distance-->
            <div class="card" style="width: 18rem;">
              <div class="card-body">
                <div class="filter-content">
                <h5 class="card-title">Filters</h5>

                <div class="slidecontainer">
                  <label>Maximum Price</label>
                  <input type="range" class="custom-range" name="pricerange" min="1" max="100000" onchange="updateTextInput(this.value);">
                  <label>$<input type="text" id="textInput" value="500000" style="border: none;"></label>
                </div>
             
              </br>
                <div class="slidecontainer2">
                  <label></label>Distance</label>
                  <input type="range" class="custom-range "name="distancerange" min="0" max="2000" onchange="updateTextInput2(this.value);">
                  <label><input type="text" id="textInput2" value="10" style="border: none;"> .mi</label>
                </div>

                </div>
              </div>
            </div> 
          </br>
            <button type="submit" class="btn btn-primary btn-block">Submit</button>
          </div>
        </form>
        <%@ page import="htmlgeneration.TreatmentCardGenerator"%>
        <%
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
           %>
<%   
  
String name1=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  
%> 
   </body>
</html>
