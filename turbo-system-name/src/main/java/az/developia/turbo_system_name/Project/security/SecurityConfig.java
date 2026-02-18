package az.developia.turbo_system_name.Project.security;


import org.springframework.context.annotation.*;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filter(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable());
        http.authorizeHttpRequests(req -> req.anyRequest().permitAll());

        return http.build();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}