package sd.sym.codingcompete.codechef.beginner.primality_test;

import java.util.Scanner;

class PrimalityTest {
  public static void main(String Sym[]) {
    Scanner sym = new Scanner(System.in);
    int noOfTimes = sym.nextInt();
    for (int i = 0; i < noOfTimes; i++) {
      System.out.println(new PrimalityTest().primeTest(sym.nextLong()));
    }
    sym.close();
  }

  private String primeTest(long term) {
    String flag = "yes";
    if(term != 1 || term != 2) {
      for (int i = 2; i < term; i++) {
        if(term%i == 0) {
          flag = "no";
          break;
        }
      }
    }
    return flag;
  }
}
