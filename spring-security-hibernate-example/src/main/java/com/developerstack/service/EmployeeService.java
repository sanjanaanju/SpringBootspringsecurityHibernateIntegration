package com.developerstack.service;
import java.util.List;
import com.developerstack.model.*;

public interface EmployeeService {
			public void createEmployee(Employee emp);
		public List<Employee> getEmployee();
		public Employee findById(int id);
		public Employee update(Employee emp, int id);
		public void deleteEmployeeById(int id);
		public Employee updatePartially(Employee emp, int id);
	}



