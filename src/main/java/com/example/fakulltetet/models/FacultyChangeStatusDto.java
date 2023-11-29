package com.example.fakulltetet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyChangeStatusDto {
    private long id;
    private boolean active;
}
