package sd.sym.codingcompete.codechef.beginner.the_smallest_pair;

import java.util.Arrays;
import java.util.Scanner;

class TheSmallestPair {
  public static void main(String Sym[]) {
    Scanner sym = new Scanner(System.in);
    int noOfTimes = sym.nextInt();
    for (int i = 0; i < noOfTimes; i++) {
      int sizeofInt = sym.nextInt();
      int[] intArr = new int[sizeofInt];
      for (int j = 0; j < sizeofInt; j++) {
        intArr[j] = sym.nextInt();
      }
      Arrays.sort(intArr);
      System.out.println(intArr[0]+intArr[1]);
    }
    sym.close();
  }
}