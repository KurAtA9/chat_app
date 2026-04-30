package in.tech_camp.chat_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;


@Controller
@AllArgsConstructor
public class MessageController {
  @GetMapping("/")
  public String showMessages() {
      return "messages/index";
  }
  
  
}
