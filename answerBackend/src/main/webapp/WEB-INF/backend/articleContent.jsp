<%--
  Created by IntelliJ IDEA.
  User: TP-LINK
  Date: 2016/11/24
  Time: 15:45
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
    <title>习题详情</title>
    <link href="startbootstrap1.0.4/css/bootstrap.min.css" rel="stylesheet">
    <link href="startbootstrap1.0.4/css/sb-admin.css" rel="stylesheet">
    <link href="startbootstrap1.0.4/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="js/articleContent.js"></script>
</head>
<body>
    <div style="background-color:#ffffff;">
        <div class="container">
            <h2>习题详情</h2>
            <div class="row">
            <div class="col-lg-6">
                <form>
                    <div class="form-group">
                        <label>习题标题</label>
                        <input type="text" class="form-control" required>
                        <p class="help-block">如：高数A:习题1-1函数与复合函数</p>
                    </div>
                    <div class="form-group">
                        <label>封面图片</label>
                        <input type="file"  required>
                    </div>
                    <div class="form-group">
                        <label>习题解析截图</label>
                        <div class="form-group">
                            <div class="row">
                                <input class="col-lg-6" type="file"  required>
                                <i class="fa fa-plus" onclick="addPicture()"></i>
                             </div>
                        </div>

                        <div class="form-group" id="">
                            <div class="row">
                                <input class="col-lg-6" type="file"  required>
                                <i class="fa fa-plus" onclick="addPicture()"></i>
                            </div>
                        </div>

                    </div>

                </form>
            </div>

            </div>
    </div>


</div>
</body>
</html>
