<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"
         import="java.util.ResourceBundle" %>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<%
		//Just load the MessageBundle.properties file to read Chinese information
		ResourceBundle resource = ResourceBundle.getBundle("MessageBundle");
		String title = resource.getString("introduction.title");
	%>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title><%=title%></title>
</head>
<body>
	
	<%@include file="navigator-bar.jsp" %>	

	<div class="introduction-text">
		<h1>Title<h1>
		<p>More details about the subsystem</p>
	</div>
</body>
</html>