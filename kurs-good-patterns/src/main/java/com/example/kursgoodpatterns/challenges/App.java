package com.example.kursgoodpatterns.challenges;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = new OrderRequestRetriever().retrieve();

        OrderProcessor orderProcessor = new OrderProcessor((InformationService) new MailService(), new OrderRepository() {
            @Override
            public void createOrder(User user, LocalDateTime from, LocalDateTime to, Product product) {

            }
        }, new ProductOrderService());

        orderProcessor.process(orderRequest);
    }
}
