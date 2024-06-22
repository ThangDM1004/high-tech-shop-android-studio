package com.example.high_tech_shop.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserAddress {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int userId;
    private String city;
    private String province;
    private String district;
    private String address;
    private boolean status;


    public UserAddress(int id, int userId, String province, String district, String address, String city,boolean status) {
        this.id = id;
        this.userId = userId;
        this.province = province;
        this.district = district;
        this.address = address;
        this.city=city;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
