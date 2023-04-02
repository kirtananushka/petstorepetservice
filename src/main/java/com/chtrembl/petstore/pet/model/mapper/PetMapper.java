package com.chtrembl.petstore.pet.model.mapper;


import com.chtrembl.petstore.pet.model.Pet;
import com.chtrembl.petstore.pet.model.dto.PetDto;
import org.mapstruct.Mapper;

@Mapper()
public interface PetMapper {

  PetDto toDto(Pet pet);

  Pet toEntity(PetDto petDto);
}
