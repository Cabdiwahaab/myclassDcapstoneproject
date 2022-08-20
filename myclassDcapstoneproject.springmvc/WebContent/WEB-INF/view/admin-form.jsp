<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Admin</title>

	

	    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Admin Page</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add User</h3>
	
		<form:form action="saveUser" modelAttribute="user" method="POST">
		
			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					
					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" type="password"/></td>
					</tr>
					
					
					
					
					
					
					
					

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
			</div>
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/user/Admin">Back to List</a>
		</p>
	

</body>

</html>










