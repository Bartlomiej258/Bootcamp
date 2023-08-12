package com.example.bootcamphibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
