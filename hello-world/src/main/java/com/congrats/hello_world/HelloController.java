package com.congrats.hello_world;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping("get-hello-world")
    public String hello() {
        return service.getCongratsMessage();
    }

    @GetMapping("/get-hello-world-dto")
    public ResponseEntity<HelloResponseDTO> helloRequestParam(@RequestParam String name) {
        HelloResponseDTO body = new HelloResponseDTO(name);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("/get-hello-world-path-param/{name}")
    public ResponseEntity<HelloResponseDTO> helloPathVariable(@PathVariable String name) {
        HelloResponseDTO body = new HelloResponseDTO(name);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
}
