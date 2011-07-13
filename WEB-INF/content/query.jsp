<%@include file="inner/top-header.jsp" %>

	<title><s:property value="subsystemName" /><s:text name="query.title" /></title>

<%@include file="inner/middle.jsp" %>
<%@include file="inner/navigator-bar.jsp" %>
	
	<s:form action="query" >
		<s:textfield name="subsystemType" label="%{getText('input_type.title')}" />
		<s:submit value="%{getText('query.title')}" />
	</s:form>	

<%@include file="inner/bottom-footer.jsp" %>