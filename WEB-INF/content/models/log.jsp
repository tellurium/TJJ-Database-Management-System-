<%@include file="../inner/top-header.jsp" %>
	<title></title>

<div id="body-wrapper">
<%@include file="../inner/middle.jsp" %>
	
	<div id="main-content">
	<s:if test="list.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>User Name</th>
				<th>Event</th>
				<th>Event Type</th>
				<th>Description</th>
				<th>CreateTime</th>
				<th>Download</th>
			</tr>

			<s:iterator value="list" status="logStatus">
				<tr
					class="<s:if test="#logStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="userName" /></td>
					<td><s:property value="event" /></td>
					<td><s:property value="evnetType" /></td>
					<td><s:property value="discription" /></td>
					<td><s:property value="time" /></td>
					<td><s:property value="download" /></td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>
	<s:else>
		<s:text name="have_no.title" /><s:text name="log.title" />
	</s:else>





		<div class="clear"></div> <!-- End .clear -->
		<div id="footer">
			<small> <!-- Remove this notice or replace it with whatever you want -->
				&#169; Copyright 2011 | Powered by <a href="#"><s:text name="shanghai_university.title" /></a> | <a href="#">Top</a>
			</small>
		</div><!-- End #footer -->
	</div>
</div>
<%@include file="../inner/bottom-footer.jsp" %>