package com.example.kursgoodpatterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean order(User user, LocalDateTime from, LocalDateTime to, Product product);
}
