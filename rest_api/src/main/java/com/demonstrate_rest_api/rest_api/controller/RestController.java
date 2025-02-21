package com.demonstrate_rest_api.rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
class RestController {

    @GetMapping("/UC1")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
