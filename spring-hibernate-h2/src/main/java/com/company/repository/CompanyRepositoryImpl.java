package com.company.repository;

import org.springframework.stereotype.Repository;

import com.company.common.persistence.AbstractHibernateDao;
import com.company.model.Company;

@Repository
public class CompanyRepositoryImpl extends AbstractHibernateDao<Company> 
	implements CompanyRepository {
	
	public CompanyRepositoryImpl() {
        super();
        setClazz(Company.class);
    }
	
}
