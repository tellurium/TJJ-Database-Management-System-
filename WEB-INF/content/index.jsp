<%@include file="inner/top-header.jsp" %>
	<%
		String s = resource.getString("introduction.title");
	%>
	<title>Index</title>
	<s:head />
<%@include file="inner/middle.jsp" %>
	<s:form action="loginAction">
		<s:textfield name="userName" label="User Name" />
		<s:password name="password" label="Password" />
		<s:select name="subsystemName" list="subsystemList"
			headerKey="" headerValue="--------------" />
		<s:submit />
	</s:form>

<%@include file="inner/bottom-footer.jsp" %>

