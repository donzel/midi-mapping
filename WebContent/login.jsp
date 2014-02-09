<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Struts 2 Login Application!</title>  
	</head>
    <body>
		<s:form action="loginAction" method="POST">
    		Login
			<s:textfield name="identifiant" label="Login name"/>
			<s:password name="password" label="Password"/>
			<s:submit value="Login" align="center"/>
		</s:form>
  	</body>
</html>

