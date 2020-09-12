package sd.sym.codingcompete.codechef.beginner.servant;

import java.util.Scanner;

class Servant {
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int noOfTestcasde = sym.nextInt();
    for (int i = 0; i < noOfTestcasde; i++) {
      if(10<=sym.nextInt()) {
        System.out.println("-1");
      }
      else{
        System.out.println("What an obedient servant you are!");
      }
    }
    sym.close();
  }
}