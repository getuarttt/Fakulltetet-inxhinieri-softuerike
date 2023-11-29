package com.example.fakulltetet.services.impls;

import com.example.fakulltetet.mappers.FacultyMapper;
import com.example.fakulltetet.models.FacultyChangeStatusDto;
import com.example.fakulltetet.models.FacultyDto;
import com.example.fakulltetet.repositories.FacultyRepository;
import com.example.fakulltetet.services.FacultyService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpls  implements FacultyService {

    private final FacultyRepository repository;
    private final FacultyMapper mapper;

    public FacultyServiceImpls(FacultyRepository repository, FacultyMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public boolean add(FacultyDto facultyDto){
        var entity = mapper.toEntity(FacultyDto);
        repository.save(entity);
        return true;
    }

    @Override
    public List<FacultyDto> getAll(){

        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public FacultyDto getById(long id){

        var optionalEntity = repository.findById(id);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("Faculty not found with id: "+ id);
        var entity = optionalEntity.get();
        var dto = mapper.toDto(entity);
        return dto;
    }

    @Override
    public boolean changeStatus(long id, FacultyChangeStatusDto dto) {
        var optionalDriver = repository.findById(id);
        if (optionalDriver.isEmpty())
            throw new EntityNotFoundException("Faculty not found with id " + id);
        var entity = optionalDriver.get();
        entity.setActive(dto.isActive());
        repository.save(entity);
        return true;
    }

    @Override
    public boolean deleteById(long id) {
        repository.deleteById(id);
        return true;
    }


}
