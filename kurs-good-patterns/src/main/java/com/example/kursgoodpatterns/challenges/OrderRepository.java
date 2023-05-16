package com.example.kursgoodpatterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {


    void createOrder(User user, LocalDateTime from, LocalDateTime to, Product product);
}
