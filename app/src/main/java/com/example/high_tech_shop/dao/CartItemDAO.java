package com.example.high_tech_shop.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.high_tech_shop.entity.Cart;
import com.example.high_tech_shop.entity.CartItem;

import java.util.List;
@Dao
public interface CartItemDAO {
    @Query("SELECT * FROM CartItem")
    List<CartItem> getCarts();
    @Query("SELECT * FROM CartItem WHERE id = :id")
    CartItem geCartItemById(int id);
    @Insert
    void insertCartItem(CartItem cartItem);
    @Insert
    void insertCartItem(List<CartItem> cartItems);
    @Update
    void updateCartItem(CartItem cartItem);
    @Delete
    void deleteCartItem(CartItem cartItem);
}
