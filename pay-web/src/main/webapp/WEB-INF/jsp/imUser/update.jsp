<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <%@ include file = "../common.jsp" %>
	</head>
	<body>
		<article class="cl pd-20">
    <form action="imUser/update" method="post" class="form form-horizontal" id="form">
    <input type="hidden" name="id_user" value="${imUser.id_user }">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>用户名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${imUser.user_acc }" placeholder="" id="user_acc" name="user_acc">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>姓名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="${imUser.user_name }" placeholder="" id="user_name" name="user_name">
            </div>
        </div>
        
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
            </div>
        </div>
    </form>
</article>
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="resources/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="resources/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="resources/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="resources/lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">
$(function(){
    $('.skin-minimal input').iCheck({
        checkboxClass: 'icheckbox-blue',
        radioClass: 'iradio-blue',
        increaseArea: '20%'
    });
    
    $("#form").validate({
    	rules:{
            user_acc:{
                required:true,
                minlength:4,
                maxlength:16
            },
            user_name:{
                required:true,
            },
        },
        onkeyup:false,
        focusCleanup:true,
        success:"valid",
        submitHandler:function(form){
            $(form).ajaxSubmit({success:function(data){
                if(data=="success"){
                    var index = parent.layer.getFrameIndex(window.name);
                    parent.location.reload();
                    parent.layer.close(index);
                }else{
                    alert("修改失败");
                }
            }});
        }
    });
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
	</body>
</html>