package com.roager.firstrestapi.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private UserDetailsRepository repository;

    public UserDetailsCommandLineRunner(UserDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new UserDetails("Rasmus", "Admin"));
        repository.save(new UserDetails("Bjarne", "Admin"));
        repository.save(new UserDetails("Flemming", "User"));

        //List<UserDetails> users = repository.findAll();

        List<UserDetails> admins = repository.findByRole("Admin");

        admins.forEach(u -> logger.info(u.toString()));
    }
}
