<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@page  import="java.text.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div align="center"><br>
 <%@include file="header.jsp" %>
  <%@include file="top.jsp" %>
  <img  src ="image/sanguoLogo.jpg"/><br> <br>
<form action="register" method="post">
	<table >
		<tr>
			<td>登录账号 :</td>
			<td><input oninput = "value=value.replace(/[^\d]/g,'')" placeholder="请输入数字账号" name="userRegisterAccount" > </td>
		</tr>
		<tr>
			<td>登录密码:</td>
			<td ><input type="password" oninput = "value=value.replace(/[^\d]/g,'')"  placeholder="请输入密码" name="userRegisterPassword"></td>
		</tr>
		<tr></tr>
		<tr>
				<td></td>
			<td  width="20px"><input id="submit" type="submit" value="登录"></td>
		</tr>
	
	</table>
</form>










<%@include file="footer.jsp" %>
</div> 

