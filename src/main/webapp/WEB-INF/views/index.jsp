<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
  <h1>This home page</h1>
  <h1>called by home controller</h1>
  <h1>Url/home</h1>
  <%
    String name=(String)request.getAttribute("name");
    String address=(String)request.getAttribute("address");
    List<String> like=(List<String>)request.getAttribute("like");
  %>
  <h2><%=name %></h2>
  <h2><%=address %></h2>
  <h3>What i like<br></h3>
  <h3><%  
      for(String s:like){
    	  %>
    	<%=s %>
   <%
      }
    	 
  %></h3>
</body>
</html>