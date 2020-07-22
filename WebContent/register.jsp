<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@page  import="java.text.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><
<div align="center"><br>
  <%@include file="top.jsp" %>
<form action="register" method="post">
	<table >
		<tr>
			<td>登 录 名 :</td>
			<td><input placeholder="一旦确认无法修改" name="userRegisterName"> </td>
		</tr>
		<tr>
			<td>登录密码:</td>
			<td ><input placeholder="请输入密码" name="userRegisterPassword"></td>
		</tr>
		<tr>
			<td>确认密码:</td>
			<td><input placeholder="请确认密码"></td>
		</tr>
		<tr style="left:20px;">
			<td bgcolor="red" width="20px;"><input id="submit" type="submit" value="提交"></td>
		</tr>
	
	</table>
</form>










<%@include file="footer.jsp" %>
</div> 

