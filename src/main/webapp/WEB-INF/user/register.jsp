<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>这是注册页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	这是注册页面
  <form action="/xbgyOA/user/register" method="post">
  	用户名<input name="username" type="text"><br/>
  	密  码<input name="password" type="text"><br/>
  	姓  名<input name="fullName" type="text"><br/>
  	性 别<input type="radio" name="sex" value="男" checked="checked">男<input type="radio" name="sex" value="女">女<br/>
  	电话号码<input name="telePhone" type="text"><br/>
  	
  	<input type="submit">
  </form>
  
  ${requestScope.abc}
  </body>
</html>
