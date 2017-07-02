<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:useBean id="student" class="com.kodecamp.beans.Student"></jsp:useBean>
<jsp:getProperty property="name" name="student"/> --%>

<input type="text" value="${sessionScope.student.name}">
<input type="text" value="${sessionScope.student.rollno}">
<input type="text" value="${sessionScope.student.address}">
<input type="text" value="${sessionScope.student.course}">

</body>
</html>