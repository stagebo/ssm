package com.wyb.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;

import com.wyb.model.User;

public class SessionUtil {
	public static User getLoginSession(HttpServletRequest request){
		return (User)request.getSession().getAttribute("user");
	}
}
