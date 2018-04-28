package com.liuhao.lagou.service.impl;

import com.liuhao.lagou.mapper.CompanyMapper;
import com.liuhao.lagou.model.Company;
import com.liuhao.lagou.model.CompanyResponse;
import com.liuhao.lagou.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public int addOne(Company company) {
        return companyMapper.add(company);
    }

    @Override
    public List<CompanyResponse> findAll() {
        return companyMapper.findAll();
    }
}
