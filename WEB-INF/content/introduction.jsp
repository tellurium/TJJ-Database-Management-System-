<%@include file="inner/top-header.jsp" %>	
	<title><s:property value="subsystemName" /><s:text name="introduction.title" /></title>
<%@include file="inner/middle.jsp" %>

<div id="body-wrapper">
<%@include file="inner/navigator-bar.jsp" %>
	<div id="main-content">
		<div id="introduction-title">
			<s:property value="subsystemName" /><s:text name="subsystem.title" />
		</div>
		<br>

		<div id="introduction-text">
			<p><s:property value="subsystemDiscription" /></p>
		</div>




		<div class="clear"></div> <!-- End .clear -->
		<div id="footer">
			<small> <!-- Remove this notice or replace it with whatever you want -->
				&#169; Copyright 2011 | Powered by <a href="#"><s:text name="shanghai_university.title" /></a> | <a href="#">Top</a>
			</small>
		</div><!-- End #footer -->
	</div>	
</div>
<%@include file="inner/bottom-footer.jsp" %>