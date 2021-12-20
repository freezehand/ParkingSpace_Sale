<%@ page import="Pojo.Account" %><%--
  Created by IntelliJ IDEA.
  User: 尘起
  Date: 2021/12/16
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>车位详细信息</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/main.css">
</head>
<body>
<%--<%--%>
<%--    Account account=(Account) session.getAttribute("account");--%>
<%--%>--%>
<div id="preloader" >
    <div id="status" ></div>
</div>
<header>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="logo"></div>
        <a href="${pageContext.request.contextPath }/jsp/product.jsp">首页</a>
        <a href="javascript:void(0)" onclick="phone('手机')">我的订单</a>
        <a href="javascript:void(0)" onclick="phone('平板')">消息通知</a>
        <a href="javascript:void(0)" onclick="phone('笔记本')">我的优惠卷</a>
        <a href="javascript:void(0)" onclick="phone('配件')">客服咨询</a>
        <span class="slider-bar"></span>
        <i class="carts" onclick="tocart()"></i>
        <span>
            <c:if test="${not empty account }">
                <h4 class="user">${account.username}</h4>
                <a class="logout" href="${pageContext.request.contextPath}/#">注销</a>
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

<section class="w">
    <div class="product-img">
        <div class="handle">
            <div class="thumb">
                <ul>
                    <li class="n-hover">
                        <img src="/upload/${pro.imgurl }">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/e086ecc18effe218e6f9cefeb1745b83.jpg">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/eb09f6835eb770e9106dff6b300fe2f8.jpg">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/47bacd1fbf16cba1554d0723dddfe4fe.jpg">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/2e94f6482d570ce355030bea44fd42fa.jpg">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/e2c7f88b1bd6809ade50c5be45455da0.jpg">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/4cae1678a7b505eea715486651c0f4c7.jpg">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/fee60363efe598aa21d633a3671a4861.jpg">
                    </li>
                    <li class="">
                        <img src="http://img001.fview.cn/Public/upload/product/76f87b698fe34f6447dd4e53dc052d44.jpg">
                    </li>
                </ul>
            </div>
            <a class="arrow up i-icon"></a>
            <a class="arrow down i-icon"></a>
        </div>
        <div class="view">
            <img src="${pageContext.request.contextPath}/image/parkingspace/${ParkingSpace.url}">
        </div>
    </div>
    <div class="product-details">
        <h1>${ParkingSpace.location}</h1>
        <p class="re"><span>车位编号：</span><span>${ParkingSpace.id}</span></p>
        <p class="price" data-price="3649">
            <span>价格</span>
            <span class="price">${ParkingSpace.price }</span>
        </p>
        <ul class="details">
            <li><span>小区</span><a class="u-check n-check">${ParkingSpace.community}</a></li>
            <li><span>车位证照信息</span><a class="u-check n-check">${ParkingSpace.licenses}</a></li>
            <li><span>折扣信息</span><a class="u-check n-check">${ParkingSpace.discount}</a></li>
            <li><span>车位状态</span><a class="u-check n-check">${ParkingSpace.state}</a></li>
            <li><span>发布者</span><a class="u-check n-check">${ParkingSpace.publisher}</a></li>
        </ul>
        <div class="action">
            <a class="buy"	href="fastbuy.jsp">立即购买</a>
            <a class="addCar" onclick="addProductToCart('${pro.id}')"><i></i>加入购物车</a>
        </div>
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
<script type="text/javascript">
    function addProductToCart(id){

        location.href="${pageContext.request.contextPath}/AddProductToCartServlet?id="+id;
    }
</script>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bg-canvas.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/main.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/onloada.js"></script>
</body>
</html>
