package com.helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public String helloworld(){return "Hello World!";}

    @GetMapping("/worldgreeting")
    public List<Greeting> worldgreetinglist(){
    List<Greeting> greetings = List.of(
            new Greeting("Japan","こんにちは"),
            new Greeting("China","你好"),
            new Greeting("USA","Hello"),
            new Greeting("France","Bonjour"));
    return greetings;
    }
}