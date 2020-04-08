<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.Statement"%>

<%@include file="header.jsp"  %>
<%-- <%@taglib uri="uri" prefix="fx" %> --%>


<!-- 
Scriptlet 
Directive @
Declaration ! 
Expression = -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>that is Title for home.jsp</title>
</head>
<body>
	<%!
	int coef = 3;	%>

	<%
	out.print("Hello from home.jsp file");
	%>
	<br>
	My Favorite Number is : <%= coef %>
</body>
</html>