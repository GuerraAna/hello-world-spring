package com.congrats.hello_world;

import org.springframework.stereotype.Component;

@Component
public class HelloUseCase {

    public String getCongratsMessage() {
        return "Olá, Ana! Sua aplicação está no ar. 🚀";
    }
}
