package com.chtrembl.petstore.pet.api.testcontroller;

import com.chtrembl.petstore.pet.model.dto.CategoryDto;
import com.chtrembl.petstore.pet.model.dto.PetDto;
import com.chtrembl.petstore.pet.model.dto.TagDto;
import com.chtrembl.petstore.pet.service.CategoryService;
import com.chtrembl.petstore.pet.service.PetService;
import com.chtrembl.petstore.pet.service.TagService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("${openapi.swaggerPetstore.base-path:/petstorepetservice/v2}")
public class TestController {

  private final CategoryService categoryService;
  private final TagService tagService;
  private final PetService petService;

  @GetMapping("/categories")
  public List<CategoryDto> findAllCategories() {
    return categoryService.findAll();
  }

  @GetMapping("/categories/{id}")
  public ResponseEntity<CategoryDto> findCategoryById(@PathVariable Long id) {
    try {
      CategoryDto categoryDto = categoryService.findById(id);
      return new ResponseEntity<>(categoryDto, HttpStatus.OK);
    } catch (IllegalArgumentException e) {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/tags")
  public List<TagDto> findAllTags() {
    return tagService.findAll();
  }

  @GetMapping("/pets")
  public List<PetDto> findAllPets() {
    return petService.findAll();
  }
}
