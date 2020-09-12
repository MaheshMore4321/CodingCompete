package sd.sym.codingcompete.codechef.beginner.sum_of_digits;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n; i++) {
      String str = sym.next();
      try {
        Integer.parseInt(str);
        char[] strArr = str.toCharArray();
        int sum = 0;
        for (char element : strArr) {
          sum += Integer.parseInt(String.valueOf(element));
        }
        System.out.println(sum);
      } catch (Exception e) {}
    }
    sym.close();
  }
}
