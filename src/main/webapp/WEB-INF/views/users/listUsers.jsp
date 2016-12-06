<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Spring 4 MVC</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>User list</h2>
	
	<p>Welcome, ${name}</p>
	
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
	
</body>
</html>