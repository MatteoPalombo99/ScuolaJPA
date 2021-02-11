package it.sirfin.ScuolaJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.ScuolaJPA"})
@EnableJpaRepositories(basePackages = {"it.sirfin.ScuolaJPA.repository"})
@EntityScan(basePackages = {"it.sirfin.ScuolaJPA.model"})

public class ScuolaJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScuolaJpaApplication.class, args);
    }

}
