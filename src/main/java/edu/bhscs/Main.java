// Ali Zaidi
// P2
// Zero-Hero
// 10-10-25

// MAIN GOAL: MAKE  A CAKE, HAVE SOMEONE MAKE IT, BUY IT, AND PLAYER WHO GETS THE MONEY
package edu.bhscs;

public class Main {

  public static void main(String[] args) {

    new Cake().draw("Delicious", 5, 12);

    Player user = new Player("GREIBER");

    String name = user.giveAnswer("What is your name?");
    String age = user.giveAnswer("How old are you?");

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}
