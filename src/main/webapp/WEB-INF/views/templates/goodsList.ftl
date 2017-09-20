<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GoodsData</title>
</head>
<body>
<#include "header.ftl">
<h1>Goods list:</h1>

<table style="width:100%" class="table">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Merchant</th>
    </tr>
<#list goods as goods>
    <tr>
        <td><a href="/goods/${goods.id}">${goods.id}</a></td>
        <td>${goods.name}</td>
        <td>${goods.price}</td>
        <td>${goods.merchant}</td>
    </tr>
</#list>
</table>

<#include "newGoods.ftl"/>
</body>
</html>