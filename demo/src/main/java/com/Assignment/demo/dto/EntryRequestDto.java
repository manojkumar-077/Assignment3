package com.Assignment.demo.dto;

import com.Assignment.demo.enums.Category;
import com.Assignment.demo.enums.EntryType;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class EntryRequestDto {

    @NotNull
    @Positive
    private BigDecimal amount;

    @NotNull
    private EntryType type;

    @NotNull
    private Category category;

    @NotNull
    private LocalDate date;

    @NotBlank
    private String description;

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
