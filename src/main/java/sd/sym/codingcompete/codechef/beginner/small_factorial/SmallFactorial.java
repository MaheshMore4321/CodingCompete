package sd.sym.codingcompete.codechef.beginner.small_factorial;

import java.math.BigInteger;
import java.util.Scanner;

class SmallFactorial
{
  public static void main (String[] Sym)
  {
    Scanner sym=new Scanner(System.in);
    int s=sym.nextInt();
    for(int i=0;i<s;i++)
    {
      BigInteger n = new BigInteger(sym.next());
      BigInteger count = BigInteger.ONE;

      for( int i1 = 1 ; i1 <= n.intValue() ; i1++)
      {
        BigInteger b = new BigInteger(String.valueOf(i1));
        count = count.multiply(b);
      }
      System.out.println(count);
    }
    sym.close();
  }
}
