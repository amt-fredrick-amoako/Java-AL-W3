package com.amalitech;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ECommerceApp {

    private List<Order> orders;

    public void processOrders(List<Order> orders) {
        for (Order order : orders) {
            if (order.getStatus().equals("PENDING")) {
                double total = 0;
                for (OrderItem item : order.getItems()) {
                    total += item.getPrice() * item.getQuantity();
                }
                System.out.println("Order Total: " + total);
            }
        }
    }

    public void processOrdersRefactored(List<Order> orders) {
        orders.stream()
                .filter(order -> order.getStatus().equals("PENDING"))
                .forEach(order -> {
                    double total = order.getItems().stream()
                            .mapToDouble(item -> item.getPrice() * item.getQuantity())
                            .sum();
                    System.out.println("Order Total: " + total);
                });
    }


    // Total order amount
    public double calculateTotalOrderAmount() {
        return orders.stream()
                .flatMap(order -> order.getItems().stream())
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }

    // Orders per customer
    public Map<String, Long> countOrdersPerCustomer() {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerId, Collectors.counting()));
    }
}

