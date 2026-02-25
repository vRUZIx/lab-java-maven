package com.ironhack;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private String orderId;
    private String customer;
    private List<OrderItem> orderItems;
    private BigDecimal orderTotal;

    public Order() {
    }

    public Order(String orderId, String customer, List<OrderItem> orderItems, BigDecimal orderTotal) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = orderItems;
        this.orderTotal = orderTotal;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public List<OrderItem> getOrderItems() { return orderItems; }

    public void printOrderItems(){
        System.out.println("List of Items: ");
        for(OrderItem item : orderItems){
            System.out.println("Name: " + item.getName() + " | Price: " + item.getPrice());
        }
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }
}
