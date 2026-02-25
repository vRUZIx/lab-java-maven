package com.ironhack;

import com.ironhack.Order;
import com.ironhack.OrderProcessor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String order1Json = """
                {
                  "orderId": "12312",
                  "customer": "Ally",
                  "orderItems": [
                    {
                      "name": "pencil",
                      "price": 2.99
                    },
                    {
                      "name": "laptop",
                      "price": 999.99
                    },
                    {
                      "name": "scarf",
                      "price": 9.99
                    }
                  ],
                  "orderTotal": 1012.97
                }
                """;

        String order2Json = """
                {
                  "orderId": "3123412",
                  "customer": "Billy",
                  "orderItems": [
                    {
                      "name": "polish",
                      "price": 1.99
                    },
                    {
                      "name": "phone",
                      "price": 499.99
                    },
                    {
                      "name": "cap",
                      "price": 9.99
                    }
                  ],
                  "orderTotal": 511.97
                }
                """;

        OrderProcessor orderProcessor = new OrderProcessor();
        Order order1 = orderProcessor.processOrder(order1Json);
        Order order2 = orderProcessor.processOrder(order2Json);

        List<Order> orderList = List.of(order1, order2);

        OrderCalculator orderCalculator = new OrderCalculator();
        System.out.println("The Grand Total of Orders: " + orderCalculator.calculateGrandTotal(orderList));
    }
}