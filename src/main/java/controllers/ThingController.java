package controllers;

import models.Thing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThingController {

    private final String placeholder = "Hello, %s!";
    private int counter = 0;

    @RequestMapping("/greeting")
    public Thing getThing(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Thing(this.counter++, String.format(placeholder, name));
    }
}
