<%@include file="inner/top-header.jsp" %>
	<title><s:text name="update.title" /><s:property value="#session['SUBSYSTEM_NAME']" /></title>
<%@include file="inner/middle.jsp" %>

<div id="body-wrapper">
<%@include file="inner/navigator-bar.jsp" %>
	<div id="main-content">
		<div id="subsystem-type">
			<!-- Input the type -->
			<div id="type-title">
				<label><s:property value="#session['SUBSYSTEM_NAME']" /><s:text name="type.title" /></label>
    			<input name="type" value="" type="text" />
			</div>
			<br />

			<div id="attrs-list">
    		<!-- iterator the attrs -->
    		<s:iterator value="attrMap" id="column" status="status">
    		<div id="attr">
    			<label><s:property value="%{getAttrNameById(#status.index)}" />:</label>
    			<input type="text" name="attrMap['${status.index}']" value="<s:property value='%{getAttrValueById(#status.index)}' />" />
    		</div>
    			
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

	    		<input type="submit"  />

			</div>

			<div class="clear"></div>
			<div id="paras-list">
				<br />
				<s:property value="#session['SUBSYSTEM_NAME']" /><s:text name="parameter.title"/>:
				<br />
				<!-- iterator the paras -->
				<s:iterator value="paraMap" id="column" status="status">
					<div id="para">
						<label><s:property value="%{getParaNameById(#status.index)}" />:</label>
	    				<input type="text" name="paraMap['${status.index}']" value="<s:property value='%{getParaValueById(#status.index)}' />" />
					</div>
	    		</s:iterator>
	    		<br />
				
			</div>
			<br />
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
<%@include file="inner/bottom-footer.jsp" %>