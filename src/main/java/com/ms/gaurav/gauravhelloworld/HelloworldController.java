package com.ms.gaurav.gauravhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloworldController {

    @GetMapping("/messages")
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<b> Hello world from spring boot docker running over Azure AKS - Gaurav Rehan </b> <BR><BR>" );
        sb.append("<b>Env Vars: </b> <BR>");
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            sb.append("<b>"+entry.getKey() + " : </b>" + entry.getValue() + " <BR>");
        }
        return sb.toString();
    }


}
