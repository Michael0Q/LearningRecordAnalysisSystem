package com.lras.common.domain;

import org.seasar.doma.Entity;

import lombok.Data;

@Entity
@Data
public class WeeklyRecordEntity {

	private int monday;
	private int tuesday; 
	private int wednesday;
	private int thursday;
	private int friday; 
	private int saturday; 
	private int sunday;

}
