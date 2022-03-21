package com.example.Student.management.System.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="school")
public class School {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		
		@Column(name="sch_name",nullable=false)
		private String schName ;
		
		@Column(name="addres")
		private String addres;

		public School() {
			super();
			// TODO Auto-generated constructor stub
		}

		public School(long id, String schName, String addres) {
			super();
			this.id = id;
			this.schName = schName;
			this.addres = addres;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getSchName() {
			return schName;
		}

		public void setSchName(String schName) {
			this.schName = schName;
		}

		public String getAddres() {
			return addres;
		}

		public void setAddres(String addres) {
			this.addres = addres;
		}
		
		
		

}
