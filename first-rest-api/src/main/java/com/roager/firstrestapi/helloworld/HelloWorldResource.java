package com.roager.firstrestapi.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWolrdBean helloWorldBean() {
        return new HelloWolrdBean("Hello World");
    }

    @GetMapping("/hello-world-path-param/{name}")
    public HelloWolrdBean helloWorldPathParam(@PathVariable String name) {
        return new HelloWolrdBean("Hello " + name);
    }

    @GetMapping("/hello-world-path-param/{name}/message/{message}")
    public HelloWolrdBean helloWorldMultiplePathParam(@PathVariable String name, @PathVariable String message) {
        return new HelloWolrdBean("Hello " + name + ". " + message);
    }
}
