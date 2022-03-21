package com.example.Student.management.System.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="techer")
public class Teacher {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column (name="Name")
	private String Tname;
	
	@Column (name="Subject")
	private String sub;

	public Teacher(long id, String tname, String sub) {
		super();
		this.id = id;
		Tname = tname;
		this.sub = sub;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
