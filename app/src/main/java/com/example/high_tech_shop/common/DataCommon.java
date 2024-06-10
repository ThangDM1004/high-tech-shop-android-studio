package com.example.high_tech_shop.common;

import android.content.Context;
import android.widget.Toast;

import com.example.high_tech_shop.entity.Category;
import com.example.high_tech_shop.entity.Product;
import com.example.high_tech_shop.entity.User;
import com.example.high_tech_shop.entity.UserAddress;
import com.example.high_tech_shop.repositories.CategoryRepository;
import com.example.high_tech_shop.repositories.ProductRepository;
import com.example.high_tech_shop.repositories.UserAddressRepository;
import com.example.high_tech_shop.repositories.UserRepository;

import java.util.Arrays;

public class DataCommon {
    public static void initData(Context context) {
        insertUser(context);
        insertProduct(context);
        insertCategory(context);
        insertUserAddress(context);
        Toast.makeText(context, "Data initialized successfully", Toast.LENGTH_SHORT).show();
    }

    private static void insertUser(Context context){
        User user_1 = new User(1, "admin@gmail.com", "1234567890", "image.png", "10/04/2002", true, "12345", "admin", "admin");
        User user_2 = new User(2, "shipper@gmail.com", "1234567890", "image.png", "10/04/2002", true, "12345", "shipper", "shipper");
        User user_3 = new User(3, "user1@gmail.com", "1234567890", "image.png", "10/04/2002", true, "12345", "user1", "user");
        User user_4 = new User(4, "user2@gmail.com", "1234567890", "image.png", "10/04/2002", true, "12345", "user2", "user");
        User user_5 = new User(5, "user3@gmail.com", "1234567890", "image.png", "10/04/2002", true, "12345", "user3", "user");

        UserRepository userRepository = new UserRepository(context);
        userRepository.insert(Arrays.asList(user_1, user_2, user_3, user_4, user_5));
    }
    private static void insertProduct(Context context){
        Product product_1 = new Product(1, "Product 1", "Description 1", "image.png", true, 1);
        Product product_2 = new Product(2, "Product 2", "Description 2", "image.png", true, 1);
        Product product_3 = new Product(3, "Product 3", "Description 3", "image.png", true, 2);
        Product product_4 = new Product(4, "Product 4", "Description 4", "image.png", true, 2);
        Product product_5 = new Product(5, "Product 5", "Description 5", "image.png", true, 3);

        ProductRepository productRepository = new ProductRepository(context);
        productRepository.insert(Arrays.asList(product_1, product_2, product_3, product_4, product_5));
    }
    private static void insertCategory(Context context){
        Category category_1 = new Category(1, "Category 1");
        Category category_2 = new Category(2, "Category 2");
        Category category_3 = new Category(3, "Category 3");

        CategoryRepository categoryRepository = new CategoryRepository(context);
        categoryRepository.insert(Arrays.asList(category_1, category_2, category_3));
    }

    private static void insertUserAddress(Context context){
        UserAddress userAddress_1 = new UserAddress(1, 1, "City 1", "Country 1", "12345");
        UserAddress userAddress_2 = new UserAddress(2, 1, "City 2", "Country 2", "12345");
        UserAddress userAddress_3 = new UserAddress(3, 2, "City 3", "Country 3", "12345");
        UserAddress userAddress_4 = new UserAddress(4, 2, "City 4", "Country 4", "12345");
        UserAddress userAddress_5 = new UserAddress(5, 3, "City 5", "Country 5", "12345");
        UserAddress userAddress_6 = new UserAddress(6, 3, "City 6", "Country 6", "12345");
        UserAddress userAddress_7 = new UserAddress(7, 4, "City 7", "Country 7", "12345");
        UserAddress userAddress_8 = new UserAddress(8, 4, "City 8", "Country 8", "12345");
        UserAddress userAddress_9 = new UserAddress(9, 5, "City 9", "Country 9", "12345");
        UserAddress userAddress_10 = new UserAddress(10, 5, "City 10", "Country 10", "12345");

        UserAddressRepository userAddressRepository = new UserAddressRepository(context);
        userAddressRepository.insert(Arrays.asList(userAddress_1, userAddress_2, userAddress_3, userAddress_4, userAddress_5, userAddress_6, userAddress_7, userAddress_8, userAddress_9, userAddress_10));
    }


}
