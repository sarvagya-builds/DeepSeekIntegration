package com.spring.test_deepseek.controller;

import com.spring.test_deepseek.service.ChatService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ChatControllerTest {

  @InjectMocks
  ChatController chatController;
  @Mock
  ChatService chatService;

  @Test
  void generate() {
  }

  @Test
  void generateStream() {
  }

  @Test
  void getResponseFromDeepSeekAI() {
    String question = "What is your name?";
    Mockito.when(chatService.getResponseFromDeepSeekAI(question)).thenReturn(question);
    chatController.getResponseFromDeepSeekAI(question);
  }

  @Test
  void getResponseFromDeepSeekAIWithStream() {
  }
}