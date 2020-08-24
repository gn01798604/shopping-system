<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>

<div data-role="page" id="pageone">
  <div data-role="header">
    <h1>火星貓購物</h1>
  </div>

  <div data-role="content">
    <form action="../member/create" method="post">
    	<table width=300 align="center">
    		<tr>
    			<td>姓名:
    			<td><input type="text" name="name">
    		<tr>
    			<td>帳號:
    			<td><input type="text" name="username">
    		<tr>
    			<td>密碼:
    			<td><input type="password" name="password">
    		<tr>
    			<td>電話:
    			<td><input type="text" name="phone">
    		<tr>
    			<td>地址:
    			<td><input type="text" name="address">
    		<tr>
    			<td colspan=2 align=center>
    			<input type="radio" name="admin" value="true">管理者
    			<input type="radio" name="admin" value="false">購物狂
    		<tr>
    			<td colspan=2 align=center>
    			<input type="submit" value="確定">						
    	</table>
    </form>
  </div>

  <div data-role="footer">
    <h1>火星股份有限公司</h1>
  </div>
</div>

</body>
</html>