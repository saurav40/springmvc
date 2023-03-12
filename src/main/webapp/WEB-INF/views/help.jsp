<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h5>
      <%--<%
         String h=(String)request.getAttribute("h");
         out.println(h); 
         
      --%>
      ${h}
    </h5>
    <hr>
   <p> ${shortlisted}<p>
    <br>
    <hr>
    <c:forEach var="item" items="${shortlisted}">
      <%-- <h3>${item }</h3>  --%>
      <c:out value="${item}"></c:out>
    </c:forEach>
</body>
</html>