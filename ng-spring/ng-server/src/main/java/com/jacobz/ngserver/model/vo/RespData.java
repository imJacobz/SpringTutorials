package com.jacobz.ngserver.model.vo;

import java.util.HashMap;

public class RespData extends HashMap<String, Object> {
    public RespData success() {
        this.put("status", 200);
        this.put("msg", "OK");
        this.put("data", null);
        return this;
    }

    public RespData notFound() {
        this.put("status", 404);
        this.put("msg", "Not Found");
        this.put("data", null);
        return this;
    }

    public RespData internalError() {
        this.put("status", 500);
        this.put("msg", "Internal Error");
        this.put("data", null);
        return this;
    }

    public RespData status(int status) {
        this.put("status", status);
        return this;
    }

    public RespData msg(String msg) {
        this.put("msg", msg);
        return this;
    }

    public RespData data(Object data) {
        this.put("data", data);
        return this;
    }
}
