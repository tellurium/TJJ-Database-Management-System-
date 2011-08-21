<%@include file="inner/top-header.jsp" %>
	<title><s:text name="index.title" /></title>
	<s:head />

<%@include file="inner/middle.jsp" %>
	<s:actionerror />
	<h1><s:text name="index.title" /></h1>

	<s:form action="login">
		<s:textfield name="userName" label="%{getText('username.title')}" />
		<s:password name="password" label="%{getText('password.title')}" />
		<s:action name="showSubsystemList" executeResult="true"/>
		<s:submit value="%{getText('submit.title')}" />
	</s:form>

	
<%@include file="inner/bottom-footer.jsp" %>

