package com.kodecamp.framework;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CentralServlet extends HttpServlet {

	public CentralServlet() {
		System.out.println("Constructor :" + this.getClass().getName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String actionName = req.getParameter("action");
		String beanClass = req.getParameter("bean-class");
		String beanName = req.getParameter("bean-name");
		System.out.println("<------------------ bean details --------------------------");
		System.out.println("action : " + actionName);
		System.out.println("bean-class : " + beanClass);
		System.out.println("bean-name : " + beanName);
		System.out.println("<------------------ bean details --------------------------");
		Object beanObj = null;
		try {
			beanObj = Class.forName(beanClass).newInstance();
			System.out.println("Bean Class instatiation done : " + beanObj.getClass().getName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			System.err.println("Bean class not found : " + e.getMessage());

		}
		mapBeanToRequestValues(beanObj, req);
		req.getSession().setAttribute(beanName, beanObj);
		String targetView = executeAction(actionName, beanObj, req, resp);
		if (targetView != null) {
			getServletContext().getRequestDispatcher(targetView).forward(req, resp);
		}
	}

	private void mapBeanToRequestValues(Object beanObj, HttpServletRequest req) {
		System.out.println("bean obj : " + beanObj);
		Map<String, String[]> params = req.getParameterMap();
		for (String param : params.keySet()) {
			try {
				System.out.println("param : " + param);
				String methodName = "set"+param;
				System.out.println();
				Method method = beanObj.getClass().getMethod(methodName, String.class);
				System.out.println("Method instance : " + method);
				method.invoke(beanObj, req.getParameter(param));

			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				System.err.println(e);
			}
		}

	}

	private String executeAction(String actionName, Object beanObj, HttpServletRequest req, HttpServletResponse resp) {

		Method method;
		String view = "";

		try {
			String mappedVeiwValue = (String) beanObj.getClass().getMethod(actionName).invoke(beanObj);
			view = NavigationRules.navigationMap.get(mappedVeiwValue);
			
		} catch (NoSuchMethodException | SecurityException e) {
			System.err.println("Invalid Action :" + e.getMessage());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return view;
	}

}
