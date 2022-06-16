package com.jacobz.ngserver.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jacobz.ngserver.model.vo.RespData;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class NgAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        String sessionId = request.getSession().getId();
        Map<String, String> data = new HashMap<>();
        data.put("username", authentication.getName());
        data.put("token", sessionId);

        ObjectMapper om = new ObjectMapper();
        out.write(om.writeValueAsString(new RespData().success().data(data)));
    }
}
