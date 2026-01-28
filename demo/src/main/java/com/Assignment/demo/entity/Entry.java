package com.Assignment.demo.entity;
//import com.Assignment.demo.enums.Category;
//import com.Assignment.demo.enums.EntryType;
import com.Assignment.demo.enums.Category;
import com.Assignment.demo.enums.EntryType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Entry {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private BigDecimal amount;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EntryType type;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;


    @Column(nullable = false)
    private LocalDate date;


    private String description;


// Getters and Setters


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public BigDecimal getAmount() {
        return amount;
    }


    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


    public EntryType getType() {
        return type;
    }


    public void setType(EntryType type) {
        this.type = type;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }


    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}
