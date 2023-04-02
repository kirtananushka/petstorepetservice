package com.chtrembl.petstore.pet.service;

import com.chtrembl.petstore.pet.model.dto.TagDto;
import java.util.List;

public interface TagService {
  List<TagDto> findAll();
}
