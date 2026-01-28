package com.Assignment.demo.dto;

import com.Assignment.demo.enums.Category;
import com.Assignment.demo.enums.EntryType;
import java.math.BigDecimal;
import java.time.LocalDate;

public class EntryResponseDto {

    private Long id;
    private BigDecimal amount;
    private EntryType type;
    private Category category;
    private LocalDate date;
    private String description;

    // ✅ Standard getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public EntryType getType() { return type; }
    public void setType(EntryType type) { this.type = type; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
