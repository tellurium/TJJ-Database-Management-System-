	<s:a href="#"><s:property value="subsystemName"/><s:text name="introduction.title" /></s:a>
	<s:a href="#"><s:text name="query.title" /><s:property value="subsystemName"/></s:a>
	<s:a href="#"><s:text name="add.title" /><s:property value="subsystemName"/></s:a>
	<s:a href="#"><s:text name="update.title" /><s:property value="subsystemName"/></s:a>
	<s:a href="#"><s:text name="user_management.title" /></s:a>
	<s:a href="#"><s:text name="check_log.title" /></s:a>
	<s:a href="#"><s:text name="modify_password.title" /></s:a>
	<s:select name="subsystemName" label="%{getText('subsystem_list.hint')}" list="subsystemList" />
	<s:submit value="%{getText('logout.title')}" />
