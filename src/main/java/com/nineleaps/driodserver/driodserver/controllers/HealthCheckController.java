package com.nineleaps.driodserver.driodserver.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nineleaps.driodserver.driodserver.models.HealthCheck;

@RestController
public class HealthCheckController {

    public static final String LIVE = "live";

    @RequestMapping(path = "/api/health-check")
    public HealthCheck healthCheck(){

        return new HealthCheck(LIVE);
    }
}
