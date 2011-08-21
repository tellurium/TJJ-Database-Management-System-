<%@include file="inner/top-header.jsp" %>

	<title><s:property value="subsystemName" /><s:text name="query.title" /></title>
	<link rel="stylesheet" href="/tiaojujiang/css/query.css" type="text/css" />
<%@include file="inner/middle.jsp" %>
	

<%@include file="inner/navigator-bar.jsp" %>
	
	<div id="input-type" >
		<s:form action="query" >
			<s:textfield name="subsystemType" label="%{getText('input_type.title')}" />
			<s:submit value="%{getText('query.title')}" />
		</s:form>
	</div>
	
	<%@include file="units/list-attrs.jsp" %>
		
	<%@include file="units/parameter-picture.jsp" %>

	<%@include file="units/list-right-side.jsp" %>

	<%@include file="units/list-parameters.jsp" %>

<%@include file="inner/bottom-footer.jsp" %>