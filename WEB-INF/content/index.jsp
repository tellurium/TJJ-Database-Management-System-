<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Index</title>
</head>
<body>
	<s:form action="/welcome-user">
		<s:textfield name="userName" label="User Name" />
		<s:textfield name="password" label="Password" />
		<s:submit />
	</s:form>
</body>
</html>