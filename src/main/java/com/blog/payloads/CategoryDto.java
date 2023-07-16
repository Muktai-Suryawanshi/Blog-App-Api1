package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
	
	private Integer categoryId;
	@NotBlank
	@Size(min = 3, message = "Minimum size of title should be 3")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 5, message = "Minimum size of description should be 5")
	private String categoryDescription;

}
