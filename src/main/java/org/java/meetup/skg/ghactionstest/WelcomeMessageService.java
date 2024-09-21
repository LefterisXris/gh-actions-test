package org.java.meetup.skg.ghactionstest;


public interface WelcomeMessageService {
   default WelcomeMessage getWelcomeMessage(String msg) {
      return new WelcomeMessage("Updated: " + msg);
   }

   default WelcomeMessage getWelcomeMessage1(String msg) {
      return new WelcomeMessage("Updated1: " + msg);
   }

   default WelcomeMessage getWelcomeMessage2(String msg) {
      return new WelcomeMessage("Updated2: " + msg);
   }


}