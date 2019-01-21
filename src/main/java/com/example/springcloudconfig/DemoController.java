package com.example.springcloudconfig;

/**
 * Created by sparik0 on 1/21/2019.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${test.property}")
    private String testProperty;

    @Value("${test.local.property}")
    private String localTestProperty;

    @RequestMapping("/")
    public String test() {
        StringBuilder builder = new StringBuilder();
        builder.append("test property - ").append(testProperty).append(" ")
                .append("local property - ").append(localTestProperty);
        return builder.toString();
    }
}
