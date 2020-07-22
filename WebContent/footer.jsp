<%@page contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" import="java.util.*"%>
    <%@page  import="java.text.*"%>
<!DOCTYPE html>
<div align="center">


 
<br>

<% 
	SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	Date date=new Date();
	out.println(ft.format(date));

%>

</div> 