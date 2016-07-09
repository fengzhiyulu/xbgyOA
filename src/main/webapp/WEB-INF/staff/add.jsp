<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/head.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>这是新增员工管理页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
  
 		<form action="${path }/staff/addStaff" method="post">
 			姓名<input type="text" name="staff.staName">	<br/>
 			电话<input type="text" name="staff.telePhone"><br/>
 			地址<input type="text" name="staff.address"><br/>
 			身份证号码<input type="text" name="staff.cardId"><br/>
 			相片<input type="text" name="staff.picUrl"><br/>
 			银行账号<input type="text" name="staff.bankCount"><br/>
 			部门<select name="staff.depart.departId">
 				<c:forEach items="${departList}" var="dpart">
 					<option value="${dpart.departId }">${dpart.depName}</option>
 				</c:forEach>
 			</select> 
 			
 			<input type="submit" value="提交">
 		</form>
  </body>
</html>
