// Ali Zaidi
// P2
// Zero-Hero
// 9/12/25

/*
 * DESCRIPTION: Whatever Mr Reiber says
 * INPUT: We dont know about input yet
 * OUTPUT: Some cools words in the command line thing
 * EDGE CASE: They are all edge cases at the moment
 */

package edu.bhscs;

public class Main {
  public static final float NAME_OF_THIS_FLOAT = 69.42f;
  public static final char A = 'a';

  public static void main(String[] args) {
    System.out.println(A);
    String myString = pushup("Garlic");
    System.out.println(myString);

    Awesome steve = new Awesome("Steve, im steve... and 200lbs");
    Awesome sue = new Awesome("sue hee, yep im also fat");
    Awesome linda = new Awesome("linda, i play board games, yep, im fat");
    Awesome jhon = new Awesome("jhon w a jh, fatass, i play fortnite, of course im 100% body fat");

    steve.getName();
    sue.getName();
    linda.getName();
    jhon.getName();


  }


public static String pushup(String food){
  return "sweat" + food;
}

}
