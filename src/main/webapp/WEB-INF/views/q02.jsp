<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://me2.do/5BvBFJ57">
<style>

</style>
</head>
<body>
	<h1>실행</h1>
	<div>
		검색어(동입력): 
		<input type="text" id="dong" class="short">
		<input type="button" id="btn1" value="우편번호검사하기">
	</div>
	<div>
		검색결과: 
		<select>
			<option value="op1">옵션1</option>
		</select>
	</div>
	<div>
		나머지 주소:
		<input type="text" id="extra">
		<span id="result"></span>
	</div>
	
	


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script>
	$('#btn1').click(()=>{
		
		$.ajax({
			
			type: 'GET',
			url: '/ajax/q02data.do',
			data: 'dong=' + $('#dong').val(),
			dataType: 'json',
			success: (result)=>{
				
				if(result.result==1) {
					alert('있는동');
				} else {
					alert('없는동');
				}
				
			},
			error: (a,b,c)=>console.log(a,b,c)
			
		});
		
	});
</script>
</body>
</html>










