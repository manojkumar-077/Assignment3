package com.Assignment.demo.controller;

import com.Assignment.demo.dto.EntryRequestDto;
import com.Assignment.demo.dto.EntryResponseDto;
import com.Assignment.demo.service.EntryService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/entries")
public class EntryController {

    private final EntryService service;

    public EntryController(EntryService service) {
        this.service = service;
    }

    @PostMapping
    public EntryResponseDto create(@Valid @RequestBody EntryRequestDto dto) {
        return service.createEntry(dto);
    }

    @GetMapping
    public List<EntryResponseDto> getAll() {
        return service.getAllEntries();
    }

    @GetMapping("/{id}")
    public EntryResponseDto getById(@PathVariable Long id) {
        return service.getEntryById(id);
    }

    @PutMapping("/{id}")
    public EntryResponseDto update(@PathVariable Long id,
                                   @Valid @RequestBody EntryRequestDto dto) {
        return service.updateEntry(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteEntry(id);
    }
}
