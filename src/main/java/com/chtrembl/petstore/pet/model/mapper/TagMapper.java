package com.chtrembl.petstore.pet.model.mapper;


import com.chtrembl.petstore.pet.model.Tag;
import com.chtrembl.petstore.pet.model.dto.TagDto;
import org.mapstruct.Mapper;

@Mapper()
public interface TagMapper {

  TagDto toDto(Tag tag);

  Tag toEntity(TagDto tagDto);
}
