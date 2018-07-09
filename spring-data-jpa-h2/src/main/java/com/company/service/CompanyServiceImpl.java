package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.model.Company;
import com.company.repository.CompanyJpaRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyJpaRepository companyJpaRepository;

    @Override
    @Transactional(readOnly = true)
    public Company get(Long id) {
    	if(companyJpaRepository.findById(id).isPresent()) {
    		return companyJpaRepository.findById(id).get();
    	}
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Company get(String name) {
        return companyJpaRepository.findByName(name);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Company> getAll() {
        return companyJpaRepository.findAll();
    }

    @Override
    @Transactional
    public void create(Company company) {
        companyJpaRepository.save(company);
    }

    @Override
    @Transactional
    public Company update(Company company) {
        companyJpaRepository.save(company);
        return company;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        companyJpaRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void delete(Company company) {
        companyJpaRepository.delete(company);
    }
}
