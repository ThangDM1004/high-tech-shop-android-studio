package com.example.high_tech_shop.dao;

import androidx.room.*;

import com.example.high_tech_shop.entity.UserAddress;

import java.util.List;
@Dao
public interface UserAddressDAO {
    @Query("SELECT * FROM UserAddress")
    List<UserAddress> getAllUserAddresses();

    @Query("SELECT * FROM UserAddress WHERE id = :id")
    UserAddress getUserAddressById(int id);

    @Insert
    void addUserAddress(UserAddress userAddress);

    @Insert
    void addUserAddress(List<UserAddress> userAddress);

    @Update
    void updateUserAddress(UserAddress userAddress);

    @Delete
    void deleteUserAddress(UserAddress userAddress);
}