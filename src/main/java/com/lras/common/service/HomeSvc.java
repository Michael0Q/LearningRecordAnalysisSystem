package com.lras.common.service;

import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lras.common.domain.WeeklyRecordEntity;
import com.lras.common.repository.HomeDao;

@Service
@Transactional
public class HomeSvc {

	@Autowired(required=false)
	HomeDao homeDao;

	@Autowired
	HttpSession session;

	public ResponseEntity<String> getWeeklyRecord() {
		LocalDate date = (LocalDate) session.getAttribute("date");
		WeeklyRecordEntity weeklyRecord = null;
		if (date == null) {
			date = LocalDate.now().with(DayOfWeek.SUNDAY);
			weeklyRecord = homeDao.selectWeeklyRecord("2");
		} else {
			weeklyRecord = homeDao.selectWeeklyRecord("2");
		}
		session.setAttribute("date", date);

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String jsonData = objectMapper.writeValueAsString(weeklyRecord);
			return ResponseEntity.ok(jsonData);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null; // エラーハンドリングの方法に応じて適切な処理を行ってください
		}
	}
}
