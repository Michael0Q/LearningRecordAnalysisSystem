package com.lras.common.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;

import com.lras.common.model.RecorderForm;

@Dao
@ConfigAutowireable
public interface RecorderDao {

	@Insert(sqlFile=true)
	public int insertRecord(String id, RecorderForm form);
}
