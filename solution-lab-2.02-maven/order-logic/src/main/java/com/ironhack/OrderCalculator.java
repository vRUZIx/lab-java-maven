package com.ironhack;

import java.math.BigDecimal;
import java.util.List;

public class OrderCalculator {
    public BigDecimal calculateGrandTotal(List<Order> orders){
        BigDecimal grandTotal = BigDecimal.ZERO;
        for(Order order : orders){
            grandTotal = grandTotal.add(order.getOrderTotal());
        }
        return grandTotal;
    }
}
