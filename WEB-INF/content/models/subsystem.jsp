<%@include file="../inner/top-header.jsp" %>
	<title>Subsystem</title>
<%@include file="../inner/middle.jsp" %>
	
	<h1><s:text name="subsystem.title" /><s:text name="list.title" /></h1>
	
	<s:if test="list.size() > 0">
		<div class="content">
		<table class="table">
			<tr class="even">
				<th>Subsystem Id</th>
				<th>Subsystem Name</th>
				<th>Subsystem Description</th>
				<th>Create User</th>
				<th>Create Time</th>
				<th>Edit</th>
				<th>Delete</th>
				<th>Update attrs</th>
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
						<a href="<s:url action="updateSubsystem"><s:param name="subsystemId" value="subsystemId"/></s:url>">
						Edit
						</a>
					</td>
					<td>
						<a href="<s:url action="deleteSubsystem"><s:param name="subsystemId" value="subsystemId" /></s:url>">
						Delete
						</a>
					</td>
					<td>
						<a href="<s:url action="showAttrs"><s:param name="subsystemId" value="subsystemId" /></s:url>">
						Update Attrs
						</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>
	<br/>
	<form action="showAddSubsystemForm">
		<input type="submit" value="<s:text name='add.title' /><s:text name='subsystem.title' />"/>
	</form>

	<s:if test="isAddOrUpdate==true">
	

	
	<h3><s:if test="oprationTag.equals('add')"><s:text name="add.title" /></s:if>
		<s:elseif test="oprationTag.equals('update')"><s:text name="update.title" /></s:elseif>
		<s:text name="subsystem.title" /></h3>

	<s:form action="addSubsystem" >
		<s:textfield name="subsystemName" label="Subsystem Name" />
		<s:textarea name="subsystemDescription" label="Subsystem Description" />
		<s:submit value="%{getText('add.title')}" />
	</s:form>
	</s:if>
	<br/>


	<s:if test="oprationTag.equals('update_attr')">
	<s:textfield name="subsystemName" label="Subsystem Name" readonly="true" />
	<br/>
	<s:if test="attrNameList.size() > 0">
		<div class="content">
		<table class="table" >
			<tr class="even">
				<th>Attr Name</th>
				<th>Delete</th>
			</tr>

			<s:iterator value="attrNameList" status="subsystemAttrStatus">
				<tr
					class="<s:if test="#subsystemAttrStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="subsystemAttrName" /></td>
					<td>
						<a href="<s:url action="deleteAttr"><s:param name="subsystemAttrNameId" value="subsystemAttrNameId" /></s:url>">
						Delete
						</a>
					</td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>
	<br/>
	<s:form action="addAttr">
		<s:textfield name="attrName" label="Attr Name" />
		<s:submit value="%{getText('add.title')}" />
	</s:form>
	<br/>
	</s:if>
	
<%@include file="../inner/bottom-footer.jsp" %>