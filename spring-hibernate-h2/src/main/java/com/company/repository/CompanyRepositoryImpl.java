package com.company.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.model.Company;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public Company find(Long id) {
		return getCurrentSession().find(Company.class, id);
	}

	@Override
	public Company find(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Company update(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		Company c = find(id);
		getCurrentSession().delete(c);
	}

	@Override
	public void delete(Company company) {
		// TODO Auto-generated method stub
		
	}
	
	protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
