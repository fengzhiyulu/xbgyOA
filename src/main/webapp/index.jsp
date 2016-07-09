<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/head.jsp" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="${path }/bootstrap/css/index.css">
    <title>Navbar Template for Bootstrap</title>

      <script type="text/javascript">
          $(function(){
          });
      </script>
  </head>

  <body>
    <!--导航栏*/-->
    <div class="container-fluid" style="margin: 0px;padding: 0px;">
    <nav class="navbar navbar-default" style="margin-bottom:0px;">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <a class="navbar-brand" href="#">xbgy</a>
        </div>
    
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="navbar-right">
         
          <form class="navbar-form navbar-left" role="search">
         	<button type="button" class="btn btn-default" aria-label="Left Align">
         		<span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
        	</button>
            <button type="button" class="btn btn-default" aria-label="Left Align">
         		<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
        	</button>
            <div class="input-group">
              <input type="text" class="form-control" placeholder="Search">
            	<span class="input-group-btn">
        			<button class="btn btn-default" type="button" aria-label="Left Align"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
      			</span>
            </div>
          
          </form>
          
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
    </nav>
        <!--主菜单-->
        <section class="container-fluid" style="margin:0px; padding:0px;">
            <div class="row" style="margin:0px; padding:0px;">
                <div class="col-lg-2" style="margin:0px; padding:0px;">
                <!--功能菜单-->
                    <ul id="main-nav" class="nav nav-stacked">
                        <li class="active">
                            <a href="#">
                                <i class="glyphicon glyphicon-th-large"></i>
                        	        首页
                            </a>
                        </li>
                        <li>
                            <a href="#systemSetting" class="nav-header collapsed" data-toggle="collapse">
                                <i class="glyphicon glyphicon-cog"></i>
                           	     系统管理
                                <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                            </a>
                            <ul id="systemSetting" class="nav nav-list collapse">
                                <li><a href="#"><i class="glyphicon glyphicon-user"></i>用户管理</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>菜单管理</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>角色管理</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-edit"></i>修改密码</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-eye-open"></i>日志查看</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#staff" class="nav-header collapsed" data-toggle="collapse">
                                <i class="glyphicon glyphicon-cog"></i>
                              	  员工管理
                                <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                            </a>
                            <ul id="staff" class="nav nav-list collapse">
                                <li><a href="${path}/staff/staffPage" target="rightFrame"><i class="glyphicon glyphicon-user"></i>员工管理</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-user"></i>部门管理</a></li>
                            </ul>
                        </li>
                         <li>
                            <a href="#sale" class="nav-header collapsed" data-toggle="collapse">
                                <i class="glyphicon glyphicon-cog"></i>
                              	  销售管理
                                <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                            </a>
                            <ul id="sale" class="nav nav-list collapse">
                                <li><a href="${path}/sale/addMarketPage" target="rightFrame"><i class="glyphicon glyphicon-user"></i>门店管理</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-user"></i>签单管理</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#store" class="nav-header collapsed" data-toggle="collapse">
                                <i class="glyphicon glyphicon-cog"></i>
                              	 仓库管理
                                <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                            </a>
                            <ul id="store" class="nav nav-list collapse">
                                <li><a href="${path}/purchase/addPurchasePage" target="rightFrame"><i class="glyphicon glyphicon-user"></i>入库单管理 </a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-user"></i>签单管理</a></li>
                            </ul>
                        </li>

                        <li>
                            <a href="./grid.html">
                                <i class="glyphicon glyphicon-globe"></i>
                                分发配置
                                <span class="label label-warning pull-right">5</span>
                            </a>
                        </li>

                        <li>
                            <a href="./charts.html">
                                <i class="glyphicon glyphicon-calendar"></i>
                                图表统计
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-fire"></i>
                                关于系统
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="col-lg-10"  style="padding: 0px 10px;">
                    <div class="embed-responsive embed-responsive-4by3">
                        <iframe class="embed-responsive-item" src="${path}/default.jsp" name="rightFrame"></iframe>
                    </div>
                </div>

            </div>
        </section>
    </div>
  </body>
</html>

