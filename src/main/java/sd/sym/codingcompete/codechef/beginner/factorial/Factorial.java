package sd.sym.codingcompete.codechef.beginner.factorial;

import java.util.Scanner;

public class Factorial {

  public static void main (String[] Sym)
  {
    Scanner sym=new Scanner(System.in);
    int s=sym.nextInt();
    for(int i=0;i<s;i++)
    {
      int n=sym.nextInt();

      int count = 0;
      int m = n/5;
      int temp = 5;

      for( int i1 = 2 ; m >= 1 ; i1++)
      {
        m = n/temp;
        count += m;
        temp = (int) Math.pow(5,i1);
      }
      System.out.println(count);
    }
    sym.close();
  }
}