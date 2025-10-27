package edu.bhscs;

public class Cake {

  // PROPERTIES AND FIELDS
  String ingredient1;
  String ingredient2;
  String person;
  String icing;
  Flour flour;
  int weight;
  int price;
  int height;
  int width;
  int layers;

  // CONSTRUCTOR
  public Cake() {

  }

  public Cake(String icing, int height, int width, int layers) {
    this.icing = icing;
    this.height = height;
    this.width = width;
    this.layers = layers;
  }


  // METHOD
  void draw() {
    System.out.println(icing.repeat(width));
    for (int l = 0; l < layers; l++) {
     for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
          double rand = Math.random();
          char sprinkle = rand < 0.333 ? '-' : (rand < 0.666 ? '*' : '/');
          System.out.print(sprinkle);
        }
        System.out.println();

      }


      if (l < layers - 1) {
        System.out.println("-".repeat(width));
      }

      System.out.println("=".repeat(width));

    }
  }

  public static void main(String[] args) {
    Cake myCake = new Cake("~", 5, 20, 3);
    myCake.draw();
  }
}