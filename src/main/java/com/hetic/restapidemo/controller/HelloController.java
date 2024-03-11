package com.hetic.restapidemo.controller;

import com.hetic.restapidemo.response.HelloResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String sayHello(){
        return "Hello world !";
    }

    @GetMapping("/guest")
    public String sayHelloGuest(
            @RequestParam(name="guest", required=false, defaultValue = "Guest") String guest){
        return "Hello " + guest + ", welcome to Spring Boot!";
    }

    @GetMapping("/{guest}")
    public HelloResponse sayHelloGuestV2(@PathVariable String guest){
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setGuestName(guest);
        helloResponse.setMessage("Hello " + guest + ", welcome to Spring Boot!");
        return helloResponse;
    }
}
