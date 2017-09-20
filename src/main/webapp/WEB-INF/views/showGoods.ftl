<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GoodsData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>Goods info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${goods.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${goods.name}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${goods.price}</td>
        </tr>
        <td>Merchant</td>
        <td>${goods.merchant}</td>
        </tr>
    </table>
</div>
<a type="button" href="/allGoods" class="button">Back</a>
</body>
</html>