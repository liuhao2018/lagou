package com.liuhao.lagou.model;

public class ResetPassword {
    private long id;
    private String password;

    public ResetPassword() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ResetPassword{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
