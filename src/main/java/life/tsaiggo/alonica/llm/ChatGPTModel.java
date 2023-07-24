package life.tsaiggo.alonica.llm;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChatGPTModel {

    @Value("${OPENAI_API_KEY}")
    private String apiKey;

    public void sayHello() {
        ChatLanguageModel model = OpenAiChatModel.withApiKey(apiKey);
        AiMessage answer = model.sendUserMessage("Hello world!");
        System.out.println(answer.text());
    }
}