package com.drobledo.fullstacktips.singleton;

import org.springframework.stereotype.Service;

@Service
public class Config {
    private final String APIURL = "https://youshouldhiredanielrobledo.com";

    public String getAPIURL() {
        return APIURL;
    }
}
