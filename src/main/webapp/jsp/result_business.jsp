<%--
  Created by IntelliJ IDEA.
  User: 尘起
  Date: 2021/12/25
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>结果</title>
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
    <a href="${pageContext.request.contextPath }/jsp/business_main.jsp">我的车位发布</a>
    <a href="${pageContext.request.contextPath }/user/getorder?username=${account.username}">我的消息发布</a>
    <a href="${pageContext.request.contextPath }/user/getmessage?username=${account.username}">我的优惠券发布</a>
    <a href="${pageContext.request.contextPath }/user/getcoupons?username=${account.username}">我的订单</a>
    <span class="slider-bar"></span>
    <i class="carts" onclick="tocart()"></i>
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
<section class="page">

  <aside id="aside" class="panel-group aside-menu">
    <h3 class="type">菜单</h3>
    <%--        <c:forEach items="${c2name}" var="p" varStatus="vs">--%>
    <dl class="panel panel-default">
      <dt data-toggle="collapse" data-target=".1" aria-expanded="true" data-parent="#aside" >
        <span class="collapse-btn"><a href="${pageContext.request.contextPath }/jsp/addparkingspace.jsp">发布新车位</a></span>
      </dt>
    </dl>
    <dl class="panel panel-default">
      <dt data-toggle="collapse" data-target=".1" aria-expanded="true" data-parent="#aside">
        <span class="collapse-btn"><a href="${pageContext.request.contextPath }/user/getorder?username=${account.username}">发布新消息</a></span>
      </dt>
    </dl>
    <dl class="panel panel-default">
      <dt data-toggle="collapse" data-target=".1" aria-expanded="true" data-parent="#aside" >
        <span class="collapse-btn"><a href="${pageContext.request.contextPath }/user/getmessage?username=${account.username}">发布新优惠券</a></span>
      </dt>
    </dl>
    <%--        </c:forEach>--%>
  </aside>
  <div class="content">
   <h3 align="center">${message}</h3>
  </div>
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
