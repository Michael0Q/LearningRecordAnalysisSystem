package com.lras.common.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.lras.common.entity.UserAccounts;
import com.lras.common.model.LoginForm;
import com.lras.common.model.UserAccount;
import com.lras.common.repository.LoginDao;

@Service
@Transactional
public class LoginSvc {

	private LoginDao loginDao; 
	
	@Autowired
	private MessageSource msg;
	
	@Autowired
	private HttpSession session;
	
	public boolean login(Model model, LoginForm form) {
		UserAccounts userAccounts = loginDao.login(form);
		if(userAccounts == null) {
			//model.addAttribute("LoginFailed", msg.getMessage("LoginFailed", null, Locale.JAPAN));
			model.addAttribute("LoginFailed", "ログイン失敗しました");
			return false;
		}
		
		session.setAttribute("userAccount", new UserAccount(userAccounts));
		return true;
	}

		
}
