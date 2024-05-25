package com.lras.common.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.lras.common.entity.UserAccounts;
import com.lras.common.model.LoginForm;

@Dao
@ConfigAutowireable
public interface LoginDao {

	@Select
	public UserAccounts login(LoginForm form);
}
