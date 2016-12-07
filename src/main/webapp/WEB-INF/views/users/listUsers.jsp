<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Spring 4 MVC</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' />
	<link rel='stylesheet' href='<c:url value="/resources/css/bootstrap.min.css" />' type='text/css' media='all' />
	
	<script src="resources/js/jquery-2.1.4.js"></script>
	<script src="resources/js/bootstrap.min.js"></script> 
</head>
<body>
	<h2>User list</h2>
	
	<p>Welcome, ${userNameLogged}</p>
	
	<table>
		<tr>
			<td>Name</td>
			<td>Age</td>
			<td></td>
			<td></td>
		</tr>
		
		<c:forEach var="user" items="${listUser}">
			<tr>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td><a href="editForm/${user.id}">Edit</a></td>
				<td><a href="deleteUser/${user.id}">Remove</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<a class="btn btn-info btn-lg" href="createForm">Add User</a>
</body>
</html>