package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain projectSecurityConfig( HttpSecurity http) throws Exception {
        http.csrf((csrf) -> csrf.disable())
                .securityContext(securityContext->securityContext.requireExplicitSave(false))
                .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.ALWAYS).maximumSessions(300))
                .authorizeHttpRequests((requests) -> requests
                		.anyRequest().permitAll())
                .formLogin()
                .loginPage("/gethelpermember")
                .usernameParameter("account")
                .defaultSuccessUrl("/LoginKapcha.html")
                .failureUrl("/helperLoginFail.html");


        return http.build();


    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
