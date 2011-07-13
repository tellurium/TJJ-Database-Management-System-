<%@include file="inner/top-header.jsp" %>
	<title>User</title>
<%@include file="inner/middle.jsp" %>

	<s:form action="addUser" >
		<s:textfield name="user.userName" label="User Name" />
		<s:textfield name="user.sex" label="Gender" />
		<s:textfield name="user.email" label="Email" />
		<s:password name="user.password" label="Password" />
		<s:textfield name="privilegeId" label="Privilege" />
		<s:submit />
	</s:form>

	<s:if test="userList.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>UserName</th>
				<th>Gender</th>
				<th>Email</th>
				<!-- <th>Privilege</th> -->
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<s:iterator value="userList" status="userStatus">
				<tr
					class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="user.userName" /></td>
					<td><s:property value="user.sex" /></td>
					<td><s:property value="user.email" /></td>
					<!-- <td><s:property value="privilege" /></td> -->
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