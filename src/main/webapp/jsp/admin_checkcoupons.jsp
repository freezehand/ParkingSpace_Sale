<%--
  Created by IntelliJ IDEA.
  User: 尘起
  Date: 2021/12/26
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>审核优惠券</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/main.css">
</head>
<body>
<div id="preloader" >
    <div id="status" ></div>
</div>
<header>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="logo"></div>
        <a href="${pageContext.request.contextPath }/admin/admingetparkingspace">审核车位发布</a>
        <a href="${pageContext.request.contextPath }/admin/admingetmessage">审核消息发布</a>
        <a href="${pageContext.request.contextPath }/admin/admingetcoupons">审核优惠券发布</a>
        <span class="slider-bar"></span>
        <%--        <i class="carts" onclick="tocart()"></i>--%>
        <span>
        <c:if test="${not empty account }">
            <h4 class="user">${account.username}</h4>
            <a class="logout" href="${pageContext.request.contextPath}/user/logout">注销</a>
        </c:if>

        <c:if test="${ empty account }">
            <h4 class="signin" data-toggle="modal" data-target="#log-wrapper" >
                <a href="${pageContext.request.contextPath }/jsp/login.jsp">登录</a>
            </h4>
            <h4 class="signup" data-toggle="modal" data-target="#log-wrapper">
                  <a href="${pageContext.request.contextPath }/jsp/register.jsp">注册</a>
            </h4>
        </c:if>
    </span>
    </nav>
</header>

<section class="admin_message">
    <div class="head">审核优惠券</div>
    <div class="title">
        <ul>
            <li>优惠券编号</li>
            <li>发送者</li>
            <li>接收者</li>
            <li>内容</li>
            <li>状态</li>
            <li>操作</li>
        </ul>
    </div>
    <div class="carts-content">
        <c:forEach items="${admincouponslist}" var="c">
            <ul>
                <li><span class="message">${c.id}</span></li>
                <li><span class="message">${c.sender}</span></li>
                <li><span class="message">${c.receiver}</span></li>
                <li><span class="message">${c.content}</span></li>
                <li><span class="message">${c.state}</span></li>
                <li><span class="message">
                    <c:if test="${c.state=='待审核'}">
                        <a href="${pageContext.request.contextPath}/admin/checkcoupons?id=${c.id}">审核通过</a>
                    </c:if>

                </span></li>
            </ul>
        </c:forEach>
    </div >
</section>

<footer>
    <div>
        <ul>
            <li>开发人员</li>
            <li>徐晨祺</li>
            <li>苏嘉宇</li>
            <li>杨泽凯</li>
            <li>盖维旭</li>
        </ul>
    </div>
</footer>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bg-canvas.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/main.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/onloada.js"></script>
</body>
</html>
