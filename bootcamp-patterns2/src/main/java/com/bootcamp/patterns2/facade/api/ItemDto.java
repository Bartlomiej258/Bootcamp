package com.bootcamp.patterns2.facade.api;

public class ItemDto {

    private final Long productId;
    private final double quantity;

    public ItemDto(Long productId, double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long productId() {
        return productId;
    }

    public double quantity() {
        return quantity;
    }
}
