package com.spring.test_deepseek.controller;

import com.spring.test_deepseek.service.ChatService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ai.ollama.OllamaChatModel;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ChatControllerTest {

  @InjectMocks
  ChatController chatController;
  @Mock
  ChatService chatService;
  @Mock
  OllamaChatModel chatModel;

  @Test
  void generate() {
    String message = "Hello World";
    Mockito.when(chatModel.call(message)).thenReturn(message);
    assertNotNull(chatController.generate(message));
  }


  @Test
  void getResponseFromDeepSeekAI() {
    String question = "What is your name?";
    Mockito.when(chatService.getResponseFromDeepSeekAI(question)).thenReturn(question);
    assertNotNull(chatController.getResponseFromDeepSeekAI(question));
  }

  @Test
  void getResponseFromDeepSeekAIWithStream() {
    String question = "Hello World";
    Flux<String> m2 = Flux.just(question);
    Mockito.when(chatService.getResponseFromDeepSeekAIWithStream(question)).thenReturn(m2);
    assertNotNull(chatController.getResponseFromDeepSeekAIWithStream(question));
  }
}