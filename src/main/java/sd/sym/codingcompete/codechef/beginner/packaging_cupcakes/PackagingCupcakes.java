package sd.sym.codingcompete.codechef.beginner.packaging_cupcakes;

import java.util.Scanner;

public class PackagingCupcakes
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n ; i++)
    {
      int input=sym.nextInt();
      System.out.println(input/2+1);
    }
    sym.close();
  }
}