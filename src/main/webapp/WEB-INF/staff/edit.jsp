<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/head.jsp"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
    <title>这是修改员工管理页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
		function del(){
			if(confirm("确认删除？")){
				window.location.href="${path}/staff/deleteStaff?id=${staff.staffId }";
			}
		}
	</script>
  </head>
  <body>
 		<form action="staff/addStaff" method="post">
 			<input type="hidden" name="id" value="${staff.staffId }">
 			姓名<input type="text" name="staName" value="${staff.staName }">	<br/>
 			电话<input type="text" name="telePhone" value="${staff.telePhone }"><br/>
 			地址<input type="text" name="address" value="${staff.address }"><br/>
 			身份证号码<input type="text" name="cardId" value="${staff.cardId }"><br/>
 			相片<input type="text" name="picUrl" value="${staff.picUrl }"><br/>
 			银行账号<input type="text" name="bankCount" value="${staff.bankCount }"><br/>
 			部门<select name="depart.id">
 				<c:forEach items="${departList}" var="depart">
 					<option value="${depart.departId }" <c:if test="${depart.departId==staff.depart.departId}">selected</c:if>>${depart.depName}</option>
 				</c:forEach>
 			</select> 
 			
 			<input type="submit" class="btn btn-primary" value="更新">
 			<input type="button" class="btn btn-danger" onclick="del()" value="删除">
 		</form>
  </body>
</html>
