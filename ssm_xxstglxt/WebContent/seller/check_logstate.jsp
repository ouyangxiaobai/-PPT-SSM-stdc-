<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	String sellerid = (String) session.getAttribute("sellerid");
	if (sellerid == null) {
		response.getWriter().println("<script>top.location.href='" + basePath + "seller/index.action';</script>");
	}
%>