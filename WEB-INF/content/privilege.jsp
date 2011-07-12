<%@include file="inner/top-header.jsp" %>
	<title>Subsystem</title>
<%@include file="inner/middle.jsp" %>
	
	<s:form action="addPrivilege">
		<s:textfield name="privilegeName" label="Privilege Name" />
		<s:textfield name="description" label="Privilege Description" />
		<s:submit />
	</s:form>

	<s:if test="privilegeList.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>Id</th>
				<th>Name</th>
				<th>Description</th>
			</tr>

			<s:iterator value="privilegeList" status="privilegeStatus">
				<tr
					class="<s:if test="#privilegeStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="privilegeId" /></td>
					<td><s:property value="privilegeName" /></td>
					<td><s:property value="description" /></td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>

<%@include file="inner/bottom-footer.jsp" %>