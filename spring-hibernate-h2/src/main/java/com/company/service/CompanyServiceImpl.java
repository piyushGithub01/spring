package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.company.model.Company;
import com.company.repository.CompanyRepository;

@Component
public class CompanyServiceImpl implements CompanyService{

	@Autowired
    private CompanyRepository companyRepository;

    @Override
    @Transactional(readOnly = true)
    public Company get(Long id) {
        return companyRepository.find(id);
    }

}
