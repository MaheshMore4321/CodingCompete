package sd.sym.codingcompete.codechef.beginner.find_remainder;

import java.util.Scanner;

public class FindRemainder
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int ntimes = sym.nextInt();
    for(int t = 1 ; t <= ntimes ; t++ )
    {
      System.out.println(sym.nextInt()%sym.nextInt());
    }
    sym.close();
  }
}
