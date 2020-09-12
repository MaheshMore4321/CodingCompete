package sd.sym.codingcompete.codechef.beginner.tanu_and_headbob;

import java.util.Scanner;

class Tanu_and_Headbob
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int noOfTimes = sym.nextInt();
    for (int i = 0; i < noOfTimes; i++)
    {
      String nod = sym.next();
      if(nod.toUpperCase().contains("I")) {
        System.out.println("INDIAN");
      }
      else {
        if(nod.toUpperCase().contains("Y")) {
          System.out.println("NOT  INDIAN");
        }
        else {
          System.out.println("NOT SURE");
        }
      }
    }
    sym.close();
  }
}