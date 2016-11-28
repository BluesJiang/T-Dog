<%--
  Created by IntelliJ IDEA.
  User: Blues
  Date: 2016/11/12
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <title>T-Dog</title>
  </head>
  <body>

  <div id="header">
    <h1>T-Dog</h1>
    </div>


    <div class = "mid">
      <span id = "midleft"><img src = "tm.png"/> </span>
      <%--<div id = "miding"><img class="search" src = "search.png"></div>--%>
      <span id = "miding">
        <form action = "form_action.asp" method="get"></form>
          <p>
            <input type="text", name="fname" />
          </p>
        </span>
      <span id = "midright"><img class = "right" src = "tm.png"/></span>
    </div>

    <div class = "guanggaomid">
      <div class = "mid">
        <img class = "guangao" src = "http://img.alicdn.com/tps/TB10DwjOXXXXXcVXXXXSutbFXXX.jpg">

      </div>
    </div>



    <div id = "pushingmid">
      <%for (int fontSize = 1; fontSize <=20 ; fontSize ++ ) {  %>

      <span class = "item">
        <a href = "https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.1.LqWY8B&id=538207238901&skuId=3218944082365&standard=1&user_id=2616970884&cat_id=2&is_b=1&rn=d6f970436715787351d8f71dea69e861" class = "item">
        <img class = "iteming" src = "//img.alicdn.com/bao/uploaded/i7/TB1opTlNXXXXXaYXXXXV8Gr9XXX_035038.jpg_b.jpg"/>
          </a>
      </span>

      <%}%>
    </div>



  </body>
</html>

