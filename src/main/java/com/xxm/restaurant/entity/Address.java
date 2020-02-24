package com.xxm.restaurant.entity;

import java.util.Date;

public class Address {
    private Long id;

    private String tel;

    private String username;

    private String city;

    private String province;

    private String detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}