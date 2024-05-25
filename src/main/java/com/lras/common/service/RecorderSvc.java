package com.lras.common.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lras.common.SessionUtil;
import com.lras.common.model.RecorderForm;
import com.lras.common.repository.RecorderDao;

@Service
@Transactional
public class RecorderSvc {

	@Autowired(required=false)
	private RecorderDao recorderDao;
	
	private SessionUtil util = new SessionUtil();
	
	/**
	 * 
	 * @param form
	 */
	public void addRecord(RecorderForm form) {
		recorderDao.insertRecord(util.getUserId("userAccount"), form);
	}
}

