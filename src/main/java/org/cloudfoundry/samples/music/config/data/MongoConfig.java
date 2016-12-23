package org.cloudfoundry.samples.music.config.data;

import org.cloudfoundry.samples.music.repositories.mongodb.MongoAlbumRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@Profile("mongodb")
@EnableMongoRepositories(basePackageClasses = {MongoAlbumRepository.class})
public class MongoConfig {

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) {
        return new MongoTemplate(mongoDbFactory);
    }
    public String empname7;

    
    private int empid;  
    private int emp_no;
    
System.out.println("eqjmnofdhn");
private int studentid7;

private int add10;





}
