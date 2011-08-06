<%@include file="inner/top-header.jsp" %>
	<title><s:text name="index.title" /></title>
	<s:head />

<%@include file="inner/middle.jsp" %>
	
	<h1><s:text name="index.title" /></h1>

	<s:form action="login">
		<s:textfield name="userName" label="%{getText('username.title')}" />
		<s:password name="password" label="%{getText('password.title')}" />
		<s:select name="subsystemName" list="subsystemList" label="%{getText('subsystem_list.hint')}" />
		<s:submit value="%{getText('submit.title')}" />
	</s:form>

	
<%@include file="inner/bottom-footer.jsp" %>

