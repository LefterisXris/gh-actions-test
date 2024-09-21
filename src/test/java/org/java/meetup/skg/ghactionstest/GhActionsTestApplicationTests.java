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
   }

}
