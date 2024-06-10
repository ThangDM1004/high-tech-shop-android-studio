package com.example.high_tech_shop.repositories;

import android.content.Context;

import com.example.high_tech_shop.dao.CartItemDAO;
import com.example.high_tech_shop.entity.CartItem;
import com.example.high_tech_shop.room.HighTechShopRoomDatabase;

import java.util.List;

public class CartItemRepository {

    private CartItemDAO cartItemDAO;
    public CartItemRepository(Context context) {
        this.cartItemDAO = this.cartItemDAO = HighTechShopRoomDatabase.getInstance(context).cartItemDAO();
    }
    public void insert(List<CartItem> cartItem) {
        this.cartItemDAO.insertCartItem(cartItem);
    }
}
