// Ali Zaidi
// P2
// Zero-Hero
package edu.bhscs;

public class Table {

  int legs;
  int width;
  String leg;
  String widthofleg;

  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;

    System.out.println("alive table");
  }


  public void draw(scale) {
    if (scale <= 0) {
      System.out.println("Scale Stuff Things");
      return;
    }

  public void draw(int scaleamount) {
    draw(scaleamount / 100.0);
  }

}

