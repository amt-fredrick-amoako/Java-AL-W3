package com.amalitech;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Order {
    private String customerId;
    private List<OrderItem> items;
    private OrderStatus status;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(new ToDoubleFunction<OrderItem>() {
            @Override
            public double applyAsDouble(OrderItem item) {
                return item.getPrice() * item.getQuantity();
            }
        }).sum();
    }

    public double calculateTotalRefactor(){
        return items.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }

    public List<OrderItem> getExpensiveItems(double minPrice){
        return items.stream()
                .filter(item -> item.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getCustomerId() {
        return customerId;
    }

    public OrderStatus getStatus() {
        return status;
    }
}

enum OrderStatus{
    PENDING,
    SHIPPED,
}

