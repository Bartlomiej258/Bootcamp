package com.example.kursgoodpatterns.challenges;

import com.example.kursgoodpatterns.Food2Door.SupplierInterface;

public class Supplier implements SupplierInterface {

    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    @Override
    public void process() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                '}';
    }
}
