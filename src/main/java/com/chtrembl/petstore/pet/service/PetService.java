package com.chtrembl.petstore.pet.service;

import com.chtrembl.petstore.pet.model.dto.PetDto;
import java.util.List;

public interface PetService {
  List<PetDto> findAll();
}
