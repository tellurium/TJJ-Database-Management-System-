<%@include file="inner/top-header.jsp" %>
	<title>Subsystem</title>
<%@include file="inner/middle.jsp" %>
	
	<s:form action="addSubsystemAttr" >
		<s:textfield name="attrName" label="Attr Name" />
		<s:textfield name="attrValue" label="Attr Value" />
		<s:submit />
	</s:form>

	<s:if test="list.size() > 0">
		<div class="content">
		<table class="table" cellpadding="5px">
			<tr class="even">
				<th>Attr Name</th>
				<th>Attr Value</th>
			</tr>

			<s:iterator value="list" status="subsystemAttrStatus">
				<tr
					class="<s:if test="#subsystemAttrStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="attrName" /></td>
					<td><s:property value="attrValue" /></td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>

<%@include file="inner/bottom-footer.jsp" %>