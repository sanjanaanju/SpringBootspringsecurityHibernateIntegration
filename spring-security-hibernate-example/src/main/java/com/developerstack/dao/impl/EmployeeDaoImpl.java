package com.developerstack.dao.impl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.developerstack.dao.EmployeeDao;
import com.developerstack.model.*;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
			@Autowired
		private SessionFactory sessionFactory;
		  
		public void addEmployee(Employee emp) {
			// TODO Auto-generated method stub
			 Session session = sessionFactory.getCurrentSession();
			  session.save(emp); 
		}

		public List<Employee> getEmployee() {
			// TODO Auto-generated method stub
			 Session session = sessionFactory.getCurrentSession();
			@SuppressWarnings("unchecked")
			List<Employee> list= session.createCriteria(Employee.class).list();
			return list;
		}

		public Employee findById(int id) {
			// TODO Auto-generated method stub
			 Session session = sessionFactory.getCurrentSession();
			Employee emp=(Employee) session.get(Employee.class,id);
			return emp;
		}

		public Employee update(Employee val,int id) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			Employee emp =(Employee)session.get(Employee.class, id);
			emp.setFirstName(val.getFirstName());
			emp.setLastName(val.getLastName());
			emp.setMiddleName(val.getMiddleName());
			emp.setDoj(val.getDoj());
			emp.setEmployeeType(val.getEmployeeType());
			emp.setDesignation(val.getDesignation());
			emp.setMobileNumber(val. getMobileNumber());
			session.update(emp);
			return emp;
		}

		public void delete(int id) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			Employee emp = findById(id);
			session.delete(emp);
		}
			}



