<%@include file="inner/top-header.jsp" %>	
	<%
		String title = resource.getString("introduction.title");
	%>
	<title><%=title%></title>
<%@include file="inner/middle.jsp" %>
<%@include file="inner/navigator-bar.jsp" %>	
	<div class="introduction-text">
		<h1>Title<h1>
		<p>More details about the subsystem</p>
	</div>

<%@include file="inner/bottom-footer.jsp" %>