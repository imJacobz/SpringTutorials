package com.jacobz.ngserver.controller;

import com.jacobz.ngserver.model.vo.RespData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class HomeController {

    @RequestMapping({"/","/resource"})
    @CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders={"x-auth-token", "x-requested-with", "x-xsrf-token"})
    public ResponseEntity<RespData> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return ResponseEntity.ok(new RespData().success().data(model));
    }

    @RequestMapping("/user")
    @CrossOrigin(origins="*", maxAge=3600)
    public Principal user(Principal user) {
        return user;
    }

    @RequestMapping("/token")
    public Map<String,String> token(HttpSession session) {
        return Collections.singletonMap("token", session.getId());
    }

}
