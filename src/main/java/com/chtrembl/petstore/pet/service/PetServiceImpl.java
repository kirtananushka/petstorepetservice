package com.chtrembl.petstore.pet.service;

import com.chtrembl.petstore.pet.model.Pet;
import com.chtrembl.petstore.pet.model.dto.PetDto;
import com.chtrembl.petstore.pet.model.dto.TagDto;
import com.chtrembl.petstore.pet.model.mapper.PetMapper;
import com.chtrembl.petstore.pet.model.mapper.TagMapper;
import com.chtrembl.petstore.pet.repository.PetRepository;
import com.chtrembl.petstore.pet.repository.TagRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

  private final PetRepository petRepository;
  private final PetMapper mapper = Mappers.getMapper(PetMapper.class);

  @Override
  @Transactional(readOnly = true)
  public List<PetDto> findAll() {
    return petRepository.findAll().stream().map(mapper::toDto).toList();
  }
}
