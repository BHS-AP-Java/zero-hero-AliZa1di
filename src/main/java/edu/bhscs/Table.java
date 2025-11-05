// Ali Zaidi
// P2
// Zero-Hero
package edu.bhscs;


public class Table{

  int legs;
  int width;


  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;

    System.out.println("alive table");
  }


public void draw(double scale) {
    if (scale <= 0) {
      System.out.println("Scale MRReiber Desk");
    }
}

  public void draw(int scaleamount) {
    draw(scaleamount / 100.0);
  }

}