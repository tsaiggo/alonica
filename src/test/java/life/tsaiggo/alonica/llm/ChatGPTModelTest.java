package life.tsaiggo.alonica.llm;

import life.tsaiggo.alonica.AlonicaApplicationTests;
import org.junit.jupiter.api.Test;
import javax.annotation.Resource;

public class ChatGPTModelTest extends AlonicaApplicationTests {

    @Resource
    private ChatGPTModel chatGPTModel;

    @Test
    public void testConnection()
    {
        chatGPTModel.sayHello();
    }
}
