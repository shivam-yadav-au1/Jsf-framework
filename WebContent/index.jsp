<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JSF TESTING</h2><br>

<jsp:useBean id="student" class="com.kodecamp.beans.Student" scope="session"></jsp:useBean>
	<%-- <a href="${pageContext.request.contextPath}/views/student.jsp">Student</a> --%>
	<a href="${pageContext.request.contextPath}/views/student_form.jsp">Student Form</a>

</body>
</html>