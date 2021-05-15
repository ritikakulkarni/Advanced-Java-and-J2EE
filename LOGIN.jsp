<!DOCTYPE html>
<head>
<title>LOGIN PAGE</title>
</head>
<body>
<% 
String s=request.getParameter("user");
String p=request.getParameter("password");
%>
<% if(s=="admin" && p="123") { %>
	out.println("Welcome <%=s%> to JSP page");
<% } else { %>
	out.println("Doesn't match username and password");
<% } %>
</body>
</html>