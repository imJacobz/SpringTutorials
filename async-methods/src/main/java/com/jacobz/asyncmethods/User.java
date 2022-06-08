package com.jacobz.asyncmethods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown=true)
@Getter
@Setter
public class User {

    private String name;
    private String blog;

    @Override
    public String toString() {
        return "User [name=" + name + ", blog=" + blog + "]";
    }

}