package com.example.Student.management.System.entity;

import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name="")
public class Classs {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String address;
	public Classs(long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Classs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
