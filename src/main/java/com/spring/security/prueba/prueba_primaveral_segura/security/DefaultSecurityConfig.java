package com.spring.security.prueba.prueba_primaveral_segura.security;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity 
@Configuration
public class DefaultSecurityConfig {
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
	    .authorizeHttpRequests(auth -> auth
	        .anyRequest().authenticated()
	    );
	    
	    return http.build();
    }
	@Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
            .username("santi")
            .password("{noop}1234")
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(user);
    }
}