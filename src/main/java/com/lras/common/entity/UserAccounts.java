package com.lras.common.entity;


import org.seasar.doma.Entity;

import lombok.Data;

@Entity
@Data
public class UserAccounts {
	
	private String id;
	
	private String pass;
	
}
