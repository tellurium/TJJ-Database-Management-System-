<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Index</title>
	<s:head />
</head>
<body>
	<s:form action="loginAction">
		<s:textfield name="userName" label="User Name" />
		<s:password name="password" label="Password" />
		<s:select name="subsystem" list="subsystemList"
			headerKey="" headerValue="----------" />
		<s:submit />
	</s:form>
</body>
</html>