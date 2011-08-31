<%@include file="inner/top-header.jsp" %>
	<title><s:text name="index.title" /></title>
	<s:head />

	<link rel="stylesheet" href="/tiaojujiang/css/global.css" type="text/css" />
</head>
<body id="login">
	<div id="login-wrapper" class="png_bg">
		<s:actionerror />
		<div id="login-top">
			<h1><s:text name="index.title" /></h1>		
		</div>

		<div id="login-content">
			<s:form action="login">
				<s:textfield name="userName" label="%{getText('username.title')}" />
				<s:password name="password" label="%{getText('password.title')}" />
				<s:action name="showSubsystemList" executeResult="true"/>
				<s:submit class="button" value="%{getText('submit.title')}" />
			</s:form>
		</div>
	</div>
	
	
<%@include file="inner/bottom-footer.jsp" %>

