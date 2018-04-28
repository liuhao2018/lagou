package com.liuhao.lagou.model;

public class ItemResponse {
    private long id;
    private String company_name;
    private String company_address;
    private String job_name;
    private String edu_level;
    private String describe_info;
    private String require_info;
    private int salary;
    private String create_name;

    public ItemResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getEdu_level() {
        return edu_level;
    }

    public void setEdu_level(String edu_level) {
        this.edu_level = edu_level;
    }

    public String getDescribe_info() {
        return describe_info;
    }

    public void setDescribe_info(String describe_info) {
        this.describe_info = describe_info;
    }

    public String getRequire_info() {
        return require_info;
    }

    public void setRequire_info(String require_info) {
        this.require_info = require_info;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCreate_name() {
        return create_name;
    }

    public void setCreate_name(String create_name) {
        this.create_name = create_name;
    }

    @Override
    public String toString() {
        return "ItemResponse{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", company_address='" + company_address + '\'' +
                ", job_name='" + job_name + '\'' +
                ", edu_level='" + edu_level + '\'' +
                ", describe_info='" + describe_info + '\'' +
                ", require_info='" + require_info + '\'' +
                ", salary=" + salary +
                ", create_name='" + create_name + '\'' +
                '}';
    }
}

