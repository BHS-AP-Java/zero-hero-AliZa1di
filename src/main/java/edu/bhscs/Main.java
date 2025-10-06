package edu.bhscs;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to Bob's Baking Bakery!");
    System.out.println(
        "What cake would you like to purchase? We have chocolate, vanilla, and strawberry.");
    String cake = s.next();
    System.out.println("We are making your: " + cake + " cake");
    System.out.println("It'll be fresh and ready, just a moment!");
    s.close();

    if (cake.equals("chocolate")) {
      System.out.println("Here's your chocolate cake!");
    } else if (cake.equals("vanilla")) {
      System.out.println("Here's your vanilla cake!");
    } else if (cake.equals("strawberry")) {
      System.out.println("Here's your strawberry cake!");
    } else {
      System.out.println("Sorry, we out of stock for that right now. Come back tmrw maybe.");
    }
  }
}

// old code
// StorePersonDude clerk = new StorePersonDude("Gus");
  //  Store store = new Store("Bob's Baking Bakery", clerk);
    // Person person = new Person("Bob");
    // System.out.println("Welcome to " + store.getName() + "!!!!!!");
    // person.buyAndEatCake(store);
  // }
