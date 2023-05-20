package com.example.kursgoodpatterns.Food2Door;

import com.example.kursgoodpatterns.challenges.Supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderProcess {

    Map<Product, Supplier> products = new HashMap<>();

    public Map<Product, Supplier> getOrder() {
        products.put(new Product("pomidory", 2), new Supplier("DorotaShop"));
        products.put(new Product("ogorki", 3), new Supplier("MartaShop"));
        return products;
    }


}
