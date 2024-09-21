package org.java.meetup.skg.ghactionstest;


public interface WelcomeMessageService {
   default WelcomeMessage getWelcomeMessage(String msg) {
      return new WelcomeMessage("Updated: " + msg);
   }
}