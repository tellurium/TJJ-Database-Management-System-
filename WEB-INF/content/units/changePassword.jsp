<%@include file="/WEB-INF/content/inner/top-header.jsp" %>

<div id="body-wrapper">
<%@include file="/WEB-INF/content/inner/middle.jsp" %>
	<div id="main-content">
	<s:if test="isChangePasswordOK == false">
		<s:form action="submitPassword">
			<s:password name="oldPassword" label="%{getText('please.title')}%{getText('input.title')}%{getText('old.title')}%{getText('password.title')}" />	
			<s:password name="passwordInput" label="%{getText('please.title')}%{getText('input.title')}%{getText('new.title')}%{getText('password.title')}" />
			<s:password name="passwordSubmit" label="%{getText('please.title')}%{getText('submit.title')}%{getText('new.title')}%{getText('password.title')}" />
			<s:submit value="%{getText('submit.title')}" />	
		</s:form>
	</s:if>
	<s:else>
		<h3><s:text name="success.title" /><s:text name="update.title" /></h3>
	</s:else>
	





		<div class="clear"></div> <!-- End .clear -->
		<div id="footer">
			<small> <!-- Remove this notice or replace it with whatever you want -->
				&#169; Copyright 2011 | Powered by <a href="#"><s:text name="shanghai_university.title" /></a> | <a href="#">Top</a>
			</small>
		</div><!-- End #footer -->
	</div>
</div>
<%@include file="/WEB-INF/content/inner/bottom-footer.jsp" %>