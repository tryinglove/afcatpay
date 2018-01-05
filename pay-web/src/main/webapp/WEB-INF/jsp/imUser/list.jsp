<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <%@ include file = "../common.jsp" %>
	</head>
	<body>
    
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户列表<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <div class="cl pd-5 bg-1 bk-gray"> <span class="l"> <a href="javascript:;" onclick="member_add('添加用户','imUser/add','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span></div>
            <div class="mt-20">
                <table class="table table-border table-bordered table-hover table-bg table-sort">
                    <thead>
                        <tr class="text-c">
                            <th><input type="checkbox" name="" value=""></th>
                            <th>ID</th>
                            <th>账号</th>
                            <th>姓名</th>
                            <th>角色</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${imUserList }" var="imUser">
                        <tr class="text-c">
                            <td><input type="checkbox" value="1" name=""></td>
                            <td>${imUser.id_user}</td>
                            <td>${imUser.user_acc}</td>
                            <td>${imUser.user_name}</td>
                            <td>${imUser.user_stt}</td>
                            <td class="td-manage"><a title="编辑" href="javascript:;" onclick="member_edit('编辑','imUser/update/${imUser.id_user}','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>  <a title="删除" href="imUser/delete/${imUser.id_user}" onclick="return confirm('确定删除?');" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </article>
    </div>
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="resources/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="resources/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="resources/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
    $('.table-sort').dataTable({
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
          //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
          {"orderable":false,"aTargets":[0,5]}// 制定列不参与排序
        ]
    });
    $('.table-sort tbody').on( 'click', 'tr', function () {
        if ( $(this).hasClass('selected') ) {
            $(this).removeClass('selected');
        }
        else {
            table.$('tr.selected').removeClass('selected');
            $(this).addClass('selected');
        }
    });
});
/*用户-添加*/
function member_add(title,url,w,h){
    layer_show(title,url,w,h);
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
    layer_show(title,url,w,h);
}

</script>
	</body>
</html>