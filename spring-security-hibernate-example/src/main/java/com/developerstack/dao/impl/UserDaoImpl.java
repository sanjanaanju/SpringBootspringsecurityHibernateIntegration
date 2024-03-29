package com.developerstack.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.developerstack.dao.UserDao;
import com.developerstack.model.UserDetails;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<UserDetails> getUserDetails() {
		Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
		return criteria.list();
	}

	public UserDetails findUserByEmail(String name) {
		UserDetails userDetails = null;
		Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
		criteria.add(Restrictions.eq("name", name));
		List<UserDetails> entityList = criteria.list();
		if(!entityList.isEmpty()) {
			userDetails = entityList.get(0);
		}
		return userDetails;
	}

}
