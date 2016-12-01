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
            <button class="button" type="button"><img class="search" src="search.png"> </button>
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
      <%for (int fontSize = 0; fontSize < content.size() ; fontSize ++ ) {  %>

      <span class = "item">

        <a href = "https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.1.LqWY8B&id=538207238901&skuId=3218944082365&standard=1&user_id=2616970884&cat_id=2&is_b=1&rn=d6f970436715787351d8f71dea69e861" class = "item">
        <%
          out.print("<img class = \"iteming\" src = \"//" + content.get(fontSize).getThumbnailUrl() + "\"/>");
        %>
            </br>
            <em>
            <b>¥</b>
                <%
                  out.print(content.get(fontSize).getPrice());
                %>

                </em>
          </br>
            <%
              out.print("<h6>" + content.get(fontSize).getName() + "</h6>");
            %>
        </a>
      </span>
      <%}%>
    </div>



  </body>
</html>

