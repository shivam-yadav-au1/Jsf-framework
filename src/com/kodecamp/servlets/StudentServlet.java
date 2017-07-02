package com.kodecamp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kodecamp.beans.Student;

public class StudentServlet extends HttpServlet {

	public StudentServlet() {
		System.out.println("Constructor : " + this.getClass().getName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("doGet() : " + this.getClass().getName());
//
//		HttpSession session = req.getSession(false);
//		Student student = (Student) session.getAttribute("student");
//		System.out.println("Student from Session : " + student);
//		String name = student.getName();
//		String address = student.getAddress();
//		String course = student.getCourse();
//		String rollno = student.getRollno();
//		System.out.println("Name : "+name);

		getServletContext().getRequestDispatcher("/views/student_details.jsp").forward(req, resp);
	}

}
