package com.ironhack;

public class Main {
    public static void main(String[] args) {
        String orderJson = """
                {
                  "orderId": "54789",
                  "customer": "Sarah",
                  "orderItems": [
                    {
                      "name": "keyboard",
                      "price": 79.99
                    },
                    {
                      "name": "mouse",
                      "price": 29.99
                    },
                    {
                      "name": "monitor",
                      "price": 299.99
                    }
                  ],
                  "orderTotal": 409.97
                }
                """;
        OrderProcessor orderProcessor = new OrderProcessor();
        Order myOrder = orderProcessor.processOrder(orderJson);

        System.out.println(myOrder.getOrderId());
        myOrder.printOrderItems();
        System.out.println(myOrder.getCustomer());
        System.out.println(myOrder.getOrderTotal());
    }
}