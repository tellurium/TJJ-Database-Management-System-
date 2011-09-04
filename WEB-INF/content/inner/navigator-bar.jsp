<div id="sidebar" ><div id="sidebar-wrapper">
	<div id="login-top">
		<p id="logo">
			<s:text name="application.name" />
		</p>
	</div>
	<div id="profile-links">
		<s:text name="hello.title" />, <a href="#" title="<s:text name='username.title' />"><s:property value="#session['USER_NAME']" /></a>
		<br />
	</div>
	<ul id="main-nav">  <!-- Accordion Menu -->
		
		<!-- introduction -->
		<li>
			<a href="introduction" class="nav-top-item no-submenu"> <!-- Add the class "no-submenu" to menu items with no sub menu -->
				<s:property value="#session['SUBSYSTEM_NAME']" /><s:text name="introduction.title" />
			</a>       
		</li>
		
		<!-- subsystem -->
		<li>
			<a href="showQuery" class="nav-top-item current no-submenu">
				<s:text name="query.title" /><s:property value="#session['SUBSYSTEM_NAME']" />
			</a>
		</li>
		<li>
			<a href="addType" class="nav-top-item no-submenu">
				<s:text name="add.title" /><s:property value="#session['SUBSYSTEM_NAME']" />
			</a>
		</li>
		<li>
			<a href="updateType" class="nav-top-item no-submenu">
				<s:text name="update.title" /><s:property value="#session['SUBSYSTEM_NAME']" />
			</a>
		</li>
		
		<!-- SubsystemManager -->
		<li>
			<a href="subsystemManager" class="nav-top-item no-submenu">
				<s:text name="update_subsystem.title" />
			</a>
		</li>

		<!-- UserManager -->
		<li>
			<a href="userManager" class="nav-top-item no-submenu">
				<s:text name="user.title" /><s:text name="manage.title" />
			</a>
		</li>

		<!-- LogViewer -->
		<li>
			<a href="logViewer" class="nav-top-item no-submenu">
				<s:text name="check_log.title" />
			</a>
		</li>

		<!-- PasswordChanger -->
		<li>
			<a href="passwordChanger" class="nav-top-item no-submenu">
				<s:text name="modify_password.title" />
			</a>
		</li>	
	</ul> <!-- End #main-nav -->
	<div id="subsystem-list" > 
		<s:action name="showSubsystemList" executeResult="true"/>
		<input class="button" type="submit" value="<s:text name='logout.title' />" />
	</div>

	
	</div>
</div>