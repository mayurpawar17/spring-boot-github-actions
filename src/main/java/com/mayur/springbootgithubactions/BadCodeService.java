package com.mayur.springbootgithubactions;

public class BadCodeService {

    public void process(String name, int age) {

        String temp = "Hello";   // Unused variable

        if (name != null) {
            if (name.length() > 0) {
                if (age > 18) {
                    if (age < 100) {
                        System.out.println(name.toUpperCase());
                    }
                }
            }
        }

        try {
            int x = 10 / 0;
        } catch (Exception e) {

        }

    }

}
