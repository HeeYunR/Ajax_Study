<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://me2.do/5BvBFJ57">
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.13.2/themes/smoothness/jquery-ui.css">
<style>
	#cat {
		position: relative;
		width: 150px; 
		height: 150px;
		left: 100px;
		top: 500px;
	}
</style>
</head>
<body>
	<h1>고양이를 움직이고 다음 방문시에도 상태를 유지하시오.</h1>
	
	<img src="pic/pic.png" id="cat">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.13.2/jquery-ui.min.js"></script>
<script>
	$('#cat').draggable();
	$('#cat').mouseup(function(){
		
		let x = parseInt($('#cat').css('left').replace(/[^0-9]/g, "")); //숫자만
		let y = parseInt($('#cat').css('top').replace(/[^0-9]/g, ""));
		let id = this.id;
		
		alert(id);
		
		
		$.ajax({
			
			type: 'POST',
			url: '/ajax/q04data.do',
			data: {
				id: id,
				x: x,
				y: y
			},
			error: (a,b,c)=>console.log(a,b,c)
			
			
		});
			
	});
</script>
</body>
</html>










