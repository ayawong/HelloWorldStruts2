<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
	<h1>Struts 2 Hello World Example !</h1>

	<s:form namespace="/User" action="Welcome" >
		<s:textfield name="username" label="Username" />
		<%-- <s:password name="password" label="Password" /> --%>
		<s:submit />
	</s:form>

</body>
</html>