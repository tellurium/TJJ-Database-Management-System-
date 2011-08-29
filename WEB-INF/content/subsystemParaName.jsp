<%@include file="inner/top-header.jsp" %>
	<title>Subsystem</title>
<%@include file="inner/middle.jsp" %>
	
	<s:form action="addSubsystemParaName" >
		<s:textfield name="subsystemParaName" label="Para Name" />
		<s:action name="showSubsystemList" executeResult="true"/>
		<s:submit />
	</s:form>

	<s:if test="list.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>Para Name</th>
				<th>Subsystem</th>
			</tr>

			<s:iterator value="list" status="subsystemAttrStatus">
				<tr
					class="<s:if test="#subsystemAttrStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="subsystemParaName" /></td>
					<td><s:property value="subsystemName" /></td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>

<%@include file="inner/bottom-footer.jsp" %>