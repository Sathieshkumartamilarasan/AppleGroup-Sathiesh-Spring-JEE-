<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${id }
<form action="movielist"method="post">
<input type="hidden"name="movie_id" value =${id } />
MovieName:<input type="text"name="movie_name"/><br/><br/>
ReleaseDate:<input type="text"name="release_date"/><br/><br/>
No_Of_Shows:<input type="text"name="no_of_shows"/><br/><br/>
Active:<input type="text"name="active"/><br/><br/>
<input type="submit"value="update"/>
</form>
</body>
</html>