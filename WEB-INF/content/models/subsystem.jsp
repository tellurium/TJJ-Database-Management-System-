<%@include file="../inner/top-header.jsp" %>
	<title>Subsystem</title>

<div id="body-wrapper">
<%@include file="../inner/middle.jsp" %>
	<div id="main-content">
	<h1><s:text name="subsystem.title" /><s:text name="list.title" /></h1>
	
	<s:if test="list.size() > 0">
		<div class="content">
		<table class="table">
			<tr class="even">
				<th><s:text name="subsystem.title" /></th>
				<th><s:text name="description.title" /></th>
				<th><s:text name="create.title" /><s:text name="user.title" /></th>
				<th><s:text name="create.title" /><s:text name="time.title" /></th>
				<th><s:text name="operation.title" /></th>
			</tr>

			<s:iterator value="list" status="subsystemStatus">
				<tr
					class="<s:if test="#subsystemStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="subsystemName" /></td>
					<td><s:property value="subsystemDescription" /></td>
					<td><s:property value="userName" /></td>
					<td><s:property value="createTime" /></td>
					<td>
						<a href="<s:url action="updateSubsystem"><s:param name="subsystemId" value="subsystemId"/></s:url>">
						<s:text name="edit.title" />
						</a> | 
						<a href="<s:url action="deleteSubsystem"><s:param name="subsystemId" value="subsystemId" /></s:url>">
						<s:text name="delete.title" />
						</a> |
						<a href="<s:url action="showAttrs"><s:param name="subsystemId" value="subsystemId" /></s:url>">
						<s:text name="update.title" /><s:text name="attribute.title" />
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


	<div id="subsystem-list">
		<s:if test="isAddOrUpdate==true">
		

		<h3><s:if test="oprationTag.equals('add')"><s:text name="add.title" /></s:if>
			<s:elseif test="oprationTag.equals('update')"><s:text name="update.title" /></s:elseif>
			<s:text name="subsystem.title" /></h3>

		<s:form action="addSubsystem" >
			<s:textfield name="subsystemName" label="%{getText('subsystem.title')}" />
			<s:textarea name="subsystemDescription" label="%{getText('description.title')}" />
			<s:submit value="%{getText('add.title')}" />
		</s:form>
		</s:if>
		<br/>


		<s:if test="oprationTag.equals('update_attr')">
		<s:textfield name="subsystemName" label="%{getText('subsystem.title')}" readonly="true" />
		<br/>
		<s:if test="attrNameList.size() > 0">
			<div class="content">
			<table class="table" >
				<tr class="even">
					<th><s:text name="subsystem.title" /><s:text name="name.title" /></th>
					<th><s:text name="operation.title" /></th>
				</tr>

				<s:iterator value="attrNameList" status="subsystemAttrStatus">
					<tr
						class="<s:if test="#subsystemAttrStatus.odd == true ">odd</s:if><s:else>even</s:else>">
						<td><s:property value="subsystemAttrName" /></td>
						<td>
							<a href="<s:url action="deleteAttr"><s:param name="subsystemAttrNameId" value="subsystemAttrNameId" /></s:url>">
							<s:text name="delete.title" />
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
			</div>
		</s:if>
		<br/>
		<s:form action="addAttr">
			<s:textfield name="attrName" label="%{getText('attribute.title')}" />
			<s:submit value="%{getText('add.title')}" />
		</s:form>
		<br/>
		</s:if>
	</div>
	



	<div class="clear"></div> <!-- End .clear -->
		<div id="footer">
			<small> <!-- Remove this notice or replace it with whatever you want -->
				&#169; Copyright 2011 | Powered by <a href="#"><s:text name="shanghai_university.title" /></a> | <a href="#">Top</a>
			</small>
		</div><!-- End #footer -->
	</div>
</div>	
<%@include file="../inner/bottom-footer.jsp" %>