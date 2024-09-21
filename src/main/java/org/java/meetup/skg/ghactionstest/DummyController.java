package org.java.meetup.skg.ghactionstest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Dummy controller
 */
@RestController
@AllArgsConstructor
@RequestMapping("/dummy")
public class DummyController {

   private final WelcomeMessageService welcomeMessageService;

   @GetMapping("/hello")
   public WelcomeMessage sayHello() {
      return welcomeMessageService.getWelcomeMessage("Hello World");
   }

   @GetMapping("/hello/{name}")
   public WelcomeMessage sayHelloPersonal(@PathVariable String name) {
      return welcomeMessageService.getWelcomeMessage("Hello " + name);
   }

   @GetMapping("/hello/verbose/{name}")
   public WelcomeMessage sayVerboseHello(@PathVariable String name) {
      return welcomeMessageService.getWelcomeMessage("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. " + name);
   }

}