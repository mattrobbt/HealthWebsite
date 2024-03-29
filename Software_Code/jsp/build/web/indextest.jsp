
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Healthcare thing</title>
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD4CBJappqMXhSoYXh3RmXt0-oiJaCjuGg"></script>
    <script
      src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
      integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
      integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
      integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
      crossorigin="anonymous"
    ></script>
    <script
      src="../src/index.js">
    </script>
    
    <link rel="stylesheet" href="./index.css">
  
  </head>
  <body>

    <nav class="navbar navbar-expand-lg navbar-light bg-danger mb-3 fixed-top">
      <a class="navbar-brand" href="#" style="max-width: 20%;"><img src="images/hinder.png" style="max-width: 55%;"></a>
      
    <!--searching -->
      <div class="input-group offset-0" style="max-width: 60%;">
          <form action="indextest.jsp" method="GET">
            <input class="form-control py-2 rounded-pill shadow-lg p-4 mb-2 bg-white rounded"  type="search" placeholder="Search" name="searchProcedure">
          </form>
        <span class="input-group-append">
           
            
        </span>
        
    </div>

    
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav offset-10 fixed-top">
          <a class="navbar-brand display-1 offset-2 text-light" href="#" >Login </a>
            <a class="navbar-brand display-1 text-light" href="#" >Register</a>

        </ul>

      </div>

    </nav>

    <div class="container-fluid">
      <div class="row">
          <div class="px-4 position-absolute" id="sticky-sidebar">
            <!-- Side card used to take input of location-->
            <div class="card" style="width: 18rem;">
              <div class="card-body">
                <div class="filter-content">
                <h5 class="card-title">Sort By</h5>
                 <!-- Group of material radios - option 1 -->
                 <div class="form-check">
                  <input type="radio" class="form-check-input" id="materialGroupExample1" name="groupOfMaterialRadios">
                  <label class="form-check-label" for="materialGroupExample1">Price (Low - High)</label>
                  </div>

                  <!-- Group of material radios - option 2 -->
                  <div class="form-check">
                  <input type="radio" class="form-check-input" id="materialGroupExample2" name="groupOfMaterialRadios" checked>
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

            <!-- Side card used to take input of location-->
            <div class="card" style="width: 18rem;">
              <div class="card-body">
                <div class="filter-content">
                <h5 class="card-title">Location</h5>
                  <div class="input-group mb-3">
                  <input type="text" class="form-control" placeholder=" Zip Code" aria-label="Recipient's username" aria-describedby="button-addon2">
                  <a class="col-5 offset-6 position-absolute " href="#" ><img src="images/currentlocation.png" style="max-width: 50%;"> </a>
                    <div class="input-group-append">
                    <button class="btn btn-outline-dark" type="button" id="button-addon2">Search</button>
                  </div>
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

                <div class="form-row">
                  <label for="customRange1">Maximum Price</label>
                  <input type="range" class="custom-range" id="myPriceRange" type="text" min="0" max="100" data-slider-step="1" value="50" >
                   <p>Current Slider Value:$ <span id="pricedemo"></span></p>
                   <script>
                        var priceslider = document.getElementById("myPriceRange");
                        var priceoutput = document.getElementById("pricedemo");
                        priceoutput.innerHTML = priceslider.value;
                        priceslider.oninput = function() {
                            priceoutput.innerHTML = this.value;
                        }
                    </script>
                   
                </div>
                
                <div class="form-row">
                  <label for="customRange1">Maximum Distance</label>
                   <input type="range" class="custom-range" id="myDistanceRange" type="text" min="0" max="100" data-slider-step="1" value="50" >
                   <p>Current Slider Value:$ <span id="distancedemo"></span></p>
                   <script>
                        var distanceslider = document.getElementById("myDistanceRange");
                        var distanceoutput = document.getElementById("distancedemo");
                        distanceoutput.innerHTML = distanceslider.value;
                        distanceslider.oninput = function() {
                            distanceoutput.innerHTML = this.value;
                        }
                    </script>
                </div>
                </div>
              </div>
            </div>
          </div>
        
          <div class="col offset-4" id="main">
            
          <!-- Procedure/hopsital information cards-->
          <div class="container-fluid offset-1">  
            
          <!--Card 1-->
          <div class="card col-lg-10 col"> 
              <div class="card-body" id="card1">
              <a class="col-lg-10 col offset-11" data-toggle="modal" data-target="#myModal"><img  id="map" src="images/map.png" style="max-width: 10%;" ></a>
              <h6 class="card-title offset-10">6.0 mi</h6>
              <h4 class="card-title">Ninewells Hospital</h4>
              <h6 class="card-subtitle">Heart Surgery</h6>
              <h6 class="">$120,000</h6>  
              <p class="card-text">........1</p>

              <div class="showing-hidden">
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card1'))">Show more</button>
              </div>
              <div class="hide">

                Hellooo11
                <button class="btn btn-outline-primary btn-block" onclick="onClickShow(document.getElementById('card1'))">Show less</button>
              </div>
            </div>
          </div>
          <!--Card1 END-->

          <div class="card col-lg-10 col">
            <div class="card-body" id="card2">
            <a class="col-lg-10 col offset-11" data-toggle="modal" data-target="#myModal"><img  id="map" src="images/map.png" style="max-width: 10%;" ></a> 
            <h6 class="card-title offset-10">6.0 mi</h6>           
            <h4 class="card-title">Ninewells Hospital</h4>
            <h6 class="card-subtitle">Heart Surgery</h6>
            <h6 class="">$120,000</h6>
            
            <p class="card-text">........2</p>

              <div class="showing-hidden">
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card2'))">Show more</button>
              </div>
              <div class="hide">
                Hellooo11
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card2'))">Show less</button>
              </div>
            </div>
          </div>

          <div class="card col-lg-10 col">
            <div class="card-body" id="card3">
            <a class="col-lg-10 col offset-11" data-toggle="modal" data-target="#myModal"><img  id="map" src="images/map.png" style="max-width: 10%;" ></a>
            <h6 class="card-title offset-10">6.0 mi</h6>
            <h4 class="card-title">Ninewells Hospital</h4>
            <h6 class="card-subtitle">Heart Surgery</h6>
            <h6 class="">$120,000</h6>
              
            <p class="card-text">........3</p>

              <div class="showing-hidden">
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card3'))">Show more</button>
              </div>
              <div class="hide">
                Hellooo11
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card3'))">Show less</button>
              </div>
            </div>
          </div>

          <div class="card col-lg-10 col">
            <div class="card-body" id="card4">
            <a class="col-lg-10 col offset-11" data-toggle="modal" data-target="#myModal"><img  id="map" src="images/map.png" style="max-width: 10%;" ></a>
            <h6 class="card-title offset-10">6.0 mi</h6>
            <h4 class="card-title">Ninewells Hospital</h4>
            <h6 class="card-subtitle">Heart Surgery</h6>
            <h6 class="">$120,000</h6>
             
            <p class="card-text">.......4</p>

              <div class="showing-hidden">
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card4'))">Show more</button>
              </div>
              <div class="hide">
                Hellooo11
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card4'))">Show less</button>
              </div>
            </div>
          </div>

          <div class="card col-lg-10 col ">
            <div class="card-body" id="card5">
            <a class="col-lg-10 col offset-11" data-toggle="modal" data-target="#myModal"><img  id="map" src="images/map.png" style="max-width: 10%;" ></a>
            <h6 class="card-title offset-10">6.0 mi</h6>
            <h4 class="card-title">Ninewells Hospital</h4>
            <h6 class="card-subtitle">Heart Surgery</h6>
            <h6 class="">$120,000</h6>
             
            <p class="card-text">.......5</p>

              <div class="showing-hidden">
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card5'))">Show more</button>
              </div>
              <div class="hide">
                Hellooo11
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card5'))">Show less</button>
              </div>
            </div>
          </div>

          <div class="card col-lg-10 col">
            <div class="card-body" id="card6">
            <a class="col-lg-10 col offset-11" data-toggle="modal" data-target="#myModal"><img  id="map" src="images/map.png" style="max-width: 10%;" ></a>
            <h6 class="card-title offset-10">6.0 mi</h6>
            <h4 class="card-title">Ninewells Hospital</h4>
            <h6 class="card-subtitle">Heart Surgery</h6>
            <h6 class="">$120,000</h6>
            
            <p class="card-text">.......6</p>

              <div class="showing-hidden">
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card6'))">Show more</button>
              </div>
              <div class="hide">
                Hellooo11
                <button class="btn btn-primary btn-block" onclick="onClickShow(document.getElementById('card6'))">Show less</button>
              </div>
          </div>
        </div>  
        
          <!-- Page Navigation -->
      </br> 
      <nav aria-label="Page navigation example">
        <ul class="pagination">
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
  
      </div>
    </div>
  </div>
</div>
    
  <!-- The Modal -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog-fluid ">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Location</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <embed class="card-fluid" id="map" src="maps.html" width=200 height=200 />
        </div>
        
     
        
      </div>
    </div>
  </div>
  
</div>
  </body>
<!-- Footer -->
<footer class="page-footer font-small indigo">

  <!-- Footer Links -->
  <div class="container">

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
          <a href="#!">Help</a>
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
        <p style="line-height: 1.7rem">Hinder Helps you find the best hospitals for the best price for your specific needs.</p>
      </div>
      <!-- Grid column -->

    </div>
    <!-- Grid row-->
    <hr class="clearfix d-md-none rgba-white-light" style="margin: 10% 15% 5%;">

  </div>
  <!-- Footer Links -->

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">� 2020 Copyright:
    <a href="https://mdbootstrap.com/education/bootstrap/"> Hinder</a>
  </div>
  <!-- Copyright -->

</footer>


<!-- Footer -->
</html>
