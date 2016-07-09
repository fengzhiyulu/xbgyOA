<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/head.jsp"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <script type="text/javascript">
		function submitForm(){
			//document.getElementById("myForm").submit();
			$("#myForm").submit();
		}
		
		function go(){
			window.location.href="${path}/staff/addStaffPage";
		}

    </script>
</head>
<body>
<div class="page-header">
    <h3>员工管理</h3>
    <input type="button" class="btn btn-primary" value="新增员工" onclick="go()">
</div>


<div>
    <form class="form-inline" method="post" id="myForm" action="${path}/staff/search">
        <div class="form-group">
            <select class="form-control" name="searchType">
                <option value="1" <c:if test="${searchType==1}">selected</c:if>>员工号</option>
                <option value="2" <c:if test="${searchType==2}">selected</c:if>>姓名</option>
            </select>
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search for..." name="searchContext" value="${searchContext}">
                  <span class="input-group-btn">
                    <button class="btn btn-default" type="button" onclick="submitForm();">查找</button>
                  </span>
            </div><!-- /input-group -->
        </div>
    </form>
    <table class="table table-hover">
        <thead>
        <tr>
        	<th class="col-lg-1"><input type="checkbox">全选</th>
            <th class="col-lg-1">序号</th>
            <th class="col-lg-2">员工编号</th>
            <th class="col-lg-3">姓名</th>
            <th class="col-lg-2">部门</th>
            <th class="col-lg-2">编辑</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pageResult.items }" var="staff" varStatus="vs">
	        <tr>
	        	<td><input type="checkbox"></td>
	       		<td>${vs.count }</td>
	         	<td>${staff.cardId }</td>
	            <td>${staff.staName }</td>
	            <td>${staff.address }</td>
	            <td><a href="${path}/staff/editStaffPage?staff.staffId=${staff.staffId}">编辑</a></td>
	        </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="container">
        <nav>
            <ul class="pagination ">
                <li>
                    <a href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <c:forEach begin="1" end="${pageResult.totalPageCount}" var="i">
                	<c:choose>
                		<c:when test="${pageResult.pageNo==i}"><li class="active"><a href="#">${i}</a></li></c:when>
                		<c:otherwise><li><a href="#">${i}</a></li></c:otherwise>
                	</c:choose>
                </c:forEach>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>

</div>
</body>

<script src="bootstrap/js/bootstrap.min.js"></script>
</html>
