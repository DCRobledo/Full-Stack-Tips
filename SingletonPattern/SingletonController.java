package com.drobledo.fullstacktips.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class SingletonController {
    private final Config config;

    public SingletonController(Config config) {
        this.config = config;
    }

    @GetMapping("/singleton")
    public String getConfig() {
        return "API URL: " + config.getAPIURL();
    }
}
