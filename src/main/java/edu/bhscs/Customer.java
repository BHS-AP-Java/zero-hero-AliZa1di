// Ali Zaidi
// P2
// Zero-Hero

package edu.bhscs;

public class Customer {

  private String name;
  private int money;

  public Customer() {
    this.name = "Customer";
    this.money = 100;
  }

  public Customer(String name, int money) {
    this.money = Math.max(0, money);
  }

  public int pay(int price) {
    int paid = Math.min(price, money);
    money -= paid;
    System.out.println(name + " paid " + paid);
    return paid;
  }

  public void takeCake(Cake cake) {
    System.out.println(this.name + " received a " + cake());
  }

  private String cake() {
    return "cake";
  }
}
