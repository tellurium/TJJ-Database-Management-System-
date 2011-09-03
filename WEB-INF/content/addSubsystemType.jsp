<%@include file="inner/top-header.jsp" %>
	<title><s:text name="add.title" /><s:property value="#session['SUBSYSTEM_NAME']" /></title>
<%@include file="inner/middle.jsp" %>

<%@include file="inner/navigator-bar.jsp" %>
	<s:form action="addSubsystemType">
		<div id="attrs-list">
			<!-- Input the type -->
			<label><s:property value="#session['SUBSYSTEM_NAME']" /><s:text name="type.title" /></label>
    		<input name="type" value="" type="text" />
    		<br />

    		<!-- iterator the attrs -->
    		<s:iterator value="attrMap" id="column">
    			<label><s:property value="key" /></label>
    			<input type="text" name="attrMap['${key}']" value="<s:property value='value' />" />
    		</s:iterator>

		</div>
		<div id="parameter-picture">
			<%@include file="units/parameter-picture.jsp" %>
			<br />
		</div>
		<div id="picture-bar">

			<label for="_paraImage" class="label"><s:text name="add.title" /><s:text name="para_pic.title" />: </label>
    		<input name="paraImage" value="" id="_paraImage" type="file" accept="image/jpg,image/gif" /> 
    		<br />

    		<label for="_cadImage" class="label"><s:text name="add.title" /><s:text name="cad_pic.title" />: </label>
    		<input name="cadImage" value="" id="_cadImage" type="file" />
    		<br />

    		<label for="_exploreImage" class="label"><s:text name="add.title" /><s:text name="explore_pic.title" />: </label>
    		<input name="exploreImage" value="" id="_exploreImage" type="file" />
    		<br />

		</div>
		<div id="paras-list">
			<br />
			<s:property value="#session['SUBSYSTEM_NAME']" /><s:text name="parameter.title"/>:
			<!-- iterator the paras -->

		</div>
		<br />
		<input value="<s:text name='submit.title' />" type="submit">
		<input value="<s:text name='reset.title' />" type="reset">

	</s:form>

<%@include file="inner/bottom-footer.jsp" %>