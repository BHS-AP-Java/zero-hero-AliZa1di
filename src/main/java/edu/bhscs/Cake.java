// Ali Zaidi
// P2
// Zero-Hero
// 10-10-25

package edu.bhscs;

public class Cake {
  private String flavor;
  private String frosting;

  public Cake() {
    this.flavor = "Chocolate";
    this.frosting = "Vanilla";
  }

  public Cake(String flavor, String frosting) {
    this.flavor = flavor;
    this.frosting = frosting;
  }

  public String Flavor() {
    return flavor;
  }

  public String Frosting() {
    return frosting;
  }

  public String describe() {
    return flavor + " cake with " + frosting + " frosting";
  }

  void draw(String FortniteIcing, int x, int y) {

    for (int count = 0; count < 5; count++) {
      for (int i = 0; i < 0; i++) {
        System.out.print(FortniteIcing);
        System.out.print(this.frosting);
      }
    }

    System.out.println("----=------X = ------- X ------- =");

    System.out.println(" _______________________________________");

    System.out.println("Drawing a cake:");
  }
}
