<%@include file="../inner/top-header.jsp" %>
	<title><s:text name="query.title" /><s:property value="#session['SUBSYSTEM_NAME']" /></title>
<%@include file="../inner/middle.jsp" %>

<div id="body-wrapper">
<%@include file="../inner/navigator-bar.jsp" %>
	<div id="main-content">
		<h2><s:text name="welcome.title" />!</h2>
		<br />

		<div id="subsystem-type">
			<!-- Query box -->
			<div id="input-type" >
				<form action="showSubsystemType">
					<label for="showSubsystemType_type" class="label"><s:text name="%{getText('input_type.title')}" />: </label>
	    			<input name="type" value="" id="showSubsystemType_type" type="text">
	    			<input id="showSubsystemType_0" value="<s:text name='query.title' />" type="submit">
				</form>
			</div>

			<!-- Show the type name -->
			<div id="type-title">
				<label><s:property value="#session['SUBSYSTEM_NAME']" /><s:text name="type.title" /></label>
				<input name="type" value="" type="text" readonly="true" />
			</div>
			<!-- All the attrs current subsystem -->
			<div id="attrs-list">
				<!-- iterator the attrs -->
	    		<s:iterator value="attrMap" id="column" status="status">
	    			<div id="attr">
	    				<s:property value="%{getAttrNameById(#status.index)}" />:
	    				<s:property value="%{getAttrValueById(#status.index)}" />
	    			</div>
	    		</s:iterator>
			</div>
			<br />

			<div class="clear"></div>
			<!-- parameter picture -->
			<div id="parameter-picture">
				<%@include file="../units/parameter-picture.jsp" %>
				<br />
			</div>

			<div id="picture-bar">

				<input value="<s:text name='check_units.info' />" type="submit" />
				<br />
				<select name="picName" id="picName">
					<option value="-1">--------</option>
				</select>
				<input value="<s:text name='download.title' />" type="submit" />
				<br />
				<input value="<s:text name='check_view_pic.info' />" type="submit" />
				<br />
				<input value="<s:text name='check_parameter_pic.info' />" type="submit" />
			</div>

			<div class="clear"></div>
			<div id="paras-list">
				<s:property value="#session['SUBSYSTEM_NAME']" /><s:text name="parameter.title"/>:
				<div class="clear"></div>

				<!-- iterator the paras -->
				<s:iterator value="paraMap" id="column" status="status">
					<div id="para">
						<s:property value="%{getParaNameById(#status.index)}" /> :
	    				<s:property value="%{getParaValueById(#status.index)}" />
					</div>
	    		</s:iterator>
			</div>

			<div class="clear"></div>
			<div id="buttons">
				<input class="button" value="<s:text name='submit.title' />" type="submit">
				<input class="button" value="<s:text name='reset.title' />" type="reset">
			</div>
			
		</div>







		<div class="clear"></div> <!-- End .clear -->
		<div id="footer">
			<small> <!-- Remove this notice or replace it with whatever you want -->
				&#169; Copyright 2011 | Powered by <a href="#"><s:text name="shanghai_university.title" /></a> | <a href="#">Top</a>
			</small>
		</div><!-- End #footer -->

		
	</div>

</div>
<%@include file="../inner/bottom-footer.jsp" %>