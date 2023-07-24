package life.tsaiggo.alonica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"life.tsaiggo.alonica.*"})
public class AlonicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlonicaApplication.class, args);
    }

}
