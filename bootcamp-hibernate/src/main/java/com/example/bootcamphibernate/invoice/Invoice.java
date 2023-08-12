package com.example.bootcamphibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private int id;

    @NotNull
    @Column(name = "NUMBER")
    private String number;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
