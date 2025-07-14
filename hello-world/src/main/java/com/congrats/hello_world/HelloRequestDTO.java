package com.congrats.hello_world;

public class HelloRequestDTO {

	private String name;

	public HelloRequestDTO(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
