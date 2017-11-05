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
	<!-- ��head��ǩ��ʹ��link��ǩ����BootStrap��css�ļ� -->
	<link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
	<h1>Welcome, this is SpringMVC Bootstrap WebApp</h1>
</div>

<!-- һ��Ҫ������BootStrap�ű�֮ǰ����jquery�Ľű� -->
<script src="bootstrap/js/jquery.js" type="text/javascript"></script>
<!-- ��ý�BootStrap��js�ű��ļ��ŵ�body��ǩ����֮ǰ������ҳ������ȼ���html���ݺ��ټ��ؽű��ļ� -->
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>

</body>
</html>
