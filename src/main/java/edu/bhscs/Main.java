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

    String cake = user.giveAnswer("What cake u need");
    String frosting = user.giveAnswer("What frosting u need");

    System.out.println("cake " + cake);
    System.out.println("frosting " + frosting);
  }
}
