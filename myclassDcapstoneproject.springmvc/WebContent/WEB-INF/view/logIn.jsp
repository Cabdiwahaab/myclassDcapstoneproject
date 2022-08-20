<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Log In</title>
<!-- reference our style sheet -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

<link rel="stylesheet" href="../styles/login.css">

    <link rel="preconnect" href="https://fonts.gstatic.com" />

    
<body>

    
  <nav class="navbar navbar-expand-lg bg-light fixed-top">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">ClassD Test</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link " aria-current="page" href="home">Home</a>
          </li>
         
          <li class="nav-item">
            <a class="nav-link  " href="contactUs">Contact Us</a>
          </li>

          <li class="nav-item">
            <a class="nav-link" href="Register">Register</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="logIn">Log In</a>
          </li>

         

         
         
          
        </ul>
        
      </div>
    </div>
  </nav>
 
	                          		  <section class="" style="background-color: white;">
            <div class="container"style="margin-top:6%;">
              <div class="row d-flex justify-content-center align-items-center ">
                <div class="col-lg-12 col-xl-11">
                  <div class="card text-black" style="border-radius: 15px;">
                    <div class="card-body p-md-5">
                      <div class="row justify-content-center">
                        <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
          
                          <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Log In Here </p>
                         
						
                  			
              
	                <div class="d-flex flex-row align-items-center mb-4">
	                                  <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
	                                  <div class="form-outline flex-fill mb-0">
	                                    <input type="email" id="form3Example3c" class="form-control" />
	                                    <label class="form-label" for="form3Example3c"> Email</label>
	                                  </div>
	                                </div>
	                
	                                <div class="d-flex flex-row align-items-center mb-4">
	                                  <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
	                                  <div class="form-outline flex-fill mb-0">
	                                    <input type="password" id="form3Example4c" class="form-control" />
	                                    <label class="form-label" for="form3Example4c">Password</label>
	                                  </div>
	                                </div>
	                
	                              
	                                <div class="d-flex justify-content-center mx-4 mb-3 mb-sm-4">
	                                  <button type="button" class="btn btn-primary btn" 
	                                   style="margin-top: 8%!important;">LogIn</button>
	                                </div>
	
					
				
	                
	              
	               
	                
	            </div>
	          
	                          		<div class="col-md-10 col-sm-6 col-xl-4 d-flex align-items-center order-1 order- sm-1">
	                          		
	                            	 <img src="${pageContext.request.contextPath}/resources/images/pexels-michael.jpg"
					                class="img-fluid" alt="Sample image">
					                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        </div>
                        </div>
                        </section>
                          
        <footer class="footer" style="text-align: center;">
            <hr>
            copyright by Ibrahim Aden 2022
    
    
    
        </footer>
        <script src="../script/login.js"></script>
      
  </body>
 

</html>