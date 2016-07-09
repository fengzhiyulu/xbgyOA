<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/head.jsp"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">

<title></title>
<script type="text/javascript">

	function submitForm(path) {
		$("#orderForm").action=path;
		$("#orderForm").submit();
		return false;
	}
	
	//ajax 模糊查找客户姓名
	function searchCustmer(){
		var searchContext = $("#custmerName").val();
		var aj =  $.ajax({
	         url:'${path}/custmer/getCustmers',
	         data:{
	             searchContext:searchContext
	         },
	         type:'post',
	         cache:false,
	         dataType:"json",
	         success:function(data){
				alert(data[0].custmerName);
	         }
    	});
	}
	
	function compute(button){
		alert(button.lang);
	}
</script>
</head>
<body>
	<div class="page-header">
		<h3>签单订单</h3>
	</div>
	<button onclick="searchCustmer();">123</button>
	<div class="panel panel-default">

		<div class="panel-body">
			<form class="form-inline" id="orderForm"
				method="post">
				<input type="hidden" value="${marketVO.itemsNumber}" name="marketVO.itemsNumber">
				<div class="form-group">
					<label for="custmerName">客户名:</label> <input type="text"
						class="form-control" id="custmerName" placeholder="Jane Doe" onchange="test1();">
				</div>
				<div class="form-group">
					<label for="orderTime">订单时间：</label> <input type="date"
						class="form-control" id="orderTime" value="${date}">
				</div>
				<div class="form-group">
					<label for="backup">备注信息：</label> <input type="text"
						class="form-control" id="backup" size="50">
				</div>
				<hr>
	            <c:forEach var="goods" items="${goodsList}" varStatus="vs">
		           <!--  <div <c:if test="${vs.count!=1}">style="display:none"</c:if>> -->
		            <div>
		                <div class="form-group">
		                    <label for="goodsName">商品名:</label>
		                   <span class="label label-info">${goods.goodsName }</span>
		                </div>
		                <div class="form-group">
		                    <label for="number_1">数量:</label>
		                    <input type="number" class="form-control" placeholder="0" value="0" name="number[${vs.index}]" lang="${vs.index}" onchange="compute(this);">
		                </div>
		                <div class="form-group">
		                    <label>单价</label>
		                    <label><span class="label label-info">${goods.price}</span>元</label>
		                </div>
		                <div class="form-group">
		                    <label for="subprice_1">小计</label>
		                    <label><span class="label label-info" id="subprice${vs.index}">0</span>元</label>
		                </div>
		                <button type="button" class="btn btn-danger">清空项</button>
		            </div>
	            </c:forEach>
	            
				<br />
				<hr>
				<button type="submit" class="btn btn-primary" onclick="submitForm('${path}/sale/addMarket');">提交</button>
			</form>

		</div>
	</div>
</body>
</html>
