package sd.sym.codingcompete.codechef.beginner.mahasena;

import java.util.Scanner;

public class Mahasena {

  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int tstcs = sym.nextInt();

    int countEven = 0  ;
    int countOdd = 0  ;

    for (int i = 0; i < tstcs; i++) {
      if(sym.nextInt()%2 != 0 ) {
        countEven++ ;
      } else {
        countOdd++;
      }
    }
    sym.close();

    if(countEven < countOdd) {
      System.out.println("READY FOR BATTLE");
    } else {
      System.out.println("NOT READY");
    }
  }

}
