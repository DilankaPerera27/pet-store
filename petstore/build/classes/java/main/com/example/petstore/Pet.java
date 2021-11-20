package com.example.petstore;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

@Schema(name = "Pet")
public class Pet {

	@Schema(required = true, description = "Pet id")
	@JsonProperty("pet_id")
	private Integer pet_id;

	@Schema(required = true, description = "Pet type")
	@JsonProperty("pet_type")
	private String pet_type;

	@Schema(required = true, description = "Pet name")
	@JsonProperty("pet_name")
	private String pet_name;

	@JsonProperty("pet_age")
	private Integer pet_age;

	public Integer getPetId() {
		return pet_id;
	}

	public void setPetId(Integer petId) {
		this.pet_id = petId;
	}

	public String getPetType() {
		return pet_type;
	}

	public void setPetType(String petType) {
		this.pet_type = petType;
	}

	public String getPetName() {
		return pet_name;
	}

	public void setPetName(String petName) {
		this.pet_name = petName;
	}

	public Integer getPetAge() {
		return pet_age;
	}

	public void setPetAge(Integer petAge) {
		this.pet_age = petAge;
	}

}
