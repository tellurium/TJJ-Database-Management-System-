<%@include file="inner/top-header.jsp" %>
	<title>Subsystem</title>
<%@include file="inner/middle.jsp" %>

	<s:form action="addSubsystem" >
		<s:textfield name="subsystemName" label="Subsystem Name" />
		<s:textfield name="subsystemDescription" label="Subsystem Description" />
		<s:textfield name="userName" label="User Name" />
		<s:submit />
	</s:form>

	<s:if test="list.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>Subsystem Id</th>
				<th>Subsystem Name</th>
				<th>Subsystem Description</th>
				<th>Create User</th>
				<th>Create Time</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<s:iterator value="list" status="subsystemStatus">
				<tr
					class="<s:if test="#subsystemStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="subsystemId" /></td>
					<td><s:property value="subsystemName" /></td>
					<td><s:property value="subsystemDescription" /></td>
					<td><s:property value="userName" /></td>
					<td><s:property value="createTime" /></td>
					<td>
						<a href="<s:url action="editSubsystem"><s:param name="userId" value="userId"/></s:url>">
						Edit
						</a>
					</td>
					<td>
						<a href="<s:url action="deleteSubsystem"><s:param name="usedId" value="userId" /></s:url>">
						Delete
						</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>

<%@include file="inner/bottom-footer.jsp" %>