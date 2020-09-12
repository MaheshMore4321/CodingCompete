package sd.sym.codingcompete.codechef.beginner.fit_squares_in_triangle;

import java.util.Scanner;

public class Fit_Squares_in_Triangle {

  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int tstcs = sym.nextInt();
    for (int i = 0; i < tstcs; i++) {
      System.out.println(runexp(sym.nextInt()));
    }
    sym.close();
  }

  public static int runexp(int nextInt) {
    int n = nextInt/2-1;
    return n*(n+1)/2 ;
  }

}
