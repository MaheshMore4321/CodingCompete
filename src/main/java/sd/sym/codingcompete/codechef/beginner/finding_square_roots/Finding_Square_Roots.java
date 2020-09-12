package sd.sym.codingcompete.codechef.beginner.finding_square_roots;

import java.util.Scanner;

class Finding_Square_Roots
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n; i++)
    {
      System.out.println((int) Math.floor(Math.sqrt(sym.nextDouble())));
    }
    sym.close();
  }
}
