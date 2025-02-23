package com.spring.test_deepseek.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ChatService {

    //Access to cloud-based models via API
    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    public String getResponseFromDeepSeekAI(String question) {
        return chatClient.prompt(question)
                .call()
                .content();
    }

    public Flux<String> getResponseFromDeepSeekAIWithStream(String question) {
        return chatClient.prompt(question)
                .stream()
                .content();
    }
}
