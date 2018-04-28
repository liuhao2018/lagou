package com.liuhao.lagou.service;

import com.liuhao.lagou.model.Company;
import com.liuhao.lagou.model.CompanyResponse;
import java.util.List;

public interface ICompanyService {

    int addOne(Company company);

    List<CompanyResponse> findAll();

}
