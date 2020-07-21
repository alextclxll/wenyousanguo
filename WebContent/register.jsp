<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@page  import="java.text.*"%>
   
<div align="center"><br>
  <%@include file="top.jsp" %>
<form action="register">
	<table >
		<tr>
			<td>登 录 名 :</td>
			<td><input placeholder="一旦确认无法修改"> </td>
		</tr>
		<tr>
			<td>登录密码:</td>
			<td ><input placeholder="请输入密码"></td>
		</tr>
		<tr>
			<td>确认密码:</td>
			<td><input placeholder="请确认密码"></td>
		</tr>
		<tr>
			<td><a href="register"><button>提   交</button></a></td>
		</tr>
	
	</table>



</form>










<%@include file="footer.jsp" %>
</div> 

