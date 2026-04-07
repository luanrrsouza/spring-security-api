package com.unifacisa.springsecurityapi;

import com.unifacisa.springsecurityapi.domain.user.User;
import com.unifacisa.springsecurityapi.domain.user.UserRole;
import com.unifacisa.springsecurityapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        if (userRepository.findByEmail("admin@email.com").isEmpty()) {
            User admin = new User();
            admin.setName("Administrador");
            admin.setEmail("admin@email.com");
            admin.setPassword(passwordEncoder.encode("123456"));
            admin.setRole(UserRole.ADMIN);
            userRepository.save(admin);
        }

        if (userRepository.findByEmail("user@email.com").isEmpty()) {
            User user = new User();
            user.setName("Usuário");
            user.setEmail("user@email.com");
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRole(UserRole.USER);
            userRepository.save(user);
        }
    }
}