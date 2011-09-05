<%@include file="/WEB-INF/content/inner/top-header.jsp" %>
	<title>Test</title>
<%@include file="/WEB-INF/content/inner/middle.jsp" %>

<div id="body-wrapper">
<%@include file="/WEB-INF/content/inner/navigator-bar.jsp" %>
	<div id="main-content">
		<h2>Test!</h2>

		<s:form action="fileUpload" method="POST" enctype="multipart/form-data" >
        	<s:file name="myFile" label="Image File" />
        	<s:textfield name="caption" label="Caption" />        
        	<s:submit /> 
        </s:form > 

        <div style="padding: 3px; border: solid 1px #cccccc; text-align: center" >
        <img src='UploadImages/<s:property value="imageFileName" /> ' />
        <br />
        <s:property value="caption" />
    	</div> 
    	
	</div>
</div>
<%@include file="/WEB-INF/content/inner/bottom-footer.jsp" %>