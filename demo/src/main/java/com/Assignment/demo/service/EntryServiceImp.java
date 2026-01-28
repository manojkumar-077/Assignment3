package com.Assignment.demo.service;

import com.Assignment.demo.dto.EntryRequestDto;
import com.Assignment.demo.dto.EntryResponseDto;
import com.Assignment.demo.entity.Entry;
import com.Assignment.demo.exception.ResourceNotFoundException;
import com.Assignment.demo.repository.EntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntryServiceImp implements EntryService {

    private final EntryRepository repository;

    public EntryServiceImp(EntryRepository repository) {
        this.repository = repository;
    }

    @Override
    public EntryResponseDto createEntry(EntryRequestDto dto) {
        Entry entry = mapToEntity(dto);
        return mapToDto(repository.save(entry));
    }

    @Override
    public List<EntryResponseDto> getAllEntries() {
        return repository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public EntryResponseDto getEntryById(Long id) {
        Entry entry = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Entry not found with id " + id));
        return mapToDto(entry);
    }

    @Override
    public EntryResponseDto updateEntry(Long id, EntryRequestDto dto) {
        Entry entry = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Entry not found with id " + id));

        entry.setAmount(dto.getAmount());
        entry.setType(dto.getType());
        entry.setCategory(dto.getCategory());
        entry.setDate(dto.getDate());
        entry.setDescription(dto.getDescription());

        return mapToDto(repository.save(entry));
    }

    @Override
    public void deleteEntry(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Entry not found with id " + id);
        }
        repository.deleteById(id);
    }

    private Entry mapToEntity(EntryRequestDto dto) {
        Entry entry = new Entry();
        entry.setAmount(dto.getAmount());
        entry.setType(dto.getType());
        entry.setCategory(dto.getCategory());
        entry.setDate(dto.getDate());
        entry.setDescription(dto.getDescription());
        return entry;
    }

    private EntryResponseDto mapToDto(Entry entry) {
        EntryResponseDto dto = new EntryResponseDto();
        dto.setId(entry.getId());
        dto.setAmount(entry.getAmount());
        dto.setType(entry.getType());
        dto.setCategory(entry.getCategory());
        dto.setDate(entry.getDate());
        dto.setDescription(entry.getDescription());
        return dto;
    }
}
