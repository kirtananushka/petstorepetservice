package com.chtrembl.petstore.pet.service;

import com.chtrembl.petstore.pet.model.dto.CategoryDto;
import java.util.List;

public interface CategoryService {
  List<CategoryDto> findAll();
  CategoryDto findById(Long id);
}
