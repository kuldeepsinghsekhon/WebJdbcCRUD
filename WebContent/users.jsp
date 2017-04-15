<%@page import="crud.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Header goes here</p>
<h1>All Users List</h1>
<table><tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>

<%
List<User> users=(List<User>)request.getAttribute("allusers");
for(User user: users) {
%>
<tr><td><%=user.getId() %></td>
<td><%=user.getName() %></td>
<td><%=user.getEmail() %></td>
<td><%=user.getPassword() %></td></tr>
<%
}
%>

</table>
<p>Footer goes here</p>
</body>
</html>