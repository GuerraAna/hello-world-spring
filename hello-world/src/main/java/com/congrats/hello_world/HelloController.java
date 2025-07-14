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

    @GetMapping("/get-hello-world-response-dto")
    public ResponseEntity<HelloResponseDTO> getHelloWithResponseDTO(@RequestParam String name) {
        HelloResponseDTO body = new HelloResponseDTO(name);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("/get-hello-world-response-dto/{name}")
    public ResponseEntity<HelloResponseDTO> getHelloWithResponseDTO2(@PathVariable String name) {
        HelloResponseDTO body = new HelloResponseDTO(name);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("/get-hello-world-dto")
    public ResponseEntity<HelloResponseDTO> getHelloWithDTO(@RequestParam String name) {
        HelloRequestDTO request = new HelloRequestDTO(name);
        HelloResponseDTO response = new HelloResponseDTO(request.getName());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/get-hello-world-dto/{name}")
    public ResponseEntity<HelloResponseDTO> getHelloWithDTO2(@PathVariable String name) {
        HelloRequestDTO request = new HelloRequestDTO(name);
        HelloResponseDTO response = new HelloResponseDTO(request.getName());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
