package com.example.URL_HIt_Counter.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class HitUrlService {

    static HashMap<String,Integer> map = new HashMap<>();

    public String getCount(String username) {
        if(username != null){
            map.put(username,map.getOrDefault(username,0)+1);
        }
        return "username: "+username+",Hitcounter: "  + map.get(username);
    }
}
