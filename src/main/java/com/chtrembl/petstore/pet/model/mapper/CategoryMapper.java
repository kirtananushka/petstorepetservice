package com.chtrembl.petstore.pet.model.mapper;


import com.chtrembl.petstore.pet.model.Category;
import com.chtrembl.petstore.pet.model.dto.CategoryDto;
import org.mapstruct.Mapper;


@Mapper()
public interface CategoryMapper {

  CategoryDto toDto(Category category);

  Category toEntity(CategoryDto categoryDto);
}
