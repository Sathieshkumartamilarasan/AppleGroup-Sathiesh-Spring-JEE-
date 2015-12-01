<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show list of user</title>
</head>
<body>
<h1>List of Movies</h1>
  <a href="ticket1">Add ticket Count </a>
	<table border=1>
		<thead>
			<tr>
				<th>ticket_type_id</th>
				<th>ticket_type</th>
				<th>ticket_type_count</th>
				<th colspan=1>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="m">
				<tr>
					<td><c:out value="${m.ticket_type_id}" /></td>
					<td><c:out value="${m.ticket_type}" /></td>
					<td><c:out value="${m.ticket_type_count}" /></td>
					
					<td><a href="ticket2?ticket_type_id=<c:out value="${m.ticket_type_id}"/>">edit</a></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>