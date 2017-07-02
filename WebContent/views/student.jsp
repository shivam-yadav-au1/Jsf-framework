<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h3>Student Servlet Page</h3>
	<form action="${pageContext.request.contextPath}/student" method="get">

		<input type="text" name="name" placeholder="name"> 
		<input type="text" name="rollno" placeholder="Roll No"> 
		<input type="text" name="address" placeholder="Address"> 
		<input type="text" name="course" placeholder="Course">
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>