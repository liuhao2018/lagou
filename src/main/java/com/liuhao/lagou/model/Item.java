package com.liuhao.lagou.model;

public class Item {
    private long id;
    private int job;
    private int company;
    private int education;
    private String describe_info;
    private String require_info;
    private int salary;
    private long create_by;

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
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

    public long getCreate_by() {
        return create_by;
    }

    public void setCreate_by(long create_by) {
        this.create_by = create_by;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", job=" + job +
                ", company=" + company +
                ", education=" + education +
                ", describe_info='" + describe_info + '\'' +
                ", require_info='" + require_info + '\'' +
                ", salary=" + salary +
                ", create_by=" + create_by +
                '}';
    }
}
