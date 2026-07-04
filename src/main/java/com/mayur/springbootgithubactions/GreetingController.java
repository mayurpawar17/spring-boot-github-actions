package com.mayur.springbootgithubactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService = new GreetingService();

    @GetMapping("/greet")
    public String greet() {
        return greetingService.greet();
    }

    @GetMapping("/grade/{marks}")
    public String grade(@PathVariable int marks) {
        return greetingService.calculateGrade(marks);
    }
}


