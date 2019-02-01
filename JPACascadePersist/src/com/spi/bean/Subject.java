package com.spi.bean;

import javax.persistence.*;

@Entity
public class Subject {
	private String name;
	private int marks;
	@Id
	private int s_id;

	public Subject(String name, int marks, int s_id) {
		super();
		this.name = name;
		this.marks = marks;
		this.s_id = s_id;
	}

	public Subject() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

}