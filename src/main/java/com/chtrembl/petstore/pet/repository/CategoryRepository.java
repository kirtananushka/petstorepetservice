package com.chtrembl.petstore.pet.repository;

import com.chtrembl.petstore.pet.model.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

  List<Category> findAll();

  Optional<Category> findById(Long id);
}
