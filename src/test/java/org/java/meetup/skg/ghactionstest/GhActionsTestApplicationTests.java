package org.java.meetup.skg.ghactionstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GhActionsTestApplicationTests {

   @Autowired
   private WelcomeMessageService welcomeMessageService;

   @Test
   void contextLoads() {
      var msg = welcomeMessageService.getWelcomeMessage("Test");
      Assertions.assertEquals(new WelcomeMessage("Updated: Test"), msg);
      System.out.println("Hey there");


      msg = welcomeMessageService.getWelcomeMessage1("Test");
      Assertions.assertEquals(new WelcomeMessage("Updated1: Test"), msg);

      msg = welcomeMessageService.getWelcomeMessage2("Test");
      Assertions.assertEquals(new WelcomeMessage("Updated2: Test"), msg);

   }

}
