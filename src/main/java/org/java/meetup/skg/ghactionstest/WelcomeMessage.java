package org.java.meetup.skg.ghactionstest;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WelcomeMessage {
   private final String message;
   private final LocalDateTime dateTime;

   public WelcomeMessage(String message) {
      this.message = message;
      this.dateTime = LocalDateTime.now();
   }
}
