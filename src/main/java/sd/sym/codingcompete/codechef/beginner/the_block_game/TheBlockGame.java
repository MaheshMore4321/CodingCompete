package sd.sym.codingcompete.codechef.beginner.the_block_game;

import java.util.Scanner;

class TheBlockGame {
  public static void main(String Sym[]) {
    Scanner sym = new Scanner(System.in);
    int noOfTimes = sym.nextInt();
    for (int i = 0; i < noOfTimes; i++) {
      String input = sym.next();
      if(input.equals(new StringBuffer(input).reverse().toString())) {
        System.out.println("wins");
      }
      else {
        System.out.println("losses");
      }
    }
    sym.close();
  }
}