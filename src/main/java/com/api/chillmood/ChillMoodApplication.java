package com.api.chillmood;

import com.api.chillmood.form.persistence.FormRepository;
import com.api.chillmood.user.persistence.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = {AccountRepository.class, FormRepository.class})
public class ChillMoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChillMoodApplication.class, args);
    }

}
