<%@include file="inner/top-header.jsp" %>
	<title><s:text name="application.name" /> | <s:text name="index.title" /></title>

	<link rel="stylesheet" href="/tiaojujiang/css/reset.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="/tiaojujiang/css/style.css" type="text/css" media="screen" />	
	<link rel="stylesheet" href="/tiaojujiang/css/invalid.css" type="text/css" media="screen" />
		<!-- jQuery -->
		<script type="text/javascript" src="/tiaojujiang/js/jquery-1.3.2.min.js"></script>
		
		<!-- jQuery Configuration -->
		<script type="text/javascript" src="/tiaojujiang/js/simpla.jquery.configuration.js"></script>
		
		<!-- Facebox jQuery Plugin -->
		<script type="text/javascript" src="/tiaojujiang/js/facebox.js"></script>
		
		<!-- jQuery WYSIWYG Plugin -->
		<script type="text/javascript" src="/tiaojujiang/js/jquery.wysiwyg.js"></script>
</head>
<body id="login">
	<div id="login-wrapper" class="png_bg">
			<div id="login-top">
				<p id="logo">
					<s:text name="application.name" />
				</p>
			</div>
			
			<div id="login-content">
				
				<form action="login">
				
					<div class="notification information png_bg">
						<div>
						<s:actionerror />
						<s:text name="please.title" /><s:text name="login.title" />
						</div>
					</div>
					
					<p>
						<label><s:property value="%{getText('username.title')}" />: </label>
						<input class="text-input" type="text" name="userName" />
					</p>
					<div class="clear"></div>
					<p>
						<label><s:property value="%{getText('password.title')}" />: </label>
						<input class="text-input" type="password" name="password" />
					</p>
					<div class="clear"></div>
						<s:action name="showSubsystemList" executeResult="true"/>
					<div class="clear"></div>
					<p>
						<input class="button" type="submit" value="<s:text name='submit.title' />" />
					</p>
					
				</form>
			</div> <!-- End #login-content -->
			
		</div> <!-- End #login-wrapper -->
	
<%@include file="inner/bottom-footer.jsp" %>

