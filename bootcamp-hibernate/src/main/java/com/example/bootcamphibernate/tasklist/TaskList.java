package com.example.bootcamphibernate.tasklist;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {

    @Column(name = "ID")
    @Id
    @NotNull
    @GeneratedValue
    private int id;

    @Column(name = "LISTNAME")
    private String listName;

    @Column(name = "DESCRIPTION")
    private String description;

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public int id() {
        return id;
    }

    public String listName() {
        return listName;
    }

    public String description() {
        return description;
    }
}
