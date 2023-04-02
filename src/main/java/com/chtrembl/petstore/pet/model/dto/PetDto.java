package com.chtrembl.petstore.pet.model.dto;

import com.chtrembl.petstore.pet.model.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PetDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-12-20T15:31:39.272-05:00")

public class PetDto {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("category")
	private CategoryDto categoryDto;

	@JsonProperty("name")
	private String name;

	@JsonProperty("photoURL")
	@Valid
	private String photoURL;

	@JsonProperty("tags")
	@Valid
	private List<TagDto> tags = null;

	@JsonProperty("status")
	private Status status;

	public PetDto id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 */
	@ApiModelProperty(value = "")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PetDto category(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
		return this;
	}

	/**
	 * Get categoryDto
	 *
	 * @return categoryDto
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CategoryDto getCategory() {
		return categoryDto;
	}

	public void setCategory(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}

	public PetDto name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 */
	@ApiModelProperty(example = "doggie", required = true, value = "")
	@NotNull

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get photoUrls
	 *
	 * @return photoUrls
	 */
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public PetDto tags(List<TagDto> tagDtos) {
		this.tags = tagDtos;
		return this;
	}

	public PetDto addTagsItem(TagDto tagsItem) {
		if (this.tags == null) {
			this.tags = new ArrayList<>();
		}
		this.tags.add(tagsItem);
		return this;
	}

	/**
	 * Get tagDtos
	 *
	 * @return tagDtos
	 */
	@ApiModelProperty(value = "")

	@Valid

	public List<TagDto> getTags() {
		return tags;
	}

	public void setTags(List<TagDto> tagDtos) {
		this.tags = tagDtos;
	}

	public PetDto status(Status status) {
		this.status = status;
		return this;
	}

	/**
	 * pet status in the store
	 *
	 * @return status
	 */
	@ApiModelProperty(value = "pet status in the store")

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PetDto petDto = (PetDto) o;
		return Objects.equals(this.id, petDto.id) && Objects.equals(this.categoryDto, petDto.categoryDto)
				&& Objects.equals(this.name, petDto.name) && Objects.equals(this.photoURL, petDto.photoURL)
				&& Objects.equals(this.tags, petDto.tags) && Objects.equals(this.status, petDto.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, categoryDto, name, photoURL, tags, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PetDto {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    categoryDto: ").append(toIndentedString(categoryDto)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    photoUrls: ").append(toIndentedString(photoURL)).append("\n");
		sb.append("    tagDtos: ").append(toIndentedString(tags)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
