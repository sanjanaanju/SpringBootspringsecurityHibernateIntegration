package com.developerstack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.developerstack.model.Employee;
import com.developerstack.service.EmployeeService;
import com.developerstack.dao.EmployeeDao;

@Service
@Transactional
@Component(value="EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
		EmployeeDao employeedao;


		public List<Employee> getEmployee() {
			// TODO Auto-generated method stub
			return employeedao.getEmployee();
		}

		public Employee findById(int id) {
			// TODO Auto-generated method stub
			return employeedao.findById(id);
		}

		public void createEmployee(Employee emp) {
			// TODO Auto-generated method stub
			employeedao.addEmployee(emp);
		}

		public void deleteEmployeeById(int id) {
			// TODO Auto-generated method stub
			employeedao.delete(id);
		}
	
		@Override
		public Employee update(Employee emp,int id) {
			// TODO Auto-generated method stub
			return employeedao.update(emp, id);
		}

	
		@Override
		public Employee updatePartially(Employee emp, int id) {
			// TODO Auto-generated method stub
			return null;
		}

	}

