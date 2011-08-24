<div id="navigator_bar" >
	<s:a href="introduction.action"><s:property value="subsystemName"/><s:text name="introduction.title" /></s:a> |
	<s:a href="showQuery.action"><s:text name="query.title" /><s:property value="subsystemName"/></s:a> |
	<s:a href="#"><s:text name="add.title" /><s:property value="subsystemName"/></s:a> |
	<s:a href="#"><s:text name="update.title" /><s:property value="subsystemName" /></s:a> |
	<s:a href="#"><s:text name="user_management.title" /></s:a> |
	<s:a href="#"><s:text name="check_log.title" /></s:a> |
	<s:a href="#"><s:text name="modify_password.title" /></s:a>

	<div id="subsystem_list" > 
		<s:action name="showSubsystemList" executeResult="true"/>
	</div>

	<s:submit value="%{getText('logout.title')}" />
</div>