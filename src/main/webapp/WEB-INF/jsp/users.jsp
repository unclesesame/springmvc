<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<a href="newuser">Add</a>
<br>
	<c:forEach items="${result}" var="item">
		user name: <c:out value="${item.key}"/>
		<br>
		age: <c:out value="${item.value.age}"/>
	</c:forEach>
</body>
</html>
