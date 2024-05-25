package com.lras.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lras.common.model.RecorderForm;
import com.lras.common.service.RecorderSvc;

@Controller
public class RecorderCtrl {
	
	@Autowired
	private RecorderSvc recorderSvc;
	
	/**
	 * @return
	 */
	@PostMapping(value="/recorder")
	public String toRecorder(@ModelAttribute(name="RecorderForm")RecorderForm form) {
		return "Recorder";
	}
	
	
	 /**
	  * @return
	  */
	
	@PostMapping(value="/recorder", params="record")
	public String record(@ModelAttribute(name="RecorderForm")RecorderForm form) {
		recorderSvc.addRecord(form);	 
		return "Home";
	}
}
