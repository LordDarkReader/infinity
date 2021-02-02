package com.chak.infinity.infinity.config;


import com.chak.infinity.infinity.repository.InfinityRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = InfinityRepository.class)
public class DbConfig {

}
