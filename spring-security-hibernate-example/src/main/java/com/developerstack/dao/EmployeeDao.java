package com.developerstack.dao;
import java.util.List;

import com.developerstack.model.*;
public interface EmployeeDao {
	
		public void addEmployee(Employee emp);
		public List<Employee> getEmployee();
		public Employee findById(int id);
		public Employee update(Employee emp, int id);
		public void delete(int id);
	}


