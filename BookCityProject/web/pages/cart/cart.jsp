<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>购物车</title>
    <%@include file="/pages/common/head.jsp" %>
    <script type="text/javascript">
        //删除确定
        $(function (){
            $("a.deleteItem").click(function (){
                return confirm("确定要删除【"+$(this).parent().parent().find("td:first").text()+"】吗？");
            });
        });

        // 清空购物车确定
        $(function (){
            $("#cart_clear").click(function (){
                return confirm("确定要清空购物车吗？");
            });
        });
    </script>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">购物车</span>
    <%--    静态包含 登录成功之后的菜单--%>
    <%@include file="/pages/common/login_sucess_menu.jsp" %>
</div>

<div id="main">
    <table>
        <tr>
            <td>商品名称</td>
            <td>数量</td>
            <td>单价</td>
            <td>金额</td>
            <td>操作</td>
        </tr>

        <%--    如果购物车为空--%>
        <c:if test="${empty sessionScope.cart.cartItems}">
        <tr>
            <td colspan="5"><a href="index.jsp">当前购物车为空，请选择商品</a></td>
        </tr>
    </table>
    </c:if>
    <%--    如果购物车非空--%>
    <c:if test="${not empty sessionScope.cart.cartItems}">

        <c:forEach items="${sessionScope.cart.cartItems}" var="entry">
            <tr>
                <td>${entry.value.name}</td>
                <td>
                <input style="width: 50px;" type="text" value="${entry.value.count}">
                </td>
                <td>${entry.value.price}</td>
                <td>${entry.value.totalPrice}</td>
                <td><a class="deleteItem" href="cartServlet?action=deleteItem&bookId=${entry.value.id}">删除</a></td>
            </tr>
        </c:forEach>
        </table>
    </c:if>

    <c:if test="${not empty sessionScope.cart.cartItems}">
        <div class="cart_info">
            <span class="cart_span">购物车中共有<span class="b_count">${sessionScope.cart.totalCount}</span>件商品</span>
            <span class="cart_span">总金额<span class="b_price">${sessionScope.cart.totalPrice}</span>元</span>
            <span class="cart_span" id="cart_clear"><a href="cartServlet?action=clear">清空购物车</a></span>
            <span class="cart_span"><a href="pages/cart/checkout.jsp">去结账</a></span>
        </div>
    </c:if>
</div>

<%@include file="/pages/common/footer.jsp" %>
</body>
</html>