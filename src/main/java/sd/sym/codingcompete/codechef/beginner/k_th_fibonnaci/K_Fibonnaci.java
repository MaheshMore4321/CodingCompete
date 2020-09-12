package sd.sym.codingcompete.codechef.beginner.k_th_fibonnaci;

import java.util.Scanner;

public class K_Fibonnaci
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);

    int n = sym.nextInt();
    int k = sym.nextInt();

    long sum=0;
    long a[]=new long[n];

    for (int i = 0; i < n; i++)
    {
      a[i] = 1 ;
    }

    for(int i=k; i<n; i++)
    {
      sum=0;
      for(int j=1;j<=k;j++)
      {
        sum+=a[i-j]%1000000007;
      }
      a[i]=sum;
    }

    System.out.print(a[n-1]%1000000007);

    sym.close();
  }
}
