package com.Assignment.demo.controller;

import com.Assignment.demo.enums.EntryType;
import com.Assignment.demo.repository.EntryRepository;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/summary")
public class SummaryController {

    private final EntryRepository repository;

    public SummaryController(EntryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Map<String, BigDecimal> getSummary() {
        BigDecimal income = repository.sumByType(EntryType.INCOME);
        BigDecimal expense = repository.sumByType(EntryType.EXPENSE);

        Map<String, BigDecimal> response = new HashMap<>();
        response.put("totalIncome", income);
        response.put("totalExpense", expense);
        response.put("balance", income.subtract(expense));
        return response;
    }
}
