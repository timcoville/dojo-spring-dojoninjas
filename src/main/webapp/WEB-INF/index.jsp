<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Dojos</title>
</head>
<body>
	<table>
		<tr>
			<th>Dojo Name</th>
			<th>Ninja Count</th>
		</tr>
		
		<c:forEach items="${dojos}" var="dojo">
			<tr>
				<td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
				<td><c:out value="${dojo.ninjas.size()}" /></td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<a href="dojos/new"><button>Add New Dojo</button></a>
	<a href="ninjas/new"><button>Add New Ninja</button></a>
</body>
</html>