package com.kodecamp.framework;

import java.util.HashMap;
import java.util.Map;

public class NavigationRules {
	public static final String NAV_STUDENT_DETAILS = "STUDENT_DETAILS";
	public static final Map<String,String> navigationMap = new HashMap<>();
	static {
		navigationMap.put(NAV_STUDENT_DETAILS, "/views/student_details2.jsp");
	}
}
