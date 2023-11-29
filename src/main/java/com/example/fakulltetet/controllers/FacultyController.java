package com.example.fakulltetet.controllers;


import com.example.fakulltetet.models.FacultyChangeStatusDto;
import com.example.fakulltetet.models.FacultyDto;
import com.example.fakulltetet.services.FacultyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = '*')

public class FacultyController {
    public final FacultyService facultyService;

    public FacultyController(FacultyService service){
        this.facultyService = service;
    }

    @GetMapping
    public List<FacultyDto> getAllFaculties(){
        return facultyService.getAll();

    }

    @GetMapping("/{id}")
    public FacultyDto getFacultyById(@PathVariable long id){
        return facultyService.getById(id);
    }

    @PostMapping
    public void addFaculty(@RequestBody FacultyDto facultyDto){
        facultyService.add(FacultyDto);

    }

    @PutMapping("/{id}")
    public void updateFaculty(@PathVariable long id, @RequestBody FacultyDto facultyDto){
        facultyService.update(id,facultyDto);
    }

    @PatchMapping("/{id}")
    public void updateFacultyStatus(@PathVariable long id, @RequestBody FacultyChangeStatusDto facultyDto){
        facultyService.changeStatus(id, facultyDto);
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable long id){
        facultyService.deleteById(id);
    }
}
