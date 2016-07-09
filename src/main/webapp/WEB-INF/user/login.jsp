<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/head.jsp"%>
<!DOCTYPE html>
<html>
  <head>
    <title>这是login页面</title>
    <link rel="stylesheet" href="${path }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
  <link rel="stylesheet" href="${path }/bootstrap/css/signin.css" type="text/css"></link>
  
  </head>
  
  <body>
  
   <div class="container">

      <form class="form-signin" action="/xbgyOA/user/login" method="post">
        <h2 class="form-signin-heading">请输入账号密码</h2>
        <label for="inputEmail" class="sr-only">用户名：</label>
        <input type="text" id="inputEmail" name="username" class="form-control" placeholder="zhang san" required autofocus>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->
  </body>
</html>
