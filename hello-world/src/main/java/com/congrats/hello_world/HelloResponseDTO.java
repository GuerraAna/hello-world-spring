package com.congrats.hello_world;

public class HelloResponseDTO {

	private String name;

	public HelloResponseDTO(String name) {
		this.name = name;
	}

	public String getName() {
		return "Olá, " + name + "! Sua aplicação está no ar. 🚀";
	}

	public void setName(String name) {
		this.name = name;
	}
}
