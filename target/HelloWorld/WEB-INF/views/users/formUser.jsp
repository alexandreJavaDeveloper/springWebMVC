<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Form user</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' />
	<link rel='stylesheet' href='<c:url value="/resources/css/bootstrap.min.css" />' type='text/css' media='all' />
	
	<script src="resources/js/jquery-2.1.4.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="modal-dialog">
	
	    <!-- Modal content-->
	    <div class="modal-content">
	    	<div class="modal-header">
	        	<h4 class="modal-title">Modal Header</h4>
	      	</div>
	      	
	      	<form:form method="post" modelAttribute="userForm" action="${action}">
		      	<div class="modal-body">
		        	<p>Add user</p>
		        		  <form:hidden path="id"/>
		        	Name: <form:input path="name" class="form-control input-sm" />
		        	Age:  <form:input path="age" class="form-control input-sm" />
		      	</div>
		      	
		      	<div class="modal-footer">
		      		<button type="submit" class="btn btn-default">Save</button>
		      		<a class="btn btn-default" href="listUsers">Cancel</a>
		      	</div>
	      	 </form:form>
	    </div>
	</div>
</body>
</html>