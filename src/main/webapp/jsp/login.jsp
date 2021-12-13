<%--
  Created by IntelliJ IDEA.
  User: 尘起
  Date: 2021/6/15
  Time: 6:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>车位在线售卖系统</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
</head>
<body>
<%--<header>--%>
<header>
    <nav>
        <ul>
            <a href="#"><li>首页</li></a>
            <a href="${pageContext.request.contextPath}/jsp/login.jsp"><li>登录</li></a>
            <a href="${pageContext.request.contextPath}/jsp/register.jsp"><li>业主用户注册</li></a>
        </ul>
    </nav>
</header>
<%--main--%>
<main>
    <div class="container">
        <img class="login_bg" src="${pageContext.request.contextPath }/image/login1.jpg">
        <form  class="form" action="${pageContext.request.contextPath}/user/login" method="post">
            <h3>车位在线售卖系统</h3>
            <p>登录</p>
            <input type="text" autofocus="autofocus" name="username" value placeholder="用户名" required="required">
            <input type="password" name="password" value placeholder="密码" required="required">
            <select name="usertype">
                <option value="业主用户" selected="selected">业主用户</option>
                <option value="业务人员">业务人员</option>
                <option value="管理员">管理员</option>
            </select>
            <font color=red>${message}</font>
            <input id="submit" type="submit" name="submit" value="登录">
        </form>
    </div>
</main>

<!--Footer-->
<footer>
    <div class="info">
        <ul>
            <a href="#"><li>车位在线售卖系统</li></a>
            <a href="#"><li>帮助与反馈</li></a>
            <a href="#"><li>联系我们</li></a>
        </ul>
    </div>
    <div class="copyright">
        &copy; Copyright. All rights reserved. Design by Xu Chenqi</a>
    </div>
</footer>
</body>
</html>
