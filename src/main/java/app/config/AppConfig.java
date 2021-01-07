package app.config;

import app.model.AnimalsCage;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    public AnimalsCage animalsCage(){
        AnimalsCage animalsCage = new AnimalsCage();
        return animalsCage;
    }

    @Bean
    @Scope("prototype")
    public Cat cat(){
        Cat cat = new Cat();
        return cat;
    }

    @Bean
    @Scope("prototype")
    public Dog dog(){
        Dog dog = new Dog();
        return dog;
    }
    @Bean
    public Timer timer(){
        Timer timer = new Timer();
        return timer;
    }
}
