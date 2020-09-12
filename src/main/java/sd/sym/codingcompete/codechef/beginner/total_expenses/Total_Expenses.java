package sd.sym.codingcompete.codechef.beginner.total_expenses;

import java.util.Scanner;

public class Total_Expenses {

  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int testcases = sym.nextInt();

    while(testcases>0) {

      double amt_1 = sym.nextDouble();
      double amt_2 = sym.nextDouble();

      ops(amt_1 , amt_2);

      testcases--;
    }

    sym.close();
  }

  private static void ops(double amt_1 , double amt_2) {
    if(amt_1 > 1000) {
      double amt_3 = amt_1 - amt_1 * 0.1 ;
      System.out.println(amt_3*amt_2);
    }
    else {
      System.out.println(amt_1*amt_2);
    }

  }

}
