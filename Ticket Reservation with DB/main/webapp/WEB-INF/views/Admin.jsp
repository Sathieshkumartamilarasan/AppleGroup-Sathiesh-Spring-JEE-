<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>Admin Home Page</h1>
	<a href="home">Home</a>
	<a href="movies">Add Movies</a>
	<a href="times">Add Timings</a>
	<a href="ticket1">Add ticket Count </a>
	<div class="container-fluid">

		<div class="col-md-12">
			<div class="row">
				<div class="col-md-6">
					<h1>List of Movies</h1>

					<table border="1"width="100%">
						<thead>
							<tr>
								<th>movie_id</th>
								<th>movie_name</th>
								<th>release_date</th>
								<th colspan=1>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${mymodel.data}" var="model">
								<tr>
									<c:forEach items="${model.movies}" var="m">
										<tr>
											<td><c:out value="${m.movie_id}" /></td>
											<td><c:out value="${m.movie_name}" /></td>
											<td><c:out value="${m.release_date}" /></td>

											<td><a
												href="movie?movie_id=<c:out value="${m.movie_id}"/>">edit</a></td>

										</tr>
									</c:forEach>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>

				<div class="col-md-6">
					<h1>List of Timings</h1>

					<table border="1"width="100%">
						<thead>
							<tr>
								<th>timings_id</th>
								<th>timings</th>

								<th colspan=1>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${mymodel.data}" var="model">
								<tr>
									<c:forEach items="${model.time}" var="m">
										<tr>
											<td><c:out value="${m.timings_id}" /></td>
											<td><c:out value="${m.timings}" /></td>


											<td><a
												href="time?timings_id=<c:out value="${m.timings_id}"/>">edit</a></td>

										</tr>
									</c:forEach>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-6">
					<h1>List of TicketType</h1>

					<table border="1"width="100%">
						<thead>
							<tr>
								<th>ticket_type_id</th>
								<th>ticket_type</th>
								<th>ticket_type_count</th>
								<th colspan=1>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${mymodel.data}" var="model">
								<tr>
									<c:forEach items="${model.tickettype}" var="m">
										<tr>
											<td><c:out value="${m.ticket_type_id}" /></td>
											<td><c:out value="${m.ticket_type}" /></td>
											<td><c:out value="${m.ticket_type_count}" /></td>

											<td><a
												href="ticket2?ticket_type_id=<c:out value="${m.ticket_type_id}"/>">edit</a></td>

										</tr>
									</c:forEach>
								</tr>
							</c:forEach>
						</tbody>
					</table>

				</div>
				<div class="col-md-6"></div>
			</div>
		</div>
	</div>
</body>
</html>