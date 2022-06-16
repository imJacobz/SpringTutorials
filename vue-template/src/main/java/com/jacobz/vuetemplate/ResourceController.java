package com.jacobz.vuetemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ResourceController {

    private final ResourceService service;

    public ResourceController(ResourceService service) {
        this.service = service;
    }

    @GetMapping("/api/resource")
    public Map<String, Object> getResources() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message", "OK");
        map.put("data", "Hello World");
        return map;
    }

    @GetMapping("/api/list")
    public Map<String, Object> getListResources() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", 200);
        map.put("message", "OK");
        map.put("data", service.findAllTodos());
        return map;
    }
}
