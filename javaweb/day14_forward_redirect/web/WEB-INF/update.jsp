<%--
  Created by IntelliJ IDEA.
  User: lyf
  Date: 2021/3/22
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateProduct?id=${product.id}" method="post">
    <table border="1px">
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="productName" value="${product.productName}"/></td>
        </tr>
        <tr>
            <td>商品分类id</td>
            <td><input type="text" name="dir_id" value="${product.dir_id}"/></td>
        </tr>
        <tr>
            <td>售价</td>
            <td><input type="text" name="salePrice" value="${product.salePrice}"/></td>
        </tr>
        <tr>
            <td>供应商</td>
            <td><input type="text" name="supplier" value="${product.supplier}"/></td>
        </tr>
        <tr>
            <td>品牌</td>
            <td><input type="text" name="brand" value="${product.brand}"/></td>
        </tr>
        <tr>
            <td>折扣</td>
            <td><input type="text" name="cutoff" value="${product.cutoff}"/></td>
        </tr>
        <tr>
            <td>成本</td>
            <td><input type="text" name="costPrice" value="${product.costPrice}"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="修改"/></td>
        </tr>
    </table>
</form>
</body>
</html>
