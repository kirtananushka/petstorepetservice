package com.chtrembl.petstore.pet.repository;

import com.chtrembl.petstore.pet.model.Tag;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
  List<Tag> findAll();
}
