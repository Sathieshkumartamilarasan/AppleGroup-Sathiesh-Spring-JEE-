<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${ticket_type_id }
<form action ="ticket3"method="post">
<c:if test="${ticket_type_id} >0">
<input type="hidden"name="ticket_type_id"value="${ticket_type_id }"/>
</c:if>
Ticket Type:<input type="text"name="ticket_type"/><br/><br/>
Ticket Type Count:<input type="text"name="ticket_type_count"/><br/><br/>
<input type="submit"value="Click"/><br/>

</form>
</body>
</html>