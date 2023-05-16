package com.example.kursgoodpatterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime from, LocalDateTime to, Product product) {
        System.out.println("User: " + user + " was ordered " + product.getName() + " on" +
                from.toString() + " the product will be delivered on " + to.toString());
        return true;
    }
}
