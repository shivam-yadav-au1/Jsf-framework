<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/controller" method = "post">
<input type="hidden" name="bean-name" value="studentBean">
<input type="hidden" name="bean-class" value="com.kodecamp.beans.student">
<ul>
	<li>Name</li>
	<li><input type="text" name="Name"></li>
	<li>RollNO</li>
	<li><input type="text" name="RollNo"></li>
	<li>Address</li>
	<li><input type="text" name="Address"></li>
	<li>Course</li>
	<li><input type="text" name="Course"></li>
	<li><input type="submit" value="submit" name="action"><input type="reset" value="Reset"></li>
</ul>

</form>

</body>
</html>