<%--
  Created by IntelliJ IDEA.
  User: fujiaxiaoshao
  Date: 2016/11/17
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>图文列表页</title>
    <link href="startbootstrap1.0.4/css/bootstrap.min.css" rel="stylesheet">
    <link href="startbootstrap1.0.4/css/sb-admin.css" rel="stylesheet">
    <link href="startbootstrap1.0.4/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="js/articles.js"></script>
</head>
<body>
    <div style="background-color:#ffffff;">
    <div class="container">
        <h2>习题解析后台</h2>
        <div class="row" >
            <div class="form-group col-lg-3" >
                <input class="form-control text-muted" placeholder="按图文标题查询"   id='grade'	required oninput="queryStudents()">
            </div>
            <div class="form-group col-lg-3" >
                <select class="form-control text-muted"    id='articleType'	onchange="queryStudents()"></select>
            </div>
            <div class="form-group col-lg-3" >
            <a type="button" class="btn btn-primary" href="articleContent" target= "_blank">新建习题</a>
            </div>
            <div class="col-lg-12">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover table-striped">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>图文标题</th>
                            <th>分类</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody id="articleList">

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    </div>
</body>
</html>
