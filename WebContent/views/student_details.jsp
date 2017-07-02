<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student" class = "com.kodecamp.beans.Student" scope="session">

</jsp:useBean>
<jsp:setProperty property="*" name="student"/>
<jsp:getProperty property="name" name="student"/>
<jsp:getProperty property="rollno" name="student"/>
<jsp:getProperty property="address" name="student"/>
<jsp:getProperty property="course" name="student"/>
<a href="views/student_details2.jsp">Details2</a>


</body>
</html>