<%--
  Created by IntelliJ IDEA.
  User: TsuiXh
  Date: 16/11/13
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>登陆到武理解析后台管理</title>
  <link type="text/css" href="css/bootstrap.min.css" rel="stylesheet">
  <script src="js/jquery-3.1.1.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/alert.js"></script>
  <style>
    #wrapper {
      margin-top: 5px;
    }

    body {
      background: url("images/login_bg.jpg") no-repeat fixed;
    }
  </style>
</head>
<body>
<div class="container" id="wrapper">
  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">武理解析-后台管理(BackstageManagementCenter)</a>
      </div>
    </div><!-- /.container-fluid -->
  </nav>
  <div class="alert alert-warning alert-dismissible" role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
            aria-hidden="true">&times;</span></button>
    <strong>Warning !</strong> 武理解析后台仅限管理员登陆，现在不提供注册，请联系管理员。
  </div>
  <div class="jumbotron">
    <form class="form-horizontal" action="login" method="post">
      <div class="form-group">
        <label for="inputAccount" class="col-sm-2 control-label">账号</label>
        <div class="col-sm-10">
          <input type="text" value class="form-control" id="inputAccount" placeholder="请输入管理账号" name="account">
        </div>
      </div>
      <div class="form-group">
        <label for="inputPassword" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
          <input type="password" value class="form-control" id="inputPassword" placeholder="请输入密码" name="password">
        </div>
      </div>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <div class="checkbox">
            <label>
              <input type="checkbox" id="remember_me"> 记住我
            </label>
          </div>
        </div>
      </div>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-info" id="login">登陆</button>
        </div>
      </div>
    </form>
  </div>
  <hr>
  <footer>
    <div class="container">
      <p>&copy; 2016 武理解析, Inc. Powered by Yunhong.</p>
      <!--&copy; 2016 武理解析 Yunhong, Inc-->
    </div>
  </footer>
</div>
</body>
<script src="js/app.js"></script>
</html>
