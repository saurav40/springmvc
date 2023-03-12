<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%-- <h1>${emailId}</h1>
  <h1>${userName}</h1>
  <h1>${pass}</h1> --%>
  <%-- <h1>${common}</h1> --%>
  <h1>${user.email}</h1>
  <h1>${user.username}</h1>
  <h1>${user.password}</h1>
  
  <h3>You are successfully registered with us</h3>
</body>
</html>