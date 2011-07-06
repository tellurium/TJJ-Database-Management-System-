<%@include file="top-header.jsp" %>	
	<%
		String title = resource.getString("introduction.title");
	%>
	<title><%=title%></title>
<%@include file="middle.jsp" %>	
<%@include file="navigator-bar.jsp" %>	

	<div class="introduction-text">
		<h1>Title<h1>
		<p>More details about the subsystem</p>
	</div>

<%@include file="bottom-footer.jsp" %>