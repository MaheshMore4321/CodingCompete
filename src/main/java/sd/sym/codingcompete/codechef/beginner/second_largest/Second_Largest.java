package sd.sym.codingcompete.codechef.beginner.second_largest;

import java.util.Arrays;
import java.util.Scanner;

class Second_Largest {
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int noOfTestcasde = sym.nextInt();
    for (int i = 0; i < noOfTestcasde; i++) {
      int[] intArr = new int[3];
      for (int j = 0; j < intArr.length; j++) {
        intArr[j] = sym.nextInt();
      }
      Arrays.sort(intArr);
      System.out.println(intArr[intArr.length - 2]);
    }
    sym.close();
  }
}
