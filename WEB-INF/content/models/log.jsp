<%@include file="../inner/top-header.jsp" %>
	<title></title>
<%@include file="../inner/middle.jsp" %>

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

<%@include file="../inner/bottom-footer.jsp" %>