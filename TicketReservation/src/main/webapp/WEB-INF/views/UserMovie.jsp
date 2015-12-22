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
	<h1>List of Movie </h1>
	${id }
	<table border="1"width="60%">
		<thead>
			<tr>
				
				<th>movie_name</th>
				<th>release_date</th>
				<th colspan=1>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list1}" var="m">
				<tr>
					
					<td><c:out value="${m.movie_name}" /></td>
					<td><c:out value="${m.release_date}" /></td>
                     <td><form action="book">
                         <input type="hidden"name="id"value=${id } />
                         <input type="hidden"name="releaseDate"value="${m.release_date}"/>
                         <input type="hidden"name="movie_id"value=<c:out value="${m.movie_id}"  /> />
                         <input type="submit"value="Book"/>
                     </form></td>

				<%-- <td><a href="book?movie_id=<c:out value="${m.movie_id}"/>">Book</a></td>  --%>
                 
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>