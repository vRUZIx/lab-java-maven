package com.ironhack;

import java.math.BigDecimal;

public class OrderItem {
    private String name;
    private BigDecimal price;

    public OrderItem() {
    }

    public OrderItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
