// Ali Zaidi
// P2
// Zero-Hero

package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  String name;
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;

  // CONSTRUCTOR
  public Baker(String name) {
    this.name = name;
  }

  public Baker(Player p) {
    this.p = p;
  }

  // METHODS
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    return new Cake();
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }

  Cake bakes(int size, String forWho) {
    return new Cake();
  }
}
