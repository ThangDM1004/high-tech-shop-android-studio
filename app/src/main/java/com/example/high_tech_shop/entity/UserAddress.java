package com.example.high_tech_shop.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserAddress {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int userId;
    private String province;
    private String district;
    private String address;

    public UserAddress(int id, int userId, String province, String district, String address) {
        this.id = id;
        this.userId = userId;
        this.province = province;
        this.district = district;
        this.address = address;
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
