<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<a href="newuser">Add</a>
<br>
	<c:forEach items="${result}" var="item">
		user name: <c:out value="${item.key}"/>
		-----
		age: <c:out value="${item.value.age}"/>
		-----
		<a href="${item.key}/update">Update</a>
		-----
		<a href="${item.key}/delete">Delete</a>
		
		<br/>
	</c:forEach>
</body>
</html>
