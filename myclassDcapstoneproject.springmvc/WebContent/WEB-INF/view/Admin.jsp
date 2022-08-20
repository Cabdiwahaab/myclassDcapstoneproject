<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   <!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Quiz</title>
   <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/static/css/style.css">
		  
 		<link rel="preconnect" href="https://fonts.gstatic.com" />
    	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" 
      rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous"> 
    
    
  </head>


     
<body>

    <nav class="navbar navbar-expand-lg bg-light fixed-top">
    <div class="container-fluid">
      
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">

			
                <!-- Links -->
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link" href="Admin">Admin</a>
                  </li>
                
                 
                   <li class="nav-item">
                    <a class="nav-link" href="logout">LogOut</a>
                  </li>
                  
                
         
                  
       		 </ul>
       		 </ul>
      </div>
    </div>
    </nav>
 
    <div id="container">
	
		<div id="content">
		
			<!-- put new button: Add User -->
		
			<input class="K" style="padding-top: 10px;
 		margin-top: 8%; margin-left: 100px;"type="button" value="Add User"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			
		
			<!--  add our html table here -->
		 <table class="table table-bordered table-striped" style="margin-top: 2%; width:85%; margin-left:100px;">
         <thead class="thead-dark">
            <tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Action</th>
				</tr>
				</thead>
				<!-- loop over and print our users -->
				<c:forEach var="tempUser" items="${users}">
				
					<!-- construct an "update" link with user id -->
					<c:url var="updateLink" value="/user/showFormForUpdate">
						<c:param name="userId" value="${tempUser.id}" />
					</c:url>					

					<!-- construct an "delete" link with user id -->
					<c:url var="deleteLink" value="/user/deleteUser">
						<c:param name="userId" value="${tempUser.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempUser.firstName} </td>
						<td> ${tempUser.lastName} </td>
						<td> ${tempUser.email} </td>
						<td> ${tempUser.password} </td>
						
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a class ="delete" href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	</div>

      
</body>
</html>