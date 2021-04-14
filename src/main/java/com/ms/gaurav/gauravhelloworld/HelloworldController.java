package com.ms.gaurav.gauravhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/messages")
    public String getMessage() {
        return "Hello world from spring boot docker running over AKS";
    }
}
