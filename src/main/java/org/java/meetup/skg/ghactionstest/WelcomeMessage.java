package org.java.meetup.skg.ghactionstest;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
public class WelcomeMessage {
   private final String message;
   @EqualsAndHashCode.Exclude
   private final LocalDateTime dateTime;

   public WelcomeMessage(String message) {
      this.message = message;
      this.dateTime = LocalDateTime.now();
   }


}
