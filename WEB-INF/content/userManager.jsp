<%@include file="inner/top-header.jsp" %>	
	<title><s:text name="user.title" /><s:text name="manage.title" /></title>
<%@include file="inner/middle.jsp" %>
<%@include file="inner/navigator-bar.jsp" %>
	<s:action name="listUser" executeResult="true"/>
<%@include file="inner/bottom-footer.jsp" %>