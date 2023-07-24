package life.tsaiggo.alonica;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = {"life.tsaiggo.alonica.*"})
public class AlonicaApplicationTests {

    @Test
    void contextLoads() {
    }

}
