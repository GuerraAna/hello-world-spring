package com.congrats.hello_world;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private final HelloUseCase helloUseCase;

    public HelloService(HelloUseCase helloUseCase) {
        this.helloUseCase = helloUseCase;
    }

    public String getCongratsMessage() {
        return helloUseCase.getCongratsMessage();
    }
}
