
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.lang.*"%>
<%@ page import="data.SearchSpecificTreatment"%>
<%@ page import="htmlgeneration.Treatment"%>
<%@ page import="data.DbConTemplate"%>
<%@ page import="data.SortingByPrice"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Healthify</title>
    <link rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
      crossorigin="anonymous"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Poppins:400,800" rel="stylesheet" />
    <link href="css/main.css" rel="stylesheet" />
    <meta name=âviewportâ content=âwidth=device-width, initial-scale=1.0">
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD4CBJappqMXhSoYXh3RmXt0-oiJaCjuGg"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
      integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
      crossorigin="anonymous"></script>
    
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
      integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
      crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
      integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="../src/index.js"></script>
    <link rel="stylesheet" href="./index.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
   function updateTextInput(val) {
          document.getElementById('textInput').value=val; 
        }
  function updateTextInput2(val2) {
    document.getElementById('textInput2').value=val2; 
  }
  function destroyModal(){
    $('#myModal').hide();
    $('.modal-backdrop').hide();
  }
  function showModal(){
   $('#myModal').show();
   $('.modal-backdrop').show();
 }
 function destroyModal_review(){
    $('#review').hide();
    $('.modal-backdrop').hide();
  }
  function showModal_review(){
   $('#review').show();
   $('.modal-backdrop').show();
 }
  </script>

  </head>
  <body>

    <nav class="navbar navbar-expand-lg navbar-light mb-3 fixed-top" style="background-color: #C91F37">
      <a class="navbar-brand" href="#" style="max-width: 10%;"><img src="images/hinder.png" id="logo" style="max-width: 45%;"></a>
      <h3 class="display-6 text-light ">Healthify</h3>
  
      <form  action="index.jsp" method="post" class="col-12 col-lg-6 offset-lg-2">
          
        <div class="p-2 bg-light rounded rounded-pill shadow-lg">
          <div class="input-group">
            <input type="search" placeholder="Search" name="Search" aria-describedby="button-addon1" class="form-control border-0 bg-light">
            
            <div class="input-group-append">
                
              <button id="button-addon1" type="submit" class="btn btn-link text-primary"><i class="fa fa-search"></i></button>
            </div>
          </div>
          </div>
        </form>
      
           
         <!-- <a class="btn navbar-brand display-1 offset-2 text-light" href="login.html" >Login </a>
          <a class="btn navbar-brand display-1 text-light" href="#" >Register</a> -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul id="filters" class="navbar-nav fixed-top col-12 col-lg-3">
         
            <div class="row">
                <div class="col-sm-5 col-md-5 col-lg-3 col-4 offset-sm-1 offset-lg-1 offset-md-3 " id="sticky-sidebar">
                <form>
                  <!-- Side card used to take input of location-->
                  <div class="card" style="width: 18rem;">
                    <div class="card-body">
                      <div class="filter-content">
                      <h5 class="card-title">Location</h5>
                        <div class="input-group mb-3">
                        <input type="text" class="form-control" placeholder=" Zip Code" aria-label="Recipient's username" aria-describedby="button-addon2">
                        <a class="col-5 offset-6 position-absolute " href="#" ><img id="logo" src="images/currentlocation.png" style="max-width: 50%;"> </a>
                          <div class="input-group-append">
                          <button class="btn btn-outline-dark" type="submit" id="button-addon2">Search</button>
                        </div>
                      </div>
                    </div>
                  </div>
                 </div>
                </br>
                </form>
                <form action="index.jsp" method="post">
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
 

        </ul>

      </div>
      
    </nav>

          <div class="col-lg-8 col-15 offset-lg-4" id="main">
            
          <!-- Procedure/hospital information cards-->
          <div class="container-fluid">  
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
           out.println(request.getParameter("price"));
           out.println("====="+cookie.getValue()+"======");
           if(request.getParameter("price")==null){
               
           }
           
           else if(request.getParameter("price").equals("pricehightolow"))
           {
               int maxprice=Integer.parseInt(maxprice_String);
               out.println(maxprice);
               result_SF=item_SF.sortingByPriceHightoLow(cookie.getValue(), maxprice);
           }else if(request.getParameter("price").equals("pricelowtohigh")){
               int maxprice=Integer.parseInt(maxprice_String);
                              out.println(maxprice);

               result_SF=item_SF.sortingByPriceLowtoHigh(cookie.getValue(), maxprice);
           }
           int index_SF=1;
           for(Treatment obj_SF:result_SF){
               out.print("generate card");
                TreatmentCardGenerator test_SF=new TreatmentCardGenerator(obj_SF);
                String html_SF=test_SF.generateCard(index_SF);
                out.print(html_SF);
                index_SF++;
                if(index_SF==5)break;
            }
           %>
<%   
  
String name1=request.getParameter("uname");  
out.print("Welcome "+name1);  
  
pageContext.setAttribute("user",name1,PageContext.SESSION_SCOPE);  
  
%> 
             
      
              
              </br> 
      </div>
    </div>
  </div>
</div>
    
  <!-- The Map Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog-fluid ">
      <div class="modal-content" id="modalmap">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Location</h4>

          <button type="button" class="close" onclick="destroyModal('myModal');">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <embed class="card-fluid" id="map" src="./maps.html" width=200 height=200 />
        </div> 
      </div>
    </div>
  </div>
    <!-- Map Modal End-->

   <!-- The Review Modal panel -->
   <div class="modal fade" id="review">
    <div class="modal-dialog-fluid ">
      <div class="modal-content" id="modalpanel">
        <!-- Modal Header -->
        <div class="modal-header">
            <h4 class="modal-title">Reviews</h4>
            <button type="button" class="close" onclick="destroyModal_review('myModal');">
            <span aria-hidden="true">&times;</span>
        </div>
        <!-- Modal body -->
        <div class="modal-body">
          <!--Review 1-->
          <div class="card col-10"> 
            <div class="card-body" id="card1">
              <h5 class="card-title">Great Treatment</h5>
              <h6 class="card-subtitle">Heart Surgery</h6>
              <span class="fa fa-star checked"></span>
              <span class="fa fa-star checked"></span>
              <span class="fa fa-star checked"></span>
              <span class="fa fa-star"></span>
              <span class="fa fa-star"></span>
          </div>
        </div>
        <!--Review1 END-->
        <!--Review 2-->
        <div class="card col-lg-10 col"> 
          <div class="card-body" id="card1">
            <h5 class="card-title">Fast and Caring</h5>
            <h6 class="card-subtitle">Heart Surgery</h6>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
        </div>
      </div>
      <!--Review2 END-->
        </div>  
      </div>
    </div>
  </div>
    <!-- Review Modal End -->

    <!-- The accessibility Modal panel -->
    <div class="modal fade" id="mypanel">
      <div class="modal-dialog-fluid ">
        <div class="modal-content" id="modalpanel">
          <!-- Modal Header -->
          <div class="modal-header">
            <h4 class="modal-title">Accessibility</h4>
            <button type="button" class="close" onclick="destroyModal('myModal');">
              <span aria-hidden="true">&times;</span>
          </div>
          <!-- Modal body -->
          <div class="modal-body">
            <h4 class="display-5">
              Font Size: 
            </h4>
            <a type="button" class="btn-outline-dark rounded-pill shadow-lg p-3 offset-7" data-target="#myModalpanel" >&plus;</a>
            <a type="button" class="btn-outline-dark rounded-pill shadow-lg p-3 " data-target="#myModalpanel" >&minus;</a>
          </div>  
        </div>
      </div>
    </div>
<!-- Accessibility Modal End -->

  </body>
<!-- Footer -->
<footer class="page-footer font-small indigo">

  <!-- Footer Links -->
  <div class="container">
    <nav aria-label="Page navigation example">
      <ul class="pagination offset-4 offset-lg-5">
        <li class="page-item">
          <a class="page-link" href="#" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
            <span class="sr-only">Previous</span>
          </a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
          <a class="page-link" href="#" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
            <span class="sr-only">Next</span>
      </a>
    </li>
  </ul>
</nav>
    <!-- Grid row-->
    <div class="row text-center d-flex justify-content-center pt-5 mb-3">

      <!-- Grid column -->
      <div class="col-md-2 mb-3">
        <h6 class="text-uppercase font-weight-bold">
          <a href="#!">About us</a>
        </h6>
      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-2 mb-3">
        <h6 class="text-uppercase font-weight-bold">
          <a href="#!" data-toggle="modal" data-target="#mypanel">Accessibility</a>
        </h6>
      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-2 mb-3">
        <h6 class="text-uppercase font-weight-bold">
          <a href="#!">Contact</a>
        </h6>
      </div>
      <!-- Grid column -->

    </div>
    <!-- Grid row-->
    <hr class="rgba-white-light" style="margin: 0 15%;">

    <!-- Grid row-->
    <div class="row d-flex text-center justify-content-center mb-md-0 mb-4">

      <!-- Grid column -->
      <div class="col-md-8 col-12 mt-5">
        <p style="line-height: 1.7rem">Healthify helps you find the best hospitals for the best price for your specific needs.</p>
      </div>
      <!-- Grid column -->

    </div>
    <!-- Grid row-->
    <hr class="clearfix d-md-none rgba-white-light" style="margin: 10% 15% 5%;">

  </div>
  <!-- Footer Links -->

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">Â© 2020 Copyright:
    <a href="https://mdbootstrap.com/education/bootstrap/"> Healthify</a>
  </div>
  <!-- Copyright -->
</footer>
<!-- Footer -->
</html>
