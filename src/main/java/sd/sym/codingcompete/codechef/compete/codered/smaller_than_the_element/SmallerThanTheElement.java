package sd.sym.codingcompete.codechef.compete.codered.smaller_than_the_element;

import java.util.Scanner;

public class SmallerThanTheElement {

  public static void main(String[] args) {
    Scanner sym = new Scanner(System.in);
    int testCases = sym.nextInt();
    int[] intArr = new int[testCases];
    for (int i = 0; i < testCases; i++) {
      intArr[i] = sym.nextInt();
    }
    printFunction(intArr);
    sym.close();
  }

  private static void printFunction(int[] intArr) {
    for (int i = 0; i < intArr.length; i++) {
      int count = 0 ;
      for (int j = 0; j < i; j++) {
        if(intArr[i]>intArr[j]) {
          count++;
        }
      }
      if(count != 0) {
        System.out.println(count);
      } else {
        System.out.println("-1");
      }
    }
  }

}
