<%--
  Created by IntelliJ IDEA.
  User: Blues
  Date: 2016/11/12
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
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
      <div id = "midleft"><img src = "tm.png"/> </div>
      <div id = "miding"><img class="search" src = "search.png"></div>
      <div id = "midright"><img class = "right" src = "tm.png"/></div>
    </div>


    <div>
      <div class = "mid">
      <img class="guangao" src = "iphone_guanggao.jpg"/>
      </div>
    </div>


    <div id = "pushingmid">
      <%for (int fontSize = 1; fontSize <=3 ; fontSize ++ ) {  %>
       <span class= "item"> <img class = "iteming" src = "tm.png"/> </span>
      <%}%>
    </div>



  </body>
</html>
