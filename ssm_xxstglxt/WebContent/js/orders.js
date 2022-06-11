$(function() {

$("#ordercode").blur(
		function() {
			$("#ordercode_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#ordercode").after("<span id='ordercode_msg' style='color: red'>订单不能为空</span>");
			}
	});

$("#usersid").blur(
		function() {
			$("#usersid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#usersid").after("<span id='usersid_msg' style='color: red'>用户不能为空</span>");
			}
	});

$("#goodsid").blur(
		function() {
			$("#goodsid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#goodsid").after("<span id='goodsid_msg' style='color: red'>食品不能为空</span>");
			}
	});

$("#sellerid").blur(
		function() {
			$("#sellerid_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#sellerid").after("<span id='sellerid_msg' style='color: red'>商户不能为空</span>");
			}
	});

$("#price").blur(
		function() {
			$("#price_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#price").after("<span id='price_msg' style='color: red'>单价不能为空</span>");
			}
	});

$("#num").blur(
		function() {
			$("#num_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#num").after("<span id='num_msg' style='color: red'>数量不能为空</span>");
			}
	});

$("#total").blur(
		function() {
			$("#total_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#total").after("<span id='total_msg' style='color: red'>总计不能为空</span>");
			}
	});

$("#addtime").blur(
		function() {
			$("#addtime_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#addtime").after("<span id='addtime_msg' style='color: red'>下单日期不能为空</span>");
			}
	});

$("#status").blur(
		function() {
			$("#status_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#status").after("<span id='status_msg' style='color: red'>状态不能为空</span>");
			}
	});

$("#receiver").blur(
		function() {
			$("#receiver_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#receiver").after("<span id='receiver_msg' style='color: red'>收货人不能为空</span>");
			}
	});

$("#address").blur(
		function() {
			$("#address_msg").empty();
			var name = $(this).val();
			if (name == "" || name == null) {
				$("#address").after("<span id='address_msg' style='color: red'>送餐地址不能为空</span>");
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







$('#sub').click(function(){
var ordercode = $("#ordercode").val();
var usersid = $("#usersid").val();
var goodsid = $("#goodsid").val();
var sellerid = $("#sellerid").val();
var price = $("#price").val();
var num = $("#num").val();
var total = $("#total").val();
var addtime = $("#addtime").val();
var status = $("#status").val();
var receiver = $("#receiver").val();
var address = $("#address").val();
var contact = $("#contact").val();
$("#ordercode_msg").empty();
$("#usersid_msg").empty();
$("#goodsid_msg").empty();
$("#sellerid_msg").empty();
$("#price_msg").empty();
$("#num_msg").empty();
$("#total_msg").empty();
$("#addtime_msg").empty();
$("#status_msg").empty();
$("#receiver_msg").empty();
$("#address_msg").empty();
$("#contact_msg").empty();
if (ordercode == "" || ordercode == null) {
	$("#ordercode").after("<span id='ordercode_msg' style='color: red'>订单不能为空</span>");
	return false;
}
if (usersid == "" || usersid == null) {
	$("#usersid").after("<span id='usersid_msg' style='color: red'>用户不能为空</span>");
	return false;
}
if (goodsid == "" || goodsid == null) {
	$("#goodsid").after("<span id='goodsid_msg' style='color: red'>食品不能为空</span>");
	return false;
}
if (sellerid == "" || sellerid == null) {
	$("#sellerid").after("<span id='sellerid_msg' style='color: red'>商户不能为空</span>");
	return false;
}
if (price == "" || price == null) {
	$("#price").after("<span id='price_msg' style='color: red'>单价不能为空</span>");
	return false;
}
if (num == "" || num == null) {
	$("#num").after("<span id='num_msg' style='color: red'>数量不能为空</span>");
	return false;
}
if (total == "" || total == null) {
	$("#total").after("<span id='total_msg' style='color: red'>总计不能为空</span>");
	return false;
}
if (addtime == "" || addtime == null) {
	$("#addtime").after("<span id='addtime_msg' style='color: red'>下单日期不能为空</span>");
	return false;
}
if (status == "" || status == null) {
	$("#status").after("<span id='status_msg' style='color: red'>状态不能为空</span>");
	return false;
}
if (receiver == "" || receiver == null) {
	$("#receiver").after("<span id='receiver_msg' style='color: red'>收货人不能为空</span>");
	return false;
}
if (address == "" || address == null) {
	$("#address").after("<span id='address_msg' style='color: red'>送餐地址不能为空</span>");
	return false;
}
if (contact == "" || contact == null) {
	$("#contact").after("<span id='contact_msg' style='color: red'>联系方式不能为空</span>");
	return false;
}
});
$('#res').click(function() {
$("#ordercode_msg").empty();
$("#usersid_msg").empty();
$("#goodsid_msg").empty();
$("#sellerid_msg").empty();
$("#price_msg").empty();
$("#num_msg").empty();
$("#total_msg").empty();
$("#addtime_msg").empty();
$("#status_msg").empty();
$("#receiver_msg").empty();
$("#address_msg").empty();
$("#contact_msg").empty();
});

});
