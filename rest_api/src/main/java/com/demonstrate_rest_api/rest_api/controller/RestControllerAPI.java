package com.demonstrate_rest_api.rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
class RestControllerAPI {

    @GetMapping("/UC1")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/UC2")
    @ResponseBody
    public String sayHello(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return "Hello " + name + " from BridgeLabz";

        //http://localhost:8080/hello/UC2?name=adarsh --> Browse this to run 
    }

}