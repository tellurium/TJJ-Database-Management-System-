<%@include file="inner/top-header.jsp" %>
	<title>Subsystem</title>
<%@include file="inner/middle.jsp" %>
	
	<s:form action="addSubsystem" >
		<s:textfield name="subsystemName" label="Subsystem Name" />
		<s:textfield name="subsystemDescription" label="Subsystem Description" />
		<s:submit />
	</s:form>

	<s:if test="lists.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>Id</th>
				<th>Name</th>
				<th>Description</th>
				<th>CreateTime</th>
				<th>User</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<s:iterator value="lists" status="subsystemStatus">
				<tr
					class="<s:if test="#subsystemStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="subsystemId" /></td>
					<td><s:property value="subsystemName" /></td>
					<td><s:property value="subsystemDescription" /></td>
					<td><s:property value="createTime" /></td>
					<td><s:property value="createUser" /></td>
					<td>
						<a href="<s:url action="editSubsystem"><s:param name="subsystemId" value="subsystemId"/></s:url>">
						Edit
						</a>
					</td>
					<td>
						<a href="<s:url action="deleteSubsystem"><s:param name="subsystemId" value="subsystemId" /></s:url>">
						Delete
						</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>

<%@include file="inner/bottom-footer.jsp" %>