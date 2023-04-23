package com.example.URL_HIt_Counter.controller;

import com.example.URL_HIt_Counter.service.HitUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hitUrlcontroller {

    @Autowired
    HitUrlService hitUrlService;

    @GetMapping("count/{username}")
    public String HitCount(@PathVariable String username) {
        return hitUrlService.getCount(username);
    }

}
