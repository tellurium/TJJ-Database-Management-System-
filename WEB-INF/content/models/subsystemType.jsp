<%@include file="../inner/top-header.jsp" %>
	<title><s:text name="query.title" /><s:property value="#session['SUBSYSTEM_NAME']" /></title>
<%@include file="../inner/middle.jsp" %>

<%@include file="../inner/navigator-bar.jsp" %>
	
	<div id="input-type" >
		<s:form action="showSubsystemType" >
			<s:textfield name="type" label="%{getText('input_type.title')}" />
			<s:submit value="%{getText('query.title')}" />
		</s:form>
	</div>
	
	


<%@include file="../inner/bottom-footer.jsp" %>