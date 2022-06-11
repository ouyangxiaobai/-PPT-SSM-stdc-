<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>商户信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="seller/userinfo.action" data-title="商家信息" href="javascript:void(0)">商家信息</a></li>
					<li><a data-href="seller/prePwd.action" data-title="修改密码" href="javascript:void(0)">修改密码</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>食品信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="goods/createGoods.action" data-title="新增食品" href="javascript:void(0)">新增食品信息</a></li>
					<li><a data-href="goods/getSellerGoods.action" data-title="食品列表" href="javascript:void(0)">食品信息列表</a></li>
				</ul>
			</dd>
		</dl>


		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>订单信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="orders/getSellerOrders.action" data-title="订单列表" href="javascript:void(0)">订单信息列表</a></li>
					<li><a data-href="seller/chart.jsp" data-title="订单统计" href="javascript:void(0)">订单统计</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>评价信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="topic/getSellerTopic.action" data-title="评价列表" href="javascript:void(0)">评价信息列表</a></li>
					<li><a data-href="seller/chartpie.jsp" data-title="用户评价统计" href="javascript:void(0)">用户评价统计</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i>意见反馈信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="complains/getSellerComplains.action" data-title="意见反馈列表" href="javascript:void(0)">意见反馈信息列表</a></li>
				</ul>
			</dd>
		</dl>

	</div>
</aside>


