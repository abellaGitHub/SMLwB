package com.springboot.myapp;

import com.springboot.myapp.models.Building;
import com.springboot.myapp.models.Floor;
import com.springboot.myapp.models.Room;
import com.springboot.myapp.models.Sensor;
import com.springboot.myapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abella on 2017-06-22.
 */

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@EntityScan("com.springboot.myapp.models")
@ComponentScan({"com.springboot.myapp.services", "com.springboot.myapp.controllers"})
@EnableJpaRepositories("com.springboot.myapp.repositories")
public class Application {
    public static void main(String [] args) {
        SpringApplication.run(Application.class, args);
    }
}
