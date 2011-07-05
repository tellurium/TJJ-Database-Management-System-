<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Index</title>
</head>
<body>
	<s:form action="/hello-world">
		<s:textfield name="userName" label="User Name" />
		<s:textfield name="password" label="Password" />
		<s:select name="subsystem" label="Select a subsystem" list="{'sys1', 'sys2', 'sys3'}"
			headerKey="" headerValue="----------" />
		<s:submit />
	</s:form>
</body>
</html>