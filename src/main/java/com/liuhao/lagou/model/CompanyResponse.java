package com.liuhao.lagou.model;

public class CompanyResponse {
    private long id;
    private String full_name;
    private String simple_name;
    private String www;
    private String email;
    private String address;
    private String describe_info;
    private String service;
    private int employee_count;
    private String phone;
    private String finance_status;

    public CompanyResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getSimple_name() {
        return simple_name;
    }

    public void setSimple_name(String simple_name) {
        this.simple_name = simple_name;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescribe_info() {
        return describe_info;
    }

    public void setDescribe_info(String describe_info) {
        this.describe_info = describe_info;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFinance_status() {
        return finance_status;
    }

    public void setFinance_status(String finance_status) {
        this.finance_status = finance_status;
    }

    @Override
    public String toString() {
        return "CompanyResponse{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", simple_name='" + simple_name + '\'' +
                ", www='" + www + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", describe_info='" + describe_info + '\'' +
                ", service='" + service + '\'' +
                ", employee_count=" + employee_count +
                ", phone='" + phone + '\'' +
                ", finance_status='" + finance_status + '\'' +
                '}';
    }
}
