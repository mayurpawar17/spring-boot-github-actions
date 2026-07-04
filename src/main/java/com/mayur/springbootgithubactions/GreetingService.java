package com.mayur.springbootgithubactions;

public class GreetingService {

    public String greet() {
        return "Welcome to Spring Boot with GitHub Actions";
    }

    public String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
