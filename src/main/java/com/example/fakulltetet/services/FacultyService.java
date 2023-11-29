package com.example.fakulltetet.services;

import com.example.fakulltetet.models.FacultyChangeStatusDto;
import com.example.fakulltetet.models.FacultyDto;

import java.util.List;

public interface FacultyService {
    boolean add(FacultyDto facultyDto);

    List<FacultyDto> getAll();

    FacultyDto getById(long id);

    boolean update(long id, FacultyDto updatedFacultyDto);

    boolean changeStatus(long id, FacultyChangeStatusDto dto);

    boolean deleteById(long id);

}
