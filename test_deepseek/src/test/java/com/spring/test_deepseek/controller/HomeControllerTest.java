package com.spring.test_deepseek.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HomeControllerTest {

  @InjectMocks
  HomeController homeController;

  @Test
  void home() {
    homeController.home();
  }
}