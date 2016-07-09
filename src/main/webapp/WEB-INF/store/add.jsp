<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/head.jsp"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title></title>
<script type="text/javascript">
	function submitForm(){
		$("#orderFrom").submit();
		alert("1");
	}
</script>
</head>
<body>
	<div class="page-header">
		<h3>入库单管理</h3>
	</div>
	<div class="panel panel-default">

		<div class="panel-body">
			<form class="form-horizontal" id="orderForm"
				method="post" action="${path}/purchase/addPurchase">
				<div class="form-group">
					<label for="custmerName" class="col-sm-1">农户:</label> 
					<div class="col-sm-4">
						<input type="text"
							class="form-control" id="custmerName" placeholder="Jane Doe" onchange="test1();">
					</div>
					<label for="orderTime" class="col-sm-1">订单时间：</label> 
					<div class="col-sm-4">
					<input type="date"
						class="form-control" id="orderTime" value="${date}">
						</div>
				</div>
				<div class="form-group">
					<label for="backup" class="col-sm-1">采购数量(斤):</label> 
					<div class="col-sm-4">
						<input type="text"
							class="form-control" >
					</div>
					<label for="backup" class="col-sm-1">采购价格(元):</label> 
					<div class="col-sm-4">
						<input type="text"
							class="form-control" >
					</div>
					
				</div>
				<div class="form-group">
					<label for="backup" class="col-sm-1">称重员:</label> 
					<div class="col-sm-4">
						<input type="text"
							class="form-control" id="backup" size="50">
					</div>
					<label for="backup"  class="col-sm-1">采购员:</label> 
					<div class="col-sm-4">
						<input type="text"
							class="form-control">
					</div>
				</div>
				<hr>
				<button type="submit" class="btn btn-primary" onclick="submitForm();">提交</button>
			</form>

		</div>
	</div>
</body>
</html>
