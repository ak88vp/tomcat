<%--
  Created by IntelliJ IDEA.
  User: Tien Dung
  Date: 11/26/2021
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  <h2>Currency Converter</h2>--%>
<%--  <form action="/convert" method="get">--%>
<%--    <label>Rate: </label><br/>--%>
<%--    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>--%>
<%--    <label>USD: </label><br/>--%>
<%--    <input type="text" name="usd" placeholder="USD" value="0"/><br/>--%>
<%--    <input type = "submit" id = "submit" value = "Converter"/>--%>
<%--  </form>--%>
<%--  <h2>Vietnamese Dictionary</h2>--%>
<%--  <form action="/TuDien" method="post">--%>
<%--    <input type="text" name="txtSearch" placeholder="Enter your word: "/>--%>
<%--    <input type = "submit" id = "submit" value = "Search"/>--%>
<%--  </form>--%>
<%--  <h2> Nhập 2 số vào để tính tổng</h2>--%>
<%--  <form action="/tong" method="get">--%>
<%--    <input type="text" name="a" placeholder="Nhập số đầu">--%>
<%--    <input type="text" name="b" placeholder="Nhập số thứ 2">--%>
<%--    <button> tính</button>--%>
<%--  </form>--%>
<%--  --%>
<%--  <form action="/tong" method="get">--%>
<%--    <input type="text" name="name" placeholder="Nhập tên" >--%>
<%--    <input type="password" name="pass" placeholder="Nhập mật khẩu" >--%>
<%--    <button> Đăng nhập</button>--%>
<%--  </form>--%>
  <form action="/price" >

    <input type="text" name="name" placeholder="Mổ tả sản phẩm ">
    <input type="text" name="price" placeholder="Giá niêm yết ">
    <input type="text" name="Percent" placeholder="Tỷ lệ triết khấu  ">
    <button> Hiển thị</button>

  </form>
  </body>
</html>
