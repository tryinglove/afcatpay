    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="resources/favicon.ico" >
    <link rel="Shortcut Icon" href="resources/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="resources/lib/html5.js"></script>
    <script type="text/javascript" src="resources/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="resources/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="resources/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="resources/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="resources/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="resources/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <!--/meta 作为公共模版分离出去-->
    
    <!--_footer 作为公共模版分离出去-->
    <script type="text/javascript" src="resources/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="resources/lib/layer/2.4/layer.js"></script>
    <script type="text/javascript" src="resources/static/h-ui/js/H-ui.js"></script>
    <script type="text/javascript" src="resources/static/h-ui.admin/js/H-ui.admin.page.js"></script>
    <!--/_footer /作为公共模版分离出去-->