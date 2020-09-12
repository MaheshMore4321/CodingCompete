package sd.sym.codingcompete.codechef.beginner.valid_triangles;

import java.util.Scanner;

class ValidTriangles {
  public static void main(String Sym[]) {
    Scanner sym = new Scanner(System.in);
    int noOfTimes = sym.nextInt();
    for (int i = 0; i < noOfTimes; i++) {
      int sum = 0  ;
      boolean flag = true;
      for (int j = 0; j < 3; j++) {
        int x = sym.nextInt();
        sum += x;
        if(x <= 0){flag = false;}
      }
      if(flag && sum==180) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sym.close();
  }
}