package lv.anna.Test.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController//annotations so that class knows that it's part of springboot
public class TestController {

    private final double PI = 3.14;

    @GetMapping(value = "/test")
    public String getTest() {
        return "This is Test!";
    }

    @PostMapping ( value = "/test")//if we want to update date on our websites, we use these mappings: get; post, put, delete
    public String getAnotherTest() {
        System.out.println("Something is created here");
        return "This is a response for POST request";
    }

    /**
     *  calculates perimeter of a circle
     * @param radius
     * @return
     */
    @GetMapping ( value = "/calculate")
    public double calculate( double radius ) {
        return 2*PI*radius;
    }

}
