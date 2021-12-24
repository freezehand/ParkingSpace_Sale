<%--
  Created by IntelliJ IDEA.
  User: 尘起
  Date: 2021/12/23
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>业务人员新增停车位</title>
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
        <a href="${pageContext.request.contextPath }/jsp/product.jsp">我的车位发布</a>
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
                <span class="collapse-btn"><a href="${pageContext.request.contextPath }/jsp/product.jsp">发布新车位</a></span>
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
        <form action="${pageContext.request.contextPath}/ProductAddServlet"
              method="post" encType="multipart/form-data" id="add">
            <table border="1" align="center">
                <tr style="display:none">
                    <td>id</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>小区名</td>
                    <td><input type="text" name="name" value="123"></td>
                </tr>
                <tr>
                    <td>商品价格</td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>
                    <td>商品数量</td>
                    <td><input type="text" name="pnum">
                        <input type="hidden" name="c3code" id="c3code"></td>
                </tr>
                <tr>

                </tr>
                <tr>
                    <td>商品图片</td>
                    <td><input type="file" name="f"></td>
                </tr>
                <tr>
                    <td>商品颜色</td>
                    <td><input type="text" name="color"></td>
                </tr>
                <tr>
                    <td>商品描述</td>
                    <td><textarea rows="10" cols="20" name="description"></textarea>
                    </td>
                </tr>

                <tr>
                    <td colspan="2"><input type="button" value="添加" onclick="add()">&nbsp;&nbsp;
                        <input type="reset" value="取消" onclick="cancel()">
                    </td>

                </tr>

            </table>
        </form>
    </div>
</section>


<aside class="aside-tool">
    <ul>
        <li class="customer">
            <a href="http://wpa.qq.com/msgrd?v=3&uin=476759153&site=qq&menu=yes" target=_blank
               clickid=guanwang_navigation_customer>联系客服</a>
        </li>
        <li class="top"></li>
    </ul>
</aside>
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
