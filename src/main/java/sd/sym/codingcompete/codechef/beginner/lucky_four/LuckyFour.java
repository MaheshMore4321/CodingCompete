package sd.sym.codingcompete.codechef.beginner.lucky_four;

import java.util.Scanner;

class LuckyFour
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n; i++)
    {
      String str = sym.next();
      int i1 = 0;
      for (int j = 0; j < str.length(); j++)
      {
        if((str.charAt(j)+"").equals("4"))
        {
          i1++;
        }
      }
      System.out.println(i1);
    }
    sym.close();
  }
}