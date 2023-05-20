package com.example.kursgoodpatterns.Food2Door;

import com.example.kursgoodpatterns.challenges.Supplier;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        OrderProcess orderProcess = new OrderProcess();
        Map<Product, Supplier> products = orderProcess.getOrder();
        System.out.println(products);
    }
}
