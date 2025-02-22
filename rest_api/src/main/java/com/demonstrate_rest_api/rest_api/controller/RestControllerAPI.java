package com.demonstrate_rest_api.rest_api.controller;
import com.demonstrate_rest_api.rest_api.User;
import org.springframework.boot.context.annotation.UserConfigurations;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
class RestControllerAPI {

    @GetMapping("/UC1")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/UC2")
    @ResponseBody
    public String sayHelloByPassName(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return "Hello " + name + " from BridgeLabz";

        //http://localhost:8080/hello/UC2?name=adarsh --> Browse this to run
    }

    @GetMapping("UC3/{name}")
    public String sayHelloByPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";

        //http://localhost:8080/hello/UC3/adarsh
    }

    @PostMapping("/UC4")
    public String greetUser(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/UC5/{firstName}")
    public String greetUser(
            @PathVariable String firstName, // Extract firstName from the path
            @RequestParam String lastName   // Extract lastName from the query parameter
    ) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}