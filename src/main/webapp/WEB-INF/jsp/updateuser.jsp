<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<sf:form method="post" modelAttribute="user">
		user name: <sf:input path="username"/> <br/>
		age: <sf:input path="age"/> <br/>	
		<input type="submit" value="update user">
	</sf:form>	
</body>
</html>
