<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎使用后台管理系统</title>
<link rel="stylesheet" type="text/css" href="h-ui/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="h-ui/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="h-ui/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="h-ui/h-ui.admin/css/style.css" />
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="h-ui/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="h-ui/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="js/seller.js" charset="utf-8"></script>
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js" charset="utf-8"></script>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>商户管理 <span class="c-gray en">&gt;</span> 商户信息
	</nav>
	<article class="page-container">
		<form class="form form-horizontal" id="form-article-add" action="seller/personal.action" name="myform" method="post">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2">用户名</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="username" class="input-text" id="username" value="${seller.username}" readonly="readonly" />
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2">商铺名称</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="shopname" class="input-text" id="shopname" value="${seller.shopname}" readonly="readonly" />
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2">身份证</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="idcard" class="input-text" id="idcard" value="${seller.idcard}" readonly="readonly" />
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2">联系方式</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="contact" class="input-text" id="contact" value="${seller.contact}" />
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2">商铺地点</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="address" class="input-text" id="address" value="${seller.address}" />
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2">开业日期</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="workdate" class="input-text" id="workdate" value="${seller.workdate}" onclick="WdatePicker()"
						readonly="readonly" />
				</div>
			</div>
			<div class="row cl">
				<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
					<input type="hidden" name="sellerid" id="sellerid" value="${seller.sellerid}" /><input type="hidden" name="password" id="password"
						value="${seller.password}" /> <input type="hidden" name="status" id="status" value="${seller.status}" /> <input type="hidden"
						name="regdate" id="regdate" value="${seller.regdate}" /> <input type="hidden" id="basepath" value="<%=basePath%>" />
					<button id="sub" class="btn btn-secondary radius" type="submit">
						<i class="Hui-iconfont">&#xe632;</i>提交保存
					</button>
					<button id="res" class="btn btn-default radius" type="reset">
						<i class="Hui-iconfont">&#xe68f;</i>取消重置
					</button>
				</div>
			</div>
		</form>
	</article>
</body>
</html>


