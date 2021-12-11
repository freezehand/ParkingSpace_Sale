<%--
  Created by IntelliJ IDEA.
  User: 尘起
  Date: 2021/12/11
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>车位在线售卖系统</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
<%--    <script src="${pageContext.request.contextPath }/js/register.js"></script>--%>
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
        <form  class="form" action="LoginServlet" method="post" name="registerform">
            <h3>车位在线售卖系统</h3>
            <p>注册</p>
            <input type="text" autofocus="autofocus" id="username" name="username" value placeholder="用户名" required="required">
            <input type="password" name="password" id="password" value placeholder="密码" required="required">
<%--            <input type="password" name="repassword" id="repassword" value placeholder="确认密码" required="required">--%>
            <input type="text" name="name" id="name" value placeholder="真实姓名" required="required">
            <input type="text" name="address" id="address" value placeholder="小区地址（例XX小区X幢X室）" required="required">
            <font color=red>${result}</font>
            <input id="submit" type="submit" name="submit" value="注册">
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
