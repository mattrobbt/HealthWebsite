<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.*"%>
<%@ page import="data.FilterByPrice"%>
<%@ page import="htmlgeneration.Treatment"%>
<%@ page import="data.DbConTemplate"%>
<%@ page import="data.SortingByPrice"%>
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
        <form action="SortAndFilter.jsp" method="post">
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
                  <input type="range" class="custom-range" name="pricerange" min="1" max="1000000" onchange="updateTextInput(this.value);">
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
       
       <%
           
           Cookie cookie=null;
           Cookie[] cookies=null;
           cookies=request.getCookies();
           if(cookies!=null){
               out.print("Find Cookies");
               cookie=cookies[1];
               out.print("Name : " + cookie.getName( ) + ",  ");
               out.print("Value: " + cookie.getValue( )+" <br/>");
           }else {
            out.println("<h2>No cookies founds</h2>");
            }
           SortingByPrice item=new SortingByPrice();
           List<Treatment> result=new ArrayList<Treatment>();
           if(request.getParameter("price")=="pricelowtohigh"){
               int maxprice=Integer.parseInt(request.getParameter("pricerange"));
               result=item.sortingByPriceLowtoHigh(cookie.getValue(), maxprice);
           }
           else if(request.getParameter("price")=="pricehightolow"){
               int maxprice=Integer.parseInt(request.getParameter("pricerange"));
               result=item.sortingByPriceHightoLow(cookie.getValue(), maxprice);

           }
           %>
 <%   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  
%> 
   </body>
</html>