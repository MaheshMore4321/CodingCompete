package sd.sym.codingcompete.codechef.beginner.chef_and_remissness;

import java.util.Scanner;

class Chef_and_Remissness
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n; i++)
    {
      int a = sym.nextInt();
      int b = sym.nextInt();
      System.out.println((a>b?a:b) +" "+ (a+b));
    }
    sym.close();
  }
}