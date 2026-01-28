package com.Assignment.demo.service;

import com.Assignment.demo.dto.EntryRequestDto;
import com.Assignment.demo.dto.EntryResponseDto;

import java.util.List;

public interface EntryService {

    EntryResponseDto createEntry(EntryRequestDto dto);

    List<EntryResponseDto> getAllEntries();

    EntryResponseDto getEntryById(Long id);

    EntryResponseDto updateEntry(Long id, EntryRequestDto dto);

    void deleteEntry(Long id);
}
