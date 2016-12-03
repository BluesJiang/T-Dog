<%--
  Created by IntelliJ IDEA.
  User: wanghanmei
  Date: 16/11/28
  Time: 下午4:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="PDClass.Item" %><%--
  Created by IntelliJ IDEA.
  User: Blues
  Date: 2016/11/12
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html>
<head>
    <link href="css/itemstyle.css" rel="stylesheet" type="text/css"/>
    <title>T-Dog</title>
</head>
    <%! Item content; %>
    <%
        content=(Item)request.getAttribute("item");

    %>

<body>
<div class="hee">
    <img class="tm" src="tm.png">
</div>
<div class="mid">
    <div class="item">
        <%
            out.print("<img src = \"//" + content.getDetailImageUrl() + "\"/>");
        %>
    </div>
    <div class="midright">
        <%
            out.print("<h>" + content.getName() +"</h>");
        %>

        </br>
        <font color="FF0000">下单立减 限量疯抢 苏宁快递 急速送达</font>

        <div>
            <span class="price">促销价</span>

            <span class="pricevalue">
                <%
                    out.print("<h1>" + content.getPrice() +"</h1>");
                %>
            </span>

        </div>

        <div>
            <img class="indexhead" src="indexh.png">
        </div>
        <div>
            <img class="indexend" src="indexe.png">
        </div>
        <div>
					<span>
						<img class="iconpay" src="iconpay.png">
					</span>
            <span>
						<img class="iconadd" src="iconadd.png">
					</span>
        </div>
        <div>
            <img class="following" src="following.png">
        </div>
    </div>
</div>
</body>