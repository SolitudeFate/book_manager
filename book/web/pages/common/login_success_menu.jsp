<%--
  Created by IntelliJ IDEA.
  User: zzy
  Date: 2021/1/26
  Time: 4:10 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <span>用户名：<span class="um_span">${sessionScope.user.username}</span></span>
    <a href="orderServlet?action=myOrders">我的订单</a>
    <a href="userServlet?action=logout">退出当前账号</a>
    <a href="index.jsp">返回</a>
</div>
