package com.lras.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lras.common.service.HomeSvc;

@Controller
public class HomeCtrl {

	@Autowired
	HomeSvc homeSvc;

	@PostMapping(value = "/Home/getWeeklyData")
	@ResponseBody
	public ResponseEntity<String> getMonthlyRecord() {
		return homeSvc.getWeeklyRecord();
	}
}
