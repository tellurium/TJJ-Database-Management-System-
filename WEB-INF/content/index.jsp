<%@include file="inner/top-header.jsp" %>
	<title><s:text name="index.title" /></title>
	<s:head />

<%@include file="inner/middle.jsp" %>
	
	<h1><s:text name="index.title" /></h1>

	<s:form action="login">
		<s:textfield name="userName" label="User Name" />
		<s:password name="password" label="Password" />
		<s:select name="subsystemName" list="subsystemList" label="Select a subsystem" />
		<s:submit />
	</s:form>

<%@include file="inner/bottom-footer.jsp" %>

