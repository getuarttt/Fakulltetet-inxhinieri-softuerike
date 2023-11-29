package com.example.fakulltetet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyDto {
    private long id;
    private String name;
    private String location;
    private String departments;
    private boolean active = true;
    private LocalDateTime openhours;
    private String dean;
}
