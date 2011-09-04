<%@include file="../inner/top-header.jsp" %>
	<title>User</title>
<%@include file="../inner/middle.jsp" %>
	
	<h1><s:text name="user.title" /><s:text name="list.title" /></h1>

	<s:if test="list.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>UserName</th>
				<th>Gender</th>
				<th>Email</th>
				<th>Privilege</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<s:iterator value="list" status="userStatus">
				<tr
					class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="userName" /></td>
					<td><s:property value="sex" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="privilege.privilegeId" /></td>
					<td>
						<a href="<s:url action="updateUser"><s:param name="userId" value="userId"/></s:url>">
						Edit
						</a>
					</td>
					<td>
						<a href="<s:url action="deleteUser"><s:param name="userId" value="userId" /></s:url>">
						Delete
						</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>
	<br/>
	<s:form action="addUser" >
		<s:textfield name="userName" label="User Name" />
		<s:textfield name="sex" label="Gender" />
		<s:textfield name="email" label="Email" />
		<s:password name="password" label="Password" />
		<s:action name="showPrivilegeList" executeResult="true"/>
		<s:submit value="%{getText('add.title')}" />
	</s:form>

<%@include file="../inner/bottom-footer.jsp" %>