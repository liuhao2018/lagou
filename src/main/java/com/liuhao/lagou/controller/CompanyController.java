package com.liuhao.lagou.controller;

import com.liuhao.lagou.model.CommonAPIResponse;
import com.liuhao.lagou.model.Company;
import com.liuhao.lagou.model.CompanyResponse;
import com.liuhao.lagou.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/company")
@RestController
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @PostMapping("/")
    public CommonAPIResponse addOne(@RequestBody  Company company) {
        int result = companyService.addOne(company);
        CommonAPIResponse response = new CommonAPIResponse();
        if (result > 0 ) {
            return response;
        }
        response.setCode(400);
        response.setMessage("提交公司信息失败");
        return response;
    }

    @GetMapping("/")
    public CommonAPIResponse<List<CompanyResponse>> findAll() {
        List<CompanyResponse> companyResponse = companyService.findAll();
        CommonAPIResponse<List<CompanyResponse>> response = new CommonAPIResponse<>();
        response.setData(companyResponse);
        return response;
    }

}
