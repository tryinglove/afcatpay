<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <%@ include file = "../common.jsp" %>
	</head>
	<body>
		<article class="cl pd-20">
    <form action="imUser/add" method="post" class="form form-horizontal" id="form">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>用户名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="user_acc" name="user_acc">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>初始密码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="password" class="input-text" autocomplete="off" value="" placeholder="密码" id="user_pwd" name="user_pwd">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>确认密码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="password" class="input-text" autocomplete="off"  placeholder="确认新密码" id="user_pwd2" name="user_pwd2">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>姓名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="user_name" name="user_name">
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>状态：</label>
            <div class="formControls col-xs-8 col-sm-9 skin-minimal">
                <div class="radio-box">
                    <input name="user_stt" type="radio" id="user_stt-0" value="0">
                    <label for="user_stt-0">停用</label>
                </div>
                <div class="radio-box">
                    <input type="radio" id="user_stt-1" value="1" name="user_stt" checked>
                    <label for="user_stt-1">启用</label>
                </div>
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
            user_pwd:{
                required:true,
            },
            user_pwd2:{
                required:true,
                equalTo: "#user_pwd"
            },
            user_name:{
                required:true,
            },
            user_stt:{
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
                    alert("添加失败");
                }

            }});
        }
    });
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
	</body>
</html>