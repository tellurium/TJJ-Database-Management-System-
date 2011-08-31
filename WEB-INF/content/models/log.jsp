<%@include file="../inner/top-header.jsp" %>
	<title>Subsystem</title>
<%@include file="../inner/middle.jsp" %>
	
	<s:form action="addLog" >
		<s:textfield name="userName" label="User Name" />
		<s:textfield name="event" label="Event" />
		<s:textfield name="eventType" label="Event Type" />
		<s:textfield name="discription" label="Discription" />
		<s:textfield name="download" label="Download" />
		<s:submit />
	</s:form>

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

<%@include file="../inner/bottom-footer.jsp" %>