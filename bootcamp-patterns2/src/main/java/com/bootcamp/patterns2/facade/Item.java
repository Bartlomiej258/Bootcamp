package com.bootcamp.patterns2.facade;

public class Item {

    private final Long productId;
    private final double qty;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long productId() {
        return productId;
    }

    public double qty() {
        return qty;
    }
}
