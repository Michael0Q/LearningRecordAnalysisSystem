package com.lras.common;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.lras.common.model.UserAccount;

public class SessionUtil {
	
	@Autowired
	HttpSession session;
	
	public String getUserId(String sessionKey) {
		UserAccount data = (UserAccount) session.getAttribute(sessionKey);
		return data.getId();
	}
}
