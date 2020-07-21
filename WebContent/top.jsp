<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@page  import="java.text.*"%>
<div align="center">
	<img  alt="Ant" width="40" height="40"  src="image/mayijinfu.jpg">
	<%-- <% out.println("恭喜蚂蚁金服上市A+H，可喜可贺，可惜我没股权，你说气人不气人");%> --%>
	<span  id="blink" >恭喜蚂蚁金服上市A+H，可喜可贺，可是我没股权，你说气人不气人</span>
</div> 
<br>

<script >

function changeColor(){

	var color="#f00|red|black|green|blue";
	
	colors=color.split("|");
	
	document.getElementById("blink").style.color=colors[parseInt(Math.random() * 
	
	colors.length)];

}

	setInterval("changeColor()",700);

</script>
<style>
	#blink{
		font-size:17px;
    	 margin-bottom:50px;
	}
</style>