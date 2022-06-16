package com.jacobz.vuetemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ResourceController {

    @GetMapping("/api/resource")
    public Map<String, Object> getResources(){
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message","OK");
        map.put("data", "Hello World");
        return map;
    }
}
