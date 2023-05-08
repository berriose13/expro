package com.eleazar.prueba.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("eleazar")
                .password("password")
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .requestMatchers(new AntPathRequestMatcher("/obtener", HttpMethod.GET.name()))
                .hasRole("USER")
                .and()
                .authorizeRequests()
                .requestMatchers(new AntPathRequestMatcher("/create", HttpMethod.GET.name()))
                .hasRole("USER")
                .and()
                .authorizeRequests()
                .requestMatchers(new AntPathRequestMatcher("/obtener", HttpMethod.GET.name()))
                .hasRole("ADMIN")
                .and()
                .authorizeRequests()
                .requestMatchers(new AntPathRequestMatcher("/create", HttpMethod.GET.name()))
                .hasRole("ADMIN")
                .and()
                .httpBasic();
        return http.build();
    }
}
