package com.jsp.springboot_hospitalmanagementsystem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Name cannot be blank")
	@NotNull(message = "name cannot be null")
	private String name;
	@NotBlank(message = "Email cannot be blank")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
	private String email;
}
