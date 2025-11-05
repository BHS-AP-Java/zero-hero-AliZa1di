// Ali Zaidi
// P2
// Zero-Hero

// MAIN GOAL: MAKE  A CAKE, HAVE SOMEONE MAKE IT, BUY IT, AND SOMEONE WHO GETS THE MONEY
package edu.bhscs;

public class Main {
  public static void main(String[] args) {
    date10_27();
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);

    Player user = new Player("GREIBER");

    String cake = user.giveAnswer("What cake u need");
    String frosting = user.giveAnswer("What frosting u need");

    new Cake().draw();

    System.out.println("cake " + cake);
    System.out.println("frosting " + frosting);
  }
}
