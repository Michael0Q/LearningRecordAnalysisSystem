package com.lras.common.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.lras.common.domain.WeeklyRecordEntity;


@ConfigAutowireable
@Dao
public interface HomeDao {
	
	@Select
	public WeeklyRecordEntity selectWeeklyRecord(String date);

}
