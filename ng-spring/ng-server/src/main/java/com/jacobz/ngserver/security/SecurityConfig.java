//package com.jacobz.ngserver.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.session.FindByIndexNameSessionRepository;
//import org.springframework.session.security.SpringSessionBackedSessionRegistry;
//
//@Configuration
//public class SecurityConfig {
//    //    private final FindByIndexNameSessionRepository<?> sessionRepository;
//    private final AuthenticationSuccessHandler authenticationSuccessHandler;
//
//    @Autowired
//    public SecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
////        this.sessionRepository = sessionRepository;
//        this.authenticationSuccessHandler = authenticationSuccessHandler;
//    }
//
//    @Bean
//    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        // @no-format:off
//        return http
//                .httpBasic()
////
//                .and().authorizeRequests()
////                .antMatchers("/login").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin()//.loginPage("/login")
//                //.loginProcessingUrl("/login")
//                .successHandler(authenticationSuccessHandler)
//                //.and().cors()
////                .and().sessionManagement((sessionManagement) -> sessionManagement
////                        .maximumSessions(2)
////                        .sessionRegistry(sessionRegistry())
////                )
//                .and()
//                .build();
//        // @no-format:on
//    }
//
////    @Bean
////    public SpringSessionBackedSessionRegistry<?> sessionRegistry() {
////        return new SpringSessionBackedSessionRegistry<>(this.sessionRepository);
////    }
//}
