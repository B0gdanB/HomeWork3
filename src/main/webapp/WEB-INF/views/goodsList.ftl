<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>All Goods list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Merchant</th>
        </tr>
    <#list allGoods as goods>
        <tr>
            <td><a href="/goods/${goods.id}">${goods.id}</a></td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
            <td>${goods.merchant}</td>
        </tr>
    </#list>
    </table>
</div>
<#include "templates/createGoodsForm.ftl"/>
<#include "templates/deleteGoodsForm.ftl"/>
</body>
</html>