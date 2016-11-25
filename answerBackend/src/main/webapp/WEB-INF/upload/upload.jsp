<%--
  Created by IntelliJ IDEA.
  User: TsuiXh
  Date: 16/11/24
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增图文</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-3.1.1.js"></script>
    <script src="js/alert.js"></script>
    <script src="js/app.js"></script>
</head>
<body background="images/bg.jpg">
<div class="container">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">武理解析-答案上传(AnswerSyncCenter)</a>
            </div>
        </div>
    </nav>

    <div class="alert alert-warning" role="alert">
        Attention: 如有学校或者科目缺省的情况，请联系<a href="#" class="alert-link">武理解析管理员</a>。
    </div>

    <div class="jumbotron">
        <form class="form-horizontal">
            <div class="form-group">
                <label for="inputSchool" class="col-sm-2 control-label">学校</label>
                <div class="col-sm-10">
                    <select name="school" class="form-control" id="inputSchool">
                        <option>武汉大学</option>
                        <option selected>武汉理工大学</option>
                        <option>华中师范大学</option>
                        <option>华中科技大学</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="inputSubject" class="col-sm-2 control-label">科目</label>
                <div class="col-sm-10">
                    <select name="subject" class="form-control" id="inputSubject">
                        <option selected>高等数学A</option>
                        <option>高等数学B</option>
                        <option>线性代数</option>
                        <option>大学物理</option>
                        <option>C语言</option>
                        <option>大学英语1</option>
                        <option>大学英语2</option>
                        <option>大学英语3</option>
                        <option>大学英语4</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="inputChapter" class="col-sm-2 control-label">习题（章节）</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputChapter" name="chapter" placeholder="习题章节">
                </div>
            </div>
            <div class="form-group">
                <label for="thumb" class="col-sm-2 control-label">封面图片</label>
                <div class="col-sm-10">
                    <div id="imgShow"></div>
                    <input type="file" class="form-control" id="thumb" name="thumb" value onchange="showPic(this)">
                </div>
            </div>
            <div class="form-group">
                <label for="inputChapter" class="col-sm-2 control-label">习题图片</label>
                <div class="col-sm-10">
                    <input type="file" class="form-control" id="inputPics" name="answers" multiple>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-info">提交</button>
                </div>
            </div>
        </form>
    </div>
    <hr>
    <footer>
        <div class="container">
            <p style="color: #d6d6d6;">&copy; 2016 Wulijiexi, Inc. Powered by Yunhong</p>
        </div>
    </footer>
</div>
</body>
</html>
