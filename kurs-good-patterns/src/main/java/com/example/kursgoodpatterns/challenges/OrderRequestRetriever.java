package com.example.kursgoodpatterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowal", "Warszawa");
        Product product = new Product("czekolada");
        LocalDateTime dateFrom = LocalDateTime.of(2022, 8, 2, 11, 15);
        LocalDateTime dateTo = LocalDateTime.of(2022, 8, 3, 12, 00);

        return new OrderRequest(user, dateFrom, dateTo, product);
    }
}
