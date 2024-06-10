package com.example.high_tech_shop.repositories;

import android.content.Context;

import com.example.high_tech_shop.dao.OrderItemDAO;
import com.example.high_tech_shop.entity.OrderItem;
import com.example.high_tech_shop.room.HighTechShopRoomDatabase;

import java.util.List;

public class OrderItemRepository {
    private OrderItemDAO orderItemDAO;
    public OrderItemRepository(Context context) {
        this.orderItemDAO = HighTechShopRoomDatabase.getInstance(context).orderItemDAO();
    }
    public void insert(List<OrderItem> orderItems) {
        orderItemDAO.addOrderItem(orderItems);
    }


}
