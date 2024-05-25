package com.lras.common.model;

import com.lras.common.entity.UserAccounts;

public class UserAccount {

	private String Id;

	public UserAccount(UserAccounts data) {
		this.Id = data.getId();
	}
	public UserAccount() {

	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
}
