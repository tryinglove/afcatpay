<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <base href="<%=basePath%>">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="resources/lib/html5.js"></script>
    <script type="text/javascript" src="resources/lib/respond.min.js"></script>
    <![endif]-->
    <link href="resources/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="resources/static/h-ui/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="resources/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="resources/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="resources/http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script><![endif]-->
    <title>后台登录 - H-ui.admin.page v3.0</title>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" action="sys/login" method="post">
            <div class="row cl">
                <label class="form-label col-xs-2"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="account" name="account" type="text" placeholder="账户" class="input-text size-L" value="${account }">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-2"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-2"><i class="Hui-iconfont">&#xe6cb;</i></label>
                <div class="formControls col-xs-8">
                    <input id="code" name="code" class="input-text size-L" type="text" placeholder="验证码">

                </div>
            </div>
            <div class="row cl">
               <p align="center"> <font color="red">${message }</font></p>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-5">
                    <img alt="验证码" title="看不清楚,换一下" src="sys/code" >
                    <input name=""  type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                </div>
            </div>


        </form>
    </div>
</div>
<div class="footer">Copyright AFCAT|TPP by H-ui.admin.page.v3.0</div>

<script type="text/javascript" src="resources/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="resources/static/h-ui/js/H-ui.js"></script>
<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();

</script>
<script>

    $("img").on("click",function(){
        //欺骗浏览器缓存
        $(this).attr("src","sys/code?"+(new Date()).getTime());
    });

</script>
</body>
</html>
