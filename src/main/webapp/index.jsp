<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"
			+ request.getServerName()+":"
			+ request.getServerPort()
			+ path + "/";
	System.out.println("request.getContextPath() : " + request.getContextPath());
	System.out.println("request.getScheme() : " +request.getScheme());
	System.out.println("getServerName() : " + request.getServerName());
%>
<html>
<head>
	<base href="<%=basePath%>"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 在head标签中使用link标签引用BootStrap的css文件 -->
	<link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
	<h1>Welcome, this is SpringMVC Bootstrap WebApp</h1>
</div>

<!-- 一定要在引用BootStrap脚本之前引用jquery的脚本 -->
<script src="bootstrap/js/jquery.js" type="text/javascript"></script>
<!-- 最好将BootStrap的js脚本文件放到body标签结束之前，这样页面会优先加载html内容后再加载脚本文件 -->
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>

</body>
</html>
