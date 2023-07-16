package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private Integer id;
	
	@NotEmpty
	@Size(min= 5, message="Name must be min of 8 characters")
	private String name;
	
	@Email(message="Email Address is Invalid !!")
	private String email;
	
	@NotEmpty
	@Size(min= 5 ,max= 10, message ="Password must be of min 5 chars and max 10 chars")
	private String password;
	
	@NotEmpty
	private String about;


}
