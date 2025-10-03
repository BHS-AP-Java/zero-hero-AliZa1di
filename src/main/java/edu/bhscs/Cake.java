package edu.bhscs;

public class Cake {
  private String flavor;
  private String frosting;

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
}
