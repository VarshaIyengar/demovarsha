package com.spi.bean;

import javax.persistence.*;

@Entity
public class StudentEntity {
	@Id
	private int s_id;
	private String s_name;
	private int s_age;

	@OneToOne(cascade={CascadeType.PERSIST})  
	private Subject sub;

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public StudentEntity(int s_id, String s_name, int s_age, Subject sub) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;
		this.sub = sub;
	}

	public StudentEntity() {
		super();
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

}