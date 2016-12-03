<%@ page import="java.util.ArrayList" %>
<%@ page import="PDClass.Item" %><%--
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

        <form action = "finditem" method="get">
            <input class="input" type="text" name="keyword"/>
            <button class="button" type="submit"><img class="search" src="search.png"> </button>
          </form>
        </span>
      <span id = "midright"><img class = "right" src = "left.png"/></span>
    </div>

    <div class = "guanggaomid">
      <div class = "mid">
        <img class = "guangao" src = "http://gdp.alicdn.com/imgextra/i3/2616970884/TB2ARtFdNRzc1FjSZFPXXcGAFXa-2616970884.jpg">

      </div>
    </div>
    <%! ArrayList<Item> content; %>
    <%

      content = (ArrayList<Item>) request.getAttribute("result");
      if (content == null) {
        content = Item.findItemWithName("apple");
      }
    %>



    <div id = "pushingmid">
      <% for (Item item:content) {  %>


      <span class = "item">


        <%
          out.print("<a href=\"/detail?id="+item.getId()+"\"/>");
          out.print("<img class = \"iteming\" src = \"//" + item.getThumbnailUrl() + "\"/>");
        %>

          <p><b>¥</b><% out.print(item.getPrice()); %></p>
          <% out.print("<h6>" + item.getName() + "</h6>"); %>
        </a>
      </span>
      <%}%>
    </div>



  </body>
</html>

