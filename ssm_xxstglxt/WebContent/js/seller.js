$(function() {

$("#username").blur(
		function() {
			$("#username_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#username").after("<span id='username_msg' style='color: red'>用户名不能为空</span>");
			}
	});

$("#password").blur(
		function() {
			$("#password_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#password").after("<span id='password_msg' style='color: red'>密码不能为空</span>");
			}
	});

$("#shopname").blur(
		function() {
			$("#shopname_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#shopname").after("<span id='shopname_msg' style='color: red'>商铺名称不能为空</span>");
			}
	});

$("#idcard").blur(
		function() {
			$("#idcard_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#idcard").after("<span id='idcard_msg' style='color: red'>身份证不能为空</span>");
			}
	});

$("#contact").blur(
		function() {
			$("#contact_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
			}
	});

$("#address").blur(
		function() {
			$("#address_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#address").after("<span id='address_msg' style='color: red'>商铺地点不能为空</span>");
			}
	});

$("#workdate").blur(
		function() {
			$("#workdate_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#workdate").after("<span id='workdate_msg' style='color: red'>开业日期不能为空</span>");
			}
	});







$('#sub').click(function(){
var username = $("#username").val();
var password = $("#password").val();
var shopname = $("#shopname").val();
var idcard = $("#idcard").val();
var contact = $("#contact").val();
var address = $("#address").val();
var workdate = $("#workdate").val();
$("#username_msg").empty();
$("#password_msg").empty();
$("#shopname_msg").empty();
$("#idcard_msg").empty();
$("#contact_msg").empty();
$("#address_msg").empty();
$("#workdate_msg").empty();
if (username == "" || username == null) {
	$("#username").after("<span id='username_msg' style='color: red'>用户名不能为空</span>");
	return false;
}
if (password == "" || password == null) {
	$("#password").after("<span id='password_msg' style='color: red'>密码不能为空</span>");
	return false;
}
if (shopname == "" || shopname == null) {
	$("#shopname").after("<span id='shopname_msg' style='color: red'>商铺名称不能为空</span>");
	return false;
}
if (idcard == "" || idcard == null) {
	$("#idcard").after("<span id='idcard_msg' style='color: red'>身份证不能为空</span>");
	return false;
}
if (contact == "" || contact == null) {
	$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
	return false;
}
if (address == "" || address == null) {
	$("#address").after("<span id='address_msg' style='color: red'>商铺地点不能为空</span>");
	return false;
}
if (workdate == "" || workdate == null) {
	$("#workdate").after("<span id='workdate_msg' style='color: red'>开业日期不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#username_msg").empty();
$("#password_msg").empty();
$("#shopname_msg").empty();
$("#idcard_msg").empty();
$("#contact_msg").empty();
$("#address_msg").empty();
$("#workdate_msg").empty();
});

});
