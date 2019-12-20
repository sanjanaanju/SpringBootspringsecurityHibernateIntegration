package com.developerstack.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Employee {
	
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@NotNull
		@Size(min=1,message="**required")
		@Column
		private String firstName;
		@Column
		private String middleName;
		@Column
		@NotNull
		@Size(min=1,message="*required")
		private String lastName;
	
	
		@Column
		private String doj;
		@NotNull
		@Size(min=1,message="*required")
		@Column
		private String employeeType;
		@Column
		@NotNull
		@Size(min=1,message="*required")
		private String designation;
		@Column
		private long mobileNumber;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDoj() {
			return doj;
		}
		public void setDoj(String doj) {
			this.doj = doj;
		}
		public String getEmployeeType() {
			return employeeType;
		}
		public void setEmployeeType(String employeeType) {
			this.employeeType = employeeType;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


	}



