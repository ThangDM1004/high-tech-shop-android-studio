package com.example.high_tech_shop.repositories;

import android.content.Context;

import com.example.high_tech_shop.dao.CartDAO;
import com.example.high_tech_shop.entity.Cart;
import com.example.high_tech_shop.room.HighTechShopRoomDatabase;

import java.util.List;

public class CartRepository {

    private CartDAO cartDAO;

    public CartRepository(Context context) {
        this.cartDAO = HighTechShopRoomDatabase.getInstance(context).cartDAO();
    }

    public void insertAll(List<Cart> carts) {
        cartDAO.insertCart(carts);
    }
}
