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


// getters and setters
}
