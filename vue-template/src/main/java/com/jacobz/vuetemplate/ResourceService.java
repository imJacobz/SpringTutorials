package com.jacobz.vuetemplate;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ResourceService {

    public List<Todo> findAllTodos() {
        return Arrays.asList(
                new Todo(1, "Java"),
                new Todo(2, "JavaScript"),
                new Todo(3, "HTML"),
                new Todo(4, "Server")
        );
    }
}
