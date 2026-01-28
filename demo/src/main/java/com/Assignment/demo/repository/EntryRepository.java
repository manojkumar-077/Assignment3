package com.Assignment.demo.repository;

import com.Assignment.demo.entity.Entry;
import com.Assignment.demo.enums.EntryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface EntryRepository extends JpaRepository<Entry, Long> {

    @Query("SELECT COALESCE(SUM(e.amount), 0) FROM Entry e WHERE e.type = :type")
    BigDecimal sumByType(EntryType type);
}
