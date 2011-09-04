<%@include file="/WEB-INF/content/inner/top-header.jsp" %>

<%@include file="/WEB-INF/content/inner/middle.jsp" %>
	<div id="subsystem-list">
		<s:select name="subsystemName" list="subsystemList" label="%{getText('subsystem_list.hint')}" headerKey="-1" headerValue="%{getText('select_subsysmtem.title')}" />	
	</div>
	

<%@include file="/WEB-INF/content/inner/bottom-footer.jsp" %>