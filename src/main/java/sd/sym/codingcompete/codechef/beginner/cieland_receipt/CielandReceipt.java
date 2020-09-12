package sd.sym.codingcompete.codechef.beginner.cieland_receipt;

import java.util.Scanner;

public class CielandReceipt
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();

    for (int i = 0; i < n; i++)
    {
      int num = sym.nextInt();
      int count = 0 ;

      while(num != 0)
      {
        for (int i1 = 11; i1 >= 0; i1--)
        {
          int l = (int) Math.pow(2 , i1);
          if( l <= num )
          {
            num = num - l ;
            count++;
            i1 = i1 + 1;
          }
        }
      }
      System.out.println(count);
    }
    sym.close();
  }
}