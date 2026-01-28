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


// getters and setters
}