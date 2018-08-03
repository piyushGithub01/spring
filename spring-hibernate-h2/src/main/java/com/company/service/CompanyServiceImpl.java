package com.company.service;

import java.util.List;

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
        return companyRepository.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    @Transactional
    public void create(Company company) {
        companyRepository.create(company);
    }

    @Override
    @Transactional
    public Company update(Company company) {
        return companyRepository.update(company);
    }

    @Override
    @Transactional
    public void delete(Long id) {
    	Company company = companyRepository.findOne(id);
        companyRepository.delete(company);
    }

    @Override
    @Transactional
    public void delete(Company company) {
        companyRepository.delete(company);
    }

}
