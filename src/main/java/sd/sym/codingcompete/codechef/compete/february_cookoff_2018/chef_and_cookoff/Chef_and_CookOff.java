package sd.sym.codingcompete.codechef.compete.february_cookoff_2018.chef_and_cookoff;

import java.util.Scanner;

public class Chef_and_CookOff {

  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int times = sym.nextInt();
    for (int i = 0; i < times; i++) {
      int count = 0;
      for (int j = 0; j < 5; j++) {
        count += sym.nextInt();
      }
      calMaster(count);
    }
    sym.close();
  }

  /*	A contestant that solved exactly 0 problems is a beginner.
	A contestant that solved exactly 1 problem is a junior developer.
	A contestant that solved exactly 2 problems is a middle developer.
	A contestant that solved exactly 3 problems is a senior developer.
	A contestant that solved exactly 4 problems is a hacker.
	A contestant that solved all five problems is Jeff Dean.*/
  /*"Beginner", "Junior Developer", "Middle Developer", "Senior Developer", "Hacker", "Jeff Dean"*/
  private static void calMaster(int count) {
    if(count==0) {
      System.out.println("Beginner");
    } else if(count==1) {
      System.out.println("Junior Developer");
    } else if(count==2) {
      System.out.println("Middle Developer");
    } else if(count==3) {
      System.out.println("Senior Developer");
    } else if(count==4) {
      System.out.println("Hacker");
    } else if(count==5) {
      System.out.println("Jeff Dean");
    }

  }

}
