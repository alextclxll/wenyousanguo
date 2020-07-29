<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@page  import="java.text.*"%>
  <%@include file="top.jsp" %>
  <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	$(function(){
		$("#b1").click(function(){
			alert("666");
		});
	});
</script>
<div align="center"><br>
  
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
	</table><br>
			<button id="b1" onclick="register">注册</button>










<%@include file="footer.jsp" %>
</div> 

</html>