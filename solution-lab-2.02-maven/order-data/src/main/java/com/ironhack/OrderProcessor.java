package com.ironhack;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OrderProcessor {
    public Order processOrder(String orderData) {
        Gson gson = new Gson();

        Order order = gson.fromJson(orderData, Order.class);
        return order;
    }

}
