package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class App
{
    @Autowired
    private UserApi userApi;

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

}
