package com.lras.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lras.common.model.LoginForm;
import com.lras.common.service.LoginSvc;

@Controller
public class LoginCtrl {

	@Autowired
	private LoginSvc loginSvc;

	@GetMapping("/lras/login")
	public String toLogin(@ModelAttribute(name = "loginForm") LoginForm form) {
		System.out.println("a");
		return "Login";
	}

	@PostMapping("/lras/login")
	public String toHome(Model model, @ModelAttribute(name = "loginForm") LoginForm form) {
		if (!loginSvc.login(model, form)) {
			return "Login";
		}
		return "Home";
	}
}
