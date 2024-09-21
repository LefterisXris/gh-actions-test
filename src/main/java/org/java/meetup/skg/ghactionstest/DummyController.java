package org.java.meetup.skg.ghactionstest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/dummy")
public class DummyController {

   private final WelcomeMessageService welcomeMessageService;

   @GetMapping("/hello/{name}")
   public WelcomeMessage sayHelloPersonal(@PathVariable String name) {
      return welcomeMessageService.getWelcomeMessage("Hello " + name);
   }

}