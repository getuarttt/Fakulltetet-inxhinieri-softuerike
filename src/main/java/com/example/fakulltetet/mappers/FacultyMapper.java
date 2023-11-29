package com.example.fakulltetet.mappers;


import com.example.fakulltetet.entities.FacultyEntity;
import com.example.fakulltetet.models.FacultyChangeStatusDto;
import com.example.fakulltetet.models.FacultyDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class FacultyMapper {
    public FacultyEntity toEntity(FacultyDto from){
        var to = new FacultyEntity();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setLocation(from.getLocation());
        to.setDepartments(from.getDepartments());
        to.setOpenhours(LocalDateTime.now());
        to.setActive(from.isActive());
        to.setDean("admin");
        return to;
    }

    public FacultyDto toDto(FacultyEntity from){
        var to = new FacultyDto();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setLocation(from.getLocation());
        to.setDepartments(from.getDepartments());
        to.setOpenhours(LocalDateTime.now());
        to.setActive(from.isActive());
        to.setDean("admin");
        return to;
    }

    public FacultyChangeStatusDto changeStatusDto(FacultyEntity from){
        var to = new FacultyChangeStatusDto();
        to.setId(from.getId());
        to.setActive(from.isActive());
        return to;
    }
}
