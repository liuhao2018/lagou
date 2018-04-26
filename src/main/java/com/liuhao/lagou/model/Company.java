package com.liuhao.lagou.model;

public class Company {
    private long id;
    private String full_name;
    private String simple_name;
    private String phone;
    private String email;
    private String www;
    private int city;
    private String address;
    private String boss;
    private int employee_count;
    private String describe;
    private String finance_status;
    private String service;
    private int check;  //该公司是否通过系统是否审核

    public Company() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getFinance_status() {
        return finance_status;
    }

    public void setFinance_status(String finance_status) {
        this.finance_status = finance_status;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", simple_name='" + simple_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", www='" + www + '\'' +
                ", city=" + city +
                ", address='" + address + '\'' +
                ", boss='" + boss + '\'' +
                ", employee_count=" + employee_count +
                ", describe='" + describe + '\'' +
                ", finance_status='" + finance_status + '\'' +
                ", service='" + service + '\'' +
                ", check=" + check +
                '}';
    }
}
