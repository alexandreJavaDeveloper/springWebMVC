<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
			<td>Nome</td>
			<td>Idade</td>
		</tr>
		
		<c:forEach var="user" items="${listUser}">
			<tr>
				<td>${user.name}</td>
				<td>${user.age}</td>
			</tr>
		</c:forEach>
	</table>
	
	<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#addUserModal">Add User</button>
	
	<!-- add user Modal -->
	<div id="addUserModal" class="modal fade" role="dialog">
		<div class="modal-dialog">
		
		    <!-- Modal content-->
		    <div class="modal-content">
		    	<div class="modal-header">
		        	<button type="button" class="close" data-dismiss="modal">&times;</button>
		        	<h4 class="modal-title">Modal Header</h4>
		      	</div>
		      	
		      	<form:form method="post" modelAttribute="userForm" action="saveUser">  
			      	<div class="modal-body">
			        	<p>Add user</p>
			        	Name: <form:input path="name" class="form-control input-sm" />
			        	Age: <form:input path="age" class="form-control input-sm" />
			      	</div>
			      	
			      	<div class="modal-footer">
			      		<button type="submit" class="btn btn-default">Save</button>
			        	<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
			      	</div>
		      	 </form:form>
		    </div>
		</div>
	</div>
	
</body>
</html>